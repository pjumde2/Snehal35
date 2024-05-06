package runnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src//test//java//feature"}, glue ={"stepDefinition","hooks"},tags ="@RegressionTest",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","summary"})


public class RunTest extends AbstractTestNGCucumberTests{

	
}




