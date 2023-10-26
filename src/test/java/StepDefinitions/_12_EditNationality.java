package StepDefinitions;

import Pages.DenizLocaters;
import Utility.TestDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _12_EditNationality {
    DenizLocaters dc = new DenizLocaters();

    public WebDriverWait wait = new WebDriverWait(TestDriver.getDriver(), Duration.ofSeconds(20));


    String nationName = "First Nationality";
    String editedNationName = "New Nationality...";

    @When("User navigates to nationality")
    public void userNavigatesToNationality(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strLinkList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @And("User adds a new nationality")
    public void userAddsANewNationality() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nationalityName, nationName);
        dc.myClick(dc.saveButton);
    }

    @Then("New nationality should be added successfully")
    public void newNationalityShouldBeAddedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User edits an existing nationality")
    public void userEditsAnExistingNationality() {
        dc.mySendKeys(dc.nameSearch, nationName);
        //dc.waitItem(dc.searchButton);
        dc.myClick(dc.searchButton);
        //dc.waitItem(dc.edit);
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.nationalityName, editedNationName);
        dc.myClick(dc.saveButton);
    }

    @Then("Nationality should be edited successfully")
    public void nationalityShouldBeEditedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User deletes an existing nationality")
    public void userDeletesAnExistingNationality() {
        dc.mySendKeys(dc.nameSearch, editedNationName);
        //dc.waitItem(dc.searchButton);
        dc.myClick(dc.searchButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("Nationality should be deleted successfully")
    public void nationalityShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage, "success");
    }


}
