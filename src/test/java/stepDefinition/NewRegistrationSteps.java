package stepDefinition;

import POMFiles.NewRegistrationPage;
import POMFiles.Parent;
import cucumber.api.java.en.*;

public class NewRegistrationSteps extends Parent {
    NewRegistrationPage newRegistrationPage = new NewRegistrationPage();

    @Given("^Navigate to Entrance Exams$")
    public void navigate_to_Entrance_Exams()  {
      newRegistrationPage.findElementAndClickFunctionality("entranceExams");


    }

    @When("^Create  a new registration approve$")
    public void create_a_new_registration_approve() {
        newRegistrationPage.findElementAndClickFunctionality("registrationApprove");

    }

    @Then("^I click on add button$")
    public void new_registration_approve_is_successfully()  {
        newRegistrationPage.findElementAndClickFunctionality("addNewRegistration");

    }

    @Given("^I enter text to follwing elements$")
    public void i_enter_text_to_follwing_elements() {

    }

    @Given("^I click on save button$")
    public void i_click_on_save_button() {

    }

    @Then("^New registration created is successfuly$")
    public void new_registration_created_is_successfuly()  {

    }


}
