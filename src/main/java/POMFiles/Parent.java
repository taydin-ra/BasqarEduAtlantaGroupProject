package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parent {
    WebDriverWait wait;
    WebDriver driver;


    public Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);
    }

    public  void waitAndSendKeys(WebElement element, String text){

        wait.until(ExpectedConditions.visibilityOf(element)).clear();
        element.sendKeys(text);
    }

    public void waitAndClick(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        element.click();
    }

    public String waitAndGetText(WebElement element){

        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    public void clickOnFunctionalities(WebElement clickElement) {


        try {
            wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        clickElement.click();
    }

    public String waitAndGetAttribute(WebElement element,String attribute){

        return wait.until(ExpectedConditions.visibilityOf(element)).getAttribute(attribute);
    }
}
