package stepDefinition;

import POMFiles.DiscountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DiscountsSteps {
    DiscountPage discountPage = new DiscountPage();

    @Given("^I click on Setup$")
    public void i_click_on_Setup() throws Throwable {
        discountPage.findElementAndClickFunction("SetupButton");
    }

    @Given("^I click on Parameter$")
    public void i_click_on_Parameter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        discountPage.findElementAndClickFunction("ParametersButton");
    }

    @Given("^I click on Discounts$")
    public void i_click_on_Discounts() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        discountPage.findElementAndClickFunction("DiscountsButton");
    }

    @Given("^I click on add discount button$")
    public void i_click_on_add_discount_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        discountPage.findElementAndClickFunction("AddDiscountsButton");
    }

    @Then("^I enter \"([^\"]*)\" in the \"([^\"]*)\"$")
    public void i_enter_in_the(String sentText, String textInputElm) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        discountPage.FindElementAndSendKeysFunction(textInputElm, sentText);
    }

    @Then("^I click on Save button$")
    public void i_click_on_Save_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        discountPage.findElementAndClickFunction("Save");
    }

    @Then("^\"([^\"]*)\" is seen \"([^\"]*)\"$")
    public void is_created(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        // discountPage.wait(10);
        String verifySuccess = null;

        verifySuccess = discountPage.findElementAndGetText(arg1);

        System.out.println(verifySuccess);

        Assert.assertTrue(verifySuccess.contains(arg2));

    }

    @When("^I click on Edit button$")
    public void i_click_on_Edit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        //  discountPage.wait(10);

        discountPage.findElementAndClickFunction("EditButton");

    }

    @Then("^I update the discount name as\"([^\"]*)\" in the \"([^\"]*)\"$")
    public void i_update_the_discount_name_as_in_the(String sentText1, String textInputElm) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        discountPage.FindElementAndSendKeysFunction(textInputElm, sentText1);
    }

    @When("^I click on delete button$")
    public void i_click_on_delete_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);


        discountPage.findElementAndClickFunction("DeleteButton");

    }

    @Then("^I confirm \"([^\"]*)\"$")
    public void i_confirm(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        discountPage.findElementAndClickFunction("ConfirmButton");
    }


}