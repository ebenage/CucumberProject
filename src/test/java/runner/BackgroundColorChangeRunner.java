package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="classpath:features",
		glue="steps",
		tags="@BackgroundColorChange",
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.jason"
		}
		
		)

public class BackgroundColorChangeRunner {

}
