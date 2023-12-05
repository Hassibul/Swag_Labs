package swag.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./Features/"},
		glue = {"swag.ny.stepdifinition"}
		)

public class MyRunner extends AbstractTestNGCucumberTests {

}
