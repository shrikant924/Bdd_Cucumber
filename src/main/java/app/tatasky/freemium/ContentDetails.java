package app.tatasky.freemium;

import core.managers.logmanager.MyLogger;
import core.uiactions.UiActions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;


public class ContentDetails extends UiActions {
    public ContentDetails(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @FindAll({@FindBy(xpath = "(//android.widget.Button[contains(@text,'Play')])"),
    @FindBy(xpath = "(//android.widget.Button[contains(@text,'Resume')])")})
    private MobileElement  Select_Play_Btn;

    @AndroidFindBy(xpath = "(//android.widget.Button[contains(@text,'Resume')])")
    private MobileElement Select_Resume_Btn;

    @AndroidFindBy(xpath = "(//android.widget.Button[@text='Pause'])")
    private MobileElement Select_Pause_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/home_see_all"),
    @FindBy(id = "com.tatasky.binge:id/home_see_all")})
    private List<MobileElement> Select_Btn_SeeAll;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/img"),
    @FindBy(id = "com.tatasky.binge:id/img")})
    private List<MobileElement> Select_Movie;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/more"),
    @FindBy(id = "com.tatasky.binge:id/more")})
    private MobileElement Select_More;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_not_now"),
    @FindBy(id = "com.tatasky.binge:id/tv_not_now")})
    private MobileElement Select_Close_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_proceed_guest_login_previously_used_mobile"),
    @FindBy(id = "com.tatasky.binge:id/btn_proceed_guest_login_previously_used_mobile")})
    private MobileElement Used_mobile_notnow_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_cancel_guest_login"),
    @FindBy(id = "com.tatasky.binge:id/btn_cancel_guest_login")})
    private MobileElement Guest_login_notnow_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/search_icon"),
    @FindBy(id = "com.tatasky.binge:id/search_icon")})
    private MobileElement Search_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/search_src_text"),
    @FindBy(id = "com.tatasky.binge:id/search_src_text")})
    private MobileElement Search_Box;

    @FindAll({@FindBy(id = "com.tatasky.binge:id/img"),
    @FindBy(id = "com.tatasky.binge.uat:id/img")})
    private List<MobileElement> Shows_Card;

    @AndroidFindBy(xpath = "(//android.widget.Button[contains(@text,'Install')])")
    private MobileElement Install_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_dialog_secondary"),
    @FindBy(id = "com.tatasky.binge:id/btn_dialog_secondary")})
    private MobileElement Cancel_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/all_episodes"),
    @FindBy(id = "com.tatasky.binge:id/all_episodes")})
    private MobileElement ViewEpisode_Btn;

    @AndroidFindBy(xpath = "(//android.widget.EditText[@text='Search for episodes'])")
    private MobileElement Search_Episode;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_more"),
    @FindBy(id = "com.tatasky.binge:id/iv_more")})
    private List<MobileElement> Kabab_Menu;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_prv_episode"),
    @FindBy(id = "com.tatasky.binge:id/btn_prv_episode")})
    private MobileElement Previous_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btn_nxt_episode"),
    @FindBy(id = "com.tatasky.binge:id/btn_nxt_episode")})
    private MobileElement Next_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/watchlist_btn"),
    @FindBy(id = "com.tatasky.binge:id/watchlist_btn")})
    private MobileElement AddTo_Binge_list;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Added to Binge List'])")
    private MobileElement Added_Binge_list;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Add to Binge List'])")
    private MobileElement Removed_Binge_list;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/design_bottom_sheet"),
    @FindBy(id = "com.tatasky.binge:id/design_bottom_sheet")})
    private MobileElement Login_Drawer;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btnPrimary"),
    @FindBy(id = "com.tatasky.binge:id/btnPrimary")})
    private MobileElement Play_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_partner_logo"),
    @FindBy(id = "com.tatasky.binge:id/iv_partner_logo")})
    private MobileElement Partner_Logo;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/detail_desc"),
    @FindBy(id = "com.tatasky.binge:id/detail_desc")})
    private MobileElement detail_descripton;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_audio"),
    @FindBy(id = "com.tatasky.binge:id/tv_audio")})
    private MobileElement language_audio;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/share_btn"),
    @FindBy(id = "com.tatasky.binge:id/share_btn")})
    private MobileElement share_button;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/whatsapp_btn"),
    @FindBy(id = "com.tatasky.binge:id/whatsapp_btn")})
    private MobileElement whatsapp_buttton;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/home_recycler_view_title"),
    @FindBy(id = "com.tatasky.binge:id/home_recycler_view_title")})
    private MobileElement rail_title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/bottomNav"),
    @FindBy(id = "com.tatasky.binge:id/bottomNav")})
    private MobileElement Bottom_navigatoino_bar;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_premium_indicator"),
    @FindBy(id = "com.tatasky.binge:id/iv_premium_indicator")})
    private MobileElement Premium_Indicator;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_poster"),
    @FindBy(id = "com.tatasky.binge:id/iv_poster")})
    private MobileElement Banner_Poster;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/imgBack"),
    @FindBy(id = "com.tatasky.binge:id/imgBack")})
    private MobileElement Back_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_crown_small"),
    @FindBy(id = "com.tatasky.binge:id/iv_crown_small")})
    private MobileElement Premium_Content;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/starring_detail"),
    @FindBy(id = "com.tatasky.binge:id/starring_detail")})
    private MobileElement Starring_Detail;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/director_detail"),
    @FindBy(id = "com.tatasky.binge:id/director_detail")})
    private MobileElement Director_Detail;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/genre_detail"),
    @FindBy(id = "com.tatasky.binge:id/genre_detail")})
    private MobileElement Genre_Detail;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/btnSecondary"),
    @FindBy(id = "com.tatasky.binge:id/btnSecondary")})
    private MobileElement Trailer_Btn;

    @AndroidFindBy(xpath = "(//android.widget.Button[contains(@text,'Upgrade')])")
    private MobileElement Upgrade_Btn;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'My Plan')])")
    private MobileElement MyPlan_Title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_mob_previously_used_mobile_item"),
    @FindBy(id = "com.tatasky.binge:id/tv_mob_previously_used_mobile_item")})
    private List<MobileElement> Previously_USed_Mobile;


    public void tapPlayBtn() {
       waitToAppear(Select_Play_Btn);
        waitTime(5000);
        tap(Play_Btn);
        waitTime(10000);
    }

    public void tapPauseBtn() {
        tap(Select_Pause_Btn);

    }

    public void tapOnSeeAllBtn() {
        waitTime(5000);
      waitToAppear(Select_Btn_SeeAll.get(0));

        tap(Select_Btn_SeeAll.get(0));
    }

    public void tapOnMovie() {
        waitTime(5000);
           waitToAppear(Select_Movie.get(0));
            tap(Select_Movie.get(0));
        }

    public ContentDetails searchContent(String ContentName) {
       waitToAppear(Search_Btn);
        tap(Search_Btn);
        typeText(Search_Box, ContentName);
        waitTime(5000);
        return this;
    }

    public ContentDetails tapOnMoreBtn() {
        waitToAppear(Select_More);
        tap(Select_More);
        return this;
    }

    public ContentDetails tapOnTVShows() {
        waitTime(5000);
       waitToAppear(Shows_Card.get(0));

        tap(Shows_Card.get(0));
        return this;
    }

    public void tapOnViewAllEpisode() {
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            waitToAppear(Select_More);
            waitTime(6000);
            swipeToElementByText("View all Episodes");
            tap(ViewEpisode_Btn);
        } else if (driver.getPlatformName().equalsIgnoreCase("iOS")) {
            while (driver.findElements(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"View all Episodes\"`]")).size() < 1) {
                HashMap<String, Object> args = new HashMap<>();
                args.put("direction", "down");
                ((IOSDriver) driver).executeScript("mobile: scroll", args);
            }
            tap(ViewEpisode_Btn);
        }

    }

    public void tapOnKababMenu() {
        waitToAppear(Kabab_Menu.get(0));
        waitTime(2000);
        tap(Kabab_Menu.get(0));
    }

    public void tapOnPreviousBtn() {
        tap(Previous_Btn);
    }

    public void tapOnNextBtn() {
       waitToAppear(Next_Btn);
        tap(Next_Btn);
    }

    public void tapOnCloseBtn() {
        tap(Select_Close_Btn);
    }

    public void tapOnBingeList() {
        waitToAppear(Select_Play_Btn);
        if (isElementPresent(Added_Binge_list)) {
            tap(AddTo_Binge_list);
            tap(AddTo_Binge_list);
        } else {
            tap(AddTo_Binge_list);
        }
    }

    public void tapOnRemovetoBingeList() {
        waitToAppear(Select_Play_Btn);
           if(isElementPresent(Added_Binge_list)) {

               tap(AddTo_Binge_list);
           }else {
               tap(AddTo_Binge_list);
               waitTime(2000);
               tap(AddTo_Binge_list);
           }
    }

    public void tapOnPremiumContent() {
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            swipeDownward();
            tap(Premium_Content);

        }
        tap(Premium_Content);

    }

    public void tapOnUpgradeBtn() {
        tap(Upgrade_Btn);
    }

    public void tapPreviouslyUsedMobile() {
        tap(Previously_USed_Mobile.get(0));
    }

    public boolean isLogindrawerOpen() {
        return isElementPresent(Login_Drawer);
    }

    public boolean isSeeAll() {
        return isElementPresent(Select_Btn_SeeAll.get(0));
    }

    public boolean isPlayBtn() {
      waitTime(2000);
        return isElementPresent(Select_Play_Btn);
    }

    public boolean isPauseBtn() {
        waitToAppear(Select_Pause_Btn);
        return isElementPresent(Select_Pause_Btn);
    }

    public boolean isMoreBtn() {
      waitToAppear(Select_More);
        return isElementPresent(Select_More);
    }

    public boolean iscloseBtn() {
        waitToAppear(Select_Close_Btn);
        return isElementPresent(Select_Close_Btn);
    }

    public boolean isInstallBtn() {
        return isElementPresent(Install_Btn);
    }

    public boolean isCancelBtn() {
        waitToAppear(Cancel_Btn);
        return isElementPresent(Cancel_Btn);
    }

    public boolean isSearchEpisode() {
        waitToAppear(Search_Episode);
        return isElementPresent(Search_Episode);
    }

    public boolean isPreviousBtn() {
        return isElementPresent(Previous_Btn);
    }

    public boolean isBingeToastMessage() {
        waitToAppear(Added_Binge_list);
        return isElementPresent(Added_Binge_list);
    }

    public boolean isContentRemoveFromBinge() {
        waitToAppear(Removed_Binge_list);
        return isElementPresent(Removed_Binge_list);
    }

    public boolean isMetaData() {
        if (isElementPresent(Starring_Detail) || isElementPresent(Director_Detail) || isElementPresent(Genre_Detail)) {
            MyLogger.log.info("Meta Data is present");
            return true;
        } else {
            MyLogger.log.info("Meta Data is not present");
            return false;
        }
    }

    public boolean isBanner_Poster() {
        waitToAppear(Select_Play_Btn);
        return isElementPresent(Banner_Poster);
    }

    public boolean isBackBtn() {
        return isElementPresent(Back_Btn);
    }

    public boolean isPlayButton() {
       waitToAppear(Play_Btn);
        waitTime(3000);
        return isElementPresent(Play_Btn);
    }

    public boolean isPartnerLogo() {
        return isElementPresent(Partner_Logo);
    }

    public boolean isDetailDescripton() {
        return isElementPresent(detail_descripton);
    }

    public boolean isLanguageAudio() {
        return isElementPresent(language_audio);
    }

    public boolean isShareButton() {
        return isElementPresent(share_button);
    }

    public boolean isAddToBingeList() {
        return isElementPresent(AddTo_Binge_list);
    }

    public boolean isWhatsappButtton() {
        return isElementPresent(whatsapp_buttton);
    }

    public boolean isRailTitle() {
        return isElementPresent(rail_title);
    }

    public boolean isBottomNavigatoinoBar() {
        return isElementPresent(Bottom_navigatoino_bar);
    }

    public boolean isPremiumIndicator() {
        return isElementPresent(Premium_Indicator);
    }

    public boolean isTrailerBtn() {
        waitToAppear(Select_Play_Btn);
        return isElementPresent(Trailer_Btn);
    }

    public void TapTrailerBtn() {
        tap(Trailer_Btn);
    }


    public boolean isMyPlan() {
        return isElementPresent(MyPlan_Title);
    }


}