package app.tatasky.freemium;

import core.uiactions.UiActions;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.sf.json.util.JSONUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Subscription extends UiActions {

    public Subscription(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_sub_landing_title"),
    @FindBy(id = "com.tatasky.binge:id/tv_sub_landing_title")})
    private MobileElement My_Plan_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_pack_name"),
    @FindBy(id = "com.tatasky.binge:id/tv_pack_name")})
    private MobileElement Pack_Name;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_pack_price"),
    @FindBy(id = "com.tatasky.binge:id/tv_pack_price")})
    private MobileElement Pack_Price;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_total_apps"),
    @FindBy(id = "com.tatasky.binge:id/tv_total_apps")})
    private List<MobileElement> Total_Apps;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_renewal_cycle"),
    @FindBy(id = "com.tatasky.binge:id/tv_renewal_cycle")})
    private MobileElement Pack_Validity;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/recycler_packs"),
    @FindBy(id = "com.tatasky.binge:id/recycler_packs")})
    private MobileElement App_Icons;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_action"),
    @FindBy(id = "com.tatasky.binge:id/btn_action")})
    private MobileElement Get_Plan_Btn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Proceed']")
    private MobileElement Plan_Proceed_Btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Access all these apps on Mobile, TV & Web']")
    private MobileElement Text_AllApps;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Available only on Mega VIP']")
    private MobileElement TextAvailableOnly;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Apps not included']")
    private MobileElement TextAppsNotIncluded;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_crown"),
    @FindBy(id = "com.tatasky.binge:id/iv_crown")})
    private List<MobileElement> Crown_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_tenure_title"),
    @FindBy(id = "com.tatasky.binge:id/tv_tenure_title")})
    private MobileElement Price_Tenure;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_pack_title"),
    @FindBy(id = "com.tatasky.binge:id/tv_pack_title")})
    private MobileElement Pack_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_pack_tenure_subtitle"),
    @FindBy(id = "com.tatasky.binge:id/tv_pack_tenure_subtitle")})
    private MobileElement PackSub_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_tenure"),
    @FindBy(id = "com.tatasky.binge:id/iv_tenure")})
    private MobileElement Tenure_Calendar;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_tenure_price_offered"),
    @FindBy(id = "com.tatasky.binge:id/tv_tenure_price_offered")})
    private List<MobileElement> Price_Offered;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Monthly']")
    private MobileElement Plan_Monthly;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1 Month']")
    private MobileElement Plan_1Month;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Quarterly']")
    private MobileElement Plan_Quarterly;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3 Months']")
    private MobileElement Plan_3Months;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Yearly']")
    private MobileElement Plan_Yearly;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='12 Months']")
    private MobileElement Plan_12Months;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Proceed to Pay']")
    private MobileElement Proceed_To_Pay;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_compare_plan"),
    @FindBy(id = "com.tatasky.binge:id/btn_compare_plan")})
    private MobileElement Compare_Plans_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_compare_plan_title"),
    @FindBy(id = "com.tatasky.binge:id/tv_compare_plan_title")})
    private MobileElement Compare_Plans_title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/compare_item_border"),
    @FindBy(id = "com.tatasky.binge:id/compare_item_border")})
    private List<MobileElement> Plans;

    @FindAll({@FindBy(xpath = "//android.widget.TextView[@text='Select a Payment Option']"),
    @FindBy(xpath = "//android.widget.TextView[@text='Payment']")})
    private MobileElement  Select_Payment_Option;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment']//preceding::android.widget.ImageView")
    private MobileElement BackBtn_Payment_Option;

    @FindAll({@FindBy(xpath = "//android.widget.TextView[@text='Recharge Amount']//following-sibling::android.widget.TextView"),
    @FindBy(xpath = "//android.widget.TextView[@text='Payable Amount']//following-sibling::android.widget.TextView")})
    private MobileElement Payable_Amount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='More Banks']")
    private MobileElement More_banks_Btn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search Banks']")
    private MobileElement Search_Banks_TextBox;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<MobileElement> BackBtn_Netbanking;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add New Card']")
    private MobileElement Credit_Debit_Cards;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Card Number']")
    private MobileElement Card_Number;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Billdesk Test Bank']")
    private MobileElement Billdesk_Test_Bank;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Make Payment']")
    private MobileElement Make_Payment;

   @AndroidFindBy(xpath = "//android.view.View[@text='Select']")
    private List<MobileElement> Bank_Status;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Success']")
    private MobileElement Success;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    private MobileElement Submit_Form;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter card number here']")
    private MobileElement Enter_Card_Number;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='MM/YY']")
    private MobileElement Enter_Expiry_Date;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='CVV']")
    private MobileElement Enter_CVV;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Enter One Time Password')]//following-sibling::android.widget.EditText")
    private MobileElement Enter_OTP;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Plan']")
    private MobileElement Change_Plan;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Tenure']")
    private MobileElement Change_Tenure;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Existing User Login']")
    private MobileElement Existing_User_Login;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Subscribe']")
    private MobileElement Header_Subscribe;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/touch_outside"),
    @FindBy(id = "com.tatasky.binge:id/touch_outside")})
    private MobileElement  touch_outside;

    @FindBy(xpath = "//android.widget.TextView[@text='Plan added successfully!']")
    private MobileElement Plan_added;

    @FindBy(xpath = "//android.widget.TextView[@text='Plan changed successfully!']")
    private MobileElement Plan_changed;

    @FindBy(xpath = "//android.widget.Button[@text='Cancel Plan']")
    private MobileElement Cancel_Plan;

    @FindBy(xpath = "//android.widget.TextView[@text='Plan cancellation scheduled']")
    private MobileElement Plan_Cancellation_Title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Plan']")
    private MobileElement Change_Plan_title;


    String packname;
    String apptext;
    int appcount;
    int eappscount1;
    int eappscount2;
    String planamount;


    public void tapOnGetPlanBtn() {
        tap(Get_Plan_Btn);
    }

    public boolean countEnabledAppsOnPack(String packname) {
        boolean compare = false;
        String MegaPack = Pack_Name.getAttribute("text");
        int size, size1;
        String getappaount;
        int appcount;

        if (MegaPack.equals("Mega")) {
           waitTime(5000);
            size = driver.findElements(By.xpath("//android.widget.TextView[@text='"+packname+"']//following::androidx.recyclerview.widget.RecyclerView[1]//android.view.ViewGroup[@resource-id='com.tatasky.binge.uat:id/rlParent']")).size();
            size1 = driver.findElements(By.xpath("//android.widget.TextView[@text='"+packname+"']//following::androidx.recyclerview.widget.RecyclerView[2]//android.view.ViewGroup[@resource-id='com.tatasky.binge.uat:id/rlParent']")).size();
            size=size+size1;
            System.out.println("enabled app " + size);
            getappaount = driver.findElement(By.xpath("//android.widget.TextView[@text='"+packname+"']//following-sibling::android.widget.TextView[@resource-id='com.tatasky.binge.uat:id/tv_total_apps']")).getAttribute("text");
            appcount = Integer.parseInt(getappaount.substring(0, 2));
            System.out.println("total app " + appcount);

        } else {
            size = driver.findElements(By.xpath("//android.widget.TextView[@text='"+packname+"']//following::androidx.recyclerview.widget.RecyclerView[1]//android.view.ViewGroup[@resource-id='com.tatasky.binge.uat:id/rlParent']")).size();
            System.out.println("enabled app " + size);
            getappaount = driver.findElement(By.xpath("//android.widget.TextView[@text='"+packname+"']//following-sibling::android.widget.TextView[@resource-id='com.tatasky.binge.uat:id/tv_total_apps']")).getAttribute("text");
            appcount = Integer.parseInt(getappaount.substring(0, 1));
            System.out.println("total app " + appcount);
        }
        if (size == appcount) {
            compare = true;
        }
        return compare;
    }

    public boolean isSMyPlanTitle() {
        return My_Plan_Title.isDisplayed();
    }

    public boolean isPackValidity() {
        return Pack_Validity.isDisplayed();
    }

    public boolean isAppIcons(String packname) {

        return driver.findElement(By.xpath("//android.widget.TextView[@text='"+packname+"']//following::androidx.recyclerview.widget.RecyclerView[1]")).isDisplayed();
    }

    public boolean isGetPlanBtn() {
        return Get_Plan_Btn.isDisplayed();
    }

    public boolean isProceedBtn(String packname ) {
        return driver.findElement(By.xpath("//android.widget.TextView[@text='"+packname+"']//following::android.widget.Button[1]")).isDisplayed();
    }

    public boolean isPackName(String packName) {

        return driver.findElement(By.xpath("//android.widget.TextView[@text='" + packName + "']")).isDisplayed();
    }

    public boolean isTotalApps(String totalApps) {

        return driver.findElement(By.xpath("//android.widget.TextView[@text='" + totalApps + "']")).isDisplayed();
    }

    public boolean isPlanPrice(String planprice) {

        return driver.findElement(By.xpath("//android.widget.TextView[@text='" + planprice + "']")).isDisplayed();
    }

    public boolean isTextAccessAllApp() {

        return Text_AllApps.isDisplayed();
    }

    public boolean isTextAvailableOnly() {

        return TextAvailableOnly.isDisplayed();
    }

    public boolean isTextAppsNotIncluded() {

        return TextAppsNotIncluded.isDisplayed();
    }

    public boolean isCrownIcon() {

        return Crown_Icon.get(1).isDisplayed();
    }

    public void tapOnProceedBtn( ) {
       tap(Plan_Proceed_Btn);
    }

    public void tapOnComparePlans() {
        tap(Compare_Plans_Btn);
    }

    public void tapOnProceedToPay() {
        tap(Proceed_To_Pay);
    }

    public void tapOnBackBtnPaymentOption() {
        tap(BackBtn_Payment_Option);
    }

    public void tapOnPlans(String packname) {
        tap(driver.findElement(By.xpath("//android.widget.TextView[@text='"+packname+"']")));
    }

    public boolean getComparePlansAppTotal(String pname) {
        boolean compare = false;
        apptext = driver.findElement(By.xpath("//android.widget.TextView[@text='"+pname+"']//following-sibling::android.widget.TextView[@resource-id='com.tatasky.binge.uat:id/tv_app_count']")).getAttribute("text");
        System.out.println("Header Total Apps " + apptext);

        if (pname.equals("Mega")) {
            appcount = Integer.parseInt(apptext.substring(0, 2));
            System.out.println("Total availabe app " + appcount);
            eappscount1 = driver.findElements(By.xpath("//android.widget.TextView[@text='"+pname+"']//following::androidx.recyclerview.widget.RecyclerView[1]//android.widget.ImageView[@resource-id='com.tatasky.binge.uat:id/iv_compare_tick']")).size();
            System.out.println("enabled app1 " + eappscount1);
            waitTime(2000);
            swipeDownward();
            waitTime(2000);
            eappscount2 = driver.findElements(By.xpath("//android.widget.TextView[@text='"+pname+"']//following::androidx.recyclerview.widget.RecyclerView[1]//android.widget.ImageView[@resource-id='com.tatasky.binge.uat:id/iv_compare_tick']")).size();
            System.out.println("enabled app2 " + eappscount2);
            eappscount1 = eappscount1 + eappscount2;
            System.out.println("Total enabled app " + eappscount1);

        } else if (pname.equals("Super") || pname.equals("Standard")) {
            appcount = Integer.parseInt(apptext.substring(0, 1));
            System.out.println("Total availabe app " + appcount);
            eappscount1 = driver.findElements(By.xpath("//android.widget.TextView[@text='"+pname+"']//following::androidx.recyclerview.widget.RecyclerView[1]//android.widget.ImageView[@resource-id='com.tatasky.binge.uat:id/iv_compare_tick']")).size();
            swipeDownward();
            eappscount2 = driver.findElements(By.xpath("//android.widget.TextView[@text='"+pname+"']//following::androidx.recyclerview.widget.RecyclerView[1]//android.widget.ImageView[@resource-id='com.tatasky.binge.uat:id/iv_compare_tick']")).size();
            eappscount1 = eappscount1 + eappscount2 - 3;
            System.out.println("Total enabled app " + eappscount1);

        }
        if (appcount == eappscount1) {
            compare = true;
        }
        return compare;
    }

    public boolean isSamePlanScreen(String pname) {
    String packname= driver.findElement(By.id("com.tatasky.binge.uat:id/tv_pack_title")).getAttribute("text");
        System.out.println("Packe Name is " +packname);
        boolean result = false;
        if (packname.equals(pname)) {
            result = true;
        }
        return result;
    }

    public void tapOnToSelectPlan(int num) {
        tap(Price_Offered.get(num));
        planamount = Price_Offered.get(num).getAttribute("text");
        System.out.println("Offered Amount " + planamount);
    }

    public boolean isPayableSameasOfferedAmount() {
        boolean result = false;
        waitTime(10000);
        String payable = Payable_Amount.getAttribute("text");
        System.out.println("Payable Amount " + payable);

        if (payable.equals(planamount.replaceAll(" ", ""))) {
            result = true;
        }
        return result;
    }

    public void tapOnMoreBanksBtn() {
        waitToAppear(Payable_Amount);
        for (int i = 0; i <= 5; i++) {
            if (isElementPresent(More_banks_Btn).booleanValue()) {
                waitTime(2000);
                tap(More_banks_Btn);
                break;
            } else {
                swipeDownward();
            }
        }
    }

    public void tapOnNetbankingBackBtn() {
        waitToAppear(BackBtn_Netbanking.get(0));
        tap(BackBtn_Netbanking.get(0));
    }

    public void swipeToPlan(String planName) {
        waitTime(10000);
        for(int i=0; i<10; i++){
            boolean isPresent = driver.findElements(By.xpath("//android.widget.TextView[@text='"+planName+"']")).size() > 0;
            if (isPresent==true) {

            } else{
                swipeDownward();
                //swipeHorizontally(400, 849, 23, 849);
            }
        }
    }

    public void tapOnCreditDebitCards() {
        waitToAppear(Credit_Debit_Cards);
        tap(Credit_Debit_Cards);
    }

    public void SearchBank(){
        Search_Banks_TextBox.sendKeys("Billdesk");
       tap(Billdesk_Test_Bank);
    }

    public void tapOnMakePayment() {
        waitToAppear(Make_Payment);
        tap(Make_Payment);
    }

    public void tapOnBnakStatus() {
       waitTime(5000);
        String Page1= driver.getPageSource();
        System.out.println(Page1);

        tap(Bank_Status.get(1));
    }

    public void tapOnSuccess() {

        tap(Success);
    }

    public void tapOnSubmitForm() {

        tap(Submit_Form);
    }

    public void tapOnExistingUserLogin() {
    waitToAppear(Existing_User_Login);
        tap(Existing_User_Login);
    }

    public boolean isPCardNumber() {
        waitToAppear(Card_Number);
        return Card_Number.isDisplayed();
    }

    public void EnterCardNumber(String CardNumber){
        Enter_Card_Number.sendKeys(CardNumber);
    }

    public void EnterExpiryDate(String ExpiryDate){
        Enter_Expiry_Date.sendKeys(ExpiryDate);
    }

    public void EnterCVV(String CVV){
        Enter_CVV.sendKeys(CVV);
    }

    public void EnterCardOTP(String OTP){
        Enter_OTP.sendKeys(OTP);
    }

    public void tapOnChangePlan(){
       tap(Change_Plan);
    }

    public void tapOnChangeTenure(){
        tap(Change_Tenure);
    }


    public void tapHeaderSubscribe(){
        tap(Header_Subscribe);
    }

    public void tapCancelPlan(){
        tap(Cancel_Plan);
    }


    public boolean isPriceTenure() {

        return Price_Tenure.isDisplayed();
    }


    public boolean isPackTitle() {
        return Pack_Title.isDisplayed();
    }


    public boolean isPackSub_Title() {
        return PackSub_Title.isDisplayed();
    }

    public boolean isTenure_Calendar() {
        return Tenure_Calendar.isDisplayed();
    }

    public boolean isPrice_Offered() {
        return Price_Offered.get(0).isDisplayed();
    }

    public boolean isPlan_Monthly() {
        return Plan_Monthly.isDisplayed();
    }

    public boolean isPlan_1Month() {
        return Plan_1Month.isDisplayed();
    }

    public boolean isPlan_Quarterly() {
        return Plan_Quarterly.isDisplayed();
    }

    public boolean isPlan_3Months() {
        return Plan_3Months.isDisplayed();
    }

    public boolean isPlan_Yearly() {
        return Plan_Yearly.isDisplayed();
    }

    public boolean isPlan_12Months() {
        return Plan_12Months.isDisplayed();
    }

    public boolean isProceed_To_Pay() {
        return Proceed_To_Pay.isDisplayed();
    }

    public boolean isComparePlansTitle() {
        return Compare_Plans_title.isDisplayed();
    }

    public boolean isSelectPaymentOptionScreen() {
        waitToAppear(Select_Payment_Option);
        waitTime(20000);
        return Select_Payment_Option.isDisplayed();
    }

    public boolean isSearchBanksTextBox() {
       waitToAppear(Search_Banks_TextBox);
        return Search_Banks_TextBox.isDisplayed();
    }

    public boolean isLoginPageOpened() {
        waitToAppear(Existing_User_Login);
        return isElementPresent(Existing_User_Login);
    }

    public boolean isDefaultSelectPlan(String planName) {
       waitTime(5000);
        MobileElement Status;
        Status =driver.findElement(By.xpath("//android.widget.TextView[@text='"+planName+"']//following-sibling::android.widget.RadioButton"));
        return isChecked(Status);
    }

    public boolean isPlanAddedTitle() {
        waitToAppear(Plan_added);
        return Plan_added.isDisplayed();
    }
    public boolean isPlanChanged() {
        waitToAppear(Plan_changed);
        return Plan_changed.isDisplayed();

    }

    public boolean isChangePlanTitle() {
        waitToAppear(Change_Plan_title);
        return Change_Plan_title.isDisplayed();
    }

    public boolean isPlanCancelled() {
        waitToAppear(Plan_Cancellation_Title);
        return isElementPresent(Plan_Cancellation_Title);
    }




}