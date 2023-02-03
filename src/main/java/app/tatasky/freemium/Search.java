package app.tatasky.freemium;

import core.uiactions.UiActions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Search extends UiActions {

    public Search(MobileDriver<MobileElement> driver) {
        super(driver);

    }


    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/search_src_text"),
    @FindBy(id = "com.tatasky.binge:id/search_src_text")})
    private MobileElement Search_Place_Holder_Text;

    @iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypeSearchField\"")
    private MobileElement Search_Text_Box;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_search"),
    @FindBy(id = "com.tatasky.binge:id/iv_search")})
    private MobileElement Inside_Search_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_speak_now"),
    @FindBy(id = "com.tatasky.binge:id/iv_speak_now")})
    private MobileElement Search_Mic_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_back"),
    @FindBy(id = "com.tatasky.binge:id/iv_back")})
    private MobileElement Back_Arrow_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tvRecentSearch"),
    @FindBy(id = "com.tatasky.binge:id/tvRecentSearch")})
    private MobileElement Recent_Search;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tvRecentSearch"),
    @FindBy(id = "com.tatasky.binge:id/tvRecentSearch")})
    private List<MobileElement> Recent_Search_Keywords;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/cross"),
    @FindBy(id = "com.tatasky.binge:id/cross")})
    private List<MobileElement> Recent_Search_Keywords_Cross_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_close"),
    @FindBy(id = "com.tatasky.binge:id/iv_close")})
    private MobileElement Search_Cross_Icon;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tvSearchCount"),
    @FindBy(id = "com.tatasky.binge:id/tvSearchCount")})
    private MobileElement Search_Result_Count;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse By Genre']")
    private MobileElement Search_Browse_By_Genre;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse By Language']")
    private MobileElement Search_Browse_By_Language;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse By Apps']")
//    private MobileElement Search_Browse_By_Apps;

    @FindAll({@FindBy(xpath = "//android.widget.TextView[@text='Browse By Apps']"),
    @FindBy(xpath = "//android.widget.TextView[@text='Browse by Apps']")})
    private MobileElement Search_Browse_By_Apps;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Trending']")
    private MobileElement Search_Trending_Rail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No results found']")
    private MobileElement No_Results_Found;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/iv_close"),
    @FindBy(id = "com.tatasky.binge:id/iv_close")})
    private MobileElement Search_close_button;

    @FindAll({@FindBy(xpath = "(//android.widget.Button[@text='Play'])"),
    @FindBy(xpath = "(//android.widget.Button[@text='Resume'])")})
    private MobileElement  Select_Play_Btn;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/tv_filters"),
    @FindBy(id = "com.tatasky.binge:id/tv_filters")})
    private MobileElement Search_filter_title;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/img"),
    @FindBy(id = "com.tatasky.binge:id/img")})
    private List<MobileElement> Select_Movie;

    @FindAll({@FindBy(id = "com.tatasky.binge:id/imageView1"),
    @FindBy(id = "com.tatasky.binge.uat:id/imageView1")})
    private List<MobileElement> BrowseApp;

    @FindAll({@FindBy(id = "com.tatasky.binge:id/ivLogo"),
    @FindBy(id = "com.tatasky.binge.uat:id/ivLogo")})
    private MobileElement App_Logo;


    public boolean isSearchPageOpened() {
        return isElementPresent(Back_Arrow_Icon);
    }

    public boolean isRecentSearchPresent() {
        if (isElementPresent(Recent_Search)) {
            return Recent_Search_Keywords_Cross_Icon.size() > 0;
        }
        return false;
    }

    public void tapOnBackButton() {
       waitToAppear(Back_Arrow_Icon);
        tap(Back_Arrow_Icon);
    }

    public void tapOnCrossButton() {
        tap(Search_Cross_Icon);
    }

    public void enterTextFromIOSKeyboard(String str) {
        for (int i = 0; i > str.length(); i++) {
            driver.findElement(MobileBy.AccessibilityId(str.substring(i, i + 1))).click();
        }
    }


    public void enterText(String text) {
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            tap(Search_Place_Holder_Text);
            Search_Place_Holder_Text.clear();
            Search_Place_Holder_Text.sendKeys(text, Keys.ENTER);
             } else {
            tap(Search_Text_Box);
            waitTime(2000);
            Search_Text_Box.sendKeys(text);
        }
    }

    public boolean searchContent() {
  waitToAppear(Search_Result_Count);
        return isElementPresent(Search_Result_Count);

    }

    public boolean searchNotFound() {
      waitToAppear(No_Results_Found);
        return isElementPresent(No_Results_Found);

    }

    public void tabOnSearchBox() {
        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
           waitToAppear(Search_Place_Holder_Text);
            // waitTime(3000);
            tap(Search_Place_Holder_Text);
        } else {
            waitTime(3000);
            tap(Search_Text_Box);

        }
    }

    public void tabOnGenreCard(String Cname) {
       waitToAppear(Search_Browse_By_Genre);
        waitTime(5000);
             for(int i=0; i<5; i++){
            boolean isPresent = driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Genre']//following-sibling::androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView//android.widget.TextView[@text='" + Cname + "']" )).size() > 0;
            if (isPresent==true) {
                tap(driver.findElement(By.xpath("//android.widget.TextView[@text='Browse By Genre']//following-sibling::androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView//android.widget.TextView[@text='" + Cname + "']")));
                waitTime(5000);
                break;
            } else{

                Point x2 =driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Genre']//following-sibling::androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView")).get(4).getLocation();

                Point x1 =driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Genre']//following-sibling::androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView")).get(0).getLocation();
                swipe(x2.x, x2.y, x1.x, x2.y);
               // swipe(695, 531, 51, 531);
            }
        }
    }

    public boolean isGenrePageDisplayed(String Genrepage) {
      waitToAppear(Search_filter_title);
        return isElementPresent(driver.findElement(By.xpath("//android.widget.TextView[@text='"+Genrepage+"']")));
    }

    public void tabOnLanguageCard(String Cname) {
      waitTime(5000);
        waitToAppear(Search_Browse_By_Language);
            for(int i=0; i<5; i++){
                boolean isPresent = driver.findElements(By.xpath("//android.widget.TextView[@text='" + Cname + "']")).size() > 0;
                if (isPresent==true) {
                    tap(driver.findElement(By.xpath("//android.widget.TextView[@text='" + Cname + "']")));
               break;
                } else{

                 //    Point x2 =driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Language']//following-sibling::androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@resource-id='com.tatasky.binge:id/rlParent']")).get(4).getLocation();

                //    Point x1 =driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Language']//following-sibling::androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@resource-id='com.tatasky.binge:id/rlParent']")).get(0).getLocation();

                    Point x2 =driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Language']//following-sibling::androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout//android.widget.TextView")).get(4).getLocation();

                    Point x1 =driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Language']//following-sibling::androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout//android.widget.TextView")).get(0).getLocation();

                    swipe(x2.x, x2.y, x1.x, x2.y);

                    //  swipe(695, 305, 33, 305);
                }
            }
        }

    public void tabOnFilterLanguage(String Cname) {
 //       waitTime(3000);
      waitToAppear(Select_Movie.get(0));
        for (int i = 0; i < 5; i++) {
            boolean isPresent = driver.findElements(By.xpath("//android.widget.RadioButton[@text='" + Cname + "']")).size() > 0;
            if (isPresent == true) {
                tap(driver.findElement(By.xpath("//android.widget.RadioButton[@text='" + Cname + "']")));
                break;
            } else {

                Point x2 = driver.findElements(By.xpath("//android.widget.TextView[@text='Filter']//following::android.widget.RadioButton")).get(4).getLocation();

                Point x1 = driver.findElements(By.xpath("//android.widget.TextView[@text='Filter']//following::android.widget.RadioButton")).get(0).getLocation();
                swipe(x2.x, x2.y, x1.x, x2.y);

                // swipe(680, 422, 65, 422);
            }
        }

    }
    public boolean isLanguagePageDisplayed(String Languagepage) {
        waitTime(3000);
        waitToAppear(Search_filter_title);
        return isElementPresent(driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+Languagepage+"')]")));
    }

    public boolean isAudioLanguagePageDisplayed(String Languagepage) {
      waitToAppear(Select_Play_Btn);
      waitTime(3000);
        return isElementPresent(driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+Languagepage+"')]")));
    }



    public boolean isSameGenreDisplayed(String genreName) {
        return isElementPresent(driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+genreName+"') and @resource-id='com.tatasky.binge.uat:id/genre_detail']")));
    }

    public boolean isCrossIconDisplayed() {
        return isElementPresent(Search_Cross_Icon);
    }

    public boolean isSearchBrowseByGenre() {
       waitToAppear(Search_Browse_By_Genre);
        return isElementPresent(Search_Browse_By_Genre);
    }

    public boolean isSearchBrowseByLanguage() {
      waitToAppear(Search_Browse_By_Language);
        return isElementPresent(Search_Browse_By_Language);
    }

    public boolean isSearchBrowseByApps() {
      waitToAppear(Search_Browse_By_Apps);
        return isElementPresent(Search_Browse_By_Apps);
    }

    public boolean isSearchTrendingRail() {
        waitToAppear(Search_Trending_Rail);
        return isElementPresent(Search_Trending_Rail);
    }

    public boolean isSearchClosedButton() {
    waitToAppear(Search_close_button);
        return isElementPresent(Search_close_button);
    }

    public void tabOnBrowseByApps(int appNumber, String Swipe) {
        waitTime(5000);
        waitToAppear(Search_Browse_By_Apps);

        Point x2 = driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Apps']//following-sibling::androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout")).get(4).getLocation();

        Point x1 = driver.findElements(By.xpath("//android.widget.TextView[@text='Browse By Apps']//following-sibling::androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout")).get(0).getLocation();

        if (Swipe.equalsIgnoreCase("Single")) {
            swipe(x2.x, x2.y, x1.x, x2.y);
            tap(BrowseApp.get(appNumber));
        }else if (Swipe.equalsIgnoreCase("Double")) {
            swipe(x2.x, x2.y, x1.x, x2.y);
            waitTime(1000);
            swipe(x2.x, x2.y, x1.x, x2.y);
            tap(BrowseApp.get(appNumber));
        }else if (Swipe.equalsIgnoreCase("Triple")) {
            swipe(x2.x, x2.y, x1.x, x2.y);
            waitTime(1000);
            swipe(x2.x, x2.y, x1.x, x2.y);
            waitTime(1000);
            swipe(x2.x, x2.y, x1.x, x2.y);
            tap(BrowseApp.get(appNumber));

        }else
            tap(BrowseApp.get(appNumber));
        }


    public boolean isDisplayedAppLogo() {
        waitToAppear(App_Logo);
        return App_Logo.isDisplayed();
    }




}
