package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import Utility.ExcelUtility;
import Utility.FakeDataUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _05_CreateHRPosition {

    DialogContent dc = new DialogContent();
    LeftPanel lp = new LeftPanel();

    private String[] fakeData;
    private String[] fakeDataUpdate;


    @When("The user navigates to HR")
    public void theUserNavigatesToHR(DataTable dt) {

        List<String> linkList = dt.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = lp.getWebElement(linkList.get(i));
            lp.myClick(linkWebElement);
        }

        FakeDataUtility fakex = new FakeDataUtility();
        fakeData = fakex.FakeData();
        fakeDataUpdate = fakex.FakeData();
    }

    @And("The user adds a new position")
    public void theUserAddsANewPosition() {


        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.positionName, fakeData[0]);
        dc.mySendKeys(dc.shortName, fakeData[1]);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);


    }

    @Then("The position should be added successfully")
    public void thePositionShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");

    }

    @And("The user updates an existing position")
    public void theUserUpdatesAnExistingPosition() {

        dc.mySendKeys(dc.nameSearch, fakeData[0]);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.positionName, fakeDataUpdate[0]);
        dc.mySendKeys(dc.shortName, fakeDataUpdate[1]);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);

    }

    @Then("the position should be edited successfully")
    public void thePositionShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");

    }

    @And("The user searches for a position")
    public void theUserSearchesForAPosition() {


        dc.mySendKeys(dc.nameSearch, fakeDataUpdate[0]);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);


    }

    @Then("The system should display the results")
    public void theSystemShouldDisplayTheResults() {

        Assert.assertEquals(dc.positionNameText.getText(), fakeDataUpdate[0]);


    }

    @And("The user chooses to enable or disable a position")
    public void theUserChoosesToEnableOrDisableAPosition() {

        dc.mySendKeys(dc.nameSearch, fakeDataUpdate[0]);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.activeInactiveButton);


    }

    @Then("The position's status should be updated")
    public void thePositionSStatusShouldBeUpdated() {
        dc.verifyContainsText(dc.successMessage, "updated");

    }

    @And("The user deletes a position")
    public void theUserDeletesAPosition() {


        dc.mySendKeys(dc.nameSearch, fakeDataUpdate[0]);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
        dc.waitItem(dc.searchButton);

    }

    @Then("The position should be deleted successfully")
    public void thePositionShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");

    }


}
