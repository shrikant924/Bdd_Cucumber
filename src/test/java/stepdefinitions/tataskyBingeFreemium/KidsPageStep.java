package stepdefinitions.tataskyBingeFreemium;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class KidsPageStep extends BaseStep {
    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }

//--------------------------------------------------

//Kids Methods:

    @Then("Browse by Language should be present on Kids page")
    public void browseByLanguageShouldBePresentOnKidsPage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseByLanguagePresent());}

    @Then("Browse by Genre should be present on Kids page")
    public void browseByGenreShouldBePresentOnKidsPage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseByGenrePresent());}

    @Then("Browse Apps should be present on Kids page.")
    public void browseAppsShouldBePresentOnKidsPage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseAppsPresent());}

}


