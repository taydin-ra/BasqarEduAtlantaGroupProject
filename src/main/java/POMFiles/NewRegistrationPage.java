package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewRegistrationPage extends Parent {
    WebDriver driver;


    public NewRegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c101-24 ng-star-inserted']")
    private WebElement entranceExams;

    @FindBy(xpath = "/html/body/app/vertical-layout-1/div/div/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/div/div/fuse-navigation/div/fuse-nav-vertical-group/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[1]/a")
    private WebElement registrationApprove;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'BUTTON.ADD')]//button")
    private WebElement addNewRegistration;

    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c147-295']")
     private  WebElement gradeLevelOfRegistration;

    @FindBy()



    WebElement myElement;

    public void findElementAndClickFunctionality(String elementName){

        switch (elementName){

            case "entranceExams":
                myElement = entranceExams;
                break;

            case "registrationApprove":
                myElement = registrationApprove;
                break;

            case "addNewRegistration":
                myElement = addNewRegistration;
                break;



        }

        waitAndClick(myElement);
    }
//    public void findElementAndSendKeysFunction(String elementName, String value) {
//
//        switch (elementName) {
//
//            case "PayeeNameInput":
//                myElement = PayeeNameInput;
//                break;

//            case "PayeeAddressInput":
//                myElement = PayeeAddressInput;
//                break;
//
//            case "AccountInput":
//                myElement = AccountInput;
//                break;
//
//            case "PayeeDetailsInput":
//                myElement = PayeeDetailsInput;
//                break;
//
//            case "AmountInput":
//                myElement = AmountInput;
//                break;


//        }
//        sendKeysFunctionality(myElement, value);
   // }

}


//ERSIN OZKAN: Create a new registration prove
//Entrance Exam/Registration Approve

