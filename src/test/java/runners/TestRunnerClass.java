package runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = {"src/test/java/stepDefinitions/"},
        tags = "",
        dryRun = true,
        monochrome = true
)

public class TestRunnerClass {
}
