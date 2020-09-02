package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinition"},
        dryRun = false

)
public class RegressionRunner extends AbstractTestNGCucumberTests{
}
