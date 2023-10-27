package Pages;

import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ipekLocatorLeft extends Methods{
    public ipekLocatorLeft() { PageFactory.initElements(TestDriver.getDriver(),this);
    }
    @FindBy(xpath="//span[text()='Education']")
    public WebElement education;
    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c2089661534-22 ng-star-inserted']")
    public WebElement educationSetup;
    @FindBy(xpath="//span[text()='Subject Categories']")
    public WebElement educationSubjectCategories;
    @FindBy(xpath="//*[@id=\"ms-table-0_buttons\"]/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    public WebElement addButton;
    @FindBy(xpath="(//input[@data-placeholder='Name'])[2]")
    public WebElement nameInput;
    @FindBy(xpath="(//input[@data-placeholder='Code'])[2]")
    public WebElement codeInput;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="/hot-toast/div/div/div[2]/div/ms-toaster-message/div/mat-accordion/mat-expansion-panel")
    public WebElement successfulAdd;
    @FindBy(xpath="//ms-add-button//button")
    public WebElement changeButton;
    @FindBy(xpath="(//input[@data-placeholder='Name'])[1]")
    public WebElement nameSearch;
    @FindBy(xpath="(//input[@data-placeholder='Code'])[1]")
    public WebElement codeSearch;
    @FindBy(xpath = "//mat-slide-toggle[@class='mat-mdc-slide-toggle mat-accent mat-mdc-slide-toggle-checked ng-star-inserted']")
    public WebElement actionButton;

    @FindBy(xpath="(//label[@class='mdc-label'])[2]")
    public WebElement actionButton2;
    @FindBy(xpath="//tbody/tr/td[2]")
    public List<WebElement> listSubject;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;
    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteButton2;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "setup": return null;
            case "messaging": return null;
            case "entrance exams": return null;
            case "student": return null;
            case "human resources": return null;
            case "inventory": return null;
            case "education": return this.education;
            case "incidents": return null;
            case "education setup": return this.educationSetup;
            case "subject categories" : return this.educationSubjectCategories;
        }

        return null;
    }
}
