package POMFiles;

import Utilities.Driver;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class NewRegistrationPage extends Parent {
    WebDriver driver;


    public NewRegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[aria-label='dismiss cookie message']")
    private WebElement cookieMessageButton;

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

    @FindBy(xpath = "//div[contains(text(),'Student Information')]")
    private WebElement studentInformation;


    // to click lastname
    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']")
    private WebElement lastName;
    // to fill out lastname
    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastNameTextBox;
    // to click firstname
    @FindBy(css = "ms-text-field[formcontrolname='firstName']")
    private WebElement firstName;
    // to fill out firstname
    @FindBy(css = "ms-text-field[formcontrolname='firstName']>input")
    private WebElement firstNameTextBox;


    @FindBy(xpath = "//input[@name='datePickerControl']/parent::div")

    private WebElement dateOfBirth;
    @FindBy(xpath = "//input[@data-placeholder='Date of Birth']")
    //input[@name='datePickerControl']/following-sibling::input
    public WebElement dateOfBirthTextBox;
    // to click personalid
    @FindBy(xpath = "//ms-text-field[@formcontrolname='personalId']")
    private WebElement personalId;
    // to fill out personal id
    @FindBy(xpath = "//ms-text-field[@formcontrolname='personalId']//input")
    private WebElement personalIdTextBox;

    // to click on gender
    @FindBy(xpath = "//mat-select[@aria-label='Gender']")
    private WebElement gender;
    // to click male
    @FindBy(css = ".cdk-overlay-pane mat-option:first-child")
    private WebElement genderMAle;

    // to click on citizenship
    @FindBy(xpath = "//mat-select[@aria-label='Citizenship']")
    private WebElement citizenship;
    // to select option1
    @FindBy(css = ".cdk-overlay-pane mat-option:first-child")
    private WebElement citizenOption;

    // to click on nationality
    @FindBy(xpath = "//mat-select[@aria-label='Nationality']")
    private WebElement nationality;
    // to select option1
    @FindBy(css = ".cdk-overlay-pane mat-option:first-child")
    private WebElement nationalityOption;

    @FindBy(xpath = "//div[contains(text(),'Relative Info')]")
    private WebElement relativeInfo;

    @FindBy(css = "mat-select[aria-label='Representative']")
    private WebElement representative;

    @FindBy(xpath = "//mat-option//span[contains(text(),'Father')]")
    private WebElement representativeFather;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement relativeLastName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement relativeFirstName;

    @FindBy(xpath = "(//input[@data-placeholder='Mobile Phone'])[1]")
    private WebElement relativePhoneNumber;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='email']//input)[1]")
    private WebElement relativeEmail;

    @FindBy(xpath = "(//mat-select[@aria-label='Country'])[1]")
    private WebElement country;

    @FindBy(xpath = "//mat-option//span[contains(text(),' Kazakhstan ')]")
    private WebElement countryKazakhstan;

    @FindBy(xpath = "//button[@color='accent']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessfullyMessage;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;


    public void FirstName(String value) throws InterruptedException {
        clickOnFunctionalities(firstName);
        Thread.sleep(2000);
        firstNameTextBox.sendKeys(value);
    }

    public void LastName(String value) throws InterruptedException {
        clickOnFunctionalities(lastName);
        Thread.sleep(2000);
        lastNameTextBox.sendKeys(value);
    }

    public void PersonalId(String value) throws InterruptedException {
        clickOnFunctionalities(personalId);
        Thread.sleep(2000);
        personalIdTextBox.sendKeys(value);
    }

    public void ClickOnGender() throws InterruptedException {
        clickOnFunctionalities(gender);
        clickOnFunctionalities(genderMAle);
    }

    public void dateOfBirth(String value) throws InterruptedException {
        clickOnFunctionalities(dateOfBirth);
        Thread.sleep(2000);
        dateOfBirthTextBox.sendKeys(value);
    }

    public void ClickOnCitizen() throws InterruptedException {
        clickOnFunctionalities(citizenship);
        clickOnFunctionalities(citizenOption);

    }

    public void ClickOnNationality() throws InterruptedException {
        clickOnFunctionalities(nationality);
        clickOnFunctionalities(nationalityOption);

    }

    public void ClickOnRelativeInfo() {
        clickOnFunctionalities(relativeInfo);

    }


    public void ClickOnRepresetative() throws InterruptedException {
        clickOnFunctionalities(representative);
        Thread.sleep(2000);
        clickOnFunctionalities(representativeFather);
    }

    public void relativeLastName(String value) throws InterruptedException {
        clickOnFunctionalities(relativeLastName);
        Thread.sleep(2000);
        lastNameTextBox.sendKeys(value);
    }

    public void relativeFirstName(String value) throws InterruptedException {
        clickOnFunctionalities(relativeFirstName);
        Thread.sleep(2000);
        firstNameTextBox.sendKeys(value);
    }

    public void relativePhoneNumber(String value) throws InterruptedException {
        clickOnFunctionalities(relativePhoneNumber);
        Thread.sleep(2000);
        relativePhoneNumber.sendKeys(value);
    }


    public void relativeEmail(String value) throws InterruptedException {
        clickOnFunctionalities(relativeEmail);
        Thread.sleep(2000);
        relativeEmail.sendKeys(value);
    }

    public void ClickOnCountry() {
        clickOnFunctionalities(country);
        clickOnFunctionalities(countryKazakhstan);
    }

    public void clickSaveButton() {
        clickOnFunctionalities(saveButton);
    }


    WebElement myElement;

    public void findElementAndClickFunctionality(String elementName) {

        switch (elementName) {
            case "cookieMessageButton":
                myElement = cookieMessageButton;
                break;

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
            case "representative":
                myElement = representative;
                break;
            case "country":
                myElement = country;
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

            case "relativeLastName":
                myElement = relativeLastName;
                break;

            case "relativeFirstName":
                myElement = relativeFirstName;
                break;
            case "relativePhoneNumber":
                myElement = relativePhoneNumber;
                break;
            case "relativeEmail":
                myElement = relativeEmail;
                break;


        }
        SendKeys(myElement, value);
    }

    public void waitUntilVisible(WebElement elementToWait) {

        wait.until(ExpectedConditions.visibilityOf(elementToWait));

    }

    public void ElementContainsText(WebElement element, String myText) {

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(myText));
    }

    public void findElementAndVerifyElementContainText(String elementName, String WhichText) {

        switch (elementName) {
            case "SuccessfullyMessage":
                myElement = SuccessfullyMessage;
                break;
            case "ErrorMessage":
                myElement = ErrorMessage;
                break;

        }

//            Creating one method in parent class which is get the element and it is containing the WhichText(parameter)

        ElementContainsText(myElement, WhichText);

    }
}


