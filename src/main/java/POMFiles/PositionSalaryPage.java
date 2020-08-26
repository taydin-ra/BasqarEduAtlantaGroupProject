package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PositionSalaryPage extends Parent {

    public PositionSalaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//span[text()='Human Resources']")
    private WebElement HumanResourcesButton;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement Setup3Button;

    @FindBy(xpath="(//span[text()='Position Salary'])[1]")
    private WebElement PositionSalary1Button;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement AddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement NameInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    WebElement myElement;
    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "HumanResourcesButton":
                myElement = HumanResourcesButton;
                break;

            case "Setup3Button":
                myElement = Setup3Button;
                break;

            case "PositionSalary1Button":
                myElement = PositionSalary1Button;
                break;

            case "SaveButton":
                myElement = SaveButton;
                break;
        }

       waitAndClick(myElement);
        //
    }

    public void clickHumanResource(){
        clickOnFunctionalities(HumanResourcesButton);
    }
    public void clickSetUp3(){
        clickOnFunctionalities(Setup3Button);
    }
    public void clickPositionSalary(){
        clickOnFunctionalities(PositionSalary1Button);
    }

    public void clickAddButton(){
        clickOnFunctionalities(AddButton);
    }
    public void findElementAndSendKeys(String elementName, String text ){
        switch (elementName){
            case "NameInput":
                myElement=NameInput;
                break;
        }
        waitAndSendKeys(myElement,text);
    }


}


