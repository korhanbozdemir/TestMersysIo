package StepDefinitions;

import Pages.aDialogContent;
import Pages.aLeftPanel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.util.List;

public class SchoolStep {

    aDialogContent dc = new aDialogContent();
    aLeftPanel ln = new aLeftPanel();


    @And("Navigate to schoolsetup")
    public void navigateToSchoolsetup(DataTable linkler){
        List<String> stringList=linkler.asList(String.class);

        for (int i = 0; i < stringList.size(); i++) {
            WebElement linkWebElement=ln.getWebElement(stringList.get(i));
            ln.myClick(linkWebElement);

        }

    }

    @Then("Click button add")
    public void clickButtonAdd() {
        dc.myClick(dc.registerButton);
    }

    @When("Add a location name as {string} and shortname as {string} and location as laboratory and capacity as {string} and click to empty area and click to save")
    public void addALocationNameAsAndShortnameAsAndLocationAsLaboratoryAndCapacityAsAndClickToEmptyAreaAndClickToSave(String arg0, String arg1, String arg2) {
        dc.mySendKeys(dc.LocationName, "yasin");
        dc.mySendKeys(dc.ShortName, "ahmet");
        dc.myClick(dc.locationType);
        dc.myClick(dc.laboratory);
        dc.mySendKeys(dc.capacity, "20");
        dc.myClick(dc.LocationName);
        dc.myClick(dc.save);
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tbody//tr"), 10));
    }


    @And("Click to edit and edit at name as {string} and edit shortname as {string} and edit location as other and edit capacity as {string} and click to empty area and click to save")
    public void clickToEditAndEditAtNameAsAndEditShortnameAsAndEditLocationAsOtherAndEditCapacityAsAndClickToEmptyAreaAndClickToSave(String arg0, String arg1, String arg2) {
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.LocationName, "bugra");
        dc.mySendKeys(dc.ShortName, "ipek");
        dc.myClick(dc.locationType);
        dc.myClick(dc.other);
        dc.mySendKeys(dc.capacity, "25");
        dc.myClick(dc.LocationName);
        dc.myClick(dc.save);
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tbody//tr"), 10));

    }

    @Then("Click delete button and user should displayed verifieing message and click to button delete")
    public void clickDeleteButtonAndUserShouldDisplayedVerifieingMessageAndClickToButtonDelete() throws InterruptedException {
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tbody//tr"), 10));
        dc.myClick(dc.deleteButton);
        dc.verifyContainsText(dc.deleteMessage, "Do you want to delete");
        dc.myClick(dc.deleteMsg);
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tbody//tr"), 10));


    }


    @When("Add a location name as {string} and shortname as {string} and location as laboratory and capacity as {string}")
    public void addALocationNameAsAndShortnameAsAndLocationAsLaboratoryAndCapacityAs(String arg0, String arg1, String arg2) {
        dc.mySendKeys(dc.LocationName, "korhan");
        dc.mySendKeys(dc.ShortName, "");
        dc.myClick(dc.locationType);
        dc.myClick(dc.laboratory);
        dc.mySendKeys(dc.capacity, "26");

    }

    @And("User should display This field cannot be left blank!")
    public void userShouldDisplayThisFieldCannotBeLeftBlank() {
        dc.verifyContainsText(dc.errorShortname, "This field cannot be left blank!");


    }


    @When("Add a location name as {string} and shortname as {string} and location as laboratory and capacity as {string} and Click to activity and click to save")
    public void addALocationNameAsAndShortnameAsAndLocationAsLaboratoryAndCapacityAsAndClickToActivityAndClickToSave(String arg0, String arg1, String arg2) {
        dc.mySendKeys(dc.LocationName, "izmir");
        dc.mySendKeys(dc.ShortName, "urla");
        dc.myClick(dc.locationType);
        dc.myClick(dc.laboratory);
        dc.mySendKeys(dc.capacity, "40");
        dc.myClick(dc.activitySwitch);
        // for (int i = 1; i < 4; i++) {
        // robot.keyPress(KeyEvent.VK_TAB);
        // robot.keyRelease(KeyEvent.VK_TAB);
        //new Actions(TestDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        // dc.myClick(dc.activitySwitch);
        //}
        dc.myClick(dc.save);
    }
}

