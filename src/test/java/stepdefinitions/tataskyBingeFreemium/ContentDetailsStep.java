package stepdefinitions.tataskyBingeFreemium;

import core.ThreadLocalDriver;
import core.managers.logmanager.MyLogger;
import core.managers.logmanager.filemanager.JSONReader;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ContentDetailsStep extends BaseStep {

    JSONReader jsonReader = new JSONReader("deviceDetails.json");

    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }

    @Then("Select movie tab from navigation bar")
    public void Selectmovietabfromnavigationbar() {
//        tataSkyFreemiumApp.bottomNavigation.waitTime(4000);
        tataSkyFreemiumApp.bottomNavigation.tapOnMovieTab();
//        tataSkyFreemiumApp.bottomNavigation.waitTime(10000);
        MyLogger.log.info("User is on Movies Page");
    }

    @And("Select shows tab from navigation bar")
    public void Selectshowstabfromnavigationbar() {
        tataSkyFreemiumApp.bottomNavigation.tapOnShowsTab();
        MyLogger.log.info("Tapped on TV shows");
    }

    @And("Tap on hero banner")
    public void Taponherobanner() {
        tataSkyFreemiumApp.freemiumHomePage.tapOnHeroBanner();
        MyLogger.log.info("Tapped on hero banner");
    }

    @Then("User is on TV shows PI page")
    public void UserisonTVshowsPIpage() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isMoreBtn());
    }

    @Then("Tap on Play button")
    public void TaponPlaybutton() {
        tataSkyFreemiumApp.contentDetails.tapPlayBtn();
        MyLogger.log.info("Movie played");
    }

    @Then("Tap on Resume button")
    public void TaponResumebutton() {
        tataSkyFreemiumApp.contentDetails.tapPlayBtn();
        MyLogger.log.info("Movie played");
    }

    @Then("Tap on Pause button")
    public void TaponPausebutton() {
        tataSkyFreemiumApp.contentDetails.tapPauseBtn();
    }

    @Then("Verify user is able to paused the movie")
    public void ThenVerifyuserisabletopausethemovie() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isPlayBtn());
        MyLogger.log.info("Movie Paused");
    }

    @And("Select see all button")
    public void Selectseeallbutton() {
        tataSkyFreemiumApp.contentDetails.tapOnSeeAllBtn();
    }

    @And("Select movie content")
    public void Selectmoviecontent() {
        tataSkyFreemiumApp.contentDetails.tapOnMovie();
    }

    @And("Select more button")
    public void Selectmorebutton() {
        tataSkyFreemiumApp.contentDetails.tapOnMoreBtn();
    }

    @Then("Verify login drawer is opened")
    public void verifylogindrawerisopened() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isLogindrawerOpen());
    }

    @Then("Verify Detail Drawer on the PI page")
    public void verifyDetailDraweronthePIpage() {
        tataSkyFreemiumApp.contentDetails.iscloseBtn();
        MyLogger.log.info("Detail Drawer is opened");
    }

    @And("Search Content")
    public void searchcontent() {
        tataSkyFreemiumApp.contentDetails.searchContent(jsonReader.getJSONValue("Hot Star TV Show", "TvShowName"));
        MyLogger.log.info("Entered TV Show to search");

    }

    @And("Select Partner app content")
    public void SelectPartnerappcontent() {
        tataSkyFreemiumApp.contentDetails.tapOnTVShows();
        MyLogger.log.info("Tapped on TV Show");
    }

    @And("Search movie Content")
    public void SearchmovieContent() {
        tataSkyFreemiumApp.contentDetails.searchContent(jsonReader.getJSONValue("Movie", "MovieName1"));
        MyLogger.log.info("Entered Movie name to search");

    }

    @Then("Verify Partner app installation Popup open")
    public void VerifyPartnerappinstallationPopupopen() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isCancelBtn());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isInstallBtn());
        MyLogger.log.info("Partner app popup is opened, Install and Cancel button are present");
    }

    @And("Tap on view all episode")
    public void Taponviewallepisode() {
        tataSkyFreemiumApp.contentDetails.tapOnViewAllEpisode();
        MyLogger.log.info("Tapped on View all episode button");
    }

    @Then("Verify search all episode page is opened")
    public void Verifysearchallepisodepageisopened() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isSearchEpisode());
        MyLogger.log.info("Search Episode page is opened");
    }

    @And("Tap on Kebab Menu")
    public void TaponKebabMenu() {
        tataSkyFreemiumApp.contentDetails.tapOnKababMenu();
        MyLogger.log.info("Tapped on Kebab Menu");
    }

    @And("Tap on Next Button")
    public void TaponNextButton() {
        tataSkyFreemiumApp.contentDetails.tapOnNextBtn();
        MyLogger.log.info("Tapped on Next button");
    }

    @And("Tap on Previous Button")
    public void TaponPreviousButton() {
        tataSkyFreemiumApp.contentDetails.tapOnPreviousBtn();
        MyLogger.log.info("Tapped on Previous button");
    }

    @And("Verify user is able to go to previous episode")
    public void Verifyuserisabletogotopreviousepisode() {
        Assert.assertFalse(tataSkyFreemiumApp.contentDetails.isPreviousBtn());
        MyLogger.log.info("User is on previous episode");
    }

    @And("Verify user is able to go to Next episode")
    public void VerifyuserisabletogotoNextepisode() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isPreviousBtn());
        MyLogger.log.info("User is on Next episode");
    }

    @And("Tap on Close Button")
    public void TaponCloseButton() {
        tataSkyFreemiumApp.contentDetails.tapOnCloseBtn();
        MyLogger.log.info("Tapped on close button");
    }

    @Then("Verify user is on Movie PI page")
    public void VerifyuserisonMoviePIpage() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isMoreBtn());
    }


    @Then("Verify user is able to play the movie")
    public void Verifyuserisabletoplaythemovie() {
        tataSkyFreemiumApp.contentDetails.waitTime(15000);
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isPauseBtn());
    }

    @And("Tap on Add to Binge List")
    public void TaponAddtoBingeList() {
        tataSkyFreemiumApp.contentDetails.tapOnBingeList();
        MyLogger.log.info("Tapped on binge list");
    }

    @And("Tap on Binge List to remove")
    public void TaponBingeListtoremove() {
        tataSkyFreemiumApp.contentDetails.tapOnRemovetoBingeList();
        MyLogger.log.info("Tapped on binge list to removed");
    }

    @And("Verify content added to binge list")
    public void Verifycontentaddedtobingelist() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isBingeToastMessage());
        MyLogger.log.info("Content successfully added to binge list");
    }

    @And("Verify content removed from binge list")
    public void Verifycontentremovedfrombingelist() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isContentRemoveFromBinge());
        MyLogger.log.info("Content Removed from binge list");
    }

    @Then("Verify the movie PI page items")
    public void VerifythemoviePIpageitems() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isBanner_Poster());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isBackBtn());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isPartnerLogo());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isDetailDescripton());
     //   Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isPremiumIndicator());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isMoreBtn());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isLanguageAudio());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isPlayButton());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isShareButton());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isAddToBingeList());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isWhatsappButtton());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isRailTitle());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isSeeAll());
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isBottomNavigatoinoBar());
        MyLogger.log.info("Items are available on the PI Pages");

    }

    @And("Go to premium content")
    public void Gotopremiumcontent() {
        tataSkyFreemiumApp.contentDetails.tapOnPremiumContent();
        MyLogger.log.info("Tapped on premium content");
    }

    @Then("Verify MetaData is present or not")
    public void VerifyMetaDataispresentornot() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isMetaData());
        MyLogger.log.info("Meta Data is present");
    }

    @Then("Verify Trailer button is present")
    public void VerifyTrailerbuttonispresent() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isTrailerBtn());
        MyLogger.log.info("Trailer button is present");
    }
    @Then("Verify Trailer button is not present")
    public void VerifyTrailerbuttonisnotpresent() {
        Assert.assertFalse(tataSkyFreemiumApp.contentDetails.isTrailerBtn());
        MyLogger.log.info("Trailer button is not present");
    }

    @Then("User should successfully logged in from PI Page")
    public void UsershouldsuccessfullyloggedinfromPIPage() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isPlayButton());
        MyLogger.log.info("Successfully logged in from PI Page");
    }

    @And("Tap on Upgrade Button")
    public void TaponUpgradeButton() {
        tataSkyFreemiumApp.contentDetails.tapOnUpgradeBtn();
        MyLogger.log.info("Tapped on Upgrade button");
    }

    @And("Tap on Trailer Button")
    public void TaponTrailerButton() {
        tataSkyFreemiumApp.contentDetails.TapTrailerBtn();
        MyLogger.log.info("Tapped on Upgrade button");
    }

    @Then("Verify subscription page is open")
    public void Verifysubscriptionpageisopen() {
        Assert.assertTrue(tataSkyFreemiumApp.contentDetails.isMyPlan());
        MyLogger.log.info("Subscription page is opened");
    }

    @And("Tap on previously used number")
    public void Taponpreviouslyusednumber() {
        tataSkyFreemiumApp.contentDetails.tapPreviouslyUsedMobile();
        MyLogger.log.info("Tapped on Mobile number");
    }

    @AfterStep("@ContentDetails")
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