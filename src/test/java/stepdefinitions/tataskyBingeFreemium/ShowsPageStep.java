package stepdefinitions.tataskyBingeFreemium;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ShowsPageStep extends BaseStep {
    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }

//--------------------------------------------------

//Shows Methods:

    @Then("Browse by Language should be present on Shows page")
    public void browseByLanguageShouldBePresentOnShowsPage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseByLanguagePresent());
    }

    @Then("Browse by Genre should be present on Shows page")
    public void browseByGenreShouldBePresentOnShowsPage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseByGenrePresent());
    }

    @Then("Browse Apps should be present on Shows page.")
    public void browseAppsShouldBePresentOnShowsPage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseAppsPresent());
    }

}


