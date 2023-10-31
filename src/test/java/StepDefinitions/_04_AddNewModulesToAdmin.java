package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import Utility.TestDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_AddNewModulesToAdmin {
    DialogContent dc = new DialogContent();
    LeftPanel lp=new LeftPanel();


    String fieldNames = "First Field";
    String editedFieldNames = "New Field";
    String newCodes = "DO code";


    @When("User navigates to field")
    public void userNavigatesToField(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lp.getWebElement(strLinkList.get(i));
            lp.myClick(linkWebElement);
        }
    }

    @And("User adds a new field")
    public void userAddsANewField() {

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, fieldNames);
        dc.mySendKeys(dc.fieldCode, newCodes);
        dc.myClick(dc.fieldType);
        dc.myClick(dc.text);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("New field should be added successfully")
    public void newFieldShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User edits an existing field")
    public void userEditsAnExistingField() {
        dc.mySendKeys(dc.nameSearch, fieldNames);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.nameInput, editedFieldNames);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("Field should be edited successfully")
    public void fieldShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User deletes an existing field")
    public void userDeletesAnExistingField() {

        dc.mySendKeys(dc.nameSearch, editedFieldNames);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("Field should be deleted successfully")
    public void fieldShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

}


