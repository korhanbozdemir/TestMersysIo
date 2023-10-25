package Pages;

import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftPanelY extends Methods{

    public LeftPanelY() {
        PageFactory.initElements(TestDriver.getDriver(), this);
    }

    @FindBy(xpath="//span[text()='Human Resources']")
    public WebElement humanResourcesY;

    @FindBy(xpath="(//div//span[text()='Setup'])[3]")
    public WebElement humanRecourcesSetUpY;

    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'] [text()='Attestations']")
    public WebElement attestationsY;

    @FindBy(xpath="(//fuse-nav-vertical-collapsable//span[text()='Setup'])[1]")
    public WebElement setUpY;

    @FindBy(xpath="//fuse-nav-vertical-collapsable//span[text()='Parameters']")
    public WebElement setUpParametersY;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Discounts']")
    public WebElement setUpParametersDiscountsY;


}
