package StepDefinitions;

import Utility.ExcelUtility;
import Utility.FakeDataUtility;
import Utility.TestDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before()
    {
    }

    @After
    public void after(Scenario senaryo)
    {
        ExcelUtility.writeToExcel("src/test/java/ExcelDb/SenaryoSonuclari.xlsx",
                senaryo);


        if (senaryo.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) TestDriver.getDriver());
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }

        TestDriver.quitDriver();
    }

}









