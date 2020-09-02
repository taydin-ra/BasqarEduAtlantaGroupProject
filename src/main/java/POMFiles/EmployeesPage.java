package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EmployeesPage extends Parent {

    public EmployeesPage() {
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResourcesMenuElement;
    @FindBy(xpath = "//span[text()='Employees']")
    public WebElement employeesMenuElement;

    @FindBy (css = "mat-select[aria-label=\"School\"]>div>div>span")
    public WebElement schoolButtonElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> schoolListElement;

    @FindBy(css = "ms-text-field[placeholder=\"GENERAL.FIELD.FIRST_NAME\"]>input")
    public WebElement generalFirstNameElement;

    @FindBy (css = "mat-select[aria-label=\"Status\"]>div>div>div")
    public WebElement statusElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> statusElementListElement;

    @FindBy(css = "ms-search-button>div>button>span")
    public WebElement searchElement;

    @FindBy(xpath = "//ms-add-button[@tooltip='EMPLOYEE.TITLE.ADD']//button")
    public WebElement createButtonElement;

    @FindBy(css = "ms-edit-button > button > span>fa-icon>svg")
    public WebElement editButtonElement;

    @FindBy(css = "ms-delete-button > button > span>fa-icon>svg")
    public WebElement deleteButtonElement;

    @FindBy(css = "mat-dialog-actions button[type='submit']")
    public WebElement dialogSubmitButtonElement;

    @FindBy(css = "[formcontrolname=\"firstName\"]>input")
    public WebElement firstNameElement;
    @FindBy(css = "[formcontrolname=\"lastName\"]>input")
    public WebElement lastNameElement;
    @FindBy (css = "[aria-label=\"Open calendar\"]")
    public WebElement dateOfBirthButtonElement;
    @FindBy (css = "[data-placeholder=\"Date of Birth\"]")
    public WebElement dateOfBirthElement;
    @FindBy (css = "mat-select[formcontrolname=\"gender\"]>div>div>span")
    public WebElement genderButtonElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> genderListElement;
    @FindBy (css = "mat-select[formcontrolname=\"types\"]>div>div>span")
    public WebElement employeeTypteButtonElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> employeeTypteListElement;

    @FindBy (css = "[formcontrolname=\"employeeId\"]")
    public WebElement employeeIdElement;


    @FindBy (css = "mat-select[formcontrolname=\"positions\"]>div>div>span")
    public WebElement employeePositionElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> employeePositionListElement;

    @FindBy (css = "mat-select[aria-label=\"Citizenship\"]>div>div>span")
    public WebElement citizenshipElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> citizenshipListElement;


    @FindBy (css = "mat-select[aria-label=\"Nationality\"]>div>div>span")
    public WebElement nationalityElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> nationalityListElement;

    @FindBy (css = "mat-select[aria-label=\"Document Type\"]>div>div>span")
    public WebElement documentTypeElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> documentTypeElementListElement;

    @FindBy (css = "[formcontrolname=\"documentNumber\"]")
    public WebElement documentNumberElement;

    @FindBy (css = "[data-placeholder=\"Personal ID\"]")
    public WebElement personalIDElement;

    @FindBy (css = "mat-select[aria-label=\"Qualififcation\"]>div>div>span")
    public WebElement qualificationElement;
    @FindBy (css = "div[class=\"cdk-overlay-pane\"]>div>div>mat-option")
    public List<WebElement> qualificationElementListElement;

    @FindBy(xpath = "//div[text()='Contact & Address']")
    public WebElement contactButtonElement;

    @FindBy (css = "[formcontrolname=\"phone\"]")
    public WebElement phoneElement;

    @FindBy (css = "[data-placeholder=\"Email\"]")
    public WebElement emailElement;

    @FindBy (css = "[aria-label=\"dismiss cookie message\"]")
    public WebElement cookieButtonElement;

    @FindBy(tagName = "ms-save-button")
    public WebElement saveButtonElement;

    @FindBy(css = "div[role='alertdialog']")
    public WebElement alertDialogElement;





    public By rowLocator = By.cssSelector("ms-browse-table tbody > tr");
    public By editLocator = By.cssSelector("ms-edit-button > button > span>fa-icon>svg");

    public void waitForTableNotToBeEmpty() {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(rowLocator, 0));
            // TODO: to use webelement to check for numberOfElementsToBeMoreThan condition
        } catch (Exception e) {
            System.out.println("The table is empty, nevermind!");
        }
    }

    public void deleteCookie (WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element)).click();

        }catch (TimeoutException e){
            System.out.println("There is no cookie bar");
        }
    }

    public void scrollDown(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }


    public void findElementInListAndClick(String option, List<WebElement> webElements) {

        int i = 0;
        for (; i < webElements.size(); i++) {
            if (webElements.get(i).getText().trim().contains(option.trim())) {
                break;
            }

        }
        waitAndClick(webElements.get(i));
    }

    }

