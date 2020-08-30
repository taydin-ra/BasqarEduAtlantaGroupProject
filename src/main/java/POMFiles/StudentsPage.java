package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentsPage extends Parent {
    public StudentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "a[aria-label='dismiss cookie message']")
    private WebElement cookieMessageButton;

    @FindBy(partialLinkText = "Student")
    private WebElement StudentButton;

    @FindBy(partialLinkText = "Students")
    private WebElement StudentsButton;

    @FindBy(xpath = "//ms-add-button[@tooltip='STUDENTS.TITLE.ADD']//button")
    private WebElement AddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']/input")
    private WebElement FirstNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']/input")
    private WebElement LastNameInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='gender']")
    private WebElement GenderDropdown;

    @FindBy(xpath = "(//mat-option)[1]")
    private WebElement Option1;

    @FindBy(xpath = "(//mat-option)[2]")
    private WebElement Option2;

    @FindBy(xpath = "(//mat-option)[3]")
    private WebElement Option3;

    @FindBy(xpath = "(//mat-option)[4]")
    private WebElement Option4;

    @FindBy(xpath = "(//mat-option)[5]")
    private WebElement Option5;

    @FindBy(xpath = "//mat-select[@aria-label='Grade Level']")
    private WebElement GradeLevelDropdown;

    @FindBy(xpath = "//mat-select[@aria-label='School Department']")
    private WebElement SchoolDepartmentDropdown;

    @FindBy(xpath = "//mat-select[@aria-label='Section']")
    private WebElement SectionDropdown;

    @FindBy(xpath = "//mat-select[@aria-label='Citizenship']")
    private WebElement CitizenshipDropdown;

    @FindBy(xpath = "//mat-select[@aria-label='Document Type']")
    public WebElement DocumentTypeDropdown;

    @FindBy(css = "input[data-placeholder='Document Number']")
    private WebElement DocumentNumberInput;

    @FindBy(xpath = "//div[contains(text(),'Representatives')]")
    private WebElement RepresentativesButton;

    @FindBy(css = "ms-add-button[tooltip='GENERAL.BUTTON.ADD_REPRESENTATIVE'] >div>button")
    private WebElement PopUpPlusButton;

    @FindBy(xpath = "//mat-select[@aria-label='Representative']")
    private WebElement RepresentativesDropdown;

    @FindBy(css = "input[data-placeholder='First Name']")
    private WebElement PopUpFirstNameInput;

    @FindBy(css = "input[data-placeholder='Last Name']")
    private WebElement PopUpLastNameInput;

    @FindBy(css = "input[formcontrolname='phone']")
    private WebElement PopUpMobilePhoneInput;

    @FindBy(css = "mat-form-field[formgroupname='country']")
    private WebElement PopUpCountryButton;

    @FindBy(xpath = "//div[@fxlayoutalign='start stretch']/button")
    private WebElement PopUpAddButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement SaveButton;

    @FindBy(css = "mat-select[aria-label='Entry From']")
    private WebElement PopUpEntryFromButton;

    @FindBy(css = "ms-save-button[class='ng-star-inserted']>button")
    private WebElement EnrollmentSaveButton;

    // //*[@role='alertdialog']//.. alert icin bak




    WebElement myElement;

    public void findElementAndClickFunctionality(String elementName) {

        switch (elementName) {


            case "cookieMessageButton":
                myElement = cookieMessageButton;
                break;

            case "StudentButton":
                myElement = StudentButton;
                break;

            case "StudentsButton":
                myElement = StudentsButton;
                break;

            case "AddButton":
                myElement = AddButton;
                break;

            case "GenderDropdown":
                myElement = GenderDropdown;
                break;

            case "Option1":
                myElement = Option1;
                break;

            case "Option2":
                myElement = Option2;
                break;

            case "Option3":
                myElement = Option3;
                break;

            case "Option4":
                myElement = Option4;
                break;

            case "Option5":
                myElement = Option5;
                break;

            case "GradeLevelDropdown":
                myElement = GradeLevelDropdown;
                break;

            case "SchoolDepartmentDropdown":
                myElement = SchoolDepartmentDropdown;
                break;

            case "SectionDropdown":
                myElement = SectionDropdown;
                break;

            case "CitizenshipDropdown":
                myElement = CitizenshipDropdown;
                break;

            case "DocumentTypeDropdown":
                myElement = DocumentTypeDropdown;
                break;

            case "RepresentativesButton":
                myElement = RepresentativesButton;
                break;

            case "PopUpPlusButton":
                myElement = PopUpPlusButton;
                break;

            case "RepresentativesDropdown":
                myElement = RepresentativesDropdown;
                break;

            case "PopUpCountryButton":
                myElement = PopUpCountryButton;
                break;

            case "PopUpAddButton":
                myElement = PopUpAddButton;
                break;

            case "SaveButton":
                myElement = SaveButton;
                break;

            case "PopUpEntryFromButton":
                myElement = PopUpEntryFromButton;
                break;

            case "EnrollmentSaveButton":
                myElement = EnrollmentSaveButton;
                break;



        }
        waitAndClick(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "FirstNameInput":
                myElement = FirstNameInput;
                break;

            case "LastNameInput":
                myElement = LastNameInput;
                break;

            case "DocumentNumberInput":
                myElement = DocumentNumberInput;
                break;

            case "PopUpFirstNameInput":
                myElement = PopUpFirstNameInput;
                break;

            case "PopUpLastNameInput":
                myElement = PopUpLastNameInput;
                break;

            case "PopUpMobilePhoneInput":
                myElement = PopUpMobilePhoneInput;
                break;

        }
        waitAndSendKeys(myElement, value);
    }


}
