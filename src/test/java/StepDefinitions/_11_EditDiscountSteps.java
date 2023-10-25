package StepDefinitions;

import Pages.DialogContentY;
import Pages.LeftPanelY;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _11_EditDiscountSteps {
    DialogContentY dc=new DialogContentY();
    LeftPanelY ln=new LeftPanelY();
    @Given("Navigate to discounts")
    public void navigateToDiscounts() {
        ln.myClick(ln.setUpY);
        ln.myClick(ln.setUpParametersY);
        ln.myClick(ln.setUpParametersDiscountsY);
        Assert.assertTrue(ln.setUpParametersDiscountsY.isDisplayed());
        dc.myClick(dc.codeInputY);
        Assert.assertTrue(dc.codeInputY.isDisplayed());
    }

    @When("Create a discounts")
    public void createADiscounts() {
        dc.myClick(dc.addButtonY);
        dc.mySendKeys(dc.desciriptionInputY,"yasin25");
        dc.mySendKeys(dc.integrationInputY,"355");
        dc.mySendKeys(dc.priorityInputY,"755");
        dc.myClick(dc.integrationInputY);
        dc.myClick(dc.saveCloseBtnY);
    }

    @When("Organize a discount")
    public void organizeADiscount() {
        dc.mySendKeys(dc.codeInputY,"355");
        dc.myClick(dc.searchButtonY);
        dc.waitItem(dc.editButtonY);
        dc.myClick(dc.editButtonY);
        dc.mySendKeys(dc.desciriptionInputY,"yasin44");
        dc.mySendKeys(dc.integrationInputY,"44");
        dc.mySendKeys(dc.priorityInputY,"44");
        dc.myClick(dc.integrationInputY);
        dc.myClick(dc.saveCloseBtnY);
    }

    @When("Delete discount")
    public void deleteDiscount() {
        dc.mySendKeys(dc.codeInputY,"44");
        dc.myClick(dc.searchButtonY);
        dc.waitItem(dc.deleteImageBtnY);
        dc.myClick(dc.deleteImageBtnY);
        dc.myClick(dc.deleteDialogBtnY);

    }

    @And("Creating a discount with incomplete information")
    public void creatingADiscountWithIncompleteInformation() {

        dc.myClick(dc.addButtonY);
        dc.mySendKeys(dc.desciriptionInputY,"yasin25");
        dc.myClick(dc.integrationInputY);
        dc.mySendKeys(dc.priorityInputY,"755");
    }

    @And("This field is required message should be displayed")
    public void thisFieldIsRequiredMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.thisFieldErrorY,"This field is required!");
    }

    @And("Searching for discounts with wrong data")
    public void searchingForDiscountsWithWrongData() {

        dc.mySendKeys(dc.codeInputY,"456");
        dc.myClick(dc.searchButtonY);
        dc.verifyContainsText(dc.noDataMsgY,"There is no data to display");


    }
}
