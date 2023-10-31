package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import Utility.FakeDataUtility;
import Utility.TestDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class _10_EditGradeLevels {

    DialogContent dc = new DialogContent();
    LeftPanel lp = new LeftPanel();

    private String [] fakeData;
    private String [] fakeDataUpdate;

    public WebDriverWait wait;


    @When("The user navigates to grade levels")
    public void theUserNavigatesToGradeLevels(DataTable dt) {

        List<String> linkList = dt.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = lp.getWebElement(linkList.get(i));
            lp.myClick(linkWebElement);
        }

        FakeDataUtility fakex=new FakeDataUtility();
        fakeData = fakex.FakeData();
        fakeDataUpdate=fakex.FakeData();
    }

    @And("The user adds a new grade level")
    public void theUserAddsANewGradeLevel() {

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.gradeName, "korhan3");
        dc.mySendKeys(dc.gradeShortName, "kb3");
        dc.mySendKeys(dc.gradeOrder, "123");
        dc.mySendKeys(dc.maxApplicationCount, "23");
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchwait2);
    }

    @Then("The grade level should be added successfully")
    public void theGradeLevelShouldBeAddedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("The user edits a grade level")
    public void theUserEditsAGradeLevel() {

        dc.myClick(dc.lastEditBtn);
        dc.mySendKeys(dc.nameInput, "korhanyeni");
        dc.mySendKeys(dc.gradeShortName, "kyeni");
        dc.mySendKeys(dc.gradeOrder, "321");
        dc.mySendKeys(dc.maxApplicationCount, "32");
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchwait2);


    }

    @Then("The grade level should be edited successfully")
    public void theGradeLevelShouldBeEditedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("The user deletes a grade level")
    public void theUserDeletesAGradeLevel() {

                dc.myClick(dc.lastDelBtn);
    }

    @Then("The grade level should be deleted successfully")
    public void theGradeLevelShouldBeDeletedSuccessfully() {

        dc.verifyContainsText(dc.successMessage, "success");
    }



}
