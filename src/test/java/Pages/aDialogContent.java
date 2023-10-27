package Pages;

import Utility.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class aDialogContent extends Methods {


    public aDialogContent() {

        PageFactory.initElements(TestDriver.getDriver(),this);
    }



    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

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

    //@FindBy(xpath="((//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox mat-pseudo-checkbox-full ng-star-inserted'])[5]")
    //public WebElement contract;
    @FindBy(xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchName;
    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;
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


    public void waitItem(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ms-search-button//button")));
       // wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tbody//tr"),10));
        // wait.until(ExpectedConditions.elementToBeClickable(element));
       // wait.until(ExpectedConditions.stalenessOf(element));
        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='mdc-switch__icon mdc-switch__icon--on'])[1]")));
        //wait.until(ExpectedConditions.elementToBeClickable(element));
        //wait.until(ExpectedConditions.stalenessOf(element));
       // myClick(element);
    }
   // ms-search-button
   // mat-ripple mat-mdc-button-ripple
}


