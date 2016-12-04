package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/cucumber/features/",
        snippets = SnippetType.CAMELCASE,
        glue = {"cucumber.hooks",
                "cucumber.steps"},
        plugin = {"html:report/cucumberReport"})
public class RunTests {
}
