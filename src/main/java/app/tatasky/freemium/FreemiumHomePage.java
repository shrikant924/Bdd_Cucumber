package app.tatasky.freemium;

import core.managers.logmanager.MyLogger;
import core.managers.logmanager.filemanager.JSONReader;
import core.uiactions.UiActions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import junit.runner.BaseTestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.sql.PreparedStatement;

public class FreemiumHomePage extends UiActions {
    public FreemiumHomePage(MobileDriver<MobileElement> driver) {
        super(driver);
    }


    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/mygallery"),
    @FindBy(id = "com.tatasky.binge:id/mygallery")})
    private MobileElement Select_Hero_Banner;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='English']")
    private MobileElement Language_English;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hindi']")
    private MobileElement Language_Hindi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Punjabi']")
    private MobileElement Language_Punjabi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Marathi']")
    private MobileElement Language_Marathi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bhojpuri']")
    private MobileElement Language_Bhojpuri;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Telugu']")
    private MobileElement Language_Telugu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bengali']")
    private MobileElement Language_Bengali;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Odia']")
    private MobileElement Language_Odia;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Assamese']")
    private MobileElement Language_Assamese;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gujarati']")
    private MobileElement Language_Gujarati;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Kannada']")
    private MobileElement Language_Kannada;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Malayalam']")
    private MobileElement Language_Malayalam;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse By Genre']")
    private MobileElement Browse_By_Genre_Rail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse By Language']")
    private MobileElement Browse_By_Language_Rail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse Apps']")
    private MobileElement Browse_Apps_Rail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Comedy']")
    private MobileElement Genre_Comedy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drama']")
    private MobileElement Genre_Drama;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Romance']")
    private MobileElement Genre_Romance;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='War']")
    private MobileElement Genre_War;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Adventure']")
    private MobileElement Genre_Adventure;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Horror']")
    private MobileElement Genre_Horror;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Kids']")
    private MobileElement Genre_Kids;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_not_now"),
    @FindBy(id = "com.tatasky.binge:id/tv_not_now")})
    private MobileElement Select_Language_Content_Not_Now_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge:id/tv_text_login"),
    @FindBy(id = "com.tatasky.binge.uat:id/tv_text_login")})
    private MobileElement  Login_Btn_Hamburger_Menu;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_proceed_guest_login_previously_used_mobile"),
    @FindBy(id = "com.tatasky.binge:id/btn_proceed_guest_login_previously_used_mobile")})
    private MobileElement New_Login_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_proceed_guest_login_previously_used_mobile"),
    @FindBy(id = "com.tatasky.binge:id/btn_proceed_guest_login_previously_used_mobile")})
    private MobileElement Not_Now;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/et"),
    @FindBy(id = "com.tatasky.binge:id/et")})
    private MobileElement Mobile_Number;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_proceed_guest_login"),
    @FindBy(id = "com.tatasky.binge:id/btn_proceed_guest_login")})
    private MobileElement Get_OTP_Btn;

    @FindAll({@FindBy(id = "com.android.systemui:id/dismiss_view"),
    @FindBy(id = "com.android.systemui:id/clear_all_port"),
    @FindBy(xpath = "//android.view.View[@content-desc='Clear all notifications.']")})
    private MobileElement Clear_Notification;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/et_otp_dig_1"),
    @FindBy(id = "com.tatasky.binge:id/et_otp_dig_1")})
    private MobileElement  OTP_First_Number;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/et_otp_dig_2"),
    @FindBy(id = "com.tatasky.binge:id/et_otp_dig_2")})
    private MobileElement OTP_Second_Number;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/et_otp_dig_3"),
    @FindBy(id = "com.tatasky.binge:id/et_otp_dig_3")})
    private MobileElement OTP_Third_Number;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/et_otp_dig_4"),
    @FindBy(id = "com.tatasky.binge:id/et_otp_dig_4")})
    private MobileElement OTP_Fourth_Number;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/et_otp_dig_5"),
    @FindBy(id = "com.tatasky.binge:id/et_otp_dig_5")})
    private MobileElement OTP_Fifth_Number;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/et_otp_dig_6"),
    @FindBy(id = "com.tatasky.binge:id/et_otp_dig_6")})
    private MobileElement OTP_Sixth_Number;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_subtitle_profile"),
    @FindBy(id = "com.tatasky.binge:id/tv_subtitle_profile")})
    private MobileElement Profile_Number;

    //__________________________________________________________________

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_select_lang"),
    @FindBy(id = "com.tatasky.binge:id/btn_select_lang")})
    private MobileElement Select_Content_Language_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_title"),
    @FindBy(id = "com.tatasky.binge:id/tv_title")})
    private List<MobileElement> Language_List;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_select_languages"),
    @FindBy(id = "com.tatasky.binge:id/tv_select_languages")})
    private MobileElement Select_Language_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/home_recycler_view_title"),
    @FindBy(id = "com.tatasky.binge:id/home_recycler_view_title")})
    private List<MobileElement> Rail_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/hamberger_menu"),
    @FindBy(id = "com.tatasky.binge:id/hamberger_menu")})
    private MobileElement  Hamburger_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/search_icon"),
    @FindBy(id = "com.tatasky.binge:id/search_icon")})
    private MobileElement Search_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_back"),
    @FindBy(id = "com.tatasky.binge:id/iv_back")})
    private MobileElement Back_Arrow_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/home"),
    @FindBy(id = "com.tatasky.binge:id/home")})
    private MobileElement Home_Tab;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/shows"),
    @FindBy(id = "com.tatasky.binge:id/shows")})
    private MobileElement Shows_Tab;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/movies"),
    @FindBy(id = "com.tatasky.binge:id/movies")})
    private MobileElement Movie_Tab;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/kids"),
    @FindBy(id = "com.tatasky.binge:id/kids")})
    private MobileElement Kids_Tab;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/others"),
    @FindBy(id = "com.tatasky.binge:id/others")})
    private MobileElement   Others_Tab;


    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_select_languages"),
    @FindBy(id = "com.tatasky.binge:id/tv_select_languages")})
    private MobileElement Select_Language_Drawer;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/logo"),
    @FindBy(id = "com.tatasky.binge:id/logo")})
    private MobileElement Tata_Sky_Logo;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_select_languages"),
    @FindBy(id = "com.tatasky.binge:id/tv_select_languages")})
    private MobileElement Select_Content_Language_Button;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_select_lang"),
    @FindBy(id = "com.tatasky.binge:id/btn_select_lang")})
    private MobileElement Select_Content_Language_Button_On_Language_Drawer;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_cancel"),
    @FindBy(id = "com.tatasky.binge:id/btn_cancel")})
    private MobileElement Cancel_Btn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Do It Later']")
    private MobileElement Do_it_Later;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_close"),
    @FindBy(id = "com.tatasky.binge:id/tv_close")})
    private MobileElement Categories_Close;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/home_see_all"),
    @FindBy(id = "com.tatasky.binge:id/home_see_all")})
    private List<MobileElement> See_All;


    public void tapOnPreviously_Used_Number(int i) {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            if (isElementPresent(New_Login_Btn))
                driver.findElements(By.id("com.tatasky.binge.uat:id/tv_mob_previously_used_mobile_item")).get(i - 1);
        } else if (driver.getPlatformName().equalsIgnoreCase("android")) {
            if (isElementPresent(New_Login_Btn))
                driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]"));
        }

    }

    public void tapOnHeroBanner() {
  //      waitToAppear(Select_Hero_Banner, 200);
    waitToAppear(Select_Hero_Banner);
        tap(Select_Hero_Banner);

    }

    public void selectLanguageFromLanguageDrawer() {
        tap(Language_List.get(0));
        tap(Language_List.get(0));
    }

    public void tapOnSelectContentLanguageOnDrawer() {
        tap(Select_Content_Language_Button_On_Language_Drawer);
    }

    public boolean isSelectContentLanguageRailOnHomePage() {
        return isElementPresent(Select_Content_Language_Button);
    }

    public void tapOnSelectContentLanguageButton() {
        tap(Select_Content_Language_Button);

    }

    public boolean isContentLanguageDrawerOpened() {
        return isElementPresent(Select_Language_Drawer);
    }

    public void tapOnHamburgerMenu() {
        if (!new SideMenu(driver).isSideMenuOpened())
            waitTime(3000);
            tap(Hamburger_Icon);
    }

    public void tapOnLoginButton() {
        tap(Login_Btn_Hamburger_Menu);
    }

    public void tapOnNewLoginButton() {
     if(isElementPresent(New_Login_Btn))
        tap(New_Login_Btn);

    }

    public void enterMobileNumber(String mobile_number) {
        Mobile_Number.sendKeys(mobile_number);

    }

    public void ClearNotification() {
        swipe(131,4,131,1105);
        waitTime(2000);
      if(isElementPresent(Clear_Notification))
        tap(Clear_Notification);
    else
        swipe(131,1215,131,600);
    }


    public void tapOnGetOTPButton() {
        Get_OTP_Btn.click();
    }

    public void enterOTP() {
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            waitTime(3000);
            pressKey(AndroidKey.NUMPAD_9, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_3, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_8, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_2, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_5, (AndroidDriver) driver);
        } else if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
            System.out.println("Inside IOS Enter OTP");
            waitTime(3000);
            tap(driver.findElement(MobileBy.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")));
            tap(driver.findElement(MobileBy.AccessibilityId("0")));
            tap(driver.findElement(MobileBy.AccessibilityId("0")));
            tap(driver.findElement(MobileBy.AccessibilityId("0")));
            tap(driver.findElement(MobileBy.AccessibilityId("0")));
            tap(driver.findElement(MobileBy.AccessibilityId("0")));
            tap(driver.findElement(MobileBy.AccessibilityId("0")));
        }
    }

    public boolean loginWithNewNumber() {
        tap(Hamburger_Icon);
        tap(Login_Btn_Hamburger_Menu);
        if (New_Login_Btn.isDisplayed()) {
            System.out.println("inside  if block");
            tap(New_Login_Btn);
            System.out.println(driver.getPageSource());
            Mobile_Number.click();
            typeText(Mobile_Number, "9876554032");
//            pressKey(AndroidKey.NUMPAD_9, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_8, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_7, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_6, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_5, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_3, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_3, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_7, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_6, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver); pressKey(AndroidKey.NUMPAD_9, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_8, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_7, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_6, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_5, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_3, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_3, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_7, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_6, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver); pressKey(AndroidKey.NUMPAD_9, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_8, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_7, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_6, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_5, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_3, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_3, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_7, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_6, (AndroidDriver) driver);
//            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver);
            Get_OTP_Btn.click();
            // typeText(OTP_First_Number, "000000");
            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver);
            pressKey(AndroidKey.NUMPAD_0, (AndroidDriver) driver);

        } else {
            System.out.println("outsise  if block");
            System.out.println(driver.getPageSource());
            tap(Mobile_Number);
            typeText(Mobile_Number, "9876543211");
            tap(Get_OTP_Btn);
            typeText(OTP_First_Number, "0");
            typeText(OTP_Second_Number, "0");
            typeText(OTP_Third_Number, "0");
            typeText(OTP_Fourth_Number, "0");
            typeText(OTP_Fifth_Number, "0");
            typeText(OTP_Sixth_Number, "0");
        }
        waitToAppear(Hamburger_Icon);
        tap(Hamburger_Icon);
        return Profile_Number.getText().contains("9");

    }

    public boolean isHomePageOpened() {
        return Home_Tab.isEnabled();
    }

    public boolean isMoviePageOpened() {
        return Movie_Tab.isEnabled();
    }

    public boolean isShowsPageOpened() {
        return Shows_Tab.isEnabled();
    }

    public boolean isKidsPageOpened() {
        return Kids_Tab.isEnabled();
    }


    public boolean isCategoriesPageOpened() {
        waitTime(2000);
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            return isElementPresent(Categories_Close);
        } else {
            return isElementPresent(driver.findElement(MobileBy.AccessibilityId("Select Categories")));
        }
    }


    public boolean isSelectLanguageDrawerOpened() {
        return isElementPresent(Select_Content_Language_Button_On_Language_Drawer);
    }

    public boolean isSubscriptionDrawerOpened() {
       waitToAppear(Do_it_Later);
        return isElementPresent(Do_it_Later);
    }


    public boolean isDisplayedSearchIcon() {
        return isElementPresent(Search_Icon);
    }

    public boolean isDisplayedHamburgerIcon() {
        return isElementPresent(Hamburger_Icon);
    }

    public boolean isDisplayedTataSkyBingeLogo() {
       waitToAppear(Tata_Sky_Logo);
        return Tata_Sky_Logo.isDisplayed();
    }


    public void tapOnNotNowBtn() {
        tap(Select_Language_Content_Not_Now_Btn);
    }

    public void tapOnMovie() {
        tap(Movie_Tab);
    }

    public void tapOnShows() {
        tap(Shows_Tab);
    }

    public void tapOnKids() {
        tap(Kids_Tab);
    }

    public void tapOnCategories() {
   waitToAppear(Others_Tab);
        tap(Others_Tab);
    }

    public void openSideMenu() {
        tap(Hamburger_Icon);
    }

    public void tapOnSearchIcon() {
   waitToAppear(Search_Icon);
        tap(Search_Icon);
    }

    public boolean isSearchPageOpened() {
     waitToAppear(Back_Arrow_Icon);
        return isElementPresent(Back_Arrow_Icon);

    }

    public boolean isSellAllPageOpened() {
        return isElementPresent(driver.findElementByClassName("android.widget.TextView"));

    }

    public void swipeTop10Rails() {
        swipeOnLeft("com.tatasky.binge.uat:id/home_recycler_view_title");
    }


    public void tapOnEnglishLanguage() {
        scrollToRailTitle("Browse by Language");
        tap(Language_English);
    }

    public void tapOnDoitLater() {
      waitToAppear(Do_it_Later);
        tap(Do_it_Later);
    }

    public boolean isEnglishLanguageOpened() {
        return isElementPresent(Language_English);
    }

    public void tapOnHindiLanguage() {
        tap(Language_Hindi);
    }

    public boolean isHindiLanguageOpened() {
        return isElementPresent(Language_Hindi);
    }

    public void tapOnPunjabiLanguage() {
        tap(Language_Punjabi);
    }

    public boolean isPunjabiLanguageOpened() {
        return isElementPresent(Language_Punjabi);
    }

    public void tapOnBhojpuriLanguage() {
        tap(Language_Bhojpuri);
    }

    public boolean isBhojpuriLanguageOpened() {
        return isElementPresent(Language_Bhojpuri);
    }


    public void tapOnTeluguLanguage() {
        tap(Language_Telugu);
    }

    public boolean isTeluguLanguageOpened() {
        return isElementPresent(Language_Telugu);
    }

    public void tapOnBengaliLanguage() {
        tap(Language_Bengali);
    }

    public boolean isBengaliLanguageOpened() {
        return isElementPresent(Language_Bengali);
    }

    public void tapOnMarathiLanguage() {
        tap(Language_Marathi);
    }

    public boolean isMarathiLanguageOpened() {
        return isElementPresent(Language_Marathi);
    }

    public void tapOnOdiaLanguage() {
        tap(Language_Odia);
    }

    public boolean isOdiaLanguageOpened() {
        return isElementPresent(Language_Odia);
    }

    public void tapOnAssameseLanguage() {
        tap(Language_Assamese);
    }

    public boolean isAssameseLanguageOpened() {
        return isElementPresent(Language_Assamese);
    }

    public void tapOnKannadaLanguage() {
        tap(Language_Kannada);
    }

    public boolean isKannadaLanguageOpened() {
        return isElementPresent(Language_Kannada);
    }

    public void tapOnGujaratiLanguage() {
        tap(Language_Gujarati);
    }

    public boolean isGujaratiLanguageOpened() {
        return isElementPresent(Language_Gujarati);
    }

    public void tapOnMalayalamLanguage() {
        tap(Language_Malayalam);
    }

    public boolean isMalayalamLanguageOpened() {
        return isElementPresent(Language_Malayalam);
    }

    public void tapOnGenreComedy() {
        tap(Genre_Comedy);
    }

    public boolean isGenreComedyOpened() {
        return isElementPresent(Genre_Comedy);
    }


    public void tapOnDGenreDrama() {
        tap(Genre_Drama);
    }

    public boolean isGenreDramaOpened() {
        return isElementPresent(Genre_Drama);
    }

    public void tapOnGenreRomance() {
        tap(Genre_Romance);
    }

    public boolean isGenreRomanceOpened() {
        return isElementPresent(Genre_Romance);
    }

    public void tapOnGenreWar() {
        tap(Genre_War);
    }

    public boolean isGenreWarOpened() {
        return isElementPresent(Genre_War);
    }

    public void tapOnGenreAdventure() {
        tap(Genre_Adventure);
    }

    public boolean isGenreAdventureOpened() {
        return isElementPresent(Genre_Adventure);
    }

    public void tapOnGenreHorror() {
        tap(Genre_Horror);
    }

    public boolean isGenreHorrorOpened() {
        return isElementPresent(Genre_Horror);
    }

    public void tapOnGenreKids() {
        tap(Genre_Kids);
    }

    public boolean isGenreKidOpened() {
        return isElementPresent(Genre_Kids);
    }

    public void tabOnSeeAll(int i) {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
       swipeDownward();
            See_All.get(i - 1).click();
        } else
            driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='See all'])[" + i + "]"));
    }

    public void tabOnContentThumbnail(int i) {
        driver.findElementsById("com.tatasky.binge.uat:id/imgOverlay").get(i).click();
    }

    public void tapOnAdventureComedy() {
        tap(Genre_Adventure);
    }


    public void scrollToRailTitle(String text) {
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().resourceIdMatches(\".*:id/home_recycler_view\")).getChildByText("
                            + "new UiSelector().resourceIdMatches(\".*:id/home_recycler_view_title\"), \"" + text + "\")"));
        } else if (driver.getPlatformName().equalsIgnoreCase("IOS")) {
            System.out.println("Inside else if ");
            int size = driver.findElements(MobileBy.AccessibilityId(text)).size();
            System.out.println(size);
//            for (int i=0;i<=5;i++){
            System.out.println(driver.findElements(MobileBy.AccessibilityId("Browse by Language")).size());
            HashMap<String, Object> args = new HashMap<>();
            args.put("predicateString", "label == 'TVODs'");
            args.put("direction", "down");

            ((IOSDriver) driver).executeScript("mobile: scroll", args);
            System.out.println(driver.findElement(MobileBy.AccessibilityId(text)).isDisplayed());
//                if(driver.findElement(MobileBy.AccessibilityId(text)).isDisplayed())
//
//                    break;
//
//            }

        }
    }


    public boolean isBrowseByGenrePresent() {
        boolean visible = driver.getPageSource().contains("Browse By Genre");
        System.out.println(visible);
     //   return isElementPresent(Browse_By_Genre_Rail);
        return visible;

    }

    public boolean isBrowseByLanguagePresent() {
      waitTime(5000);
    boolean visible = driver.getPageSource().contains("Browse By Language");
  //      swipeToElementByText("Browse By Language");
        return isElementPresent(Browse_By_Language_Rail);
    }

    public boolean isBrowseAppsPresent() {
        boolean visible = driver.getPageSource().contains("Browse By App Dev Test");
        return visible;
    }


    public void openSelectedLanguageCard(String str) {

        switch (str) {
            case "English":
                tapOnEnglishLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Hindi":
                tapOnHindiLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Punjabi":
                tapOnPunjabiLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Bhojpuri":
                tapOnBhojpuriLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Telugu":
                tapOnTeluguLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Bengali":
                tapOnBengaliLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Marathi":
                tapOnMarathiLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Odia":
                tapOnOdiaLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Assamese":
                tapOnAssameseLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Kannada":
                tapOnKannadaLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Gujarati":
                tapOnGujaratiLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Malayalam":
                tapOnMalayalamLanguage();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            default:
                MyLogger.log.info(str);
        }
    }

    public boolean SelectedLanguagePageOpened(String str) {
        boolean result = false;
        switch (str) {
            case "English":
                result = isEnglishLanguageOpened();
                break;
            case "Hindi":
                result = isHindiLanguageOpened();
                break;
            case "Punjabi":
                result = isPunjabiLanguageOpened();
                break;
            case "Bhojpuri":
                result = isBhojpuriLanguageOpened();
                break;
            case "Telugu":
                result = isTeluguLanguageOpened();
                break;
            case "Bengali":
                result = isBengaliLanguageOpened();
                break;
            case "Marathi":
                result = isMarathiLanguageOpened();
                break;
            case "Odia":
                result = isOdiaLanguageOpened();
                break;
            case "Assamese":
                result = isAssameseLanguageOpened();
                break;
            case "Kannada":
                result = isKannadaLanguageOpened();
                break;
            case "Gujarati":
                result = isGujaratiLanguageOpened();
                break;
            case "Malayalam":
                result = isMalayalamLanguageOpened();
                break;
            default:
                result = false;
        }
        return result;

    }


    public void openGenreCard(String str) {
        switch (str) {
            case "Comedy":
                tapOnGenreComedy();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Drama":
                tapOnDGenreDrama();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Romance":
                tapOnGenreRomance();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "War":
                tapOnGenreWar();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Adventure":
                tapOnGenreAdventure();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            case "Horror":
                tapOnGenreHorror();
                MyLogger.log.info("Tapped on:  " + str);
                break;
            default:
                MyLogger.log.info(str);
        }
    }

    public boolean SelectedGenrePageOpened(String str) {
        boolean result = false;
        switch (str) {
            case "Comedy":
                result = isGenreComedyOpened();
                break;
            case "Drama":
                result = isGenreDramaOpened();
                break;
            case "Romance":
                result = isGenreRomanceOpened();
                break;
            case "War":
                result = isGenreWarOpened();
                break;
            case "Adventure":
                result = isGenreAdventureOpened();
                break;
            case "Horror":
                result = isGenreHorrorOpened();
                break;
            default:
                result = false;
        }

        return result;
    }

    public void FireTVPopUpCancel() {
        if(isElementPresent(Cancel_Btn))
    tap(Cancel_Btn);

    }

    public void ScrollTillBottom(){
      waitToAppear(Search_Icon);
    for (int i=0; i<=15; i++){
        waitTime(1000);
        swipeDownward();
    }}

    public boolean verifyRailsDisplayed(String arg){
        boolean visible = driver.getPageSource().contains("arg");
        return visible;
    }

        public void TapToEnterOTP(){
      //waitTime(3000);
        waitToAppear(OTP_First_Number);
        OTP_First_Number.sendKeys(getClipboardText((AndroidDriver) driver));
            waitTime(5000);
        }

    public boolean isOTPDialog() {

        return isElementPresent(OTP_First_Number);
    }



}