package Pages;

import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class bugrahanLocator extends Methods{

    public bugrahanLocator() {
        PageFactory.initElements(TestDriver.getDriver(),this);}

    @FindBy(xpath="//span[@class='nav-link-title']")
    public WebElement dashBoard;

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setupButton;

    @FindBy(xpath="//span[text()='School Setup']")
    public WebElement schoolSetupButton;

    @FindBy(xpath="//span[text()='Departments']")
    public WebElement departmentsButton;

    @FindBy(xpath="//*[@id=\"ms-table-0_buttons\"]/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    public WebElement addButton;

    @FindBy(xpath="//input[@data-placeholder='Name']")
    public WebElement nameBox;

    @FindBy(xpath="//input[@data-placeholder='Code']")
    public WebElement codeBox;

    @FindBy(xpath="//ms-save-button[@class='ng-star-inserted']")
    public WebElement saveButton;

    @FindBy(xpath="//ms-add-button//button")
    public WebElement editButton;

    @FindBy(xpath="mat-input-element mat-form-field-autofill-control ng-pristine cdk-text-field-autofill-monitored ng-valid ng-touched")
    public WebElement editNameBox;

    @FindBy(xpath="//input[@id='ms-text-field-7']")
    public WebElement editCodeBox;

    @FindBy(xpath="(//ms-delete-button//button)[5]")
    public WebElement deleteButton;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement againDeleteButton;

    @FindBy(xpath = "(//div[@class='ng-star-inserted'])[2]")
    public WebElement schoolDepartmentsText;

    @FindBy(xpath = "//table[@class='mat-mdc-table mdc-data-table__table cdk-table mat-sort cdk-drop-list example-container-grid example-table']")
    public WebElement episodeList;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement deleteTextMessage;
    @FindBy(xpath="//div//mat-select")
    public WebElement allSubjectButton;
    @FindBy(xpath="//span[text()=' 100 ']")
    public WebElement allSubject100;
    @FindBy(xpath="//tbody/tr/td[2]")
    public List<WebElement> listSubject;
    public WebElement getWebElement(String strElement){
        switch (strElement){

            case "dashBoard": return this.dashBoard;
            case "setupButton": return this.setupButton;
            case "schoolSetupButton": return this.schoolSetupButton;
            case "departmentsButton": return this.departmentsButton;
        }
        return null;
    }}
