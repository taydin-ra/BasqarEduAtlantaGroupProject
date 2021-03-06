package stepDefinition;

import POMFiles.NewRegistrationPage;
import POMFiles.Parent;
import Utilities.Driver;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;

public class NewRegistrationSteps extends Parent {
    NewRegistrationPage newRegistrationPage = new NewRegistrationPage();

    @Given("^Navigate to Entrance Exams$")
    public void navigate_to_Entrance_Exams() {
        newRegistrationPage.findElementAndClickFunctionality("cookieMessageButton");
        newRegistrationPage.findElementAndClickFunctionality("entranceExams");
    }

    @When("^Create  a new registration approve$")
    public void create_a_new_registration_approve() {
        newRegistrationPage.findElementAndClickFunctionality("registrationApprove");
    }

    @Then("^I click on add button$")
    public void new_registration_approve_is_successfully() {
        newRegistrationPage.findElementAndClickFunctionality("addNewRegistration");
    }

    @And("^I click on following elements$")
    public void i_click_on_following_elements(DataTable ElementFromFeature) throws InterruptedException {
        List<String> eachElement = ElementFromFeature.asList(String.class);

        for (int i = 0; i < eachElement.size(); i++) {
            Thread.sleep(2000);
            newRegistrationPage.findElementAndClickFunctionality(eachElement.get(i));

        }
    }

    @Then("^I enter text to following elements$")
    public void i_enter_text_to_following_elements_and(DataTable elementAndValues) throws InterruptedException {
        Map<String, String> elementAndValuesList = elementAndValues.asMap(String.class, String.class);

        newRegistrationPage.LastName(elementAndValuesList.get("lastName"));
        newRegistrationPage.FirstName(elementAndValuesList.get("firstName"));
        newRegistrationPage.PersonalId(elementAndValuesList.get("personalId"));
        newRegistrationPage.dateOfBirth(elementAndValuesList.get("dateOfBirth"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(newRegistrationPage.dateOfBirthTextBox).click().perform();

    }


    @Then("^I click on following elements gender, citizenship and nationality in the Student information$")
    public void i_click_on_following_elements_in_the_Student_information() throws Throwable {
        newRegistrationPage.ClickOnGender();
        newRegistrationPage.ClickOnCitizen();
        newRegistrationPage.ClickOnNationality();

    }


    @Then("^I fill up following elements in the relative info page$")
    public void i_fill_up_following_elements_in_the_relative_info_page(DataTable elementsAndValues) throws Throwable {
        Map<String, String> elementsAndValuesList = elementsAndValues.asMap(String.class, String.class);

        newRegistrationPage.relativeLastName(elementsAndValuesList.get("relativeLastName"));
        newRegistrationPage.relativeFirstName(elementsAndValuesList.get("relativeFirstName"));
        newRegistrationPage.relativePhoneNumber(elementsAndValuesList.get("relativePhoneNumber"));
        newRegistrationPage.relativeEmail(elementsAndValuesList.get("relativeEmail"));

//        List<List<String>> elementAndValueList = elementsAndValues.asLists(String.class);
//
//        for(int i = 0 ; i < elementAndValueList.size() ; i++){
//
//           newRegistrationPage.findElementAndSendKeysFunction(elementAndValueList.get(i).get(0),elementAndValueList.get(i).get(1) );

       // }
    }


    @Then("^I click on following elements in the relative info page$")
    public void i_click_on_following_elements_in_the_relative_info_page(DataTable arg1) throws Throwable {
        newRegistrationPage.ClickOnRelativeInfo();
        newRegistrationPage.ClickOnRepresetative();
        newRegistrationPage.ClickOnCountry();

    }


    @Then("^I click on save button$")
    public void i_click_on_student_info_save_button() throws Throwable {
        newRegistrationPage.clickSaveButton();

    }


    @Then("^Created succesfuly New registration Approve$")
    public void created_succesfuly_New_registration_Approve() {
        newRegistrationPage.findElementAndVerifyElementContainText("SuccessfullyMessage" , "successfully");

    }


}
