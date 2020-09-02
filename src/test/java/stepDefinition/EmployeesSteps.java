package stepDefinition;

import POMFiles.EmployeesPage;
import POMFiles.Parent;
import Utilities.Driver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import javax.swing.*;
import java.util.Map;

public class EmployeesSteps {
    EmployeesPage page = new EmployeesPage();

    @Given("^I navigate to Employees screen$")
    public void i_navigate_to_screen() {
        page.waitAndClick(page.humanResourcesMenuElement);
        page.waitAndClick(page.employeesMenuElement);
        page.waitForTableNotToBeEmpty();
    }

    @When("^I create employee with following data$")
    public void i_create_successfully(DataTable fields) {
        Map<String, String> fieldsMap = fields.asMap(String.class, String.class);
        Actions action = new Actions(Driver.getDriver());
        page.waitAndClick(page.schoolButtonElement);
        page.findElementInListAndClick(fieldsMap.get("School"), page.schoolListElement);
        page.waitAndClick(page.createButtonElement);

        page.waitAndSendKeys(page.firstNameElement, fieldsMap.get("FirstName"));
        page.waitAndSendKeys(page.lastNameElement, fieldsMap.get("LastName"));

        page.waitAndClick(page.dateOfBirthButtonElement);
        page.waitAndSendKeys(page.dateOfBirthElement, fieldsMap.get("DateOfBirth"));
        action.moveToElement(page.dateOfBirthButtonElement).click().perform();

        page.waitAndClick(page.genderButtonElement);
        page.findElementInListAndClick(fieldsMap.get("Gender"), page.genderListElement);

        page.waitAndClick(page.employeeTypteButtonElement);
        page.findElementInListAndClick(fieldsMap.get("Employee Type"), page.employeeTypteListElement);
        action.moveToElement(page.employeeIdElement).click().perform();

        page.waitAndSendKeys(page.employeeIdElement, fieldsMap.get("EmployeeID"));

        page.waitAndClick(page.employeePositionElement);
        page.findElementInListAndClick(fieldsMap.get("Employee Position"), page.employeePositionListElement);

        action.moveToElement(page.firstNameElement).click().perform();

        page.scrollDown(page.personalIDElement);

        page.waitAndClick(page.citizenshipElement);
        page.findElementInListAndClick(fieldsMap.get("Citizenship"), page.citizenshipListElement);

        page.waitAndClick(page.nationalityElement);
        page.findElementInListAndClick(fieldsMap.get("Nationality"), page.nationalityListElement);

        page.waitAndClick(page.documentTypeElement);
        page.findElementInListAndClick(fieldsMap.get("Document Type"), page.documentTypeElementListElement);

        page.waitAndSendKeys(page.documentNumberElement, fieldsMap.get("PersonalID"));
        page.waitAndSendKeys(page.personalIDElement, fieldsMap.get("PersonalID"));

        page.waitAndClick(page.qualificationElement);
        page.findElementInListAndClick(fieldsMap.get("Qualififcation"), page.qualificationElementListElement);

        page.waitAndClick(page.contactButtonElement);

        page.waitAndSendKeys(page.phoneElement, fieldsMap.get("Phone"));
        page.waitAndSendKeys(page.emailElement, fieldsMap.get("Email"));
        page.deleteCookie(page.cookieButtonElement);
        //page.waitAndClick(page.cookieButtonElement);
        page.waitAndClick(page.saveButtonElement);


    }

    @Then("^Employee is successfully created$")
    public void Employee_is_successfully_created() {
        String alertText = page.waitAndGetText(page.alertDialogElement);
        System.out.println(alertText);
        Assert.assertEquals("Employee successfully created", alertText);
    }

    @When("^I searched employee with name in the table$")
    public void iSearchedInTheTable(DataTable fields) {
        Map<String, String> fieldsMap = fields.asMap(String.class, String.class);
        page.waitAndClick(page.schoolButtonElement);
        page.findElementInListAndClick(fieldsMap.get("School"), page.schoolListElement);
        page.waitAndClick(page.generalFirstNameElement);
        page.waitAndSendKeys(page.generalFirstNameElement, fieldsMap.get("First Name"));
        page.waitAndClick(page.statusElement);
        page.findElementInListAndClick(fieldsMap.get("Status"), page.statusElementListElement);
        page.waitAndClick(page.searchElement);


    }

    @And("^I edit employee successfully$")
    public void i_edit_to_successfully(DataTable fields) {
        Map<String, String> fieldsMap = fields.asMap(String.class, String.class);
        Actions action = new Actions(Driver.getDriver());
        page.waitForTableNotToBeEmpty();
        page.waitAndClick(page.editButtonElement);

        page.waitAndClick(page.employeeTypteButtonElement);
        page.findElementInListAndClick(fieldsMap.get("Employee Type"), page.employeeTypteListElement);
        action.moveToElement(page.employeeIdElement).click().perform();

        page.waitAndClick(page.employeePositionElement);
        page.findElementInListAndClick(fieldsMap.get("Employee Position"), page.employeePositionListElement);
        action.moveToElement(page.firstNameElement).click().perform();

    }

    @And("^I changed some things$")
    public void iChangedSomeThings(DataTable fields) {
        Map<String, String> fieldsMap = fields.asMap(String.class, String.class);
        Actions action = new Actions(Driver.getDriver());
        page.waitAndClick(page.employeeTypteButtonElement);
        page.findElementInListAndClick(fieldsMap.get("Employee Type"), page.employeeTypteListElement);
        action.moveToElement(page.employeeIdElement).click().perform();

        page.waitAndClick(page.employeePositionElement);
        page.findElementInListAndClick(fieldsMap.get("Employee Position"), page.employeePositionListElement);
        action.moveToElement(page.firstNameElement).click().perform();
        page.deleteCookie(page.cookieButtonElement);
      //  page.waitAndClick(page.cookieButtonElement);
        page.waitAndClick(page.saveButtonElement);

    }

    @Then("^Employee is successfully edited$")
    public void Employee_is_successfully_edited() {
        String alertText = page.waitAndGetText(page.alertDialogElement);
        System.out.println(alertText);
        Assert.assertEquals("Employee successfully updated", alertText);
    }

    @And("^I delete employee successfully$")
    public void i_delete_successfully() {
        page.waitForTableNotToBeEmpty();
        page.waitAndClick(page.deleteButtonElement);
        page.waitAndClick(page.dialogSubmitButtonElement);
    }


    @Then("^Employee is successfully deleted$")
    public void Employee_is_successfully_deleted() {
        String alertText = page.waitAndGetText(page.alertDialogElement);
        System.out.println(alertText);
        Assert.assertEquals("Employee successfully deleted", alertText);
    }


}
