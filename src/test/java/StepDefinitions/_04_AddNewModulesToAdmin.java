package StepDefinitions;

import Pages.DenizLocaters;
import Utility.TestDriver;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _04_AddNewModulesToAdmin {
    DenizLocaters dc = new DenizLocaters();

//    private String [] fakeDataName;
//    private String [] fakeDataUpdateName;
//    private String [] fakeDataCode;



    String fieldNames = "First Field";
    String editedFieldNames = "New Field";
    String newCodes = "DO code";

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        TestDriver.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username and password as {string} and {string}")
    public void enterUsernameAndPasswordAsAnd(String username, String password) {
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginBtn);
    }

    /****************************************/

    @When("User navigates to field")
    public void userNavigatesToField(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strLinkList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @And("User adds a new field")
    public void userAddsANewField() {

//        fakeDataName=dc.FakeDataTable();
//        fakeDataUpdateName=dc.FakeDataTable();
//        fakeDataCode=dc.FakeDataTable();
       // dc.fakeDatas=new FakeDataUtility();
       // fakeDataName = FakeDatas.FakeFataTable();
        //fakeDataUpdateName = FakeDatas.FakeFataTable();
       // fakeDataCode = FakeDatas.FakeFataTable();

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.fieldName, fieldNames);
        dc.mySendKeys(dc.fieldCode, newCodes);
        dc.myClick(dc.fieldType);
        dc.myClick(dc.text);
        dc.myClick(dc.saveButton);
    }

    @Then("New field should be added successfully")
    public void newFieldShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User edits an existing field")
    public void userEditsAnExistingField() {
        dc.mySendKeys(dc.nameSearch, fieldNames);
        //dc.waitItem(dc.searchButton);
        dc.myClick(dc.searchButton);
        //dc.waitItem(dc.edit);
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.fieldName, editedFieldNames);
        dc.myClick(dc.saveButton);
    }

    @Then("Field should be edited successfully")
    public void fieldShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User deletes an existing field")
    public void userDeletesAnExistingField() {

        dc.mySendKeys(dc.nameSearch, editedFieldNames);
        //dc.waitItem(dc.searchButton);
        dc.myClick(dc.searchButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("Field should be deleted successfully")
    public void fieldShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

}


