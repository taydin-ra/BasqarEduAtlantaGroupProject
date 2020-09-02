package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscountPage extends Parent {
    WebElement myElement;

    public DiscountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement SetupButton;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement ParametersButton;
    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement DiscountsButton;
    @FindBy(css = "svg[data-icon='plus']")
    private WebElement AddDiscountsButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']/input")
    private WebElement description;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement integrationCode;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement priority;
    @FindBy(xpath="//ms-save-button")
    private WebElement Save;
    @FindBy(css = "ms-edit-button[class='ng-star-inserted']")
    private WebElement EditButton;
    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement DeleteButton;
    @FindBy(xpath = "//button[@type='submit']")
  // @FindBy(css ="mat-dialog-actions button[type='submit']")
    private WebElement ConfirmButton;

    @FindBy(xpath = "//div[@class='toast-bottom-right toast-container']")
    private WebElement VerificationMessage;

    public void findElementAndClickFunction(String elementName) {
        switch (elementName) {
            case "SetupButton":
                myElement = SetupButton;
                break;

            case "ParametersButton":
                myElement = ParametersButton;
                break;

            case "DiscountsButton":
                myElement = DiscountsButton;
                break;
            case "AddDiscountsButton":
                myElement=AddDiscountsButton;
                break;
            case "Save":
                myElement=Save;
                break;
            case "EditButton":
                myElement=EditButton;
                break;

            case "DeleteButton":
                myElement=DeleteButton;
                break;
            case "ConfirmButton":
                myElement=ConfirmButton;
                break;
        }

        waitAndClick(myElement);
    }

 public void FindElementAndSendKeysFunction(String elementName,String sentText){
        switch (elementName){
            case"description":
                myElement=description;
                break;
            case"integrationCode":
                myElement=integrationCode;
                break;
            case"priority":
                myElement=priority;
                break;


        }
    waitAndSendKeys(myElement,sentText);

 }

    public String findElementAndGetText(String element)  {
        switch (element){
            case "VerificationMessage":
                myElement=VerificationMessage;
                break;


        }


        return waitAndGetText(myElement);

    }

 }

