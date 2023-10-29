package StepDefinitions;

import Pages.LeftPanelE;
import Utility.FakeDataUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _09_EditBankAccount {

    LeftPanelE dc = new LeftPanelE();
    private String [] fakeDataName;

    @Given("Click on the bank accounts element in LeftNav")
    public void clickOnTheBankAccountsElementInLeftNav() {

        dc.myClick(dc.setUp);
        dc.myClick(dc.setUpParameters);
        dc.myClick(dc.setUpParametersBankAccounts);


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
        dc.myClick(dc.positionSaveBtn);
        dc.waitItem(dc.positionSaveBtn);
    }

    @Then("The account should be added successfully")
    public void theAccountShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("User should be edit the account")
    public void userShouldBeEditTheAccount() {

        dc.mySendKeys(dc.positionSearchName,fakeDataName[0]);
        dc.myClick(dc.positionSearchBtn);
        dc.waitItem(dc.positionSearchBtn);
        dc.myClick(dc.positionEditBtn);
        dc.mySendKeys(dc.positionAddName,fakeDataName[3]);
        dc.mySendKeys(dc.bnkAcIban,fakeDataName[4]); // yeni bir fake iban
        dc.myClick(dc.bnkSelectEur);
        dc.myClick(dc.bnkSelectTRY);
        dc.myClick(dc.editSaveBtn);
        dc.waitItem(dc.positionSearchBtn);

    }

    @Then("The account should be edited successfully")
    public void theAccountShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");


    }

    @And("User should be able to delete the account")
    public void userShouldBeAbleToDeleteTheAccount() {

        dc.mySendKeys(dc.positionSearchName,fakeDataName[3]);
        dc.myClick(dc.positionSearchBtn);
        dc.waitItem(dc.positionSearchBtn);
        dc.myClick(dc.deleteItemBtn);
        dc.myClick(dc.deleteDialogBtn);

    }

    @Then("The account should be deleted successfully")
    public void theAccountShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "deleted");

    }
//
//    }


}
