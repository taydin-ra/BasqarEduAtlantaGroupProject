package stepDefinition;

import POMFiles.SetupSchoolsPage;
import Utilities.Driver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.testng.Assert;

import java.util.List;

public class SetupSchoolsSteps {
    SetupSchoolsPage schools = new SetupSchoolsPage();

    @And("^I click on \"([^\"]*)\" button on cokkies dialog$")
    public void iClickOnButtonOnCokkiesDialog(String gotIt) {
        try {
            schools.findElementAndClick(gotIt);
        }catch(Exception e){
            System.out.println("Cookies already clicked");
        }
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
    public void i_select_time_zone_from_drop_down_list(String timeZone, DataTable table) {
        List<String> data = table.asList(String.class);
        schools.findElementAndClick(timeZone);
        schools.findElementInListAndClick(data.get(0), schools.timeZoneList);

    }

    @When("^Select language from \"([^\"]*)\" drop down list$")
    public void select_language_from_drop_down_list(String language, DataTable table) {
        List<String> data = table.asList(String.class);
        schools.findElementAndClick(language);
        schools.findElementInListAndClick(data.get(0), schools.languageList);

    }

    @When("^I press \"([^\"]*)\" button$")
    public void i_press_button(String saveButton) {
        schools.findElementAndClick(saveButton);
    }


    @Then("^I should be in \"([^\"]*)\" page$")
    public void i_should_be_in_page(String adressInfoPage) {
        //aria-selected atribute value becomes true if it was selected, i check if it is selected
//        Assert.assertEquals("true", schools.addressInfoPage.getAttribute("aria-selected"));

        String attribute = schools.findElementAndGetAttribute(schools.addressInfoPage,"aria-selected");
        Assert.assertEquals("true",attribute );
    }

    @When("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_the_and(String street, String country, DataTable table) {
        List<String> data = table.asList(String.class);
        schools.findElementAndSendKeys(street, data.get(0));
        schools.findElementAndClick(country);
        schools.findElementInListAndClick(data.get(1), schools.countryList);
    }

    @When("^I select \"([^\"]*)\" from drop down list$")
    public void i_select_from_drop_down_list(String city, DataTable table) {
        List<String> data = table.asList(String.class);
        schools.findElementAndClick(city);
        schools.findElementInListAndClick(data.get(0), schools.cityList);
    }

    @When("^I enter \"([^\"]*)\"$")
    public void i_enter(String postalCode, DataTable table) {
        List<String> data = table.asList(String.class);
        schools.findElementAndSendKeys(postalCode, data.get(0));
    }

    @When("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String saveButton) {
        schools.findElementAndClick(saveButton);
    }

    @Then("^I should get \"([^\"]*)\" message$")
    public void i_should_get_message(String success) {
        String message = schools.findElementAndGetText("successElement");
        Assert.assertEquals(message, success);
    }

    @When("^I press the left arrow button to go to school list page$")
    public void i_press_the_left_arrow_button_to_go_to_school_list_page() {
        schools.findElementAndClick("LeftArrowButton");
    }

    @Then("^I should see the new school name on the list$")
    public void i_should_see_the_new_school_name_on_the_list(DataTable table) {
        List<String> data = table.asList(String.class);
        String schoolNameOnList = schools.findElementAndGetText(data.get(0));
        Assert.assertEquals(schoolNameOnList, data.get(0));
    }

    // Scenario Editing an existing school
    @Given("^I click \"([^\"]*)\" button for Deneme High School from the list$")
    public void i_click_button_for_Deneme_High_School_from_the_list(String editButton)  {

schools.findElementAndClick(editButton);

    }

    @Then("School Info page should be open$")
    public void page_should_be_open()  {
       String attribute = schools.findElementAndGetAttribute(schools.schoolInfoPage,"aria-selected");
        Assert.assertEquals("true",attribute );
    }

    @When("^I enter new \"([^\"]*)\" and new \"([^\"]*)\"$")
    public void i_enter_new_and_new(String newName, String newShortName, DataTable table)  {
        List<String> data = table.asList(String.class);
        schools.findElementAndSendKeys(newName,data.get(0));
        schools.findElementAndSendKeys(newShortName,data.get(1));

    }

    @Then("^I should see the updated name$")
    public void i_should_see_the_updated_name(DataTable table)  {
        List<String> data = table.asList(String.class);
        String schoolNameOnList = schools.findElementAndGetText(data.get(0));
        Assert.assertEquals(schoolNameOnList, data.get(0));
    }

    @Given("^I click \"([^\"]*)\" button$")
    public void iClickButton(String delete){
schools.findElementAndClick(delete);

    }

    @And("^I click on \"([^\"]*)\" button on pop-up dialog$")
    public void iClickOnButtonOnPopUpDialog(String yes) {
schools.findElementAndClick(yes);
    }
}
