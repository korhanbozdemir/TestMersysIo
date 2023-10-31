package Pages;

import Utility.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Methods {

    public WebDriverWait wait=new WebDriverWait(TestDriver.getDriver(), Duration.ofSeconds(20));

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        //scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String yazi){
        wait.until(ExpectedConditions.visibilityOf(element));
        //scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)TestDriver.getDriver();
        js.executeScript("arguments[0]..scrollIntoView();", element);

    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(TestDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myJsClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js=(JavascriptExecutor)TestDriver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }


    public void waitItem(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


}
