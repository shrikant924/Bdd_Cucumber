package stepdefinitions.tataskyBingeFreemium;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class MoviesPageStep extends BaseStep {
    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }

//--------------------------------------------------

//Movies Methods:

    @Then("Browse by Language should be present on Movies page")
    public void browseByLanguageShouldBePresentOnMoviesPage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseByLanguagePresent());}

    @Then("Browse by Genre should be present on Movie page")
    public void browseByGenreShouldBePresentOnMoviePage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseByGenrePresent());}

    @Then("Browse Apps should be present on Movie page.")
    public void browseAppsShouldBePresentOnMoviePage() {
        Assert.assertTrue(tataSkyFreemiumApp.freemiumHomePage.isBrowseAppsPresent());}

}


