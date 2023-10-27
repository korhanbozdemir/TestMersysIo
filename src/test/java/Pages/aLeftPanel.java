package Pages;

import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class aLeftPanel extends Methods {

    public aLeftPanel() {
        PageFactory.initElements(TestDriver.getDriver(), this);

    }

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-chevron-right'])[1]")
    public WebElement setUp;
    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-chevron-right'])[2] ")
    public WebElement parameters;

    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted' and text()='Document Types']")
    public WebElement setUpParametersDocumentTypes;

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-chevron-right'])[3] ")
    public WebElement schoolsetup;

    @FindBy(xpath = "(//span[@class='nav-link-title ng-star-inserted'])[15]")
    public WebElement locations;



    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "setUp":return this.setUp;
            case "parameters":return this.parameters;
            case "setUpParametersDocumentTypes":return this.setUpParametersDocumentTypes;
            case "schoolsetup":return this.schoolsetup;
            case "locations":return this.locations;

        }


     return null;
    }
}
