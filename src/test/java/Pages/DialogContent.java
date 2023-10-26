package Pages;


import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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


    @FindBy(xpath = "(//hot-toast[@class='ng-star-inserted']//div)[8]")
    public WebElement alreadyExistsMsg;

    @FindBy(xpath = "//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td")
    public WebElement noDataMsg;

    @FindBy(xpath = "(//mat-form-field//ms-text-field//input)[2]")
    public WebElement codeInput;

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
    //YASİN

    //KORHAN

    @FindBy(xpath = "(//input[@data-placeholder='Name'])")
    public WebElement gradeName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])")
    public WebElement gradeShortName;

    @FindBy(css = "input[type='number']")
    public WebElement gradeOrder;

    @FindBy(css = "input[data-placeholder='Max Application Count']")
    public WebElement maxApplicationCount;



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

        }

        return null;
    }


//    public void deleteItem(String searchText) {
//        mySendKeys(searchInput, searchText);
//        myClick(searchButton); // fuse bar ı çocukları ortaya çıkıyor
//
//        //beklet
//        //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
//        //dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
//        //wait.until(ExpectedConditions.stalenessOf(dc.deleteImageBtn)); //olabilir ama herzaman çözmez
//
//        //2.yöntem sayfanın kendi waitini , loding ini yakalayalım. (en sağlam yöntem)
//        //fuse-progress-bar/*    -> fuse-progress-bar ın çocukları
//        // bu çocukların 0 olana bekle
//
//
//        myClick(deleteImageBtn);
//        myClick(deleteDialogBtn);
//
//        // silme ıslemı dıalogların ortak noktası olması sebebıyle buraya aldık. Silme islemi yapacagımız her seferınde tekrar tekrar kod yazmayalım dırekt cagıralım dıye aldık.
//    }
}