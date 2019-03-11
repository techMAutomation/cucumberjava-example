package cucumberRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features", tags={"@wip", "not @manual"}, glue={"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumberTestReport.json",
                "junit:target/cucumber-results.xml"
        })

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
