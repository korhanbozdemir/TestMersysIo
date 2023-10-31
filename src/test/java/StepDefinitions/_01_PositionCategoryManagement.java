package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import Utility.FakeDataUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_PositionCategoryManagement {

    LeftPanel lp = new LeftPanel();
    DialogContent dc = new DialogContent();


    private String [] fakeDataName;


    @When("The user navigates to Position Category")
    public void theUserNavigatesToPositionCategory(DataTable dt) {

        List<String> linkList = dt.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = lp.getWebElement(linkList.get(i));
            lp.myClick(linkWebElement);
        }

        FakeDataUtility fakedata=new FakeDataUtility();
        fakeDataName=fakedata.FakeDataTable();
    }

    @And("The user adds a new position1")
    public void theUserAddsANewPosition() {

        dc.myClick(dc.positionTargetBtn);
        dc.mySendKeys(dc.positionAddName,fakeDataName[0]);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);

    }

    @Then("The position should be added successfully1")
    public void thePositionShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage,"success");
    }

    @And("User should be edit the position1")
    public void userShouldBeEditThePosition() {

        dc.mySendKeys(dc.positionSearchName,fakeDataName[0]);
        dc.myClick(dc.positionSearchBtn);
        dc.waitItem(dc.positionSearchBtn);
        dc.myClick(dc.positionEditBtn);
        dc.mySendKeys(dc.positionAddName,fakeDataName[3]);
        dc.myClick(dc.editSaveBtn);


    }

    @Then("The position should be edited successfully1")
    public void thePositionShouldBeEditedSuccessfully() {

        dc.waitItem(dc.positionSearchBtn);
        dc.verifyContainsText(dc.successMessage, "success");


    }


    @And("User should be able to delete the position1")
    public void userShouldBeAbleToDeleteThePosition() {


        dc.mySendKeys(dc.positionSearchName,fakeDataName[3]);
        dc.myClick(dc.positionSearchBtn);
        dc.waitItem(dc.positionSearchBtn);
        dc.myClick(dc.deleteItemBtn);
        dc.myClick(dc.deleteDialogBtn);
        
    }

    @Then("The position should be deleted successfully1")
    public void thePositionShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "deleted");
    }


}
