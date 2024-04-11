package testExecutions;

import org.junit.runner.RunWith;
import com.aventstack.extentreports.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/cucumber1.feature",
		glue = "teststeps",
		monochrome = true,
		plugin = {"pretty","html:reports/reports.html",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:rerun/failed.txt"},
		dryRun = false
		)

public class ExceutionRajesh {
         
	
}
