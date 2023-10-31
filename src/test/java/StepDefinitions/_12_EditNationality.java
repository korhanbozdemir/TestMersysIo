package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import Utility.TestDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.ht.Le;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _12_EditNationality {
    DialogContent dc = new DialogContent();
    LeftPanel lp =new LeftPanel();

    String nationName = "First Nationality";
    String editedNationName = "New Nationality...";

    @When("User navigates to nationality")
    public void userNavigatesToNationality(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lp.getWebElement(strLinkList.get(i));
            lp.myClick(linkWebElement);
        }
    }

    @And("User adds a new nationality")
    public void userAddsANewNationality() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.positionName,nationName);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("New nationality should be added successfully")
    public void newNationalityShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User edits an existing nationality")
    public void userEditsAnExistingNationality() {
        dc.mySendKeys(dc.nameSearch, nationName);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.positionName,editedNationName);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("Nationality should be edited successfully")
    public void nationalityShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User deletes an existing nationality")
    public void userDeletesAnExistingNationality() {
        dc.mySendKeys(dc.nameSearch, editedNationName);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("Nationality should be deleted successfully")
    public void nationalityShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }


}
