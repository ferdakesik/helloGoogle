package google.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "google/step_def",
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",
                "html:target/cucumber-html-reports.html",
                "json:target/cucumber.json"
        },

        tags="@Google"
)


public class CucumberRunner {
}
