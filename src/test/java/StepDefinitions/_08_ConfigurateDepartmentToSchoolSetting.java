package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _08_ConfigurateDepartmentToSchoolSetting {


    DialogContent dc=new DialogContent();
    LeftPanel lp=new LeftPanel();
    String name="test12";
    String code="testcode2";
    String nameEdit="testedit2";
    String codeEdit="codeeditaaaa12";

    @When("User navigates to sections")
    public void userNavigatesToSections(DataTable dt) {
        List<String> linkList = dt.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = lp.getWebElement(linkList.get(i));
            lp.myClick(linkWebElement);
        }

    }

    @And("Add departments")
    public void addDepartments() {
        assert (dc.addButton.isEnabled());
        dc.myClick(dc.addButton);
        assert (dc.nameInput.isDisplayed());
        assert (dc.codeInput.isDisplayed());
        dc.mySendKeys(dc.nameInput,name);
        dc.mySendKeys(dc.codeInput,code);
        dc.myClick(dc.saveButton);
    }

    @Then("It was seen that the section was added")
    public void ıtWasSeenThatTheSectionWasAdded() {
      dc.verifyContainsText(dc.successMessage, "success");
    }


    @And("Department editing")
    public void departmentEditing() {
        assert (dc.editButton.isEnabled());
        dc.myClick(dc.editButton);
        assert (dc.nameInput.isDisplayed());
        assert (dc.codeInput.isDisplayed());
        dc.mySendKeys(dc.nameInput,nameEdit);
        dc.mySendKeys(dc.codeInput,codeEdit);
        dc.myClick(dc.saveButton);
    }

    @Then("It was seen that it was edited")
    public void ıtWasSeenThatItWasEdited() {
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @And("Delete a department")
    public void deleteADepartment() {
        assert (dc.deleteImageButton.isEnabled());
        dc.myClick(dc.deleteImageButton);
        assert (dc.deleteDialogButton.isDisplayed());
        dc.myClick(dc.deleteDialogButton);
    }

    @Then("Deletion seen")
    public void deletionSeen() {

        dc.verifyContainsText(dc.successMessage, "success");
    }
}
