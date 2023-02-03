package stepdefinitions.tataskyBingeFreemium;

import core.ThreadLocalDriver;
import io.cucumber.core.gherkin.Feature;
import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.core.runtime.CucumberExecutionContext;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

public class HomePageStep extends BaseStep {
    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }

    @Given("User is on home screen")
    public void userIsOnHomeScreen() {
//         tataSkyFreemiumApp.freemiumHomePage.waitTime(2000);
         tataSkyFreemiumApp.freemiumHomePage.FireTVPopUpCancel();
    }

    @Then("Select Content Language should be opened on screen.")
    public void selectContentLanguageShouldBeOpenedOnScreen() {
//        tataSkyFreemiumApp.bottomNavigation.driver.resetApp();
        tataSkyFreemiumApp.bottomNavigation.waitTime(3000);
        if (tataSkyFreemiumApp.freemiumHomePage.isSelectLanguageDrawerOpened()) {
            Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isSelectLanguageDrawerOpened());
            tataSkyFreemiumApp.freemiumHomePage.tapOnNotNowBtn();
        }
    }

    @Then("Subscription drawer should be opened on screen.")
    public void Subscriptiondrawershouldbeopenedonscreen() {
        if (tataSkyFreemiumApp.freemiumHomePage.isSubscriptionDrawerOpened()) {
            Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isSubscriptionDrawerOpened());
            tataSkyFreemiumApp.freemiumHomePage.tapOnDoitLater();
        }
    }

    @Then("Subscription drawer should not be opened on screen.")
    public void Subscriptiondrawershouldnotbeopenedonscreen() {
            Assert.assertFalse(tataSkyFreemiumApp.freemiumHomePage.isSubscriptionDrawerOpened());

        }

    @Then("Hamburger icon and Search icon, and Logo is displayed on the header of screen")
    public void hamburgerIconAndSearchIconIsDisplayedOnTheHeaderOfScreen() {
        //  tataBingeAppAndroid.homePage.tapOnNotNowBtn();
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isDisplayedHamburgerIcon());
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isDisplayedSearchIcon());
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isDisplayedTataSkyBingeLogo());
    }

    @Then("Home, Shows, Movies, Kids and Others tab should be on the header of screen.")
    public void homeShowsMoviesKidsAndOthersTabShouldBeOnTheHeaderOfScreen() {
        //tataBingeAppAndroid.homePage.tapOnNotNowBtn();
        Assert.assertTrue(tataSkyFreemiumApp.bottomNavigation.isDisplayedHome());
        Assert.assertTrue(tataSkyFreemiumApp.bottomNavigation.isDisplayedMovies());
        Assert.assertTrue(tataSkyFreemiumApp.bottomNavigation.isDisplayedKids());
        Assert.assertTrue(tataSkyFreemiumApp.bottomNavigation.isDisplayedShows());
        Assert.assertTrue(tataSkyFreemiumApp.bottomNavigation.isDisplayedOthers());
    }


    @When("Open the side menu.")
    public void openTheSideMenu() {
        tataSkyFreemiumApp.freemiumHomePage.waitTime(5000);
        tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
    }

    @And("Tap on Login button.")
    public void tapOnLoginButton() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnLoginButton();
    }

    @And("Tap on New Login button.")
    public void tapOnNewLoginButton() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnNewLoginButton();
    }

    @And("Enter valid mobile number.")
    public void enterValidMobileNumber() {
        tataSkyFreemiumApp.freemiumHomePage.enterMobileNumber("9870504060");
    }

    @And("Tap on proceed button")
    public void tapOnProceedButton() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnGetOTPButton();
    }

    @And("Enter OTP in OTP text boxes.")
    public void enterOTPInOTPTextBoxes() {
        if (ThreadLocalDriver.getTLDriver().getCurrentPackage().equalsIgnoreCase("com.tatasky.binge.uat"))
            {
             tataSkyFreemiumApp.freemiumHomePage.enterOTP();
            } else {
            tataSkyFreemiumApp.sideMenu.waitTime(25000);
         //     tataSkyFreemiumApp.sideMenu.swipetoOTP();
           //    tataSkyFreemiumApp.freemiumHomePage.TapToEnterOTP();
            }}


//    @And("Enter OTP in OTP text boxes.")
//    public void enterOTPInOTPTextBoxes() {
//        tataSkyFreemiumApp.sideMenu.swipetoOTP();
//        tataSkyFreemiumApp.freemiumHomePage.TapToEnterOTP();
//    }

    @Then("User should successfully logged in to a Freemium application.")
    public void userShouldSuccessfullyLoggedInToAFreemiumApplication() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
        tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isLoggedIn());
    }

    @When("Tap on Hamburger icon.")
    public void tapOnHamburgerIcon() {
        tataSkyFreemiumApp.freemiumHomePage.waitTime(3000);
        tataSkyFreemiumApp.freemiumHomePage.tapOnHamburgerMenu();
    }

    @Then("Side menu should be open on screen")
    public void sideMenuShouldBeOpenOnScreen() {
        Assert.assertTrue(tataSkyFreemiumApp.sideMenu.isSideMenuOpened());
    }

    @Then("Select Content Language should not be opened on screen.")
    public void selectContentLanguageShouldNotBeOpenedOnScreen() {
        Assert.assertFalse(tataSkyFreemiumApp.freemiumHomePage.isSelectLanguageDrawerOpened());

    }

    @Then("Select Content Language should rail should be displayed on Home page.")
    public void selectContentLanguageShouldRailShouldBeDisplayedOnHomePage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isSelectContentLanguageRailOnHomePage());
    }

    @When("Tap on Select Content Language button on Select content language rail.")
    public void tapOnSelectContentLanguageButtonOnSelectContentLanguageRail() {

        tataSkyFreemiumApp.freemiumHomePage.tapOnSelectContentLanguageButton();
    }

    @Then("Select Content Language drawer should be opened.")
    public void selectContentLanguageDrawerShouldBeOpened() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isContentLanguageDrawerOpened());
    }

    @And("Select any Language from language drawer.")
    public void selectAnyLanguageFromLanguageDrawer() {
        tataSkyFreemiumApp.freemiumHomePage.selectLanguageFromLanguageDrawer();
    }

    @Then("Select Language rail should be disappear from Home screen.")
    public void selectLanguageRailShouldBeDisappearFromHomeScreen() {
        Assert.assertFalse(tataSkyFreemiumApp.freemiumHomePage.isSelectContentLanguageRailOnHomePage());
    }

    @And("Tap on Select Content Language button.")
    public void tapOnSelectContentLanguageButton() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnSelectContentLanguageOnDrawer();
    }

    @When("Tap on Movie icon on bottom navigation bar.")
    public void tapOnMovieIconOnBottomNavigationBar() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnMovie();
    }

    @Then("User should able to navigate to Movie page  of the application.")
    public void userShouldAbleToNavigateToMoviePageOfTheApplication() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isMoviePageOpened());
    }

    @When("Tap on Shows icon on bottom navigation bar.")
    public void tapOnShowsIconOnBottomNavigationBar() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnShows();
    }

    @Then("User should able to navigate to Shows page  of the application.")
    public void userShouldAbleToNavigateToShowsPageOfTheApplication() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isShowsPageOpened());
    }

    @When("Tap on Kids icon on bottom navigation bar.")
    public void tapOnKidsIconOnBottomNavigationBar() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnKids();
    }

    @Then("User should able to navigate to Kids page  of the application.")
    public void userShouldAbleToNavigateToKidsPageOfTheApplication() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isKidsPageOpened());
    }

    @When("Tap on Categories icon on bottom navigation bar.")
    public void tapOnCategoriesIconOnBottomNavigationBar() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnCategories();
    }

    @Then("User should able to navigate to Catgories page  of the application.")
    public void userShouldAbleToNavigateToCatgoriesPageOfTheApplication() {
        tataSkyFreemiumApp.freemiumHomePage.waitTime(6000);
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isCategoriesPageOpened());

    }

    @Then("Browse by Language should be present on Home page")
    public void browseByLanguageShouldBePresentOnHomePage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseByLanguagePresent());

    }

    @Then("Browse by Genre should be present on Home page")
    public void browseByGenreShouldBePresentOnHomePage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseByGenrePresent());

    }

    @Then("Browse Apps should be present on Home page.")
    public void browseAppsShouldBePresentOnHomePage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseAppsPresent());

    }

    @When("Tap on See All button of {int} rail.")
    public void tapOnSeeAllButtonOf(int arg0) {
        tataSkyFreemiumApp.freemiumHomePage.tabOnSeeAll(arg0);

    }

    @Then("User should navigate to catalog page of that rail.")
    public void userShouldNavigateToCatalogPageOfThatRail() {
        tataSkyFreemiumApp.freemiumHomePage.isSellAllPageOpened();

    }

    @When("Tap on any {string} card on Browse By Language rail")
    public void tapOnAnyCardOnBrowseByLanguageRail(String arg0) {
        tataSkyFreemiumApp.freemiumHomePage.isBrowseByLanguagePresent();
        tataSkyFreemiumApp.freemiumHomePage.openSelectedLanguageCard(arg0);
    }

    @Then("Selected {string} page should be opened.")
    public void selectedPageShouldBeOpened(String arg0) {
        tataSkyFreemiumApp.freemiumHomePage.SelectedLanguagePageOpened(arg0);

    }

    @Given("User is on Categories page.")
    public void userIsOnCategoriesPage() {
        tataSkyFreemiumApp.bottomNavigation.tapOnOtherTab();
    }

    @And("Scroll to Bottom")
    public void ScrolltoBottom() {
        tataSkyFreemiumApp.freemiumHomePage.ScrollTillBottom();

    }
    @Then("Verify {string} rails are displayed correctly on App")
    public void verifyRailsDispalyedCorrectly(String arg){
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.verifyRailsDisplayed(arg));
    }

    @And("Tap To Enter OTP")
    public void TapToEnterOTP() {
        tataSkyFreemiumApp.freemiumHomePage.TapToEnterOTP();

    }

    @AfterStep("@Home")
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
