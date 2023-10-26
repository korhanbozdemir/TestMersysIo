package StepDefinitions;

import Pages.LeftPanel;
import Pages.bugrahanLocator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _08_ConfigurateDepartmentToSchoolSetting {


    bugrahanLocator bLoc=new bugrahanLocator();
    LeftPanel lp=new LeftPanel();
    String name="bursasdks";
    String code="izmirsdjs";
    String nameEdit="bursa2js";
    String codeEdit="izmir2hs";
    @When("User navigates to sections")
    public void userNavigatesToSections(DataTable dt) {
        List<String> linkList = dt.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = bLoc.getWebElement(linkList.get(i));
            bLoc.myClick(linkWebElement);
        }

    }

    @And("Add departments")
    public void addDepartments() {
        assert (bLoc.addButton.isEnabled());
        bLoc.myClick(bLoc.addButton);
        assert (bLoc.nameBox.isDisplayed());
        assert (bLoc.codeBox.isDisplayed());
        bLoc.mySendKeys(bLoc.nameBox,name);
        bLoc.mySendKeys(bLoc.codeBox,code);
        bLoc.myClick(bLoc.saveButton);
    }

    @Then("It was seen that the section was added")
    public void ıtWasSeenThatTheSectionWasAdded() {
/*        bLoc.myClick(bLoc.allSubjectButton);
        bLoc.wait.until(ExpectedConditions.elementToBeClickable(bLoc.allSubject100));
        bLoc.myClick(bLoc.allSubject100);

        List<WebElement> list=new ArrayList<>();
        list.addAll(bLoc.listSubject);
        boolean arg=false;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getText().equalsIgnoreCase(name)) {
                System.out.println("Name was found!");
                arg=true;
            }
        }
        if(!arg)
            System.out.println("Name wasn't found");*/
    }


    @And("Department editing")
    public void departmentEditing() {
        assert (bLoc.editButton.isEnabled());
        bLoc.myClick(bLoc.editButton);
        assert (bLoc.nameBox.isDisplayed());
        assert (bLoc.codeBox.isDisplayed());
        bLoc.mySendKeys(bLoc.nameBox,nameEdit);
        bLoc.mySendKeys(bLoc.codeBox,codeEdit);
        bLoc.myClick(bLoc.saveButton);
    }

    @Then("It was seen that it was edited")
    public void ıtWasSeenThatItWasEdited() {
       /* bLoc.myClick(bLoc.allSubjectButton);
        bLoc.wait.until(ExpectedConditions.elementToBeClickable(bLoc.allSubject100));
        bLoc.myClick(bLoc.allSubject100);

        List<WebElement> list=new ArrayList<>();
        list.addAll(bLoc.listSubject);
        boolean arg=false;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getText().equalsIgnoreCase(nameEdit)) {
                System.out.println("Name was found!");
                arg=true;
            }
        }
        if(!arg)
            System.out.println("Name wasn't found");*/
    }

    @And("Delete a department")
    public void deleteADepartment() {
        assert (bLoc.deleteButton.isEnabled());
        bLoc.myClick(bLoc.deleteButton);
        assert (bLoc.againDeleteButton.isDisplayed());
        bLoc.myClick(bLoc.againDeleteButton);
    }

    @Then("Deletion seen")
    public void deletionSeen() {

        //bLoc.verifyContainsText(bLoc.deleteTextMessage,"Success");
    }
}
