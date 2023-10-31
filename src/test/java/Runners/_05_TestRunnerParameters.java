package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_04_AddNewModulsToAdmin.feature",
                "src/test/java/FeatureFiles/_09_EditBankAccount.feature",
                "src/test/java/FeatureFiles/_10_EditGradeLevels.feature",
                "src/test/java/FeatureFiles/_11_EditDiscount.feature",
                "src/test/java/FeatureFiles/_12_EditNationality.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _05_TestRunnerParameters extends AbstractTestNGCucumberTests {
}