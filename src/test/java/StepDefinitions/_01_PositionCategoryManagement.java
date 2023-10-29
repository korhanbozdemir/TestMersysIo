package StepDefinitions;

import Pages.LeftPanelE;
import Utility.FakeDataUtility;
import Utility.TestDriver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _01_PositionCategoryManagement {

    LeftPanelE dc = new LeftPanelE();


    private String [] fakeDataName;


    @Given("Navigate to website")
    public void navigateToWebsite() {

        TestDriver.getDriver().get("https://test.mersys.io/");

    }

    @And("The user enter a valid username and password and clicks to log in button")
    public void TheUserEnterAValidUsernameAndPasswordAndClicksToLogInButton() {

        dc.mySendKeys(dc.userName, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.signInBtn);

    }

    @Then("The user logs in successfully")
    public void theUserLogsInSuccessfully() {

        dc.verifyContainsText(dc.dashBoard, "Dashboard");

    }

    @Given("Click on the position element in LeftNav")
    public void clickOnThePositionElementInLeftNav() {

        dc.myClick(dc.humanResources);
        dc.myClick(dc.humanRecourcesSetUp);
        dc.myClick(dc.HumanRecourcesSetUpPositionsCat);

        FakeDataUtility fakedata=new FakeDataUtility();
        fakeDataName=fakedata.FakeDataTable();

    }
    @And("The user adds a new position")
    public void theUserAddsANewPosition() {

        dc.myClick(dc.positionTargetBtn);
        dc.mySendKeys(dc.positionAddName,fakeDataName[0]);
        dc.myClick(dc.positionSaveBtn);
        dc.waitItem(dc.positionSaveBtn);

    }

    @Then("The position should be added successfully")
    public void thePositionShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage,"success");
    }

    @And("User should be edit the position")
    public void userShouldBeEditThePosition() {

        dc.mySendKeys(dc.positionSearchName,fakeDataName[0]);
        dc.myClick(dc.positionSearchBtn);
        dc.waitItem(dc.positionSearchBtn);
        dc.myClick(dc.positionEditBtn);
        dc.mySendKeys(dc.positionAddName,fakeDataName[3]);
        dc.myClick(dc.editSaveBtn);


    }

    @Then("The position should be edited successfully")
    public void thePositionShouldBeEditedSuccessfully() {

        dc.waitItem(dc.positionSearchBtn);
        dc.verifyContainsText(dc.successMessage, "success");


    }


    @And("User should be able to delete the position")
    public void userShouldBeAbleToDeleteThePosition() {


        dc.mySendKeys(dc.positionSearchName,fakeDataName[3]);
        dc.myClick(dc.positionSearchBtn);
        dc.waitItem(dc.positionSearchBtn);
        dc.myClick(dc.deleteItemBtn);
        dc.myClick(dc.deleteDialogBtn);
        
    }

    @Then("The position should be deleted successfully")
    public void thePositionShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "deleted");
    }
}
