package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import Utility.FakeDataUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _09_EditBankAccount {

    DialogContent dc = new DialogContent();
    LeftPanel lp =new LeftPanel();
    private String [] fakeDataName;

    @When("Click on the bank accounts")
    public void clickOnTheBankAccounts(DataTable dt) {

        List<String> strLinkList = dt.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lp.getWebElement(strLinkList.get(i));
            lp.myClick(linkWebElement);
        }

        FakeDataUtility fakedata=new FakeDataUtility();
        fakeDataName=fakedata.FakeDataTable();


    }


    @And("User should be able to add accounts")
    public void userShouldBeAbleToAddAccounts() {

        dc.myClick(dc.positionTargetBtn);
        dc.mySendKeys(dc.positionAddName,fakeDataName[0]);
        dc.mySendKeys(dc.bnkAcIban,fakeDataName[1]);
        dc.myClick(dc.bnkCurrency);
        dc.myClick(dc.bnkSelectEur);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("The account should be added successfully")
    public void theAccountShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User should be edit the account")
    public void userShouldBeEditTheAccount() {

        dc.mySendKeys(dc.positionSearchName,fakeDataName[0]);
        dc.myClick(dc.positionSearchBtn);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.positionEditBtn);
        dc.mySendKeys(dc.positionAddName,fakeDataName[3]);
        dc.mySendKeys(dc.bnkAcIban,fakeDataName[4]);
        dc.myClick(dc.bnkSelectEur);
        dc.myClick(dc.bnkSelectTRY);
        dc.myClick(dc.editSaveBtn);
        dc.waitItem(dc.searchButton);

    }

    @Then("The account should be edited successfully")
    public void theAccountShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");


    }

    @And("User should be able to delete the account")
    public void userShouldBeAbleToDeleteTheAccount() {

        dc.mySendKeys(dc.positionSearchName,fakeDataName[3]);
        dc.myClick(dc.positionSearchBtn);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteItemBtn);
        dc.myClick(dc.deleteDialogBtn);

    }

    @Then("The account should be deleted successfully")
    public void theAccountShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "deleted");

    }


}
