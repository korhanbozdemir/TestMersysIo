package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class _06_SubjectCategoriesSteps {
    DialogContent dc=new DialogContent();
    LeftPanel lp =new LeftPanel();

    String name1="a23";
    String code1="c23";
    String name2="b23";
    String code2="d23";
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strList = linkler.asList(String.class);

        for (int i = 0; i < strList.size(); i++) {
            lp.myClick(lp.getWebElement(strList.get(i)));
        }
    }

    @And("Click add button")
    public void clickAddButton() {

        dc.waitItem(dc.searchButton);
        dc.myClick(dc.addButton2);
    }

    @And("Enter a name and code and click save button")
    public void enterANameAndCodeAndClickSaveButton() {
        dc.mySendKeys(dc.nameInput,name1);
        dc.mySendKeys(dc.fieldCode,code1);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("Verify visibility of the successful create message")
    public void verifyVisibilityOfTheSuccessfulCreateMessage() {

        dc.verifyContainsText(dc.successMessage,"success");
    }
    @And("The user searches any category")
    public void theUserSearchesAnyCategory() {
        dc.mySendKeys(dc.nameSearch,name1);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
    }
    @And("Click change button enter a name and code")
    public void clickChangeButtonEnterANameAndCode() {
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.nameInput,name2);
        dc.mySendKeys(dc.fieldCode,code2);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }
    @Then("Verify visibility of the successful change message")
    public void verifyVisibilityOfTheSuccessfulChangeMessage() {

        dc.verifyContainsText(dc.successMessage,"success");
    }

    @And("Verify visibility of search button and input boxes")
    public void verifyVisibilityOfSearchButtonAndInputBoxes() {
        assert (dc.nameSearch.isDisplayed());
        assert (dc.codeSearch.isDisplayed());
        assert (dc.searchButton.isDisplayed());
    }
    @And("Enter a available name and click search button")
    public void enterAAvailableNameAndClickSearchButton() {
        dc.mySendKeys(dc.nameSearch,name2);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("Verify that the name is available in list")
    public void verifyThatTheNameIsAvailableInList() {
      List<WebElement> list=new ArrayList<>();
      list.addAll(dc.listSubject);
      boolean arg=false;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getText().equalsIgnoreCase(name2)) {
                System.out.println("Name was found!");
                arg=true;
            }
        }
        if(!arg)
            System.out.println("Name wasn't found");
    }

    @And("Verify visibility of the action button and click it")
    public void verifyVisibilityOfTheActionButtonAndClickIt() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.actionButton));
        dc.myClick(dc.actionButton);
        dc.waitItem(dc.searchButton);
    }

    @Then("In the opened window click the action button and verify change")
    public void inTheOpenedWindowClickTheActionButtonAndVerifyChange() {

        dc.myClick(dc.actionButton2);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }
    @And("Click delete icon and delete button")
    public void clickDeleteIconAndDeleteButton() {
        dc.mySendKeys(dc.nameSearch,name2);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
        dc.waitItem(dc.searchButton);
    }
    @Then("Verify visibility of the successful delete message")
    public void verifyVisibilityOfTheSuccessfulDeleteMessage() {
        dc.verifyContainsText(dc.successMessage,"success");
    }
}

