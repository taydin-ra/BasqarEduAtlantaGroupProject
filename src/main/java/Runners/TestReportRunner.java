package Runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/featureFiles/Discounts.feature"},
        glue = {"stepDefinition"},
        dryRun = false,
        plugin={"html:target/report","json:target/jason"}
)
public class TestReportRunner extends AbstractTestNGCucumberTests {


}
