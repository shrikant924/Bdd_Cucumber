package stepdefinitions.tataskyBingeFreemium;

import core.ThreadLocalDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.sql.SQLException;


public class AllCategoriesPageStep extends BaseStep {
    @Before()
    public void setupLoginSteps() {
        setupScreens();
    }


    @When("User tap on Categories Screen in Footer")
    public void user_tap_on_categories_screen_in_footer() {
        tataSkyFreemiumApp.bottomNavigation.tapOnOtherTab();
    }

    @Then("Selected category {string} displayed on top left")
    public void selectedCategoryDisplayedOnTopLeft(String arg0) {
        tataSkyFreemiumApp.allCategoriesPage.tapOnCategory(arg0);
        Assert.assertTrue(tataSkyFreemiumApp.allCategoriesPage.isSelectedCategoryPageOpened(arg0));
    }

    @AfterStep("@AllCategoriesPage")
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