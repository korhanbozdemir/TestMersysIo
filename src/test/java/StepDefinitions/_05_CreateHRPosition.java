package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import Utility.FakeDataUtility;
import Utility.TestDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import javax.xml.crypto.Data;
import java.util.List;

public class _05_CreateHRPosition {

    DialogContent dc = new DialogContent();
    LeftPanel lp = new LeftPanel();

   private String [] fakeData;
   private String [] fakeDataUpdate;



//    @Given("Navigate to Campus")
//    public void navigateToCampus() {
//        TestDriver.getDriver().get("https://test.mersys.io/");
//    }
//
//    @When("Write username and password {string} and {string} and click login button")
//    public void writeUsernameAndPasswordAndAndClickLoginButton(String username, String password) {
//        dc.mySendKeys(dc.username, username);
//        dc.mySendKeys(dc.password, password);
//        dc.myClick(dc.loginButton);
//
//    }
//
//
//    @Then("User should login successfully")
//    public void userShouldLoginSuccessfully() {
//
//        dc.verifyContainsText(dc.getWebElement("txtLoginSuccessLogo"), "Techno Study");
//
//    }



    @When("The user navigates to HR")
    public void theUserNavigatesToHR(DataTable dt) {

        List<String> linkList = dt.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = lp.getWebElement(linkList.get(i));
            lp.myClick(linkWebElement);
        }

        FakeDataUtility fakex=new FakeDataUtility(); //Fake Datalarımı FakeDataUtility çağırdım
        fakeData = fakex.FakeData();
        fakeDataUpdate=fakex.FakeData();
    }

    @And("The user adds a new position")
    public void theUserAddsANewPosition() {

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.positionName, fakeData[0]);
        dc.mySendKeys(dc.shortName,fakeData[1]);
        dc.myClick(dc.saveButton);

    }

    @Then("The position should be added successfully")
    public void thePositionShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");

    }

    @And("The user updates an existing position")
    public void theUserUpdatesAnExistingPosition() {

        dc.mySendKeys(dc.nameSearch,fakeData[0]);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.positionName,fakeDataUpdate[0]);
        dc.mySendKeys(dc.shortName,fakeDataUpdate[1]);
        dc.myClick(dc.saveButton);

    }

    @Then("the position should be edited successfully")
    public void thePositionShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");

    }

    @And("The user searches for a position")
    public void theUserSearchesForAPosition() {


        dc.mySendKeys(dc.nameSearch,fakeDataUpdate[0]);
        dc.myClick(dc.searchButton);


    }

    @Then("The system should display the results")
    public void theSystemShouldDisplayTheResults() {

        dc.waitItem(dc.searchButton);
        Assert.assertEquals(dc.positionNameText.getText(),fakeDataUpdate[0]);


    }

    @And("The user chooses to enable or disable a position")
    public void theUserChoosesToEnableOrDisableAPosition() {

        dc.mySendKeys(dc.nameSearch,fakeDataUpdate[0]);
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


        dc.mySendKeys(dc.nameSearch,fakeDataUpdate[0]);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);

    }

    @Then("The position should be deleted successfully")
    public void thePositionShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");

    }

}
