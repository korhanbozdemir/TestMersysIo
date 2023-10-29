package Pages;

import Utility.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LeftPanelE extends Methods {



    public LeftPanelE() {
        PageFactory.initElements(TestDriver.getDriver(),this);

    }
    @FindBy(xpath="//span[@class='nav-link-title']")
    public WebElement dashBoard;

    @FindBy(xpath="//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c2089661534-16 ng-star-inserted']")
    public WebElement humanRecourcesSetUp;

    @FindBy(xpath ="//span[text()=\"Position Categories\"]")
    public WebElement HumanRecourcesSetUpPositionsCat;
    @FindBy(xpath = "//input[@id='mat-input-0']")
    public WebElement userName;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement signInBtn;

    @FindBy(xpath = "//*[@id='container-2']/toolbar/mat-toolbar/div/div[1]/div[2]/div[3]")
    public WebElement posSayfaBaslik;

    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']")
    public  WebElement positionTargetBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement positionAddName;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public  WebElement positionShortName;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement positionSaveBtn;

    @FindBy(xpath = "//ms-save-button")
    public WebElement editSaveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;


    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    public WebElement positionEditBtn;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public  WebElement positionSearchName;


    @FindBy(xpath = "//ms-search-button//button")
    public WebElement positionSearchBtn;

    @FindBy(xpath = "//*[@id=cdk-drop-list-0]/tbody/tr/td")
    public WebElement positionNotFndMsg;

    @FindBy(xpath = "(//ms-delete-button//button)")
    public  WebElement deleteItemBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//*[@id=container-2]/toolbar/mat-toolbar/div/div[1]/div[2]/div[3]/span")
    public WebElement BnkSayfaOnay;


    public void waitItm(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        //myClick(element);
    }

    public void waitItem(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ms-search-button//button")));
        //myClick(element);
    }
    ///////// 9 /////

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setUp;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement setUpParameters;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Bank Accounts']")
    public WebElement setUpParametersBankAccounts;

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





    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "kulAdi": return this.userName;
            case "parola": return this.password;
            case "girisBtn": return this.signInBtn;
            case "dashBoard": return this.dashBoard;
            case "posSayfaBaslik": return this.posSayfaBaslik;
            case "positionTargetBtn": return this.positionTargetBtn;
            case "positionAddName": return this.positionAddName;
            case "positionShortName": return this.positionShortName;
            case "positionSaveBtn": return this.positionSaveBtn;
            case "positionSearchName": return this.positionSearchName;
            case "positionSearchBtn": return this.positionSearchBtn;
            case "HumanRecourcesSetUpPositionsCat": return this.HumanRecourcesSetUpPositionsCat;
            case "deleteItemBtn" : return this.deleteItemBtn;
            case "deleteDialogBtn" : return this.deleteDialogBtn;
            case "editSaveBtn": return this.editSaveBtn;
            case "bnkAcIban": return this.bnkAcIban;
            case "SearchCurrency" : return this.SearchCurrency;
            case "bnkCurrency": return this.bnkCurrency;
            case "bnkSelectEur": return this.bnkSelectEur;
            case "BnkSayfaOnay": return this.BnkSayfaOnay;
            case "bnkSelectTRY" : return this.bnkSelectTRY;

        }
        return null;
    }


}
