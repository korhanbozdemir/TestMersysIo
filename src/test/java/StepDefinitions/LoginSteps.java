package StepDefinitions;

import Pages.ipekLocator;
import Utility.ExcelUtility;
import Utility.TestDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


import java.util.ArrayList;

public class LoginSteps {
    ArrayList<ArrayList<String>> tablo = new ArrayList<>();
    //    String path="C:\\Users\\user\\IdeaProjects\\TestMersysIoSon\\src\\test\\java\\ExcelDb\\ExcelDb.xlsx";
    String sheetName = "US06";
    ipekLocator iLoc = new ipekLocator();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        TestDriver.getDriver().get("https://test.mersys.io/");
    }

    @And("The user verifies that they are in login page")
    public void theUserVerifiesThatTheyAreInLoginPage() {
        assert (iLoc.loginButton.isDisplayed());
    }

    @And("The user verifies the visibility of campus symbol")
    public void theUserVerifiesTheVisibilityOfCampusSymbol() {
        assert (iLoc.campusLogo.isDisplayed());
    }

    @And("The user verifies the visibility of social media text")
    public void theUserVerifiesTheVisibilityOfSocialMediaText() {
        assert (iLoc.socialMediaNavigator.isDisplayed());
    }

    @And("The user verifies the visibility of Google Account,Facebook,Microsoft Office symbols")
    public void theUserVerifiesTheVisibilityOfGoogleAccountFacebookMicrosoftOfficeSymbols() {
        assert (iLoc.gmailIcon.isDisplayed());
        assert (iLoc.facebookIcon.isDisplayed());
        assert (iLoc.microsoftIcon.isDisplayed());
    }

    @And("The user verifies if remember me check box is clickable")
    public void theUserVerifiesIfRememberMeCheckBoxIsClickable() {
        assert (iLoc.rememberMeCheckBox.isEnabled());
    }

    @And("The user clicks to log in button")
    public void theUserClicksToLogInButton() {
        iLoc.myClick(iLoc.loginButton);
    }

    @Then("The user sees an error message under input boxes")
    public void theUserSeesAnErrorMessageUnderInputBoxes() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(iLoc.emailError.getText(), "E-posta gereklidir");
        Assert.assertEquals(iLoc.passwordError.getText(), "Şifre gereklidir");
    }

    @And("The user enter an invalid username and password and clicks to log in button")
    public void theUserEnterAInvalidUsernameAndPasswordAndClicksToLogInButton() {
        iLoc.mySendKeys(iLoc.usernameBox, "turkey");
        iLoc.mySendKeys(iLoc.passwordBox, "Techno");
        iLoc.myClick(iLoc.loginButton);
    }

    @Then("The user sees an error message")
    public void theUserSeesAnErrorMessage() {
        iLoc.verifyContainsText(iLoc.invalidError, "Invalid username or password");
    }

    @And("The user enter a valid username and password and clicks to log in button")
    public void theUserEnterAValidUsernameAndPasswordAndClicksToLogInButton() {
        iLoc.usernameBox.clear();
        iLoc.mySendKeys(iLoc.usernameBox, "turkeyts");
        iLoc.passwordBox.clear();
        iLoc.mySendKeys(iLoc.passwordBox, "TechnoStudy123");
        iLoc.rememberMeCheckBox.click();
        iLoc.myClick(iLoc.loginButton);
    }

    @Then("The user logs in successfully")
    public void theUserLogsInSuccessfully() {
        assert(iLoc.studentAccount.isDisplayed());
    }




  /*  @When("The user clicks to log in button")
    public void theUserClicksToLogInButton() {
        iLoc.myClick(iLoc.loginButton);
    }

    @Then("The user sees an error message")
    public void theUserSeesAnErrorMessage() {
        iLoc.verifyContainsText(iLoc.invalidError,"Invalid username or password");
    }

    @Then("The user logs in successfully")
    public void theUserLogsInSuccessfully() {iLoc.verifyContainsText(iLoc.accountName,"Student");}

    @Then("The user sees an error message under input boxes")
    public void theUserSeesAnErrorMessageUnderInputBoxes() {
        iLoc.verifyContainsText(iLoc.usernameAbsent," E-posta gereklidir ");
        iLoc.verifyContainsText(iLoc.passwordAbsent," Şifre gereklidir ");
    }





    @When("The user enter a invalid username and password and clicks to log in button")
    public void theUserEnterAInvalidUsernameAndPasswordAndClicksToLogInButton() {
        tablo= ExcelUtility.getData(path,sheetName,3);
        iLoc.mySendKeys(iLoc.usernameBox, "tablo.get(3).get(2)");
        iLoc.mySendKeys(iLoc.passwordBox, "tablo.get(3).get(3)");
        iLoc.myClick(iLoc.loginButton);
    }

    @When("The user enter a valid username and password and clicks to log in button")
    public void theUserEnterAValidUsernameAndPasswordAndClicksToLogInButton() {
        tablo=ExcelUtility.getData(path,sheetName,3);
        iLoc.mySendKeys(iLoc.usernameBox, "tablo.get(2).get(2)");
        iLoc.mySendKeys(iLoc.passwordBox, "tablo.get(2).get(3)");
        iLoc.myClick(iLoc.loginButton);
    }*/
}
