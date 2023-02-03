package core;

import core.managers.logmanager.MyLogger;
import core.managers.logmanager.filemanager.JSONReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import java.util.Objects;


public class BaseTest {
    JSONReader jsonReader;
    Map<String, String> result;

    public Map<String, String> getAllParameters(ITestContext context) {
        result = context.getCurrentXmlTest().getAllParameters();
        return result;
    }

    @BeforeMethod
    public void LaunchApp(ITestContext context) {
     if (Objects.requireNonNull(ThreadLocalDriver.getTLDriver().getPlatformName()).equalsIgnoreCase("Android")) {
                ThreadLocalDriver.getTLDriver().launchApp();
            }
        }
    @BeforeSuite
    public void start(ITestContext context) {
        try {
            System.out.println(getAllParameters(context).size());
            for (Map.Entry<String, String> set : getAllParameters(context).entrySet()) {
                MyLogger.log.info("Creating session for device :" + set.getValue());
                setup(set.getValue());
            }
        } catch (Exception e) {
            MyLogger.log.info("Error in creating  session.................");
        }
    }


    public void setup(String deviceName) {
        MyLogger.log.info("Start setting up the drivers fro automation ");
        jsonReader = new JSONReader("deviceDetails.json");
        DesiredCapabilities caps = new DesiredCapabilities();
            if (jsonReader.getJSONValue(deviceName, "platformName").equalsIgnoreCase("Android")) {
            MyLogger.log.info("Preparing Capabilities  " + deviceName);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
            caps.setCapability("udid", jsonReader.getJSONValue(deviceName, "udid"));
            caps.setCapability("deviceName", jsonReader.getJSONValue(deviceName, "deviceName"));
            caps.setCapability("platformName", jsonReader.getJSONValue(deviceName, "platformName"));
            caps.setCapability("platformVersion", jsonReader.getJSONValue(deviceName, "platformVersion"));
            if (jsonReader.getJSONValue(deviceName, "automationType").equalsIgnoreCase("app")) {
         //       caps.setCapability("app", "D:\\Master\\binge-freemium-android\\Binge_Freemium_base_UAT.apk");
                caps.setCapability("appPackage", jsonReader.getJSONValue(deviceName, "appPackage"));
                caps.setCapability("appActivity", jsonReader.getJSONValue(deviceName, "appActivity"));
                caps.setCapability("fullReset", "false");
                caps.setCapability("noReset", "true");
                caps.setCapability("newCommandTimeout", 5000);
                caps.setCapability("adbExecTimeout", 5000);
                caps.setCapability("disableWindowAnimation", false);
            } else {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("w3c", false);
                caps.merge(chromeOptions);
                caps.setCapability("chromedriverExecutable", "D:\\binge-freemium\\src\\test\\resources\\chromedriver.exe");
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                caps.setCapability("newCommandTimeout", 8000);
                caps.setCapability("adbExecTimeout", 8000);
            }
            try {
                if (ThreadLocalDriver.getTLDriver() == null) {
                    ThreadLocalDriver.setTLDriver(new AndroidDriver<>(new URL(jsonReader.getJSONValue(deviceName, "appium-url")), caps));
                } else
                    ThreadLocalDriver.setTL1Driver(new AndroidDriver<>(new URL(jsonReader.getJSONValue(deviceName, "appium-url")), caps));

            } catch (Exception e) {
                MyLogger.log.error("Error in creating driver......");
                e.printStackTrace();
            }
        } else {
            MyLogger.log.info("Preparing Capabilities  " + deviceName + ":" + deviceName);
            caps.setCapability("udid", jsonReader.getJSONValue(deviceName, "udid"));
            caps.setCapability("deviceName", jsonReader.getJSONValue(deviceName, "deviceName"));
            caps.setCapability("platformName", jsonReader.getJSONValue(deviceName, "platformName"));
            caps.setCapability("platformVersion", jsonReader.getJSONValue(deviceName, "platformVersion"));
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            caps.setCapability("newCommandTimeout", 300);

            if (jsonReader.getJSONValue(deviceName, "automationType").equalsIgnoreCase("app")) {
                caps.setCapability("bundleId", jsonReader.getJSONValue(deviceName, "bundleId"));
            } else {
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
            }

            try {
                ThreadLocalDriver.setTLIOSDriver(new IOSDriver<>(new URL(jsonReader.getJSONValue(deviceName, "appium-url")), caps));
            } catch (Exception e) {
                MyLogger.log.error("Error in creating driver......");
                e.printStackTrace();
            }
        }

    }

//   @AfterMethod
//    public void closeApp() {
//        try {
//            ThreadLocalDriver.getTLDriver().closeApp();
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }

    @AfterSuite
    public void teardown() {
        try {
            if (ThreadLocalDriver.getTLDriver() != null) {
                ThreadLocalDriver.getTLDriver().quit();
            } else if (ThreadLocalDriver.getTLIOSDriver() != null) {
                ThreadLocalDriver.getTLIOSDriver().quit();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}
