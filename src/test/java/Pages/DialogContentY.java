package Pages;

import Utility.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContentY extends Methods {

    public DialogContentY() {
        PageFactory.initElements(TestDriver.getDriver(), this);
    }

    @FindBy(css="input[formcontrolname='username']")
    public WebElement usernameY;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement passwordY;

    @FindBy(css=" button[aria-label='LOGIN']")
    public WebElement loginButtonY;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButtonY;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInputY;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButtonY;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessageY;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInputY;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButtonY;

    @FindBy(xpath = "(//ms-browse-table//ms-edit-button//span[@class='mat-mdc-button-touch-target'])[1]")
    public WebElement editButtonY;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtnY;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtnY;

    @FindBy(xpath = "(//hot-toast[@class='ng-star-inserted']//div)[8]")
    public WebElement alreadyExistsMsgY;

    @FindBy(xpath = "//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td")
    public WebElement noDataMsgY;

    @FindBy(xpath = "(//mat-form-field//ms-text-field//input)[2]")
    public WebElement codeInputY;

    @FindBy(xpath = "(//ms-text-field//input[@data-placeholder='Description'])[2]")
    public WebElement desciriptionInputY;

    @FindBy(xpath = "(//ms-text-field//input[@data-placeholder='Integration Code'])[2]")
    public WebElement integrationInputY;

    @FindBy(xpath = "//ms-integer-field//input[@type='text']")
    public WebElement priorityInputY;

    @FindBy(xpath = "//span[text()='Save & Close']")
    public WebElement saveCloseBtnY;

    @FindBy(xpath = "//div//mat-error[text()=' This field is required!']")
    public WebElement thisFieldErrorY;

    @FindBy(xpath = "//button[@aria-label='Close']")
    public WebElement uyariMsgY;







}
