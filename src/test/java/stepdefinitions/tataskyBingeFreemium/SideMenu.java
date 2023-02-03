package stepdefinitions.tataskyBingeFreemium;

import core.ThreadLocalDriver;
import core.managers.logmanager.filemanager.JSONReader;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.json.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import core.managers.logmanager.filemanager.JSONReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Random;

public class SideMenu extends BaseStep {

    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }

    @Given("App should be in logout state.")
    public void userIsOnHomeScreen() {
        System.out.println("inside given");
//        tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
        tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
        tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
        if (!tataSkyFreemiumApp.sideMenu.isLoggedIn()) {
            tataSkyFreemiumApp.sideMenu.tapOnSettingsMenu();
            tataSkyFreemiumApp.sideMenu.logout();
            tataSkyFreemiumApp.freemiumHomePage.waitTime(2000);
        }
//        else if (ThreadLocalDriver.getTLIOSDriver().getPlatformName().equalsIgnoreCase("ios")) {
//            HashMap<String, Object> args = new HashMap<>();
//            args.put("direction", "left");
//            args.put("velocity", 2500);
//            ThreadLocalDriver.getTLIOSDriver().executeScript("mobile: swipe", args);
//        }
        else
            ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
    }

    @And("Click on the Hamburger menu on the top left side of the screen .")
    public void clickOnTheHamburgerMenuOnTheTopLeftSideOfTheScreen() {
        if (!tataSkyFreemiumApp.sideMenu.isSideMenuOpened())
            tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
           tataSkyFreemiumApp.freemiumHomePage.waitTime(2000);
            tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
    }

    @Then("Profile picture icon, Login button, Subscribe, Binge List,Notification,Settings, Help & Support,Terms & Conditions, Privacy policy and Version Number.")
    public void profilePictureIconLoginButtonGoVIPBingeListNotificationSettingsHelpSupportTermsConditionsPrivacyPolicyAndVersionNumber() {
        tataSkyFreemiumApp.sideMenu.withoutLoginSideMenuItems();
    }

    @Given("App should be in logged-in state with <{string}>.")
    public void appShouldBeInLoggedInStateWith(String arg0) {
        System.out.println("inside given");
        tataSkyFreemiumApp.freemiumHomePage.waitTime(5000);
        tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
        tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
        if (tataSkyFreemiumApp.sideMenu.isLoggedIn()) {
            tataSkyFreemiumApp.sideMenu.tapONLoginButton();
            tataSkyFreemiumApp.freemiumHomePage.tapOnNewLoginButton();
            tataSkyFreemiumApp.freemiumHomePage.waitTime(5000);
            tataSkyFreemiumApp.freemiumHomePage.enterMobileNumber(arg0);
            tataSkyFreemiumApp.freemiumHomePage.tapOnGetOTPButton();
            tataSkyFreemiumApp.freemiumHomePage.enterOTP();
            tataSkyFreemiumApp.freemiumHomePage.waitTime(5000);
        } else
            ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
    }

    @Then("Profile picture icon, Mobile Number, Go VIP, Binge List,Notification,Settings, Help & Support,Terms & Conditions, Privacy policy and Version Number.")
    public void profilePictureIconMobileNumberGoVIPBingeListNotificationSettingsHelpSupportTermsConditionsPrivacyPolicyAndVersionNumber() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.nonDTH_WithLout_Subscription_SideMenuItems());
    }

    @Then("Profile picture icon, Mobile Number, Tata Sky DTH Balance Go VIP, Binge List,Notification,Settings, Help & Support,Terms & Conditions, Privacy policy and Version Number.")
    public void profilePictureIconMobileNumberTataSkyDTHBalanceGoVIPBingeListNotificationSettingsHelpSupportTermsConditionsPrivacyPolicyAndVersionNumber() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.DTH_With_Subscription_SideMenuItems());
    }

    @And("Click on settings tab on the side menu .")
    public void clickOnSettingsTabOnTheSideMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnSettingsMenu();
    }

    @Then("Settings title, Back button,Expandable Edit Profile,Expandable Parental PIN,Expandable Transaction History,Expandable Content Language,Expandable Device Management,Notification setting tab with on off switch,Autoplay trailers with on off switch, Account Refresh and Log Out button.")
    public void settingsTitleExpandableBackButtonExpandableEditProfileExpandableParentalPINExpandableTransactionHistoryExpandableContentLanguageExpandableDeviceManagementNotificationSettingTabWithOnOffSwitchAutoPlayTrailersWithOnOffSwitchAccountRefreshAndLogOutButton() {
        tataSkyFreemiumApp.sideMenu.isSettingMenuOpened();
    }

    @And("Click on My Plan, Subscribe tab on the side menu.")
    public void clickOnMyPlanTabOnTheSideMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnMyPlanMenu();
    }

    @Then("User should navigate to My Plan screen.")
    public void userShouldNavigateToMyPlanScreen() {
        tataSkyFreemiumApp.sideMenu.MyPlanScreenOpened();
    }

    @Then("Login screen should be opened.")
    public void loginScreenShouldBeOpened() {
        tataSkyFreemiumApp.sideMenu.isLoginDrawerOpened();
    }

    @And("Click on Binge List tab on the side menu.")
    public void clickOnBingeListTabOnTheSideMenu() {

        tataSkyFreemiumApp.sideMenu.tapOnBingeListMenu();
    }

    @Then("User should navigate to Binge List screen.")
    public void userShouldNavigateToBingeListScreen() {
        tataSkyFreemiumApp.sideMenu.BingeListMenuScreenOpened();
    }

    @Then("User should navigate to Settings screen.")
    public void userShouldNavigateToSettingsScreen() {
        tataSkyFreemiumApp.sideMenu.SettingsMenuScreenOpened();
    }

    @And("Click on Notifications tab on the side menu.")
    public void clickOnNotificationsTabOnTheSideMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnNotificationMenu();
    }

    @Then("User should navigate to Notifications screen.")
    public void userShouldNavigateToNotificationsScreen() {
        tataSkyFreemiumApp.sideMenu.NotificationMenuScreenOpened();
    }

    @And("Click on Help and Support tab on the side menu.")
    public void clickOnHelpAndSupportTabOnTheSideMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnHelpAndSupportMenu();
    }

    @Then("User should navigate to Help and Support screen.")
    public void userShouldNavigateToHelpAndSupportScreen() {
        tataSkyFreemiumApp.sideMenu.HelpAndSupportMenuScreenOpened();
    }

    @And("Enter text in help and support search")
    public void Entertextinhelpandsupportsearch() {
        tataSkyFreemiumApp.sideMenu.HelpAndSupportTaponSearch();
    }

    @Then("Verify help and support search result displayed")
    public void Verifyhelpandsupportsearchresultdisplayed() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isHelpandSupportResult());
    }

    @And("Click on Terms and Condition tab on the side menu.")
    public void clickOnTermsAndConditionTabOnTheSideMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnTermsandConditions();
    }

    @Then("User should navigate to Terms and Condition screen.")
    public void userShouldNavigateToTermsAndConditionScreen() {
        tataSkyFreemiumApp.sideMenu.TermsAndConditionMenuScreenOpened();
    }

    @And("Click on Privacy Policy tab on the side menu.")
    public void clickOnPrivacyPolicyTabOnTheSideMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnPrivacyPolicy();
    }

    @Then("User should navigate to Privacy Policy screen.")
    public void userShouldNavigateToPrivacyPolicyScreen() {
        tataSkyFreemiumApp.sideMenu.PrivacyPolicyScreenOpened();
    }

    @And("Click on Edit Profile tab on the setting menu.")
    public void clickOnEditProfileTabOnTheSettingMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnSettingsEditProfile();
    }

    @Then("User should navigate to Edit Profile screen.")
    public void userShouldNavigateToEditProfileScreen() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isSettingsEditScreenOpened());
    }

    @And("Click on Content Language tab on the setting menu.")
    public void clickOnContentLanguageTabOnTheSettingMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnSettingsContentLanguage();
    }

    @Then("User should navigate to Content Language screen.")
    public void userShouldNavigateToContentLanguageScreen() {
        tataSkyFreemiumApp.sideMenu.isSettingsContentLanguageScreenOpened();
    }

    @And("Click on Parental Control tab on the setting menu.")
    public void clickOnParentalControlTabOnTheSettingMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnSettingsParentalControl();
    }

    @Then("User should navigate to Parental Control screen.")
    public void userShouldNavigateToParentalControlScreen() {
        tataSkyFreemiumApp.sideMenu.isSettingsParentalControlOpened();
    }

    @And("Click on Transaction History tab on the setting menu.")
    public void clickOnTransactionHistoryTabOnTheSettingMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnSettingsTransactionHistory();
    }

    @And("Click on Manage Devices tab on the setting menu.")
    public void clickOnManageDevicesTabOnTheSettingMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnSettingsManageDevice();
    }

    @Then("User should navigate to Manage Devices screen.")
    public void userShouldNavigateToManageDevicesScreen() {
        tataSkyFreemiumApp.sideMenu.isSettingsManageDeviceScreenOpened();
    }

    @And("Click on Profile icon on the side menu .")
    public void clickOnProfileIconOnTheSideMenu() {
        tataSkyFreemiumApp.sideMenu.tapOnProfileIcon();
    }


    @And("Click on Go VIP tab on the side menu before login.")
    public void clickOnMyPlanTabOnTheSideMenuBeforeLogin() {
        tataSkyFreemiumApp.sideMenu.tapOnGoVIPMenu();

    }

    @Then("Update Email Id <{string}> in Edit Profile screen App.")
    public void updateNameEmailIdFieldInEditProfileScreenWeb(String emailId) {
       // tataSkyFreemiumApp.sideMenu.updateNameField(name);
        tataSkyFreemiumApp.sideMenu.updateEmailIdField(emailId);
        tataSkyFreemiumApp.sideMenu.clickOnConfirmButton();
        tataSkyFreemiumApp.sideMenu.tapOnSettingsEditProfile();
        tataSkyFreemiumApp.sideMenu.waitTime(7000);
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isEditProfileUpdate(emailId));

    }

    public String RandomMobileNumber(){

        Random rand = new Random();
        int num1 = 658;
        //int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(10000);
        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
        DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros
        String phoneNumber = df3.format(num1) + df3.format(num2) + df4.format(num3);
        return phoneNumber;
    }

    @Given("App should be in logged-in state")
    public void appShouldBeInLoggedInState() {
       jsonReader = new JSONReader("deviceDetails.json");
        if (ThreadLocalDriver.getTLDriver().getCurrentPackage().equalsIgnoreCase("com.tatasky.binge.uat")) {
            {
                String arg0 = jsonReader.getJSONValue("phoneNumber","RMN_UAT");
               // String arg0=RandomMobileNumber();
                System.out.println("inside given");
           //     tataSkyFreemiumApp.freemiumHomePage.waitTime(5000);
                tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
                tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
                if (tataSkyFreemiumApp.sideMenu.isLoggedIn()) {
                    tataSkyFreemiumApp.sideMenu.tapONLoginButton();
                    tataSkyFreemiumApp.freemiumHomePage.tapOnNewLoginButton();
              //      tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                    tataSkyFreemiumApp.freemiumHomePage.enterMobileNumber(arg0);
                    tataSkyFreemiumApp.freemiumHomePage.tapOnGetOTPButton();
               //     tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                    tataSkyFreemiumApp.freemiumHomePage.enterOTP();
                    tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                    tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
                } else {
                    ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
                }
            }
        }else{
            String arg0 = jsonReader.getJSONValue("phoneNumber","RMN_Prod");
        System.out.println("inside given");
        tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
        tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
        tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
        if (tataSkyFreemiumApp.sideMenu.isLoggedIn()) {
            tataSkyFreemiumApp.sideMenu.tapONLoginButton();
            tataSkyFreemiumApp.freemiumHomePage.tapOnNewLoginButton();
//            tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
            tataSkyFreemiumApp.freemiumHomePage.enterMobileNumber(arg0);
//            tataSkyFreemiumApp.freemiumHomePage.waitTime(2000);
            tataSkyFreemiumApp.freemiumHomePage.ClearNotification();
            tataSkyFreemiumApp.freemiumHomePage.tapOnGetOTPButton();
            tataSkyFreemiumApp.freemiumHomePage.waitTime(15000);
       //     tataSkyFreemiumApp.sideMenu.swipetoOTP();
        //    tataSkyFreemiumApp.freemiumHomePage.TapToEnterOTP();
        //    tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
            tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
        } else{
            ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
    }
        }
    }

    @Then("Enter Login details")
    public void EnterLogindetails() {
        jsonReader = new JSONReader("deviceDetails.json");
        if (ThreadLocalDriver.getTLDriver().getCurrentPackage().equalsIgnoreCase("com.tatasky.binge.uat")) {
            {
                String arg0 = jsonReader.getJSONValue("phoneNumber","RMN_UAT");
                // String arg0=RandomMobileNumber();
                System.out.println("inside given");
                //     tataSkyFreemiumApp.freemiumHomePage.waitTime(5000);
                    tataSkyFreemiumApp.freemiumHomePage.tapOnNewLoginButton();
                    //      tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                    tataSkyFreemiumApp.freemiumHomePage.enterMobileNumber(arg0);
                    tataSkyFreemiumApp.freemiumHomePage.tapOnGetOTPButton();
                    //     tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                    tataSkyFreemiumApp.freemiumHomePage.enterOTP();
                    tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                    tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
                }

        }else{
            String arg0 = jsonReader.getJSONValue("phoneNumber","RMN_Prod");
            System.out.println("inside given");
            tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                tataSkyFreemiumApp.freemiumHomePage.tapOnNewLoginButton();
//            tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                tataSkyFreemiumApp.freemiumHomePage.enterMobileNumber(arg0);
//            tataSkyFreemiumApp.freemiumHomePage.waitTime(2000);
                tataSkyFreemiumApp.freemiumHomePage.ClearNotification();
                tataSkyFreemiumApp.freemiumHomePage.tapOnGetOTPButton();
                tataSkyFreemiumApp.freemiumHomePage.waitTime(15000);
                //     tataSkyFreemiumApp.sideMenu.swipetoOTP();
                //    tataSkyFreemiumApp.freemiumHomePage.TapToEnterOTP();
                //    tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
                tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
        }
    }

    @Then("verify the login from Subscribe button from home,My plan screen")
    public void verifytheloginfromSubscribebuttonfromhomeMyplanscreen() {
        Assert.assertFalse(tataSkyFreemiumApp.freemiumHomePage.isOTPDialog());

    }

    @And("Guest login after plan selection")
    public void Guestloginafterplanselection() {
        String arg0=RandomMobileNumber();
            tataSkyFreemiumApp.freemiumHomePage.tapOnNewLoginButton();
            tataSkyFreemiumApp.freemiumHomePage.waitTime(5000);
            tataSkyFreemiumApp.freemiumHomePage.enterMobileNumber(arg0);
            tataSkyFreemiumApp.freemiumHomePage.tapOnGetOTPButton();
            tataSkyFreemiumApp.freemiumHomePage.enterOTP();
            tataSkyFreemiumApp.freemiumHomePage.waitTime(5000);
    }

    @And("Tap on Cancel Button.")
    public void TaponCancelButton() {
        tataSkyFreemiumApp.sideMenu.tapOnCancelBtn();
    }

    @And("Select Content Language")
    public void SelectContentLanguage() {
        tataSkyFreemiumApp.sideMenu.selectNewContentLanguage();
    }

    @And("Select Content Language Remove")
    public void SelectContentLanguageRemove() {
        tataSkyFreemiumApp.sideMenu.selectContentLanguageRemove();
    }

    @Then("Verify content language is added in the Content Language Screen app.")
    public void VerifycontentlanguageisaddedintheContentLanguageScreenapp() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isContentLanguageSelected());
    }

    @Then("Verify content language is unselected in the Content Language Screen app.")
    public void VerifycontentlanguageisunselectedintheContentLanguageScreenapp() {
        Assert.assertFalse(tataSkyFreemiumApp.sideMenu.isContentLanguageSelected());
    }

    @And("Click on Account Refresh button")
    public void ClickonAccountRereshbutton() {
        tataSkyFreemiumApp.sideMenu.tapOnAccountRefresh();
    }

    @Then("Verify Account is Refreshed")
    public void VerifyAccountisRefreshed() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isAccountRefreshed());
    }

    @And("Tap on Logout button.")
    public void TaponLogoutbutton() {
        tataSkyFreemiumApp.sideMenu.tapOnlogout();
    }

    @And("Tap on Not Now button")
    public void TaponNotNowbutton() {
        tataSkyFreemiumApp.sideMenu.tapOnNotNow();
    }

    @And("Set Viewing Restrictions {int}")
    public void SetViewingRestrictions(int pset) {
        tataSkyFreemiumApp.sideMenu.SetViewingRestrictions(pset);
    }

    @And("Set Viewing Restrictions first time {int}")
    public void SetViewingRestrictionsfirsttime(int pset) {

    if(tataSkyFreemiumApp.sideMenu.isViewingRestrictions()) {
        tataSkyFreemiumApp.sideMenu.tapOnViewingRestrictions();
        tataSkyFreemiumApp.sideMenu.enterParentalPinStatic();
        tataSkyFreemiumApp.sideMenu.tapOnParentalPinProceedBtn();
        tataSkyFreemiumApp.sideMenu.SetViewingRestrictions(pset);
        tataSkyFreemiumApp.sideMenu.tapOnSetBtn();
    } else{
        tataSkyFreemiumApp.sideMenu.SetViewingRestrictions(pset);
        tataSkyFreemiumApp.sideMenu.tapOnSetBtn();
        tataSkyFreemiumApp.sideMenu.swipetoOTP();
        tataSkyFreemiumApp.freemiumHomePage.TapToEnterOTP();
        tataSkyFreemiumApp.sideMenu.enterParentalPinStatic();
        tataSkyFreemiumApp.sideMenu.tapOnParentalPinProceedBtn();
    }
   }

    @And("Tap on Parental Control proceed button")
    public void TaponParetnalControlproceedbutton() {
        tataSkyFreemiumApp.sideMenu.tapOnParentalSetupProceedBtn();
    }

    @And("Tap on Parental Control Pin proceed button")
    public void TaponParentalControlPinproceedbutton() {
        tataSkyFreemiumApp.sideMenu.tapOnParentalPinProceedBtn();
    }

    @Then("Verify Parental Pin setup successfully {string}")
    public void VerifyParentalPinsetupsucessfully(String arg0) {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isParentalPinSet(arg0));
    }

    @And("Enter Parental Pin")
    public void enterOTPInOTPTextBoxes() {
        tataSkyFreemiumApp.sideMenu.enterParentalPin();
    }

    @And("Go to home screen")
    public void Gotohomescreen() {
         tataSkyFreemiumApp.sideMenu.tapOnBackBtn();
        tataSkyFreemiumApp.sideMenu.tapOnBackBtn();
        tataSkyFreemiumApp.sideMenu.waitTime(3000);
    }

    @And("Verify Parental Pin PopUP is displayed")
    public void VerifyParentalPinPopUPisdisplayed() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isEnterPinTitle());
    }

    @And("Verify Parental Pin PopUP is not displayed")
    public void VerifyParentalPinPopUPisnotdisplayed() {
        Assert.assertFalse(tataSkyFreemiumApp.sideMenu.isEnterPinTitle());
    }

    @And("Tap on Discover To Add button in Binge List Screen on App.")
    public void TaponDiscoverToAddbuttoninBingeListScreenonApp() {
        tataSkyFreemiumApp.sideMenu.tapOnDiscoverTOAdd();
        tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
    }

    @And("Verify video added to binge List in Binge List Screen on app")
    public void VerifyvideoaddedtobingeListinBingListScreenonapp() {
        Assert.assertFalse(tataSkyFreemiumApp.sideMenu.isDiscoverTOAdd());
    }

    @And("Remove content from binge list")
    public void Removecontentfrombingelist() {
        tataSkyFreemiumApp.sideMenu.tapOnSelectBtn();
        tataSkyFreemiumApp.contentDetails.tapOnMovie();
        tataSkyFreemiumApp.sideMenu.tapOnSelectBtn();
    }
    @Given("Binge list should be Empty")
    public void BingelistshouldbeEmpty() {
     if(tataSkyFreemiumApp.sideMenu.isBingeListEmptyMessage()){
     }else{
         tataSkyFreemiumApp.sideMenu.tapOnSelectBtn();
         tataSkyFreemiumApp.contentDetails.tapOnMovie();
         tataSkyFreemiumApp.sideMenu.tapOnSelectBtn();
     }
      }



    @And("Click on Select button.")
    public void ClickonSelectbutton() {
        tataSkyFreemiumApp.sideMenu.tapOnSelectBtn();
    }
    @And("Click on any content card.")
    public void Clickonanycontentcard() {
        tataSkyFreemiumApp.contentDetails.tapOnMovie();
    }

    @And("Clicked card should be selected from Remove")
    public void ClickedcardshouldbeselectedfromRemove() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isBingeListContentSelected());
    }

    @Then("Select Content count should be matched with the number display on Remove button")
    public void SelectContentcountshouldbematchedwiththenumberdisplayonRemovebutton() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isBingeListSelectedCountMatched());
       // Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isBingeListContentSelected());
    }


    @And("Verify video is removed to binge List in Binge List Screen on app")
    public void VerifyvideoisremovedtobingeListinBingeListScreenonapp() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isDiscoverTOAdd());
    }
    @And("Tap on Parental Pin to change the pin")
    public void TaponParentalPintochangethepin() {
        tataSkyFreemiumApp.freemiumHomePage.ClearNotification();
        tataSkyFreemiumApp.sideMenu.tapOnParentalPin();
    }

    @And("Tap on Viewing Restrictions")
    public void TaponViewingRestrictions() {
        tataSkyFreemiumApp.sideMenu.tapOnViewingRestrictions();
    }

    @Then("Verify Parental Pin Changed Successfully")
    public void VerifyParentalPinChangedSuccessfully() {
        tataSkyFreemiumApp.sideMenu.waitTime(3000);
        tataSkyFreemiumApp.sideMenu.tapOnViewingRestrictions();
        tataSkyFreemiumApp.sideMenu.enterParentalPinStatic();
        // tataSkyFreemiumApp.sideMenu.enterParentalPin();
        tataSkyFreemiumApp.sideMenu.tapOnParentalPinProceedBtn();
        tataSkyFreemiumApp.sideMenu.waitTime(3000);
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isParentalControlSetting());
    }

    @And("Tap on Forget PIN")
    public void TaponForgetPIN() {
        tataSkyFreemiumApp.freemiumHomePage.ClearNotification();
        tataSkyFreemiumApp.sideMenu.tapOnForgetPIN();
    }

    @And("Tap on Not Now Parental PIN dialog box")
    public void TaponNotNowParentalPINdialogbox() {
        tataSkyFreemiumApp.sideMenu.tapOnParentalPINNotNow();
    }
    @And("Verify Enter Pin dialog box get cancelled")
    public void VerifyEnterPindialogboxgetcancelled() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isViewingRestrictions());
    }

    @And("Tap on Set button")
    public void TaponSetbutton() {
        tataSkyFreemiumApp.sideMenu.tapOnSetBtn();
    }

    @And("Enter Parental Pin 1")
    public void EnterParentalPin1() {
        tataSkyFreemiumApp.sideMenu.enterParentalPinStatic();
    }

    @Then("Binge List icon, Empty message , and description should be on Binge List screen.")
    public void BingeListiconEmptymessageanddescriptionshouldbeonBingeListscreen() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isBingeListIcon());
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isBingeListEmptyMessage());
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isBingeListDescription());
    }

    @Then("Should changed the content card to selection mode")
    public void Shouldchangedthecontentcardtoselectionmode() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isBingeListSelectOverlay());
      }

    @Given("AutoPlay Trailers should be OFF")
    public void AutoPlayTrailersshouldbeOFF() {
        if(tataSkyFreemiumApp.sideMenu.isAutoPlayTrailersOn())

        tataSkyFreemiumApp.sideMenu.tapAutoPlayTrailers();
    }

    @Given("AutoPlay Trailers should be ON")
    public void AutoPlayTrailersshouldbeON() {
        if(!tataSkyFreemiumApp.sideMenu.isAutoPlayTrailersOn())

            tataSkyFreemiumApp.sideMenu.tapAutoPlayTrailers();
    }


    @And("Tap on Settings Back Button")
    public void TaponSettingsBackButton() {
            tataSkyFreemiumApp.sideMenu.tapOnBackBtn();
    }

    @And("Swipe to get OTP")
    public void swipetoOTP() {
        tataSkyFreemiumApp.sideMenu.swipetoOTP();
    }

    @Then("Verify Parental Pin setup successfully toast message {string}" )
    public void verifyRailsDispalyedCorrectly(String arg){
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.verifyToastMessageDisplayed(arg));
    }

    @And("Click on Notification Settings toggle button on the setting menu")
    public void clickonNotificationSettingstogglebuttononthesettingMenu() {
        tataSkyFreemiumApp.sideMenu.tapNotificationSettings();
    }
    @Given("Notification Settings should be Off")
    public void NotificationSettingsshouldbeOff() {
        if(tataSkyFreemiumApp.sideMenu.isNotificationSettings())

            tataSkyFreemiumApp.sideMenu.tapNotificationSettings();
    }
    @Given("Notification Settings should be ON")
    public void NotificationSettingsshouldbeON() {
        if(!tataSkyFreemiumApp.sideMenu.isNotificationSettings())

            tataSkyFreemiumApp.sideMenu.tapNotificationSettings();
    }


    @Then("Verify user is able to change to notification toggle button Off to ON" )
    public void VerifyuserisabletochangetonotificationtogglebuttonOfftoON(){
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isNotificationSettings());
    }

    @Then("Verify user is able to change to notification toggle button ON to OFF" )
    public void VerifyuserisabletochangetonotificationtogglebuttonONtoOFF(){
        Assert.assertFalse(tataSkyFreemiumApp.sideMenu.isNotificationSettings());
    }

    @And("Click on Transaction History tab on the side menu.")
    public void ClickonTransactionHistorytabonthesidemenu() {
        tataSkyFreemiumApp.sideMenu.taponTransactionHistory();
    }

    @Then("User should navigate to Transaction History screen.")
    public void UsershouldnavigatetoTransactionHistoryscreen() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isSettingsTransactionHistoryScreenOpened());
    }

    @And("Tap on Chat button")
    public void TaponChatbutton() {
        tataSkyFreemiumApp.sideMenu.tapOnChatNowBtn();
    }


    @Then("Verify Incorrect Parental Pin message is displayed")
    public void VerifyIncorrectParentalPinmessageisdisplayed() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isIncorrectPinMessage());
    }

    @And("Tap on help and support collapsed button")
    public void Taponhelpandsupportcollapsedbutton() {
        tataSkyFreemiumApp.sideMenu.taponHelpandSupportCollaspedButton();
    }

    @And("Tap on help and support expend button")
    public void Taponhelpandsupportexpendbutton() {
        tataSkyFreemiumApp.sideMenu.taponHelpandSupportCollaspedButton();
    }

    @Then("Verify the user is able to expend the button in help and support")
    public void Verifythehelpandsupportbuttonexpended() {
        Assert.assertFalse(tataSkyFreemiumApp.sideMenu.isHelpandSupportExpended());
    }

    @Then("Verify the user is able to collapsed the button in help and support")
    public void Verifytheuserisabletocollapsedthebuttoninhelpandsupport() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isHelpandSupportExpended());
    }

    @Given("Parental control set to No Restriction")
    public void ParentalcontrolsettoNoRestriction() {
        tataSkyFreemiumApp.freemiumHomePage.waitTime(2000);
        tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
        tataSkyFreemiumApp.sideMenu.tapOnSettingsMenu();
        tataSkyFreemiumApp.sideMenu.tapOnSettingsParentalControl();
        tataSkyFreemiumApp.sideMenu.tapOnViewingRestrictions();
        tataSkyFreemiumApp.sideMenu.enterParentalPinStatic();
        tataSkyFreemiumApp.sideMenu.tapOnParentalPinProceedBtn();
        tataSkyFreemiumApp.sideMenu.SetViewingRestrictions(5);
        tataSkyFreemiumApp.sideMenu.tapOnSetBtn();
        tataSkyFreemiumApp.sideMenu.tapOnBackBtn();
        tataSkyFreemiumApp.sideMenu.tapOnBackBtn();
    }


         @AfterStep("@SideMenu")
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
