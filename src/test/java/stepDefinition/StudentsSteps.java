package stepDefinition;

import POMFiles.StudentsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.util.List;

public class StudentsSteps {

    StudentsPage studentsPage = new StudentsPage();

    @Given("^Navigate to Student Page$")
    public void navigate_to_Student_Page() {


    }

    @And("^Click on$")
    public void click_on(DataTable ElementFromFeature) {
        List<String> eachElement = ElementFromFeature.asList(String.class);

        for (int i = 0; i < eachElement.size(); i++) {

            studentsPage.findElementAndClickFunctionality(eachElement.get(i));

        }
    }

    @And("^User sending input to form$")
    public void user_sending_input_to_form() {
        studentsPage.findElementAndSendKeysFunction("FirstNameInput", "Merve");
    }

    @And("^Click in the form page$")
    public void click_in_the_form_page(DataTable ElementFromFeature) {

        List<String> eachElement = ElementFromFeature.asList(String.class);

        for (int i = 0; i < eachElement.size(); i++) {

            studentsPage.findElementAndClickFunctionality(eachElement.get(i));

        }
    }

}
