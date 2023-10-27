package StepDefinitions;

import Pages.aDialogContent;
import Pages.aLeftPanel;
import Utility.TestDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DocumentStep {
aDialogContent dc=new aDialogContent();
aLeftPanel ln=new aLeftPanel();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        TestDriver.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.txtTechnoStudy,"Techno Study");
    }


    @And("Navigate to docuument")
    public void navigateToDocuument(DataTable linkler) {
        List<String> stringList=linkler.asList(String.class);

        for (int i = 0; i < stringList.size(); i++) {
            WebElement linkWebElement=ln.getWebElement(stringList.get(i));
            ln.myClick(linkWebElement);
        }

    }

    @Then("Click button register")
    public void clickButtonRegister() {
        dc.myClick(dc.registerButton);
    }

    @When("Create a document name as {string} and click level and click ogrenci write as desciription {string} and click save button")
    public void createADocumentNameAsAndClickLevelAndClickOgrenciWriteAsDesciriptionAndClickSaveButton(String name, String mesaj) {
        dc.mySendKeys(dc.KayitName,name);
        dc.myClick(dc.Level);
        dc.myClick(dc.OgrenciKayit);
        new Actions(TestDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        dc.mySendKeys(dc.Description,mesaj);
        dc.myClick(dc.save);
        dc.waitItem(dc.save);
    }

    @Then("Click to  amend edit")
    public void clickToAmendEdit() {
        dc.waitItem(dc.edit);
        dc.myClick(dc.edit);

    }

    @Then("Create a document name as {string} and click level and click ogrenci and delete desciription and click save button")
    public void createADocumentNameAsAndClickLevelAndClickOgrenciAndDeleteDesciriptionAndClickSaveButton(String name) {
        dc.mySendKeys(dc.KayitName,name);
        dc.myClick(dc.Level);
        dc.myClick(dc.OgrenciKayit);
        new Actions(TestDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        dc.Description.clear();
        dc.myClick(dc.save);
        dc.waitItem(dc.save);
    }

    @Then("Search a name as {string} and click search box and delete")
    public void searchANameAsAndClickSearchBoxanddelete(String name) {
        dc.mySendKeys(dc.searchName, name);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteButton);
        dc.myClick(dc.deleteMsg);
        dc.waitItem(dc.deleteMsg);

    }


    @And("User should display There is no data to display")
    public void userShouldDisplayThereIsNoDataToDisplay() {
        dc.mySendKeys(dc.searchName,"a1a1a1");
        dc.myClick(dc.searchButton);
        dc.verifyContainsText(dc.message,"There is no data to display");

    }


    @When("Create a document name as {string} and click level and click examanitaion  and click save button")
    public void createADocumentNameAsAndClickLevelAndClickExamanitaionAndClickSaveButton(String document) {

        dc.mySendKeys(dc.KayitName,document);
        dc.myClick(dc.Level);
        dc.myClick(dc.examinaton);
        dc.mySendKeys(dc.Description,"");
        dc.myClick(dc.save);

    }


}
