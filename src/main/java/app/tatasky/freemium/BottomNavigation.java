package app.tatasky.freemium;

import core.uiactions.UiActions;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class BottomNavigation extends UiActions {

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

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/kids"),
    @FindBy(id = "com.tatasky.binge:id/kids")})
    private MobileElement Sports_Tab;

    @FindAll({@FindBy(id = "com.tatasky.binge.uat:id/others"),
    @FindBy(id = "com.tatasky.binge:id/others")})
    private MobileElement Others_Tab;


    public BottomNavigation(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    public void tapOnHomeTab() {
        tap(Home_Tab);
    }

    public void tapOnMovieTab() {
    waitToAppear(Movie_Tab);
        tap(Movie_Tab);
    }

    public void tapOnShowsTab() {
        waitToAppear(Shows_Tab);
        tap(Shows_Tab);
    }

    public void tapOnKidsTab() {
       waitToAppear(Kids_Tab);
        tap(Kids_Tab);
    }

    public void tapOnSportsTab() {
        waitToAppear(Sports_Tab);
        tap(Sports_Tab);
    }

    public void tapOnOtherTab() {
       waitToAppear(Others_Tab);
       waitTime(5000);
       tap(Others_Tab);

    }

    public boolean isDisplayedHome() {
        return isElementPresent(Home_Tab);
    }

    public boolean isDisplayedMovies() {
        return isElementPresent(Movie_Tab);
    }

    public boolean isDisplayedShows() {
        return isElementPresent(Shows_Tab);
    }

    public boolean isDisplayedKids() {
        return isElementPresent(Kids_Tab);
    }

    public boolean isDisplayedOthers() {
        return isElementPresent(Others_Tab);
    }


}
