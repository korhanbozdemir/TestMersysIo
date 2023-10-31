package Pages;


import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class DialogContent extends Methods {
    public DialogContent() {

        PageFactory.initElements(TestDriver.getDriver(), this);
    }
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(css = "input[formcontrolname='username']")
    public WebElement usernameBox;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement passwordBox;

    @FindBy(xpath="//input[@class='mdc-checkbox__native-control mdc-checkbox--selected']")
    public WebElement rememberMeCheckBox;

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


    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtLoginSuccessLogo;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement positionName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    public WebElement shortName;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement nameSearch;

    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    public WebElement searchwait2;


    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr/td)[2]")
    public WebElement positionNameText;

    @FindBy(css = "div[class='mdc-form-field']")
    public WebElement activeInactiveButton;

    //YASİN
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;


    @FindBy(xpath = "(//ms-browse-table//ms-edit-button//span[@class='mat-mdc-button-touch-target'])[1]")
    public WebElement editButton;

    @FindBy(css = "table tr:last-child ms-edit-button button")
    public WebElement lastEditBtn;

    @FindBy(css = "table tr:last-child ms-delete-button")
    public WebElement lastDelBtn;


    @FindBy(xpath = "(//hot-toast[@class='ng-star-inserted']//div)[8]")
    public WebElement alreadyExistsMsg;

    @FindBy(xpath = "//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td")
    public WebElement noDataMsg;

    @FindBy(xpath = "(//mat-form-field//ms-text-field//input)[2]")
    public WebElement codeInput;
    @FindBy(xpath="(//input[@data-placeholder='Code'])[1]")
    public WebElement codeSearch;
    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement fieldCode;

    @FindBy(xpath = "(//ms-text-field//input[@data-placeholder='Description'])[2]")
    public WebElement desciriptionInput;

    @FindBy(xpath = "(//ms-text-field//input[@data-placeholder='Integration Code'])[2]")
    public WebElement integrationInput;

    @FindBy(xpath = "//ms-integer-field//input[@type='text']")
    public WebElement priorityInput;

    @FindBy(xpath = "//span[text()='Save & Close']")
    public WebElement saveCloseBtn;

    @FindBy(xpath = "//div//mat-error[text()=' This field is required!']")
    public WebElement thisFieldError;

    @FindBy(xpath = "//button[@aria-label='Close']")
    public WebElement uyariMsg;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])")
    public WebElement gradeName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])")
    public WebElement gradeShortName;

    @FindBy(css = "input[type='number']")
    public WebElement gradeOrder;

    @FindBy(css = "input[data-placeholder='Max Application Count']")
    public WebElement maxApplicationCount;

    @FindBy(xpath = "//tbody[@role='rowgroup']//tr/td[2]")
    public List<WebElement> EditNames;

    //DENİZ

    @FindBy(css = "[formcontrolname='type']")
    public WebElement fieldType;

    @FindBy(xpath = "//span[text()=' Text ']")
    public WebElement text;

    @FindBy(xpath = "//mat-slide-toggle[@class='mat-mdc-slide-toggle mat-accent mat-mdc-slide-toggle-checked ng-star-inserted']")
    public WebElement actionButton;

    @FindBy(xpath="(//label[@class='mdc-label'])[2]")
    public WebElement actionButton2;

    @FindBy(xpath="//tbody/tr/td[2]")
    public List<WebElement> listSubject;

    @FindBy(xpath="//*[@id=\"ms-table-0_buttons\"]/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    public WebElement addButton2;


    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement registerButton;

    @FindBy(xpath="(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input)[2]")
    public WebElement KayitName;
    @FindBy(xpath="(//mat-select[@role='combobox']/div)[3]")
    public WebElement Level;
    @FindBy(xpath="(//*[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox mat-pseudo-checkbox-full ng-star-inserted'])[1]")
    public WebElement OgrenciKayit;
    @FindBy(xpath="//textarea[@formcontrolname='description']")
    public WebElement Description;
    @FindBy(xpath="//span[text()='Save']")
    public WebElement save;
    @FindBy(xpath="(//ms-edit-button/button)[1]")
    public WebElement edit;

    @FindBy(xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchName;
    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteButton;
    @FindBy(xpath="//tbody//tr")
    public List<WebElement> deletesWait;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteMsg;

    @FindBy(xpath=" //tbody[@class='mdc-data-table__content']//div")
    public WebElement message;
    @FindBy(xpath=" (//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox mat-pseudo-checkbox-full ng-star-inserted'])[3]")
    public WebElement examinaton;
    @FindBy(xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    public WebElement LocationName;
    @FindBy(xpath="//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']/input")
    public WebElement ShortName;
    @FindBy(xpath="(//mat-select[@role='combobox']//div//div)[5]")
    public WebElement locationType;
    @FindBy(xpath="(//mat-option[@role='option'])[2]/span")
    public WebElement laboratory;
    @FindBy(xpath="//ms-integer-field[@placeholder='GENERAL.FIELD.CAPACITY']/input")
    public WebElement capacity;
    @FindBy(xpath="(//mat-option[@role='option'])[3]/span")
    public WebElement other;
    @FindBy(xpath="//div[@class='ng-star-inserted']//div")
    public WebElement deleteMessage;
    @FindBy(xpath="//*[@class='mat-error ng-star-inserted']")
    public WebElement errorShortname;
    @FindBy(xpath="//label[text()='Active']")
    public WebElement activitySwitch;

    @FindBy(xpath = "//*[@id='container-2']/toolbar/mat-toolbar/div/div[1]/div[2]/div[3]")
    public WebElement posSayfaBaslik;

    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']")
    public  WebElement positionTargetBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement positionAddName;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public  WebElement positionShortName;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    public WebElement positionEditBtn;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public  WebElement positionSearchName;


    @FindBy(xpath = "//ms-search-button//button")
    public WebElement positionSearchBtn;

    @FindBy(xpath = "//ms-save-button")
    public WebElement editSaveBtn;

    @FindBy(xpath = "(//ms-delete-button//button)")
    public  WebElement deleteItemBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "(//ms-text-field//input)[3]")
    public WebElement bnkAcIban ;

    @FindBy(xpath = "//mat-select[@id='mat-select-6']")
    public WebElement  bnkCurrency;

    @FindBy(xpath = "//span[contains(text(),'EUR')]")
    public WebElement  bnkSelectEur;

    @FindBy(xpath ="//span[contains(text(),'TRY')]")
    public  WebElement bnkSelectTRY;

    @FindBy(xpath ="//*[@id=mat-select-value-3]" )
    public  WebElement SearchCurrency;

    @FindBy(xpath="//span[@class='nav-link-title']")
    public WebElement dashBoard;






    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "txtLoginSuccessLogo": return this.txtLoginSuccessLogo;
            case"addButton":return this.addButton;
            case"positionName":return this.positionName;
            case"shortName":return this.shortName;
            case"saveButton":return this.saveButton;
            case"successMessage":return this.successMessage;
            case"nameSearch":return this.nameSearch;
            case"searchButton":return this.searchButton;
            case"editButton":return this.editButton;
            case"deleteImageButton":return this.deleteImageButton;
            case"deleteDialogButton":return this.deleteDialogButton;
            case"positionNameText":return this.positionNameText;
            case"activeInactiveButton":return this.activeInactiveButton;
            case "gradeName" : return this.gradeName;
            case "gradeShortName" : return this.gradeShortName;
            case "gradeOrder" : return this.gradeOrder;
            case "maxApplicationCount" : return this.maxApplicationCount;
            case "fieldType" : return this.fieldType;
            case "text" : return this.text;
            case "fieldCode" : return this.fieldCode;
            case "codeSearch" : return this.codeSearch;
            case "actionButton" : return this.actionButton;
            case "actionButton2" : return this.actionButton2;
            case "registerButton" : return this.registerButton;
            case "searchwait2" : return this.searchwait2;
            case "posSayfaBaslik" : return this.posSayfaBaslik;
            case "positionTargetBtn" : return this.positionTargetBtn;
            case "positionAddName" : return this.positionAddName;
            case "positionShortName" : return this.positionShortName;

        }

        return null;
    }

}