package Pages;

import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ipekLocator extends Methods{
    public ipekLocator() { PageFactory.initElements(TestDriver.getDriver(),this);
    }
    @FindBy(xpath="//*[@id=\"login-form\"]/div[2]/form/button/span[2]")
    public WebElement loginButton;
    @FindBy(xpath="//input[@formcontrolname='username']")
    public WebElement usernameBox;
    @FindBy(xpath="//input[@formcontrolname='password']")
    public WebElement passwordBox;
    @FindBy(xpath="//*[@id=\"login-form\"]/div[2]/form/div/a")
    public WebElement forgetPassword;
    @FindBy(xpath="//*[@id=\"mat-mdc-checkbox-1\"]/div/label")
    public WebElement rememberMe;
    @FindBy(xpath="//input[@class='mdc-checkbox__native-control mdc-checkbox--selected']")
    public WebElement rememberMeCheckBox;
    @FindBy(xpath="//span[text()='Education']")
    public WebElement education;
    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c2089661534-22 ng-star-inserted']")
    public WebElement educationSetup;
    @FindBy(xpath="//span[text()='Subject Categories']")
    public WebElement educationSubjectCategories;
    @FindBy(xpath="//*[@id=\"ms-table-0_buttons\"]/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    public WebElement addButton;
    @FindBy(xpath="(//input[@class='mat-input-element mat-form-field-autofill-control ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched'])[1]")
    public WebElement nameInput;
    @FindBy(xpath="(//input[@class='mat-input-element mat-form-field-autofill-control ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched'])[2]")
    public WebElement codeInput;
    @FindBy(xpath="//button[@class='mat-accent mdc-button mat-mdc-button mat-mdc-outlined-button mdc-button--outlined mat-mdc-button-base ng-star-inserted']")
    public WebElement saveButton;
    @FindBy(xpath="/hot-toast/div/div/div[2]/div/ms-toaster-message/div/mat-accordion/mat-expansion-panel")
    public WebElement successfulAdd;
    @FindBy(xpath="(//span[@class='mat-mdc-button-touch-target'])[15]")
    public WebElement changeButton;
    @FindBy(xpath="(//span[@class='mat-mdc-button-touch-target'])[16]")
    public WebElement deleteButton;
    @FindBy(xpath="(//span[@class='mdc-button__label'])[5]")
    public WebElement deleteButton2;
    @FindBy(xpath="//*[@id=\"ms-text-field-0\"]")
    public WebElement nameSearch;
    @FindBy(xpath="//*[@id=\"ms-text-field-1\"]")
    public WebElement codeSearch;
    @FindBy(xpath="//span[text()='Search']")
    public WebElement searchButton;
    @FindBy(xpath="//*[@id=\"mat-mdc-slide-toggle-56\"]/div")
    public WebElement actionButton;
    @FindBy(xpath="//*[@id=\"mat-mdc-slide-toggle-57-button\"]/div[2]/div/div[3]/svg[2]")
    public WebElement actionButton2;
    @FindBy(xpath="//*[@id=\"cdk-drop-list-0\"]/tbody/tr")
    public List<WebElement> listSubject;
    @FindBy(xpath="//span[@class='username mr-12']")
    public WebElement studentAccount;
    @FindBy(xpath="//*[@id=\"mat-expansion-panel-header-0\"]/span/mat-panel-description/div")
    public WebElement invalidError;
    @FindBy(xpath="//mat-error[@class='mat-mdc-form-field-error mat-mdc-form-field-bottom-align ng-tns-c1205077789-1 ng-star-inserted']")
    public WebElement emailError;
    @FindBy(xpath="//mat-error[@class='mat-mdc-form-field-error mat-mdc-form-field-bottom-align ng-tns-c1205077789-2']")
    public WebElement passwordError;
    @FindBy(xpath="//*[@id=\"login-form\"]/div[2]/div[2]/button[1]")
    public WebElement gmailIcon;
    @FindBy(xpath="//*[@id=\"login-form\"]/div[2]/div[2]/button[2]")
    public WebElement facebookIcon;
    @FindBy(xpath="//*[@id=\"login-form\"]/div[2]/div[2]/button[3]")
    public WebElement microsoftIcon;

    @FindBy(xpath="//span[text()='Veya Sosyal Hesapla Giriş Yap']")
    public WebElement socialMediaNavigator;
    @FindBy(xpath="//*[@id=\"login-form\"]/div[1]/img")
    public WebElement campusLogo;


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
