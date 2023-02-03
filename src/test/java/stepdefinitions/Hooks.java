package stepdefinitions;


import core.managers.logmanager.MyLogger;
import core.managers.mailmanager.WriteInExcel;
import io.cucumber.core.gherkin.Feature;
import io.cucumber.core.gherkin.messages.GherkinMessagesFeatureParser;
import io.cucumber.core.gherkin.messages.internal.gherkin.GherkinDocumentBuilder;
import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.gherkin.Gherkin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.messages.Messages;
import io.cucumber.plugin.event.Node;
import io.cucumber.testng.CucumberOptions;

import java.io.IOException;

import static org.apache.commons.lang3.StringUtils.capitalize;
import static org.apache.commons.lang3.StringUtils.repeat;

public class Hooks {

    @Before(order = 0)
    public void beforeScenario(Scenario scenario) {
        MyLogger.log.info("#######################" + repeat("#", scenario.getName().length()) + "#######################");
        MyLogger.log.info("###########  START OF SCENARIO : " + scenario.getName() + "##########");
        MyLogger.log.info("#######################" + repeat("#", scenario.getName().length()) + "#######################");
    }

    @After(order = 0)
    public void after(Scenario scenario) throws IOException {
        WriteInExcel.writeData(scenario,scenario.getStatus().toString());
        MyLogger.log.info("##########################" + repeat("#", scenario.getName().length() + scenario.getStatus().toString().length()) + "###########################");
        MyLogger.log.info("### END OF SCENARIO : " + scenario.getName() + capitalize(scenario.getStatus().toString()));
        MyLogger.log.info("##########################" + repeat("#", scenario.getName().length() + scenario.getStatus().toString().length()) + "###########################");
        if (scenario.getStatus().equals(Status.FAILED)) {

            MyLogger.log.info("Scenario Failed");
        } else {
            MyLogger.log.info("Scenario Passed");
                }
    }

}
