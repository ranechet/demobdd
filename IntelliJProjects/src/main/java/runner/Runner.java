package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",
        glue = {"D:\\CodeRepository\\IntelliJProjects\\src\\main\\java\\stepdefinitions\\DemoSteps.java"},
        tags = {"@FirstTest"},
        monochrome = true,
        dryRun = true
)
public class Runner {

}
