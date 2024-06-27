package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/resources/parallel/acc.feature"},
		features = {"src/test/resources/parallel/ContactUs.feature"},
		//features = {"src/test/resources/parallel/LoginPage.feature"},
		glue = { "parallel" }
		//plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"}
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"} 
		//,dryRun = true
		,monochrome = true
		,plugin  = {"pretty","html:CucumberReport/Report"}
		)

public class MyTestRunner {


}
