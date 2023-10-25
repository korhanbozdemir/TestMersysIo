package StepDefinitions;

import Pages.DialogContentY;
import Pages.LeftPanelY;
import Utility.TestDriver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;


public class _02_DocumentManagementSteps {

    Faker faker=new Faker();
    String name=faker.name().firstName();
    String editName=faker.name().firstName();
    String fakeName=faker.name().firstName();


    DialogContentY dc=new DialogContentY();
    LeftPanelY ln=new LeftPanelY();
    @Given("Navigate to Campus")
    public void navigate_to_campus() {

        TestDriver.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username as {string} and password as {string} and click login button")
    public void enterUsernameAsAndPasswordAsAndClickLoginButton(String userName, String password) {
        dc.mySendKeys(dc.usernameY,userName);
        dc.mySendKeys(dc.passwordY,password);
        dc.myClick(dc.loginButtonY);

    }

    @Then("Navigate to  Attestations")
    public void navigateToAttestations() {

        ln.myClick(ln.humanResourcesY);
        ln.myClick(ln.humanRecourcesSetUpY);
        ln.myClick(ln.attestationsY);
        dc.myClick(dc.uyariMsgY);

    }

    @And("Create a attestations")
    public void createAAttestations() {

        dc.myClick(dc.addButtonY);
        dc.mySendKeys(dc.nameInputY,name);
        dc.myClick(dc.saveButtonY);
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.successMessageY,"success");
    }

    @When("Document editing")
    public void documentEditing() {
        dc.mySendKeys(dc.searchInputY,name);
        dc.myClick(dc.searchButtonY);
        dc.waitItem(dc.editButtonY);
        dc.myClick(dc.editButtonY);
        dc.mySendKeys(dc.nameInputY,editName);
        dc.myClick(dc.saveButtonY);
        dc.verifyContainsText(dc.successMessageY,"success");
    }

    @When("Delete documents")
    public void deleteDocuments() {
        dc.mySendKeys(dc.searchInputY,editName);
        dc.myClick(dc.searchButtonY);
        dc.waitItem(dc.deleteImageBtnY);
        dc.myClick(dc.deleteImageBtnY);
        dc.myClick(dc.deleteDialogBtnY);
        dc.verifyContainsText(dc.successMessageY,"success");



    }

    @When("Create a document with the same data")
    public void createADocumentWithTheSameData() {
        dc.myClick(dc.addButtonY);
        dc.mySendKeys(dc.nameInputY,name);
        dc.myClick(dc.saveButtonY);
        dc.waitItem(dc.addButtonY);
        dc.myClick(dc.addButtonY);
        dc.mySendKeys(dc.nameInputY,name);
        dc.myClick(dc.saveButtonY);


    }

    @And("Already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alreadyExistsMsgY,"already exists");
        System.out.println(dc.alreadyExistsMsgY.getText());
    }

    @And("Search with incorrect data")
    public void searchWithIncorrectData() {

        dc.mySendKeys(dc.searchInputY,fakeName);
        dc.myClick(dc.searchButtonY);
        System.out.println("mesaj yasin almalıyım  "+dc.noDataMsgY.getText());
        dc.verifyContainsText(dc.noDataMsgY,"There is no data to display");


    }
}
