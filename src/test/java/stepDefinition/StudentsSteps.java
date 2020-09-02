package stepDefinition;

import POMFiles.StudentsPage;
import Utilities.Driver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

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
    public void user_sending_input_to_form(DataTable elementsAndValues) {


        List<List<String>> elementAndValueList = elementsAndValues.asLists(String.class);

        for(int i = 0 ; i < elementAndValueList.size() ; i++){

            studentsPage.findElementAndSendKeysFunction(elementAndValueList.get(i).get(0),elementAndValueList.get(i).get(1) );

        }

    }

    @And("^Click in the form page$")
    public void click_in_the_form_page(DataTable ElementFromFeature) {

        List<String> eachElement = ElementFromFeature.asList(String.class);

        for (int i = 0; i < eachElement.size(); i++) {

            studentsPage.findElementAndClickFunctionality(eachElement.get(i));

        }
    }


    @And("^Select to dropdown menu$")
    public void selectToDropdownMenu() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", studentsPage.DocumentTypeDropdown);
        studentsPage.findElementAndClickFunctionality("DocumentTypeDropdown");
        studentsPage.findElementAndClickFunctionality("Option1");

    }
}

//          date icin select

//    public void scrollDown(WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("arguments[0].scrollIntoView();",element);
//    }