package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _11_EditDiscountSteps {
    DialogContent dc=new DialogContent();
    LeftPanel lp=new LeftPanel();
    @And("Navigate to discounts")
    public void navigateToDiscounts(DataTable dt) {
        List<String> stringList=dt.asList(String.class);

        for (int i = 0; i <stringList.size() ; i++) {
            WebElement linkWebElement=lp.getWebElement(stringList.get(i));
            lp.myClick(linkWebElement);
        }
        Assert.assertTrue(lp.setUpParametersDiscounts.isDisplayed());
        dc.myClick(dc.codeInput);
        Assert.assertTrue(dc.codeInput.isDisplayed());
    }

    @When("Create a discounts")
    public void createADiscounts() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.desciriptionInput,"yasin25");
        dc.mySendKeys(dc.integrationInput,"355");
        dc.mySendKeys(dc.priorityInput,"755");
        dc.myClick(dc.integrationInput);
        dc.myClick(dc.saveCloseBtn);
    }

    @When("Organize a discount")
    public void organizeADiscount() {
        dc.mySendKeys(dc.codeInput,"355");
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.editButton);
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.desciriptionInput,"yasin44");
        dc.mySendKeys(dc.integrationInput,"44");
        dc.mySendKeys(dc.priorityInput,"44");
        dc.myClick(dc.integrationInput);
        dc.myClick(dc.saveCloseBtn);
    }

    @When("Delete discount")
    public void deleteDiscount() {
        dc.mySendKeys(dc.codeInput,"44");
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.deleteImageButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);

    }

    @And("Creating a discount with incomplete information")
    public void creatingADiscountWithIncompleteInformation() {

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.desciriptionInput,"yasin25");
        dc.myClick(dc.integrationInput);
        dc.mySendKeys(dc.priorityInput,"755");
    }

    @And("This field is required message should be displayed")
    public void thisFieldIsRequiredMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.thisFieldError,"This field is required!");
    }

    @And("Searching for discounts with wrong data")
    public void searchingForDiscountsWithWrongData() {

        dc.mySendKeys(dc.codeInput,"456");
        dc.myClick(dc.searchButton);
        dc.verifyContainsText(dc.noDataMsg,"There is no data to display");


    }
}
