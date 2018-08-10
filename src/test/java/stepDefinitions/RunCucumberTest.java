package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        //tags = {"@run"},
        features = "src\\test\\resources\\features\\",
        glue = "stepDefinitions"

)
public class RunCucumberTest {
}