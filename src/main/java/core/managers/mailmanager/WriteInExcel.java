package core.managers.mailmanager;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInExcel {

    public static void writeData(Scenario scenario, String status) throws IOException {
        try {
            String featureName = "Feature ";
            String rawFeatureName = scenario.getId().split(";")[0].replace("-", " ");
            //featureName = featureName + rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
            String str = scenario.getSourceTagNames().toString();
            String str2 = str.substring(2, str.length() - 1);
            featureName = str2;
            FileInputStream file = new FileInputStream(new File("TestResult.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(1);
            System.out.println("Scenario: " + scenario.getName());
            //map.put(scenario.getName(),status);
            //int lastRowNum = sheet.getLastRowNum();
            //System.out.println("LastRowNum: "+lastRowNum);
            int numberOfRows = sheet.getPhysicalNumberOfRows();
            System.out.println("number of rows :" + numberOfRows);
            if (numberOfRows >= 1) {
                FileInputStream fis = new FileInputStream("TestResult.xlsx");
                XSSFWorkbook workbook2 = new XSSFWorkbook(fis);
                XSSFSheet sheet2 = workbook2.getSheetAt(1);
                int numberOfRowsToRead = sheet2.getPhysicalNumberOfRows();
                System.out.println("Number of rows to read: " + numberOfRowsToRead);
                for (int i = 0; i < numberOfRowsToRead; i++) {
                    Row row2 = sheet2.getRow(i);
                    Cell cellToRead = row2.getCell(1);
                    String value = cellToRead.getStringCellValue();
                    System.out.println("Value :" + value);
                    System.out.println("current scenario: " + scenario.getName());
                    if (value.equalsIgnoreCase(scenario.getName())) {
                        System.out.println("Yes matched going to update");
                        fis.close();
                        sheet.getRow(i).getCell(2).setCellValue(status);
                        FileOutputStream outputStream = new FileOutputStream("TestResult.xlsx");
                        workbook.write(outputStream);
                        outputStream.close();
                        break;
                    } else if (i == (numberOfRowsToRead - 1)) {
                        fis.close();
                        System.out.println("Going to create new row and add data");
                        Row row = sheet.createRow(numberOfRows++);
                        System.out.println("NumberOfRow: " + numberOfRows);
                        int cellid = 0;
                        Cell cell3 = row.createCell(cellid++);
                        System.out.println("Cell no: " + cellid);
                        cell3.setCellValue(featureName);
                        Cell cell = row.createCell(cellid++);
                        System.out.println("Cell no: " + cellid);
                        cell.setCellValue(scenario.getName());
                        Cell cell2 = row.createCell(cellid++);
                        System.out.println("Cell no: " + cellid);
                        cell2.setCellValue(status);
                        FileOutputStream outputStream = new FileOutputStream("TestResult.xlsx");
                        workbook.write(outputStream);
                        outputStream.close();
                    }
                }
            } else {
                System.out.println("Going to create new row and add data");
                Row row = sheet.createRow(++numberOfRows);
                System.out.println("NumberOfRow: " + numberOfRows);
                int cellid = 0;
                Cell cell3 = row.createCell(cellid++);
                System.out.println("Cell no: " + cellid);
                cell3.setCellValue(featureName);
                Cell cell = row.createCell(cellid++);
                System.out.println("Cell no: " + cellid);
                cell.setCellValue(scenario.getName());
                Cell cell2 = row.createCell(cellid++);
                System.out.println("Cell no: " + cellid);
                cell2.setCellValue(status);
                FileOutputStream outputStream = new FileOutputStream("TestResult.xlsx");
                workbook.write(outputStream);
                outputStream.close();
            }

        } catch (Exception e) {

        }

    }

    public static int ReadDatatotalnumber() {
        int totalnumber=0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("TestResult.xlsx");
            XSSFWorkbook workbook2 = new XSSFWorkbook(fis);
            XSSFSheet sheet2 = workbook2.getSheetAt(0);
            totalnumber = (int) sheet2.getRow(3).getCell(1).getNumericCellValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalnumber;
    }

    public static int ReadDatastatuspass() {
        int statuspass=0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("TestResult.xlsx");
            XSSFWorkbook workbook2 = new XSSFWorkbook(fis);
            XSSFSheet sheet2 = workbook2.getSheetAt(0);
            statuspass = (int) sheet2.getRow(3).getCell(2).getNumericCellValue();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return statuspass;
    }

    public static int ReadDatastatusfail() {
        int statusfail = 0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("TestResult.xlsx");
            XSSFWorkbook workbook2 = new XSSFWorkbook(fis);
            XSSFSheet sheet2 = workbook2.getSheetAt(0);
            statusfail = (int) sheet2.getRow(3).getCell(3).getNumericCellValue();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //  String[] str=statusfail.split(".");
        return statusfail;
    }


    public static void main(String[] argu){
        System.out.println(ReadDatastatusfail());
        System.out.println(ReadDatastatuspass());
        System.out.println(ReadDatatotalnumber());

    }

}
