package Pages;

import Utility.TestDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftPanel extends Methods {


    public LeftPanel() {
        PageFactory.initElements(TestDriver.getDriver(),this);

    }

    @FindBy(xpath="//span[@class='nav-link-title']")
    private WebElement dashBoard;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-6 ng-star-inserted']")
    private WebElement setUp;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Document Types']")
    private WebElement setUpParametersDocumentTypes;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-8 ng-star-inserted']")
    private WebElement setUpSchoolSetUp;

    @FindBy(xpath="//[@class='nav-link-title ng-star-inserted'][text()='Locations']")
    private WebElement setUpSchoolSetUpLocations;

    @FindBy(xpath="//[@class='nav-link-title ng-star-inserted'][text()='Departments']")
    private WebElement setUpSchoolSetUpDepartments;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-7 ng-star-inserted']")
    private WebElement setUpParameters;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Bank Accounts']")
    private WebElement setUpParametersBankAccounts;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Grade Levels']")
    private WebElement setUpParametersGradeLevels;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Discounts']")
    private WebElement setUpParametersDiscounts;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Nationalities']")
    private WebElement setUpParametersNationalities;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-9 ng-star-inserted']")
    private WebElement messaging;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-11 ng-star-inserted']")
    private WebElement entranceExams;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-13 ng-star-inserted']")
    private WebElement student;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-15 ng-star-inserted']")
    private WebElement humanResources;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-16 ng-star-inserted']")
    private WebElement humanRecourcesSetUp;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Positions']")
    private WebElement humanRecourcesSetUpPositions;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Attestations']")
    private WebElement humanRecourcesSetUpAttestations;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-19 ng-star-inserted']")
    private WebElement inventory;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-21 ng-star-inserted']")
    private WebElement education;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-22 ng-star-inserted']")
    private WebElement educationSetUp;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Subject Categories']")
    private WebElement educationSetUpSubjectCategories;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-32 ng-star-inserted']")
    private WebElement incidents;


}
