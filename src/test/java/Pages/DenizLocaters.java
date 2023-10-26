package Pages;

import Utility.ExcelUtility;
import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class DenizLocaters extends Methods{
    public DenizLocaters() {

        PageFactory.initElements(TestDriver.getDriver(),this);
    }

    /************ Login Locaters ***********/

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBtn;

    @FindBy(xpath="//span[text()='Dashboard']")
    public WebElement dashbord;


    /****************** DialogContent *********************/


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement fieldName;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement fieldCode;

    @FindBy(css = "[formcontrolname='type']")
    public WebElement fieldType;

    @FindBy(xpath = "//span[text()=' Text ']")
    public WebElement text;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement nameSearch;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    public WebElement edit;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement nationalityName;

//    @FindBy(xpath = "//td[@role='cell' and text()='DO Nationality']")
//    public WebElement editnationality;



/************************ Left Panel ************************/

@FindBy(xpath = "(//span[text()='Setup'])[1]")
public WebElement setUp;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement setUpParameters;

    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement setUpParametersfields;

    @FindBy(xpath="(//span[text()='Nationalities'])[1]")
    private WebElement setUpParametersNationalities;


public WebElement getWebElement(String strElement) {
    switch (strElement) {
        case "setUp": return this.setUp;
        case "setUpParameters": return this.setUpParameters;
        case "setUpParametersfields": return this.setUpParametersfields;
        case "setUpParametersNationalities": return this.setUpParametersNationalities;
    }
    return null;
}

}
