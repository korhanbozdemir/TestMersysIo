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
    public WebElement dashBoard;

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setUp;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Document Types']")
    public WebElement setUpParametersDocumentTypes;

    @FindBy(xpath="//span[text()='School Setup']")
    public WebElement setUpSchoolSetUp;

    @FindBy(xpath="//span[text()='Locations']")
    public WebElement setUpSchoolSetUpLocations;

    @FindBy(xpath="//span[text()='Departments']")
    public WebElement setUpSchoolSetUpDepartments;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement setUpParameters;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Bank Accounts']")
    public WebElement setUpParametersBankAccounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement setUpParametersGradeLevels;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Discounts']")
    public WebElement setUpParametersDiscounts;

    @FindBy(xpath="(//span[text()='Nationalities'])[1]")
    public WebElement setUpParametersNationalities;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-9 ng-star-inserted']")
    public WebElement messaging;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-11 ng-star-inserted']")
    public WebElement entranceExams;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-13 ng-star-inserted']")
    public WebElement student;

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement humanRecourcesSetUp;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement humanRecourcesSetUpPositions;

    @FindBy(xpath ="//span[text()=\"Position Categories\"]")
    public WebElement HumanRecourcesSetUpPositionsCat;

    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted' and text()='Attestations']")
    public WebElement humanRecourcesSetUpAttestations;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-19 ng-star-inserted']")
    public WebElement inventory;

    @FindBy(xpath="//span[text()='Education']")
    public WebElement education;

    @FindBy(xpath="(//span[text()='Setup'])[5]")
    public WebElement educationSetUp;

    @FindBy(xpath="//span[text()='Subject Categories']")
    public WebElement educationSetUpSubjectCategories;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-32 ng-star-inserted']")
    public WebElement incidents;

    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement setUpParametersfields;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "dashBoard": return this.dashBoard;
            case "setUp": return this.setUp;
            case "setUpParametersDocumentTypes": return this.setUpParametersDocumentTypes;
            case "setUpSchoolSetUp": return this.setUpSchoolSetUp;
            case "setUpSchoolSetUpLocations": return this.setUpSchoolSetUpLocations;
            case "setUpSchoolSetUpDepartments": return this.setUpSchoolSetUpDepartments;
            case "setUpParameters": return this.setUpParameters;
            case "setUpParametersBankAccounts": return this.setUpParametersBankAccounts;
            case "setUpParametersGradeLevels" : return this.setUpParametersGradeLevels;
            case "setUpParametersDiscounts" : return this.setUpParametersDiscounts;
            case "setUpParametersNationalities" : return this.setUpParametersNationalities;
            case "messaging" : return this.messaging;
            case "entranceExams" : return this.entranceExams;
            case "student" : return this.student;
            case "humanResources" : return this.humanResources;
            case "humanRecourcesSetUp" : return this.humanRecourcesSetUp;
            case "humanRecourcesSetUpPositions" : return this.humanRecourcesSetUpPositions;
            case "HumanRecourcesSetUpPositionsCat" : return this.HumanRecourcesSetUpPositionsCat;
            case "humanRecourcesSetUpAttestations" : return this.humanRecourcesSetUpAttestations;
            case "inventory" : return this.inventory;
            case "education" : return this.education;
            case "educationSetUp" : return this.educationSetUp;
            case "educationSetUpSubjectCategories" : return this.educationSetUpSubjectCategories;
            case "incidents" : return this.incidents;
            case "setUpParametersfields" : return this.setUpParametersfields;
        }

        return null;
    }


}
