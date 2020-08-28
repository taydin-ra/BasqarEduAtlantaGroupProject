package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewRegistrationPage extends Parent {
    WebDriver driver;


    public NewRegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Entrance Exams")
    private WebElement entranceExams;

    @FindBy(partialLinkText = "Registration Approve")
    private WebElement registrationApprove;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'BUTTON.ADD')]//button")
    private WebElement addNewRegistration;

    @FindBy(xpath = "//mat-select[@aria-label='Grade Level of Registration']")
    private WebElement gradeLevelOfRegistration;

    @FindBy(xpath = "(//mat-option)[1]")
    private WebElement Option1;

    @FindBy(xpath = "(//mat-option)[2]")
    private WebElement Option2;

    @FindBy(xpath = "//mat-select[@aria-label='Choose Exam']")
    private WebElement chooseExam;

    @FindBy(partialLinkText = "Student Information")
    private WebElement studentInformation;


    @FindBy(xpath = "//button[@color='accent']")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@data-placeholder='Date of Birth']")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='personalId']")
    private WebElement personalId;
    @FindBy(xpath = "//mat-select[@aria-label='Gender']")
    private WebElement gender;
    @FindBy(xpath = "//mat-select[@aria-label='Citizenship']")
    private WebElement citizenship;
    @FindBy(xpath = "//mat-select[@aria-label='Nationality']")
    private WebElement nationality;

    @FindBy(partialLinkText = "Relative Info")
    private WebElement relativeInfo;



    WebElement myElement;

    public void findElementAndClickFunctionality(String elementName) {

        switch (elementName) {

            case "entranceExams":
                myElement = entranceExams;
                break;

            case "registrationApprove":
                myElement = registrationApprove;
                break;

            case "addNewRegistration":
                myElement = addNewRegistration;
                break;

            case "gradeLevelOfRegistration":
                myElement = gradeLevelOfRegistration;
                break;

            case "Option1":
                myElement = Option1;
                break;
            case "Option2":
                myElement = Option2;
                break;
            case "chooseExam":
                myElement = chooseExam;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "gender":
                myElement = gender;
                break;
            case "citizenship":
                myElement = citizenship;
                break;
            case "nationality":
                myElement = nationality;
                break;

            case "studentInformation":
                myElement = studentInformation;
                break;
            case "relativeInfo":
                myElement = relativeInfo;
                break;
            case "dateOfBirth":
                myElement = dateOfBirth;
                break;

        }

        waitAndClick(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "lastName":
                myElement = lastName;
                break;

            case "firstName":
                myElement = firstName;
                break;

            case "personalId":
                myElement = personalId;
                break;

            case "dateOfBirth":
                myElement = dateOfBirth;
                break;
        }
        waitAndSendKeys(myElement, value);
    }
}


