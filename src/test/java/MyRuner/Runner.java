package MyRuner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features="C:\\Users\\Mostafa\\eclipse-workspace\\CucumberDemo\\src\\test\\java\\Features\\feature.feature"

					,glue=""// "stepDefenition"
					//,dryRun=true
					,dryRun=false
					,monochrome=true
					,strict = true
					,plugin= { "pretty", "html:target/cucumber"}
					//,plugin= { "pretty", "json:target/cucumber/xyz.json"}
					//,plugin= { "pretty", "junit:target/cucumber/xyz.xml"}
		)
public class Runner {

}
