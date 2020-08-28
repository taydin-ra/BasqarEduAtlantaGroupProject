package stepDefinition;

import POMFiles.NewRegistrationPage;
import POMFiles.Parent;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

import java.util.List;

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

    @And("^I click on following elements$")
    public void i_click_on_following_elements(DataTable ElementFromFeature) throws InterruptedException {
        List<String> eachElement = ElementFromFeature.asList(String.class);

        for (int i = 0; i < eachElement.size(); i++) {
            Thread.sleep(2000);

         newRegistrationPage.findElementAndClickFunctionality(eachElement.get(i));

        }


    }



    @And("^I enter text to following elements$")
    public void i_enter_text_to_following_elements(DataTable elementsAndValues) throws InterruptedException {

        List<List<String>> elementAndValueList = elementsAndValues.asLists(String.class);

        for(int i = 0 ; i < elementAndValueList.size() ; i++){
            Thread.sleep(2000);

            newRegistrationPage.findElementAndSendKeysFunction(elementAndValueList.get(i).get(0),elementAndValueList.get(i).get(1) );


        }


    }

    @And("^I click on sutudent info save button$")
    public void i_click_on_sutudent_info_save_button() {

    }

    @And("^I fill up following elements$")
    public void i_fill_up_following_elements() {

    }

    @And("^I click Relative Info save button$")
    public void i_click_Relative_Info_save_button() {

    }

    @Then("^Created succesfuly New registration Approve$")
    public void created_succesfuly_New_registration_Approve()  {

    }



}
