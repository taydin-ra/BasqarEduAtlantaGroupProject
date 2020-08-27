package stepDefinition;

import POMFiles.LoginPage;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginSteps {
    LoginPage login = new LoginPage();

    @Given("^Navigate to Basqar: \"([^\"]*)\"$")
    public void navigate_to_Basqar(String url) {

        Driver.getDriver().get(url);
    }



    @When("^Click on loggin button$")
    public void click_on_loggin_button() {
        login.findElementAndClick("loginButton");
    }

    @Then("^I am logged in successfully$")
    public void i_am_logged_in_successfully() {
        String name = "D. Saurbekov";

       try {
           String verifyName = login.findElementAndGetText("verifyUserName");
            Assert.assertEquals(name,verifyName);
        } catch (Exception e) {
           e.printStackTrace();

           Assert.assertTrue(login.findElementAndGetText("invalidUserOrPassword").contains("Invalid username or password"));
        }
    }

    @When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterTheAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.findElementAndSendKeys("userName", arg0);
        login.findElementAndSendKeys("password", arg1);
    }
}
