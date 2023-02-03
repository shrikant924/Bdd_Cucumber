package stepdefinitions.tataskyBingeFreemium;


import core.ThreadLocalDriver;
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

public class Search extends BaseStep {
    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }

    @When("Tap on  the search icon")
    public void tapOnTheSearchIcon() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnSearchIcon();
    }

    @Then("User should navigate to search page.")
    public void userShouldNavigateToSearchPage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isSearchPageOpened());
    }

    @And("Tap on Back button")
    public void tapOnBackButton() {
        tataSkyFreemiumApp.search.tapOnBackButton();
    }

    @Then("User should able to navigate to Home page  of the application.")
    public void userShouldAbleToNavigateToHomePageOfTheApplication() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isDisplayedTataSkyBingeLogo());
    }

    @And("Enter search text {string}.")
    public void enterSearchText(String arg0) {
        tataSkyFreemiumApp.search.enterText(arg0);
    }

    @Then("Search result should be displayed on screen.")
    public void userShouldBeAbleToSearchForAnySeriesAndMovies() {
        Assert.assertTrue(tataSkyFreemiumApp.search.searchContent());
    }

    @Then("Search result not found should be displayed on screen.")
    public void Searchresultnotfoundshouldbedisplayedonscreen() {
        Assert.assertTrue(tataSkyFreemiumApp.search.searchNotFound());
    }


    @And("Tap on Search box.")
    public void tapOnSearchBox() {
        tataSkyFreemiumApp.search.tabOnSearchBox();

    }

    @Then("Mic icon should change to cross post tapping on it.")
    public void micIconShouldChangeToCrossPostTappingOnIt() {
        Assert.assertTrue(tataSkyFreemiumApp.search.isSearchClosedButton());
    }

    @And("Enter {string} in search box.")
    public void enterInSearchBox(String arg0) {
        tataSkyFreemiumApp.search.enterText(arg0);
    }

    @And("Tap on search cross button.")
    public void tapOnCrossButton() {
        tataSkyFreemiumApp.search.tapOnCrossButton();
    }

    @Then("The recent search pills should be displayed on tapping search bar with cross.")
    public void theRecentSearchPillsShouldBeDisplayedOnTappingSearchBarWithCross() {
        Assert.assertTrue(tataSkyFreemiumApp.search.isRecentSearchPresent());
    }

    @Given("User is on Movie page.")
    public void userIsOnMoviePage() {
        tataSkyFreemiumApp.bottomNavigation.tapOnMovieTab();

    }

    @Given("User is on Shows page.")
    public void userIsOnShowsPage() {
        tataSkyFreemiumApp.bottomNavigation.tapOnShowsTab();

    }

    @Given("User is on Kids page.")
    public void userIsOnKidsPage() {
         tataSkyFreemiumApp.bottomNavigation.tapOnKidsTab();

    }

    @Given("User is on Sports page.")
    public void userIsOnSportsPage() {
        tataSkyFreemiumApp.bottomNavigation.tapOnSportsTab();

    }

    @Then("Browse by Genre should present on Search page")
    public void BrowsebyGenreshouldpresentonSearchpage() {
        Assert.assertTrue(tataSkyFreemiumApp.search.isSearchBrowseByGenre());
    }

    @Then("Browse by Language should be present on Search page.")
    public void BrowsebyLanguageshouldbepresentonSearchpage() {
        Assert.assertTrue(tataSkyFreemiumApp.search.isSearchBrowseByLanguage());
    }

    @Then("Browse by Apps should be present on Search Page")
    public void BrowsebyAppsshouldbepresentonSearchPage() {
        Assert.assertTrue(tataSkyFreemiumApp.search.isSearchBrowseByApps());
    }

    @Then("Trending should be present on Search Page")
    public void TrendingshouldbepresentonSearchPage() {
        Assert.assertTrue(tataSkyFreemiumApp.search.isSearchTrendingRail());
    }

    @And("Tap on {string} card")
    public void Taponcard(String arg1) {
        tataSkyFreemiumApp.search.tabOnGenreCard(arg1);
    }
    @Then("Selected {string} catalog page should be opened")
    public void Selectedcatalogpageshouldbeopened(String arg2) {
   //     tataSkyFreemiumApp.search.waitTime(3000);
        Assert.assertTrue(tataSkyFreemiumApp.search.isGenrePageDisplayed(arg2));
    }

    @And("Tap on Language {string} card.")
    public void TaponLanguagecard(String arg1) {
        tataSkyFreemiumApp.search.tabOnLanguageCard(arg1);
    }
    @Then("Selected Language {string} catalog page should be opened.")
    public void SelectedLanguagecatalogpageshouldbeopened(String arg2) {
 //       tataSkyFreemiumApp.search.waitTime(3000);
        Assert.assertTrue(tataSkyFreemiumApp.search.isLanguagePageDisplayed(arg2));
    }

    @And("Tap on {string} card.")
    public void Tapongenrecard(String arg1) {
        tataSkyFreemiumApp.search.tabOnGenreCard(arg1);
    }

    @And("Select Language {string} Filter.")

    public void SelectLanguageFilter(String arg1) {
        tataSkyFreemiumApp.search.tabOnFilterLanguage(arg1);
    }

    @And("Select Genre {string} Filter.")
    public void SelectGenreFilter(String arg1) {
        tataSkyFreemiumApp.search.tabOnFilterLanguage(arg1);
    }

    @And("Audio of selected content should same as Language  {string} filter.")
    public void AudioofselectedcontentshouldsameasLanguagefilter(String arg2) {
        Assert.assertTrue(tataSkyFreemiumApp.search.isAudioLanguagePageDisplayed(arg2));
    }

    @Then("Selected content should be same as Genre {string} filter.")
    public void SelectedcontentshouldbesameasGenrefilter(String arg2) {
        tataSkyFreemiumApp.search.waitTime(2000);
        Assert.assertTrue(tataSkyFreemiumApp.search.isSameGenreDisplayed(arg2));
    }

    @And("Tap on Browse by app {int} {string}")
    public void TaponBrowsebyapp(int agr0, String arg1)
    {
        tataSkyFreemiumApp.search.tabOnBrowseByApps(agr0, arg1);
    }

    @Then("User should able to navigate to Browse By App catalogue page.")
    public void UsershouldabletonavigatetoBrowseByAppcataloguepage() {
        Assert.assertTrue(tataSkyFreemiumApp.search.isDisplayedAppLogo());
    }


    @AfterStep("@Search")
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
