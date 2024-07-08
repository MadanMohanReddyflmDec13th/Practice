package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features",
		glue="steps",
		stepNotifications=true,
		tags="@regression",
		dryRun=false,
		plugin = {"pretty","html:CucumberReports"}
		)
public class RegRunner {

}
