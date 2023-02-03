package app.tatasky.freemium;

import core.managers.logmanager.MyLogger;
import core.uiactions.UiActions;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class SideMenu extends UiActions {

    public SideMenu(MobileDriver<MobileElement> driver) {
        super(driver);
    }


    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_profile"),
    @FindBy(id = "com.tatasky.binge:id/iv_profile")})
    MobileElement Default_Profile_Picture_Icon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'91')]")
    private MobileElement login_main;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_text_login"),
    @FindBy(id = "com.tatasky.binge:id/tv_text_login")})
    private MobileElement Login_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/menu_item_with_recharge"),
    @FindBy(id = "com.tatasky.binge:id/menu_item_with_recharge")})
    private MobileElement Menu_Item_Tata_Sky_DTH_Balance;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/menu_item_go_vip"),
    @FindBy(id = "com.tatasky.binge:id/menu_item_go_vip")})
    private MobileElement Menu_Item_Go_VIP;

    @FindAll({@FindBy(xpath = "//android.widget.TextView[@text='My Plan']"),
    @FindBy(id="com.tatasky.binge.uat:id/menu_item_go_vip"),
    @FindBy(id = "com.tatasky.binge:id/menu_item_go_vip"),
    @FindBy(xpath = "//android.widget.TextView[@text='Subscribe']")})
    private MobileElement Menu_Item_My_Plan;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/menu_item_bingeList"),
    @FindBy(id = "com.tatasky.binge:id/menu_item_bingeList")})
    private MobileElement Menu_Items_Binge_List;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/menu_item_notification"),
    @FindBy(id = "com.tatasky.binge:id/menu_item_notification")})
    private MobileElement Menu_Item_Notification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Notifications']")
    private MobileElement Menu_Item_Notification_sScreen_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/menu_item_settings"),
    @FindBy(id = "com.tatasky.binge:id/menu_item_settings")})
    private MobileElement Menu_Item_Setting;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/menu_item_help_and_support"),
    @FindBy(id = "com.tatasky.binge:id/menu_item_help_and_support")})
    private MobileElement Menu_Item_Help_And_Support;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_terms_condition"),
    @FindBy(id = "com.tatasky.binge:id/tv_terms_condition")})
    private MobileElement Term_And_Condition;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_tv_privacy_policy"),
    @FindBy(id = "com.tatasky.binge:id/tv_tv_privacy_policy")})
    private MobileElement Privacy_Policy;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_version_number"),
    @FindBy(id = "com.tatasky.binge:id/tv_version_number")})
    private MobileElement Version_Number;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Help & Support']")
    private MobileElement Help_And_Support_Screen_Title;

    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement Help_And_Support_Search;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms & Conditions']")
    private MobileElement Terms_And_Condition_Screen_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/container_login_bottom_sheet"),
    @FindBy(id = "com.tatasky.binge:id/container_login_bottom_sheet")})
    private MobileElement Login_Drawer;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Notifications']")
    private MobileElement Notifications_Screen_Title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms & Condition']")
    private MobileElement Term_And_Condition_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_sub_landing_title"),
    @FindBy(id = "com.tatasky.binge:id/tv_sub_landing_title")})
    private MobileElement My_Plan_Title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy Policy']")
    private MobileElement Privacy_Policy_Title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Binge List']")
    private MobileElement Binge_List_Title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    private MobileElement Settings_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_subtitle_profile"),
    @FindBy(id = "com.tatasky.binge:id/tv_subtitle_profile")})
    private MobileElement Profile_Mobile_Number;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/view_edit_profile"),
    @FindBy(id = "com.tatasky.binge:id/view_edit_profile")})
    private MobileElement Setting_Edit_Profile;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Edit Profile']")
    private MobileElement Setting_Edit_Profile_Screen_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/view_parental_pin"),
    @FindBy(id = "com.tatasky.binge:id/view_parental_pin")})
    private MobileElement Setting_Parental_Control;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Parental Control']")
    private MobileElement Setting_Parental_Control_Screen_Title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Set viewing restrictions]")
    private MobileElement Setting_Parental_Control_Screen_Set_viewing_restrictions_Title;

    @AndroidFindBy(className = "android.view.ViewGroup")
    private MobileElement Setting_Parental_Control_Screen_View_Restriction_All_Content_Restricted;

    @AndroidFindBy(className = "android.view.ViewGroup")
    private MobileElement Setting_Parental_Control_Screen_View_Restriction_7_Content_Restricted;

    @AndroidFindBy(className = "android.view.ViewGroup")
    private MobileElement Setting_Parental_Control_Screen_View_Restriction_13_Content_Restricted;

    @AndroidFindBy(className = "android.view.ViewGroup")
    private MobileElement Setting_Parental_Control_Screen_View_Restriction_16_Content_Restricted;

    @AndroidFindBy(className = "android.view.ViewGroup")
    private MobileElement Setting_Parental_Control_Screen_View_Restriction_18_Content_Restricted;

    @AndroidFindBy(className = "android.view.ViewGroup")
    private MobileElement Setting_Parental_Control_Screen_View_No_Restriction;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_proceed_fragment_parental_control_rating"),
    @FindBy(id = "com.tatasky.binge:id/btn_proceed_fragment_parental_control_rating")})
    private MobileElement Setting_Parental_Control_Screen_Proceed_Button;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/view_transaction_history"),
    @FindBy(id = "com.tatasky.binge:id/view_transaction_history")})
    private MobileElement Setting_Transaction_history;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transaction History']")
    private MobileElement Setting_Transaction_history_Screen_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_sub_id"),
    @FindBy(id = "com.tatasky.binge:id/tv_sub_id")})
    private MobileElement Setting_Transaction_history_Screen_SubscriptionID;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/view_content_language"),
    @FindBy(id = "com.tatasky.binge:id/view_content_language")})
    private MobileElement Setting_Content_Language;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Content Language']")
    private MobileElement Setting_Content_Language_Screen_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/view_device_management"),
    @FindBy(id = "com.tatasky.binge:id/view_device_management")})
    private MobileElement Setting_Device_Management;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Devices']")
    private MobileElement Setting_Device_Management_Screen_title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tvDeviceName"),
    @FindBy(id = "com.tatasky.binge:id/tvDeviceName")})
    private MobileElement Setting_Device_Management_Screen__Devices;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/view_notification_settings"),
    @FindBy(id = "com.tatasky.binge:id/view_notification_settings")})
    private MobileElement Setting_Notification_Settings;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/view_auto_trailer"),
    @FindBy(id = "com.tatasky.binge:id/view_auto_trailer")})
    private MobileElement Setting_Autoplay_Trailers;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_account_refresh"),
    @FindBy(id = "com.tatasky.binge:id/tv_account_refresh")})
    private MobileElement Account_Refresh;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_log_out"),
    @FindBy(id = "com.tatasky.binge:id/tv_log_out")})
    private MobileElement Logout;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_dialog_primary"),
    @FindBy(id = "com.tatasky.binge:id/btn_dialog_primary")})
    private MobileElement LogoutDialog_Logout_Button;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_dialog_secondary"),
    @FindBy(id = "com.tatasky.binge:id/btn_dialog_secondary")})
    private MobileElement LogoutDialog_Not_Now_Button;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.Switch")
    MobileElement Setting_AutoplayTrailers_Switch;

    @FindAll({@FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView[3]"),
    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView[3]")})
    private MobileElement Setting_Notifications_Switch;

    @AndroidFindBy(className = "android.widget.ImageButton")
    MobileElement Setting_Back_Button;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/et"),
    @FindBy(id = "com.tatasky.binge:id/et")})
    private List<MobileElement> Edit_Text_Box;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btnUpdateProfile"),
    @FindBy(id = "com.tatasky.binge:id/btnUpdateProfile")})
    private MobileElement Update_Profile;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Subscriber Details Updated Successfully.']")
    private MobileElement Update_Toast;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tvCancel"),
    @FindBy(id = "com.tatasky.binge:id/tvCancel")})
    private MobileElement Cancel_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/cv_language"),
    @FindBy(id = "com.tatasky.binge:id/cv_language")})
    private List<MobileElement> Content_LanguageList;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageButton'])")
    private MobileElement Back_Btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Account refresh successful']")
    private MobileElement AccountRefresh_Toast;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_rating_title"),
    @FindBy(id = "com.tatasky.binge:id/tv_rating_title")})
    private List<MobileElement> Parental_Control_list;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_proceed_fragment_parental_control_rating"),
    @FindBy(id = "com.tatasky.binge:id/btn_proceed_fragment_parental_control_rating")})
    private MobileElement Parental_Proceed_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_proceed_parental_pin_setup"),
    @FindBy(id = "com.tatasky.binge:id/btn_proceed_parental_pin_setup")})
    private MobileElement Parental_Pin_Proceed_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_pc_rating_fragment_parental_control_setup"),
    @FindBy(id = "com.tatasky.binge:id/iv_pc_rating_fragment_parental_control_setup")})
    private MobileElement Parental_Pin_Setup;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/title_parental_pin_setup"),
    @FindBy(id = "com.tatasky.binge:id/title_parental_pin_setup")})
    private MobileElement Enter_Pin_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_discover_to_add"),
    @FindBy(id = "com.tatasky.binge:id/btn_discover_to_add")})
    private MobileElement Discover_TO_Add_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/menu_select"),
    @FindBy(id = "com.tatasky.binge:id/menu_select")})
    private MobileElement Select_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_pc_status_fragment_parental_control_setup"),
    @FindBy(id = "com.tatasky.binge:id/tv_pc_status_fragment_parental_control_setup")})
    private MobileElement Parental_Pin_Change_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_pc_rating_fragment_parental_control_setup"),
    @FindBy(id = "com.tatasky.binge:id/tv_pc_rating_fragment_parental_control_setup")})
    private MobileElement Viewing_Restrictions;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_forgot_parental_pin_verification"),
    @FindBy(id = "com.tatasky.binge:id/btn_forgot_parental_pin_verification")})
    private MobileElement ForgetPin_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_cancel_parental_pin_verification"),
    @FindBy(id = "com.tatasky.binge:id/btn_cancel_parental_pin_verification")})
    private MobileElement Pin_NotNow;

    @AndroidFindBy(className = "android.widget.ImageView")
    private MobileElement Bingelist_icon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Binge List is empty!']")
    private MobileElement BingeList_Empty_message;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse and save exciting movies & TV shows to your list']")
    private MobileElement BingeList_Description;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/select_overlay"),
    @FindBy(id = "com.tatasky.binge:id/select_overlay")})
    private List<MobileElement> BingeList_SelectOverlay;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/switchView"),
    @FindBy(id = "com.tatasky.binge:id/switchView")})
    private List<MobileElement> toggle_Btn;

    @FindAll({@FindBy(xpath = "//android.widget.Button[@content-desc='Copy OTP']"),
    @FindBy(xpath = "//android.widget.Button[@content-desc='Copy Verification Code']") })
    private MobileElement Get_OTP;

    @AndroidFindBy(className ="android.widget.EditText")
    private List<MobileElement> Edit_Profile_text;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='incorrect PIN.Please try again.']")
    private MobileElement Incorrect_Pin_Message;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_snackbar_custom_with_two_actions"),
    @FindBy(id = "com.tatasky.binge:id/iv_snackbar_custom_with_two_actions")})
    private MobileElement Snackbar_Close;

    @AndroidFindBy(id = "android:id/status_bar_latest_event_content")
    private MobileElement Android_notification;

    @FindAll({@FindBy(id = "com.tatasky.binge:id/et_pin_dig_1"),
    @FindBy(id = "com.tatasky.binge.uat:id/et_pin_dig_1")})
    private MobileElement Pin_Dig_1;

    @FindAll({@FindBy(id = "com.tatasky.binge:id/et_pin_dig_2"),
    @FindBy(id = "com.tatasky.binge.uat:id/et_pin_dig_2")})
    private MobileElement Pin_Dig_2;

    @FindAll({@FindBy(id = "com.tatasky.binge:id/et_pin_dig_3"),
    @FindBy(id = "com.tatasky.binge.uat:id/et_pin_dig_3")})
    private MobileElement Pin_Dig_3;

    @FindAll({@FindBy(id = "com.tatasky.binge:id/et_pin_dig_4"),
    @FindBy(id = "com.tatasky.binge.uat:id/et_pin_dig_4")})
    private MobileElement Pin_Dig_4;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/menu_select"),
    @FindBy(id = "com.tatasky.binge:id/menu_select")})
    private MobileElement Remove_BingeList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email ID']//following::android.widget.EditText")
    private MobileElement EditBox_Email;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'How can I')]")
    private MobileElement HelpandSupport_Result;

    @AndroidFindBy(className = "android.widget.Image")
    private List<MobileElement> Help_And_Support_Collapsed;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Get help on specific topics')]")
    private MobileElement HelpandSupport_Gethelp;


    String generatedPin= RandomPIN();

    public boolean isSideMenuOpened() {
        return isElementPresent(Menu_Item_Setting);
    }

    public boolean isSettingMenuOpened() {
        return isElementPresent(Settings_Title)
                && isElementPresent(Setting_Back_Button)
                && isElementPresent(Setting_Edit_Profile)
                && isElementPresent(Setting_Content_Language)
                && isElementPresent(Setting_Device_Management)
                && isElementPresent(Setting_Parental_Control)
                && isElementPresent(Setting_Autoplay_Trailers)
                && isElementPresent(Setting_Notification_Settings)
                && isElementPresent(Account_Refresh)
                && isElementPresent(Logout)
                && isElementPresent(Setting_Transaction_history);
    }

    public boolean SettingsMenuItem() {
        return isElementPresent(Menu_Item_Setting);
    }

    public void tapOnProfileIcon() {
        tap(Default_Profile_Picture_Icon);
    }

    public boolean withoutLoginSideMenuItems() {
        return isElementPresent(Default_Profile_Picture_Icon) &&
                isElementPresent(Login_Btn) &&
                isElementPresent(Menu_Item_My_Plan) &&
                isElementPresent(Menu_Items_Binge_List) &&
                isElementPresent(Menu_Item_Setting) &&
                isElementPresent(Menu_Item_Notification) &&
                isElementPresent(Menu_Item_Help_And_Support) &&
                isElementPresent(Privacy_Policy) &&
                isElementPresent(Term_And_Condition) &&
                isElementPresent(Version_Number);
    }

    public boolean nonDTH_WithLout_Subscription_SideMenuItems() {
        return isElementPresent(Default_Profile_Picture_Icon) &&
                isElementPresent(Profile_Mobile_Number) &&
                isElementPresent(Menu_Item_My_Plan) &&
                isElementPresent(Menu_Items_Binge_List) &&
                isElementPresent(Menu_Item_Setting) &&
                isElementPresent(Menu_Item_Notification) &&
                isElementPresent(Menu_Item_Help_And_Support) &&
                isElementPresent(Privacy_Policy) &&
                isElementPresent(Term_And_Condition) &&
                isElementPresent(Version_Number);
    }

    public boolean DTH_With_Subscription_SideMenuItems() {
        return isElementPresent(Menu_Item_Tata_Sky_DTH_Balance)
                && isElementPresent(Default_Profile_Picture_Icon) &&
                isElementPresent(Profile_Mobile_Number) &&
                isElementPresent(Menu_Item_My_Plan) &&
                isElementPresent(Menu_Items_Binge_List) &&
                isElementPresent(Menu_Item_Setting) &&
                isElementPresent(Menu_Item_Notification) &&
                isElementPresent(Menu_Item_Help_And_Support) &&
                isElementPresent(Privacy_Policy) &&
                isElementPresent(Term_And_Condition) &&
                isElementPresent(Version_Number);
    }

    public void tapOnSettingsEditProfile() {
        waitToAppear(Setting_Edit_Profile_Screen_Title);
        tap(Setting_Edit_Profile_Screen_Title);
    }

    public boolean isSettingsEditScreenOpened() {
     // waitTime(3000);
        waitToAppear(Setting_Edit_Profile_Screen_Title);
        return Setting_Edit_Profile_Screen_Title.isDisplayed();
    }


    public void tapOnSettingsContentLanguage() {
       waitToAppear(Setting_Content_Language);
        Setting_Content_Language.click();
    }

    public boolean isSettingsContentLanguageScreenOpened() {
        waitToAppear(Setting_Content_Language_Screen_Title);
        return Setting_Content_Language_Screen_Title.isDisplayed();
    }

    public void tapOnSettingsManageDevice() {
       waitToAppear(Setting_Device_Management);
        Setting_Device_Management.click();
    }

    public boolean isSettingsManageDeviceScreenOpened() {
        waitToAppear(Setting_Device_Management_Screen_title);
        return Setting_Device_Management_Screen_title.isDisplayed();
    }


    public void tapOnSettingsParentalControl() {
     waitToAppear(Setting_Parental_Control);
        Setting_Parental_Control.click();

    }

    public boolean isSettingsParentalControlOpened() {
      waitToAppear(Setting_Parental_Control_Screen_Title);
        return Setting_Parental_Control_Screen_Title.isDisplayed();
    }

    public void tapOnSettingsTransactionHistory() {
        Setting_Transaction_history.click();

    }

    public boolean isSettingsTransactionHistoryScreenOpened() {
       waitToAppear(Setting_Transaction_history_Screen_Title);
        return Setting_Transaction_history_Screen_Title.isDisplayed();
    }

    public boolean AutoplayTrailersEnable() {
        return Setting_AutoplayTrailers_Switch.getAttribute("checked") == "true";
    }

    public void onOffAutoplayTrailersSwitch() {
        tap(Setting_AutoplayTrailers_Switch);
    }

    public void onOffNotificationsSettingSwitch() {
        tap(Setting_Notifications_Switch);
    }

    public boolean notificationSettingsEnable() {
        return Setting_Notifications_Switch.getAttribute("checked") == "true";
    }

    public void tapOnGoVIPMenu() {
        Menu_Item_Go_VIP.click();

    }

    public void tapOnMyPlanMenu() {

     //  waitTime(3000);
     waitToAppear(Menu_Item_My_Plan);
        Menu_Item_My_Plan.click();

    }

     public void tapOnBingeListMenu() {
       waitToAppear(Menu_Items_Binge_List);
        Menu_Items_Binge_List.click();
    }

    public void tapOnSettingsMenu() {
        waitToAppear(Menu_Item_Setting);
        Menu_Item_Setting.click();
    }

    public boolean isLoginDrawerOpened() {
      waitToAppear(Login_Drawer);
        return Login_Drawer.isDisplayed();
    }

    public void tapOnNotificationMenu() {
        waitToAppear(Menu_Item_Notification);
        Menu_Item_Notification.click();
    }

    public boolean NotificationMenuScreenOpened() {
        waitToAppear(Notifications_Screen_Title);
        return Notifications_Screen_Title.isDisplayed();
    }

    public void tapOnHelpAndSupportMenu() {
      waitToAppear(Menu_Item_Help_And_Support);
        tap(Menu_Item_Help_And_Support);
    }
    public void tapOnTermsandConditions() {
        waitToAppear(Term_And_Condition);
        tap(Term_And_Condition);
    }
    public boolean HelpAndSupportMenuScreenOpened() {
        waitToAppear(Help_And_Support_Screen_Title);
        return Help_And_Support_Screen_Title.isDisplayed();
    }

    public void HelpAndSupportTaponSearch() {
        waitToAppear(Help_And_Support_Search);
        tap(Help_And_Support_Search);
        Help_And_Support_Search.sendKeys("Payment");
    }

    public boolean TermsAndConditionMenuScreenOpened() {
       waitToAppear(Terms_And_Condition_Screen_Title);
        return Terms_And_Condition_Screen_Title.isDisplayed();
    }

    public void tapOnPrivacyPolicy() {
        waitToAppear(Privacy_Policy);
        tap(Privacy_Policy);
    }

    public boolean PrivacyPolicyScreenOpened() {
        waitToAppear(Privacy_Policy_Title);
        return Privacy_Policy_Title.isDisplayed();
    }


    public boolean GoVIPScreenOpened() {
        return My_Plan_Title.isDisplayed();
    }

    public boolean MyPlanScreenOpened() {
        return My_Plan_Title.isDisplayed();
    }


    public boolean BingeListMenuScreenOpened() {
        waitToAppear(Binge_List_Title);
        return Binge_List_Title.isDisplayed();
    }

    public boolean SettingsMenuScreenOpened() {
        waitToAppear(Settings_Title);
        return Settings_Title.isDisplayed();
    }

    public boolean isLoggedIn() {
        if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
            MyLogger.log.info("Checking is user Logged in");
           waitTime(3000);
           waitToAppear(login_main);
            return isElementPresent(login_main);
        } else {
//           waitTime(2000);
          waitToAppear(Login_Btn);
            return isElementPresent(Login_Btn);
        }
    }

    public void logout() {
        System.out.println("Inside Logout");
        waitTime(2000);
        tap(Logout);
        waitTime(4000);
          tap(LogoutDialog_Logout_Button);
    }
    public void tapOnlogout() {
     waitToAppear(Logout);
        //   waitTime(5000);
        tap(Logout);
    }

    public void tapOnNotNow() {
       waitToAppear(LogoutDialog_Not_Now_Button);
        // waitTime(5000);
        tap(LogoutDialog_Not_Now_Button);
    }

    public void tapONLoginButton() {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {

            int x = Login_Btn.getLocation().getX() - 47;
            int y = Login_Btn.getLocation().getY() + 2;
            System.out.println(x + "____" + y);
            waitTime(2000);
            tap(x, y);
            waitTime(2000);

        } else
            tap((Login_Btn));

    }

    public void updateNameField(String name) {
        Edit_Text_Box.get(0).clear();
        Edit_Text_Box.get(0).sendKeys(name);
    }

    public void updateEmailIdField(String emailId) {
  //      Edit_Text_Box.get(0).clear();
 //       Edit_Text_Box.get(0).sendKeys(emailId);
        EditBox_Email.clear();
        EditBox_Email.sendKeys(emailId);
    }

    public void clickOnConfirmButton() {
        hideKeyboard();
        tap(Update_Profile);
    }

    public boolean isEditProfileUpdate(String emailId1 ) {
   //   String getname=  Edit_Profile_text.get(0).getText();
   //   String getemail=  Edit_Profile_text.get(1).getText();
        String getemail=  EditBox_Email.getText();
  //      System.out.println(getname);
        System.out.println(getemail);

 //       System.out.println(name1);
        System.out.println(emailId1);
        waitTime(5000);

      if((getemail).equals(emailId1)) {
 //         waitTime(10000);
 //         System.out.println(name1.equals(getname));
      return true;
      }
      else{
        return false;
    }}

    public void tapOnCancelBtn() {
        tap(Cancel_Btn);
    }


    public void selectNewContentLanguage() {
        waitTime(3000);
waitToAppear(Content_LanguageList.get(0));

       if(isSelected(Content_LanguageList.get(0))) {
           tap(Content_LanguageList.get(0));
           waitTime(2000);
           tap(Content_LanguageList.get(0));
       }  else {
           tap(Content_LanguageList.get(0));
       }
       waitTime(2000);
        tap(Back_Btn);
    }

    public void selectContentLanguageRemove() {
        waitTime(3000);
        if(isSelected(Content_LanguageList.get(0))) {
            tap(Content_LanguageList.get(0));
        }  else {
            tap(Content_LanguageList.get(0));
            waitTime(2000);
            tap(Content_LanguageList.get(0));
        }
        waitTime(2000);
        tap(Back_Btn);
    }


    public boolean isContentLanguageSelected() {
        waitTime(3000);
        return isSelected(Content_LanguageList.get(0));
    }

    public void tapOnAccountRefresh() {
       waitTime(2000);
        String test= driver.getPageSource();
        System.out.println(test);
        for (int i = 0; i <= 5; i++) {
            if (isElementPresent(Snackbar_Close).booleanValue()) {
            tap(Snackbar_Close);
            waitTime(2000);
            System.out.println("Arun");
        }else{
                tap(Account_Refresh);
                break;
            }
        }
    }
    public boolean isAccountRefreshed() {
        waitToAppear(AccountRefresh_Toast);

        return AccountRefresh_Toast.isDisplayed();
    }
    public void SetViewingRestrictions(int num) {
   //         waitTime(3000);
     waitToAppear(Parental_Control_list.get(num));
           tap(Parental_Control_list.get(num));
        }

    public void tapOnParentalSetupProceedBtn() {
        tap(Parental_Proceed_Btn);
    }

    public void tapOnParentalPinProceedBtn() {
    tap(Parental_Pin_Proceed_Btn);
    waitTime(8000);

    }

    public boolean isParentalPinSet(String L) {
       waitToAppear(Parental_Pin_Setup);
     //   waitToAppear(Parental_Pin_Setup, 3);
      return   driver.findElement(By.xpath("//android.widget.TextView[@text='"+L+"']")).isDisplayed();
      }

    public String RandomPIN(){

        Random rand = new Random();
        int num1 = 1;
        //int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        DecimalFormat df3 = new DecimalFormat("00"); // 3 zeros
        // DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros
        String NewPin = df3.format(num1) + df3.format(num2);
        return NewPin;
    }
    public void enterParentalPinStatic() {

        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            waitTime(5000);
            pressKey(AndroidKey.NUMPAD_1, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_2, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_3, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_4, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_5, (AndroidDriver) driver);
        }
    }

//    public void enterParentalPin() {
//
//        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
//          System.out.println("Pin " + generatedPin);
//          waitTime(3000);
//         driver.findElement(By.id("com.tatasky.binge.uat:id/et_pin_dig_1")).sendKeys(generatedPin.substring(0,1));
//            driver.findElement(By.id("com.tatasky.binge.uat:id/et_pin_dig_2")).sendKeys(generatedPin.substring(1,2));
//            driver.findElement(By.id("com.tatasky.binge.uat:id/et_pin_dig_3")).sendKeys(generatedPin.substring(2,3));
//            driver.findElement(By.id("com.tatasky.binge.uat:id/et_pin_dig_4")).sendKeys(generatedPin.substring(3,4));
//        }
//    }

    public void enterParentalPin() {

        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            System.out.println("Pin " + generatedPin);
            waitTime(3000);
            Pin_Dig_1.sendKeys(generatedPin.substring(0,1));
            Pin_Dig_2.sendKeys(generatedPin.substring(1,2));
            Pin_Dig_3.sendKeys(generatedPin.substring(2,3));
            Pin_Dig_4.sendKeys(generatedPin.substring(3,4));
        }
    }

    public void tapOnBackBtn() {
       waitTime(4000);
        tap(Setting_Back_Button);
    }
    public boolean isEnterPinTitle() {
        waitTime(2000);
        waitToAppear(Enter_Pin_Title);
        return isElementPresent(Enter_Pin_Title);
    }
    public void tapOnDiscoverTOAdd() {
        waitToAppear(Discover_TO_Add_Btn);

        tap(Discover_TO_Add_Btn);
    }
    public boolean isDiscoverTOAdd() {
        return isElementPresent(Discover_TO_Add_Btn);
    }

    public void tapOnSelectBtn() {
        tap(Select_Btn);
    }

    public void tapOnParentalPin() {
        tap(Parental_Pin_Change_Btn);
    }

    public void tapOnViewingRestrictions() {
       waitToAppear(Viewing_Restrictions);
        tap(Viewing_Restrictions);
        }

    public boolean isParentalControlSetting() {
   waitToAppear(Parental_Control_list.get(0));
        return isElementPresent(Parental_Control_list.get(0));
    }

    public void tapOnForgetPIN() {
        tap(ForgetPin_Btn);
    }

    public void tapOnParentalPINNotNow() {
        tap(Pin_NotNow);
    }
    public boolean isViewingRestrictions() {
        return isElementPresent(Viewing_Restrictions);
    }


    public void tapOnSetBtn() {
        tap(Setting_Parental_Control_Screen_Proceed_Button);
    }

    public void tapOnChatNowBtn() {

        for (int i=0; i<=8; i++){
            waitTime(1000);
            swipeDownward();
                }
        waitTime(5000);


         tap(571,1365);
        tap(571,1365);
        waitTime(50000);
        waitTime(50000);
        waitTime(50000);
        String data = driver.getPageSource();
        System.out.println(data);

    }

    public boolean isBingeListIcon() {
        return isElementPresent(Bingelist_icon);
    }

    public boolean isBingeListEmptyMessage() {
        return isElementPresent(BingeList_Empty_message);
    }
    public boolean isBingeListDescription() {
        return isElementPresent(BingeList_Description);
    }

    public boolean isBingeListSelectOverlay() {
        return isElementPresent(BingeList_SelectOverlay.get(0));
    }

    public boolean isBingeListContentSelected() {

        return BingeList_SelectOverlay.get(0).isSelected();
    }

    public boolean isBingeListSelectedCountMatched() {
    boolean result=false;
    int size =BingeList_SelectOverlay.size();
         String remove= Remove_BingeList.getAttribute("text");

        int removecount= Integer.parseInt(remove.substring(8,9));

        System.out.println("Remove count " + removecount);
        if(size==removecount) {
            result=true;
        }
        return result;
    }

    public boolean isAutoPlayTrailersOn(){
  waitToAppear(toggle_Btn.get(0));
    return isChecked(toggle_Btn.get(0));

    }


    public void tapAutoPlayTrailers() {
       waitToAppear(toggle_Btn.get(0));
       waitTime(3000);
       tap(toggle_Btn.get(0));
    }


    public boolean isNotificationSettings(){
       waitToAppear(toggle_Btn.get(1));
      waitTime(3000);
        return isChecked(toggle_Btn.get(1));

    }

    public void tapNotificationSettings() {
       waitToAppear(toggle_Btn.get(1));
        tap(toggle_Btn.get(1));
    }

    public void taponTransactionHistory() {
      waitToAppear(Setting_Transaction_history_Screen_Title);
        tap(Setting_Transaction_history_Screen_Title);
    }

    public boolean isTransactionHistoryTitle() {
        waitTime(3000);
        return isElementPresent(Bingelist_icon);
    }

    public void swipetoOTP(){
        swipe(131,4,131,1105);
        waitToAppear(Get_OTP);
        waitTime(5000);
        tap(Get_OTP);
        waitTime(3000);
        if(isElementPresent(Android_notification)){

            swipe(430,1665,430,256);
        }

    }


    public boolean verifyToastMessageDisplayed(String arg){
       boolean visible = driver.getPageSource().contains("arg");
        return visible;
    }

    public boolean isIncorrectPinMessage() {
        return isElementPresent(Incorrect_Pin_Message);
    }



    public boolean isHelpandSupportResult() {
        return isElementPresent(HelpandSupport_Result);
    }

    public void taponHelpandSupportCollaspedButton() {
        waitToAppear(Setting_Transaction_history_Screen_Title);
        tap(Help_And_Support_Collapsed.get(0));
    }

    public boolean isHelpandSupportExpended() {
        return isElementPresent(HelpandSupport_Gethelp);
    }




}


