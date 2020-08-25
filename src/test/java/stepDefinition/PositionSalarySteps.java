package stepDefinition;

import POMFiles.PositionSalaryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositionSalarySteps {
    PositionSalaryPage positionSalaryPage = new PositionSalaryPage();

    @And("^Navigate to Position Salary page$")
    public void navigate_to_Position_Salary_page() throws InterruptedException {

//        positionSalaryPage.findElementAndClickFunction("HumanResourcesButton");
//        positionSalaryPage.findElementAndClickFunction("Setup3button");
//        positionSalaryPage.findElementAndClickFunction("PositionSalary1Button");
        positionSalaryPage.clickHumanResource();
        positionSalaryPage.clickSetUp3();
        positionSalaryPage.clickPositionSalary();
    }


    @When("^User create a position salary name as \"([^\"]*)\"$")
    public void user_create_a_position_salary_name_as(String arg1) {
        positionSalaryPage.findElementAndClickFunction("AddButton");
        positionSalaryPage.findElementAndSendKeys("NameInput", arg1);
        positionSalaryPage.findElementAndClickFunction("SaveButton");
    }


    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
    }
}


