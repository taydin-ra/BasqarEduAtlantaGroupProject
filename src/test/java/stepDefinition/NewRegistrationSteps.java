package stepDefinition;

import POMFiles.NewRegistrationPage;
import POMFiles.Parent;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class NewRegistrationSteps extends Parent {
    NewRegistrationPage newRegistrationPage = new NewRegistrationPage();

    @Given("^Navigate to Entrance Exams$")
    public void navigate_to_Entrance_Exams() {
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

    }


    @Then("^I click on following elements gender, citizenship and nationality in the Student information$")
    public void i_click_on_following_elements_in_the_Student_information() throws Throwable {
        newRegistrationPage.ClickOnGender();
        newRegistrationPage.ClickOnCitizen();
        newRegistrationPage.ClickOnNationality();

    }



    @Then("^I fill up following elements in the relative info page$")
    public void i_fill_up_following_elements_in_the_relative_info_page() throws Throwable {

    }



    @Then("^I click on student info save button$")
    public void i_click_on_student_info_save_button() throws Throwable {

    }



    @Then("^Created succesfuly New registration Approve$")
    public void created_succesfuly_New_registration_Approve() {

    }


}
