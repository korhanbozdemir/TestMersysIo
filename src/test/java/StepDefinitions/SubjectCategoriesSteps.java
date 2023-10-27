package StepDefinitions;

import Pages.ipekLocatorLeft;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class SubjectCategoriesSteps {
    ipekLocatorLeft iLocLeft =new ipekLocatorLeft();

/*    Faker faker=new Faker();
    String name1=faker.name().firstName();
    String name2=faker.name().firstName();
    String code1= String.valueOf(faker.code().hashCode());
    String code2= String.valueOf(faker.code().hashCode());
    String nameAvaible2=name2;
    String nameAvaible1=name1;*/

    String name1="mehmet6jggvhffkddfc";
    String code1="12347dfjkfhddgfgf";
    String name2="mertjggfddhff";
    String code2="6778fghfddgjf";
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strList = linkler.asList(String.class);

        for (int i = 0; i < strList.size(); i++) {
            iLocLeft.myClick(iLocLeft.getWebElement(strList.get(i)));
        }
    }

    @And("Click add button")
    public void clickAddButton() {
        iLocLeft.myClick(iLocLeft.addButton);
    }

    @And("Enter a name and code and click save button")
    public void enterANameAndCodeAndClickSaveButton() {
        iLocLeft.mySendKeys(iLocLeft.nameInput,name1);
        iLocLeft.mySendKeys(iLocLeft.codeInput,code1);
        iLocLeft.myClick(iLocLeft.saveButton);
    }

    @Then("Verify visibility of the successful create message")
    public void verifyVisibilityOfTheSuccessfulCreateMessage() {
        iLocLeft.verifyContainsText(iLocLeft.successMessage,"success");
    }
    @And("The user searches any category")
    public void theUserSearchesAnyCategory() {
        iLocLeft.mySendKeys(iLocLeft.nameSearch,name1);
        iLocLeft.myClick(iLocLeft.searchButton);
        iLocLeft.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ms-search-button//button")));
    }
    @And("Click change button enter a name and code")
    public void clickChangeButtonEnterANameAndCode() {
        iLocLeft.myClick(iLocLeft.changeButton);
        iLocLeft.mySendKeys(iLocLeft.nameInput,name2);
        iLocLeft.mySendKeys(iLocLeft.codeInput,code2);
        iLocLeft.myClick(iLocLeft.saveButton);
    }
    @Then("Verify visibility of the successful change message")
    public void verifyVisibilityOfTheSuccessfulChangeMessage() {
        iLocLeft.verifyContainsText(iLocLeft.successMessage,"success");
    }

    @And("Verify visibility of search button and input boxes")
    public void verifyVisibilityOfSearchButtonAndInputBoxes() {
        assert (iLocLeft.nameSearch.isDisplayed());
        assert (iLocLeft.codeSearch.isDisplayed());
        assert (iLocLeft.searchButton.isDisplayed());
    }
    @And("Enter a available name and click search button")
    public void enterAAvailableNameAndClickSearchButton() {
        iLocLeft.mySendKeys(iLocLeft.nameSearch,name2);
        iLocLeft.myClick(iLocLeft.searchButton);
    }

    @Then("Verify that the name is available in list")
    public void verifyThatTheNameIsAvailableInList() {
      List<WebElement> list=new ArrayList<>();
      list.addAll(iLocLeft.listSubject);
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
        iLocLeft.wait.until(ExpectedConditions.elementToBeClickable(iLocLeft.actionButton));
        iLocLeft.myClick(iLocLeft.actionButton);
    }

    @Then("In the opened window click the action button and verify change")
    public void inTheOpenedWindowClickTheActionButtonAndVerifyChange() {
       // iLocLeft.wait.until(ExpectedConditions.elementToBeClickable(iLocLeft.saveButton));
        iLocLeft.myClick(iLocLeft.actionButton2);
        iLocLeft.myClick(iLocLeft.saveButton);
    }
    @And("Click delete icon and delete button")
    public void clickDeleteIconAndDeleteButton() {
        iLocLeft.wait.until(ExpectedConditions.elementToBeClickable(iLocLeft.searchButton));
        iLocLeft.myClick(iLocLeft.deleteButton);
        iLocLeft.myClick(iLocLeft.deleteButton2);
    }
    @Then("Verify visibility of the successful delete message")
    public void verifyVisibilityOfTheSuccessfulDeleteMessage() {
        iLocLeft.verifyContainsText(iLocLeft.successMessage,"success");
    }
}

