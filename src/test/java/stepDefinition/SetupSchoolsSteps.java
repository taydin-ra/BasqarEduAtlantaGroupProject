package stepDefinition;

import POMFiles.SetupSchoolsPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.testng.Assert;

import java.util.List;

public class SetupSchoolsSteps {
    SetupSchoolsPage schools = new SetupSchoolsPage();

    @And("^I click on \"([^\"]*)\" button on cokkies dialog$")
    public void iClickOnButtonOnCokkiesDialog(String gotIt) {
        schools.findElementAndClick(gotIt);
    }

    @When("^I navigate to \"([^\"]*)\" menu$")
    public void iNavigateToMenu(String setupMenu) throws Throwable {
        schools.findElementAndClick(setupMenu);
    }

    @When("^I click on the \"([^\"]*)\" menu$")
    public void i_click_on_the_menu(String schoolSetupMenu) {
        schools.findElementAndClick(schoolSetupMenu);
    }

    @When("^I click on \"([^\"]*)\" menu$")
    public void i_click_on_menu(String schoolsAdmin) {
        schools.findElementAndClick(schoolsAdmin);
    }

    @Then("^I should be on the \"([^\"]*)\" page$")
    public void iShouldBeOnThePage(String schoolsText) {
        String text = schools.findElementAndGetText(schoolsText);
        Assert.assertEquals(schoolsText, text);
    }

    @Given("^I click on \"([^\"]*)\" button on Schools page$")
    public void i_click_on_button_on_Schools_page(String plus) {
        schools.findElementAndClick(plus);

    }

    @Then("^I should be on \"([^\"]*)\" page$")
    public void i_should_be_on_page(String newSchool) {
        String text = schools.findElementAndGetText(newSchool);
        Assert.assertEquals(newSchool, text);
    }

    @When("^I enter the Name and Short Name$")
    public void iEnterTheNameAndShortName(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        schools.findElementAndSendKeys(data.get(0).get(0), data.get(0).get(1));
        schools.findElementAndSendKeys(data.get(1).get(0), data.get(1).get(1));
    }

    @When("^I select a mask from \"([^\"]*)\" drop down list$")
    public void i_select_a_mask_from_drop_down_list(String mask, DataTable table) {
        List<String> data = table.asList(String.class);
        schools.findElementAndClick(mask);
        schools.findElementAndClick(data.get(0));

    }

    @When("^I select currency from \"([^\"]*)\" drop down list$")
    public void i_select_currency_from_drop_down_list(String currency, DataTable table) {
        List<String> data = table.asList(String.class);
        schools.findElementAndClick(currency);
        schools.findElementAndClick(data.get(0));
    }

    @When("^I select time zone from \"([^\"]*)\" drop down list$")
    public void i_select_time_zone_from_drop_down_list(String arg1, DataTable table) {
        List<List<String>> data = table.asLists(String.class);
    }

    @When("^Select language from \"([^\"]*)\" drop down list$")
    public void select_language_from_drop_down_list(String arg1, DataTable table) {
        List<List<String>> data = table.asLists(String.class);
    }

    @When("^I press \"([^\"]*)\" button$")
    public void i_press_button(String arg1) {
    }

    @Then("^I should be in \"([^\"]*)\" page$")
    public void i_should_be_in_page(String arg1) {
    }

    @When("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_the_and(String arg1, String arg2, DataTable table) {
        List<List<String>> data = table.asLists(String.class);
    }

    @When("^I select \"([^\"]*)\" from drop down list$")
    public void i_select_from_drop_down_list(String arg1, DataTable table) {
        List<List<String>> data = table.asLists(String.class);
    }

    @When("^I enter \"([^\"]*)\"$")
    public void i_enter(String arg1, DataTable table) {
        List<List<String>> data = table.asLists(String.class);
    }

    @When("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1) {

    }

    @Then("^I should get \"([^\"]*)\" message$")
    public void i_should_get_message(String arg1) {

    }

    @When("^I press the left arrow button to go to school list page$")
    public void i_press_the_left_arrow_button_to_go_to_school_list_page() {
    }

    @Then("^I should see the new school name on the list$")
    public void i_should_see_the_new_school_name_on_the_list() {
    }


}
