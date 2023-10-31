package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_06_SubjecyCategories.feature",
                "src/test/java/FeatureFiles/_07_AddLocationToSchoolSetup.feature",
                "src/test/java/FeatureFiles/_08_ConfigurateDepartmentToSchoolSetting.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _07_TestRunnerSchool extends AbstractTestNGCucumberTests {
}