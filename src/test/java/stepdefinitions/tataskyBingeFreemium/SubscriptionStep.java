package stepdefinitions.tataskyBingeFreemium;

import core.ThreadLocalDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.util.Random;

public class SubscriptionStep extends BaseStep {
    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }

    @Then("Verify the Mega VIP Free Trial 11 APPS Valid till Get Plan button should be displayed for First time login user <{string}> <{string}> <{string}>")
    public void VerifytheMegaVIPFreeTrial11APPSValidtillGetPlanbuttonshouldbedisplayedforFirsttimeloginuser(String arg1, String arg2, String arg3) {
        tataSkyFreemiumApp.subscription.waitTime(5000);
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isSMyPlanTitle());
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPackName(arg1));
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isTotalApps(arg2));
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isAppIcons(arg1));
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPackValidity());
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPlanPrice(arg3));
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isGetPlanBtn());
    }


    @And("Click on Get A Plan")
    public void ClickonGetAPlan() {
        tataSkyFreemiumApp.subscription.waitTime(5000);
        tataSkyFreemiumApp.subscription.tapOnGetPlanBtn();
    }

//    @Then("Verify User transit to plan screen when tap on Get Plan button")
//    public void VerifyUsertransittoplanscreenwhentaponGetPlanbutton() {
//        Assert.assertTrue(tataSkyFreemiumApp.subscription.isProceedBtn());
//    }

    @Then("Verify the number of enable apps are as per the plan {string}")
    public void Verifythenumberofenableappsareaspertheplan(String arg0) {
        tataSkyFreemiumApp.subscription.waitTime(3000);
        Assert.assertTrue(tataSkyFreemiumApp.subscription.countEnabledAppsOnPack(arg0));
    }

//    @And("Swipe to left Super VIP")
//    public void SwipetoleftSuperVIP() {
//        tataSkyFreemiumApp.subscription.waitTime(5000);
//        tataSkyFreemiumApp.subscription.swipeLeft();
//    }

//    @And("Swipe to left Standard VIP")
//    public void SwipetoleftStandardVIP() {
//        tataSkyFreemiumApp.subscription.waitTime(5000);
//        tataSkyFreemiumApp.subscription.swipeLeft();
//        tataSkyFreemiumApp.subscription.swipeLeft();
//    }

    @And("Swipe to Plan {string}")
    public void SwipetoleftMegaVIP(String arg1) {
        tataSkyFreemiumApp.subscription.swipeToPlan(arg1);
    }

    @And("Tap on Change Plan")
    public void TaponChangePlan() {
        tataSkyFreemiumApp.subscription.tapOnChangePlan();
    }

    @And("Tap on Change Tenure")
    public void TaponChangeTenure() {
        tataSkyFreemiumApp.subscription.tapOnChangeTenure();
    }


    @Then("Verify the crown icon VIP Plans APPS Available Proceed button and plan price etc. should be displayed <{string}> <{string}> <{string}>")
    public void VerifythecrowniconVIPPlansAPPSAvailableProceedbuttonandplanpriceetcshouldbedisplayed(String arg1, String arg2, String arg3) {
        tataSkyFreemiumApp.subscription.waitTime(5000);
      if(arg1.equals("Mega")) {
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isCrownIcon());
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isPackName(arg1));
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isTotalApps(arg2));
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isTextAccessAllApp());
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isAppIcons(arg1));
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isTextAvailableOnly());
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isPlanPrice(arg3));
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isProceedBtn(arg1));
      }else{
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isCrownIcon());
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isPackName(arg1));
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isTotalApps(arg2));
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isTextAccessAllApp());
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isAppIcons(arg1));
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isTextAppsNotIncluded());
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isPlanPrice(arg3));
          Assert.assertTrue(tataSkyFreemiumApp.subscription.isProceedBtn(arg1));

      }
    }

//    @And("Tap on Plan proceed button {string}")
//    public void Taponproceedbutton(String arg1) {
//        tataSkyFreemiumApp.subscription.tapOnProceedBtn(arg1);
//    }

    @And("Tap on Plan proceed button")
    public void Taponproceedbutton() {
        tataSkyFreemiumApp.subscription.tapOnProceedBtn();
    }

    @Then("Verify screen transit to Plan detail screen")
    public void VerifyscreentransittoPlandetailscreen() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPriceTenure());
    }

    @And("Tap on Plan {string}")
    public void TaponPlan(String arg1) {
        tataSkyFreemiumApp.subscription.waitTime(5000);
        tataSkyFreemiumApp.subscription.tapOnPlans(arg1);
    }
    @Then("Verify Plan details screen is opened <{string}>")
    public void VerifyPlandetailsscreenisopened(String arg0) {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isSamePlanScreen(arg0));
    }
    @And("Verify number of enabled app are same per mentioned in the plans {string}")
    public void Verifynumberofenabledapparesamepermentionedintheplans(String pname) {
        tataSkyFreemiumApp.subscription.waitTime(5000);
        Assert.assertTrue(tataSkyFreemiumApp.subscription.getComparePlansAppTotal(pname));
    }

    @And("Tap on Plan proceed To Pay button")
    public void TaponPlanproceedToPaybutton() {
        tataSkyFreemiumApp.subscription.tapOnProceedToPay();
    }

    @Then("Verify screen transit to Select a Payment Option")
    public void VerifyscreentransittoSelectaPaymentOption() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isSelectPaymentOptionScreen());
    }

    @Then("Verify the pack title sub title Tenure_Calendar Plan Tenure Price Offered Proceed To Pay is displayed on plan details screen")
    public void VerifythepacktitlesubtitleTenure_CalendarPlanTenurePriceOfferedProceedToPayisdisplayedonplandetailsscreen() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPackTitle());
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isTenure_Calendar());
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPrice_Offered());
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPlan_Monthly());
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPlan_1Month());
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isProceed_To_Pay());
    }
    @And("Tap on compare plans button")
    public void Taponcompareplansbutton() {
        tataSkyFreemiumApp.subscription.waitTime(3000);
        tataSkyFreemiumApp.subscription.tapOnComparePlans();
    }
    @Then("Verify screen transit to compare plans screen")
    public void Verifyscreentransittocompareplansscreen() {
        tataSkyFreemiumApp.subscription.waitTime(5000);
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isComparePlansTitle());
    }

    @And("Tap on Back button on Select a Payment Option screen")
    public void TaponBackbuttononSelectaPaymentOptionscreen() {
        tataSkyFreemiumApp.subscription.tapOnBackBtnPaymentOption();
    }

    @And("Tap on To Select Plan {int}")
    public void GetofferedPlan(int arg1) {
        tataSkyFreemiumApp.subscription.tapOnToSelectPlan(arg1);
    }

    @Then("Verify Offered price and Payable Amount are same")
    public void VerifyOfferedpriceandPayableAmountaresame() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPayableSameasOfferedAmount());
    }

    @And("Tap to More Banks")
    public void TaptoMoreBanks() {
        tataSkyFreemiumApp.subscription.tapOnMoreBanksBtn();
    }
    @Then("Verify screen transit to Popular Banks screen")
    public void VerifyscreentransittoPopularBanksscreen() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isSearchBanksTextBox());
    }

    @And("Tap on netbanking back button")
    public void Taponnetbankingbackbutton() {
        tataSkyFreemiumApp.subscription.tapOnNetbankingBackBtn();
    }

//    @And("Swipe to plan <{string}>")
//    public void Swipetofindplan(String arg1) {
//        tataSkyFreemiumApp.subscription.waitTime(20000);
//        tataSkyFreemiumApp.subscription.CheckedandSwipe(arg1);}

    @And("Tap on Credit Debit Cards")
    public void TaponCreditDebitCards() {
        tataSkyFreemiumApp.subscription.waitTime(5000);
        tataSkyFreemiumApp.subscription.tapOnCreditDebitCards();
    }

    @Then("Verify screen transit Add Card Screen")
    public void VerifyscreentransitAddCardScreen() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPCardNumber());
    }

    @And("Select the bank")
    public void Selectthebank() {
        tataSkyFreemiumApp.subscription.waitTime(5000);
        tataSkyFreemiumApp.subscription.SearchBank();
    }
    @And("Tap on Make Payment")
    public void TaponMakePayment() {
        String content = tataSkyFreemiumApp.subscription.driver.getContext();
        System.out.println(content);
        tataSkyFreemiumApp.subscription.waitTime(5000);
        tataSkyFreemiumApp.subscription.tapOnMakePayment();
    }

    @And("Tap on Bank Status")
    public void TaponBankStatus() {
        tataSkyFreemiumApp.subscription.waitTime(3000);
        String content = tataSkyFreemiumApp.subscription.driver.getContext();
        System.out.println(content);
        tataSkyFreemiumApp.subscription.tapOnBnakStatus();
    }

    @And("Tap on Success")
    public void TaponSuccess() {
        tataSkyFreemiumApp.subscription.waitTime(3000);
        tataSkyFreemiumApp.subscription.tapOnSuccess();
    }

    @And("Tap on Submit Form")
    public void TaponSubmitForm() {
        tataSkyFreemiumApp.subscription.waitTime(3000);
        tataSkyFreemiumApp.subscription.tapOnSubmitForm();
        tataSkyFreemiumApp.subscription.waitTime(20000);
    }

    @And("Enter Credit Card Number {string}")
    public void EnterCreditCardNumber(String arg1) {
        tataSkyFreemiumApp.subscription.waitTime(3000);
        tataSkyFreemiumApp.subscription.EnterCardNumber(arg1);
    }

    @And("Enter Expire Date {string}")
    public void EnterExpireDate(String arg2) {
        tataSkyFreemiumApp.subscription.EnterExpiryDate(arg2);
    }

    @And("Enter CVV {string}")
    public void EnterCVV(String arg3) {
        tataSkyFreemiumApp.subscription.EnterCVV(arg3);
    }

    @And("Enter Card OTP {string}")
    public void EnterCardOTP(String arg4) {
        tataSkyFreemiumApp.subscription.waitTime(8000);
        tataSkyFreemiumApp.subscription.EnterCardOTP(arg4);
    }

    @Then("Verify subscription page is opened")
    public void Verifysubscriptionpageisopened() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isLoginPageOpened());
    }


    @And("Tap on Header Subscribe")
    public void TaponHeaderSubscribe() {
        tataSkyFreemiumApp.subscription.waitTime(2000);
        tataSkyFreemiumApp.subscription.tapHeaderSubscribe();
    }

    @And("Tap on existing user login")
    public void Taponexistinguserlogin() {
        tataSkyFreemiumApp.subscription.waitTime(2000);
        tataSkyFreemiumApp.subscription.tapOnExistingUserLogin();
    }
    @Then("Verify default plan selected on subscription {string}")
    public void Verifydefaultplanselectedonsubscription(String arg1) {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isDefaultSelectPlan(arg1));
    }

    @Then("Verify Plan added successfully")
    public void VerifyPlanaddedsuccessfully() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPlanAddedTitle());
    }

    @Then("Verify Plan changed successfully")
    public void VerifyPlanchangedsuccessfully() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPlanChanged());
    }

    @And("Tap on Cancel Plan")
    public void TaponCancelPlan() {
        tataSkyFreemiumApp.subscription.waitTime(3000);
        tataSkyFreemiumApp.subscription.tapCancelPlan();
    }

    @Then("Verify Plan Cancelled successfully")
    public void VerifyPlanCancelledsuccessfully() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isPlanCancelled());
    }

    @Then("Verify change plan subscription page is opened")
    public void Verifychangeplansubscriptionpageisopened() {
        Assert.assertTrue(tataSkyFreemiumApp.subscription.isChangePlanTitle());
    }



    @AfterStep("@Subscription")
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            if (ThreadLocalDriver.getTLDriver() != null) {
                scenario.attach(((TakesScreenshot) ThreadLocalDriver.getTLDriver()).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
            } else if (ThreadLocalDriver.getTLIOSDriver() != null) {
                scenario.attach(((TakesScreenshot) ThreadLocalDriver.getTLIOSDriver()).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
            }
        }
    }

}
