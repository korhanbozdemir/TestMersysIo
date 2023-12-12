package StepDefinitions;

import Utility.*;
import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    String path="C:\\Users\\Lenovo\\IdeaProjects\\TestMersysIo\\src\\test\\java\\ExcelDb\\ExcelDb.xlsx";

    @Before
    public void before()
    {

        for (int i = 0; i <10 ; i++) {
            Faker faker=new Faker();

            String name= faker.name().firstName();
            String code= faker.code().ean8();
            String fakePosition = faker.job().position();
            String capacity= String.valueOf(faker.number().numberBetween(10,100));

            String[] shortNameSplit = fakePosition.split(" ");
            String firstChar = shortNameSplit[0].substring(0, 1);
            String secondChar = "";

            if (shortNameSplit.length > 1) {
                secondChar = shortNameSplit[1].substring(0, 1);
            } else {
                secondChar = "";
            }

            String shortName = firstChar + secondChar;

          //  ExcelUtility.writeToExcel(path,name,code,fakePosition,capacity,shortName);
    }


    }

    @After
    public void after()
    {

      //  ExcelUtility.ExcelClean(path,"Sayfa1",5000);
        TestDriver.quitDriver();
    }

}









