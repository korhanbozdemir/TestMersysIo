package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import Utility.TestDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_DocumentTypeManagement {
    DialogContent dc = new DialogContent();
    LeftPanel lp=new LeftPanel();



    @And("Navigate to document")
    public void navigateToDocument(DataTable linkler) {
        List<String> stringList=linkler.asList(String.class);

        for (int i = 0; i < stringList.size(); i++) {
            WebElement linkWebElement=lp.getWebElement(stringList.get(i));
            lp.myClick(linkWebElement);
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
        dc.waitItem(dc.searchButton);
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
        dc.waitItem(dc.searchButton);
    }

    @Then("Search a name as {string} and click search box and delete")
    public void searchANameAsAndClickSearchBoxanddelete(String name) {
        dc.mySendKeys(dc.searchName, name);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteButton);
        dc.myClick(dc.deleteMsg);
        dc.waitItem(dc.searchButton);

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
        dc.waitItem(dc.searchButton);

    }


}
