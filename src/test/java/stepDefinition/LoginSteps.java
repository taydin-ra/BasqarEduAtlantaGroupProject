package stepDefinition;

import POMFiles.LoginPage;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver;
    LoginPage login = new LoginPage();

    @Given("^Navigate to Basqar: \"([^\"]*)\"$")
    public void navigate_to_Basqar(String url) {

        Driver.getDriver().get(url);
        Driver.getDriver().manage().window().maximize();

    }


    @When("^Enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_the_username_and_password(String arg1, String arg2) {
        login.findElementAndSendKeys("userName", arg1);
        login.findElementAndSendKeys("password", arg2);
    }

    @When("^Click on loggin button$")
    public void click_on_loggin_button() {
        login.findElementAndClick("loginButton");
    }

    @Then("^I am logged in successfully$")
    public void i_am_logged_in_successfully() {
        String name = "D. Saurbekov";
        String verifyName = login.findElementAndGetText("verifyUserName");
        Assert.assertEquals(name, verifyName);
    }

}
