package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.WebDriverFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Homepage.feature",
        //glue = {"stepdefinitions","hooks"},
        glue = "stepdefinitions",
        tags = "not @skip",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {

    @AfterClass
    public static void tearDown() {
        WebDriverFactory.quitDriver();
    }
}