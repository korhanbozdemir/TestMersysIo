package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftPanel;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;


public class _02_DocumentManagementSteps {

    Faker faker=new Faker();
    String name=faker.name().firstName();
    String editName=faker.name().firstName();
    String fakeName=faker.name().firstName();


    DialogContent dc=new DialogContent();
    LeftPanel lp=new LeftPanel();


    @And("Navigate to  Attestations")
    public void navigateToAttestations(DataTable dt) {
            List<String> stringList=dt.asList(String.class);

            for (int i = 0; i <stringList.size() ; i++) {
                WebElement linkWebElement=lp.getWebElement(stringList.get(i));
                lp.myClick(linkWebElement);
            }
        dc.myClick(dc.uyariMsg);
    }

    @And("Create a attestations")
    public void createAAttestations() {

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.successMessage,"success");
    }

    @When("Document editing")
    public void documentEditing() {
        dc.mySendKeys(dc.nameSearch,name);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.editButton);
        dc.mySendKeys(dc.nameInput,editName);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);
        dc.verifyContainsText(dc.successMessage,"success");
    }

    @When("Delete documents")
    public void deleteDocuments() {
        dc.mySendKeys(dc.nameSearch,editName);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.myClick(dc.deleteImageButton);
        dc.myClick(dc.deleteDialogButton);
        dc.waitItem(dc.searchButton);
        dc.verifyContainsText(dc.successMessage,"success");

    }

    @When("Create a document with the same data")
    public void createADocumentWithTheSameData() {

        dc.waitItem(dc.searchButton);
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);

        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.myClick(dc.saveButton);
        dc.waitItem(dc.searchButton);


    }

    @And("Already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alreadyExistsMsg,"already exists");
    }

    @And("Search with incorrect data")
    public void searchWithIncorrectData() {

        dc.mySendKeys(dc.nameSearch,fakeName);
        dc.myClick(dc.searchButton);
        dc.waitItem(dc.searchButton);
        dc.verifyContainsText(dc.noDataMsg,"There is no data to display");


    }
}
