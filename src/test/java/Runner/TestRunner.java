package Runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
        features = "src/main/resources/features", // Path to your feature files
        glue = {"StepDefinition"}, // Package containing step definition classes
        plugin = {"pretty", "html:target/cucumber-reports.html"} // Report options
)
public class TestRunner {
}
