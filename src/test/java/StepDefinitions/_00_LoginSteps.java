package StepDefinitions;

import Pages.DialogContent;
import Utility.TestDriver;
import io.cucumber.java.en.*;
import org.testng.Assert;



public class _00_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to website")
    public void navigateToWebsite() {

        TestDriver.getDriver().get("https://test.mersys.io/");
    }

    @And("The user verifies that they are in login page")
    public void theUserVerifiesThatTheyAreInLoginPage() {
        assert (dc.loginButton.isDisplayed());
    }

    @And("The user verifies the visibility of campus symbol")
    public void theUserVerifiesTheVisibilityOfCampusSymbol() {
        assert (dc.campusLogo.isDisplayed());
    }

    @And("The user verifies the visibility of social media text")
    public void theUserVerifiesTheVisibilityOfSocialMediaText() {
        assert (dc.socialMediaNavigator.isDisplayed());
    }

    @And("The user verifies the visibility of Google Account,Facebook,Microsoft Office symbols")
    public void theUserVerifiesTheVisibilityOfGoogleAccountFacebookMicrosoftOfficeSymbols() {
        assert (dc.gmailIcon.isDisplayed());
        assert (dc.facebookIcon.isDisplayed());
        assert (dc.microsoftIcon.isDisplayed());
    }

    @And("The user verifies if remember me check box is clickable")
    public void theUserVerifiesIfRememberMeCheckBoxIsClickable() {
        assert (dc.rememberMeCheckBox.isEnabled());
    }

    @And("The user clicks to log in button")
    public void theUserClicksToLogInButton() {
        dc.myClick(dc.loginButton);
    }

    @Then("The user sees an error message under input boxes")
    public void theUserSeesAnErrorMessageUnderInputBoxes()  {
        Assert.assertEquals(dc.emailError.getText(), "E-posta gereklidir");
        Assert.assertEquals(dc.passwordError.getText(), "Şifre gereklidir");
    }

    @And("The user enter an invalid username and password and clicks to log in button")
    public void theUserEnterAInvalidUsernameAndPasswordAndClicksToLogInButton() {
        dc.mySendKeys(dc.usernameBox, "turkey");
        dc.mySendKeys(dc.passwordBox, "Techno");
        dc.myClick(dc.loginButton);
    }

    @Then("The user sees an error message")
    public void theUserSeesAnErrorMessage() {
        dc.verifyContainsText(dc.invalidError, "Invalid username or password");
    }

    @And("The user enter a valid username and password and clicks to log in button")
    public void theUserEnterAValidUsernameAndPasswordAndClicksToLogInButton() {

        dc.myClick(dc.loginButton);
        dc.usernameBox.clear();
        dc.mySendKeys(dc.usernameBox, "turkeyts");
        dc.passwordBox.clear();
        dc.mySendKeys(dc.passwordBox, "TechnoStudy123");
        dc.rememberMeCheckBox.click();
        dc.myClick(dc.loginButton);
    }

    @Then("The user logs in successfully")
    public void theUserLogsInSuccessfully() {
        assert(dc.studentAccount.isDisplayed());
    }

}
