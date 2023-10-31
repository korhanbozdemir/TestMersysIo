package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_01_PositionCategoryManagement.feature",
                "src/test/java/FeatureFiles/_02_DocumentManagement.feature",
                "src/test/java/FeatureFiles/_05_CreateHRPosition.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _03_TestRunnerHR extends AbstractTestNGCucumberTests {
}