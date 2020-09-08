package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.util.List;

public class GradeLavelPage extends Parent {
    public GradeLavelPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@class='cc-btn cc-dismiss']")
    private WebElement goToIt;
    public void clickgoToIt(){
        waitAndClick (goToIt);
    }
    @FindBy(xpath = "(//span[contains(text(),'Setup')])[1]")
    private WebElement setupMenu;
    public void clickSetupMenu(){
        waitAndClick (setupMenu);
    }

    @FindBy(xpath = "(//span[contains(text(),'Parameters')])[1]")
    private WebElement parametrMenu;
    public void clickParametrMenu(){
        waitAndClick (parametrMenu);
    }
    @FindBy(xpath = "//*[@id=\"container-2\"]/toolbar/mat-toolbar/div/div[1]/button/span/fa-icon/svg")
    private WebElement menuButton;
    public void clickMenuButton(){
        waitAndClick (menuButton);
    }

    @FindBy(xpath = "(//span[contains(text(),'Grade Levels')])[1]")
    private WebElement gradeLavel;
    public void clickGradeLavel(){
        waitAndClick (gradeLavel);
    }

    @FindBy(css = "svg[data-icon='plus']")

    private WebElement plusButton;
    public void clickPlusButton(){ waitAndClick (plusButton);
    }

    @FindBy(xpath = "(//input[@type=\"text\"])[1]")
    private WebElement addNewName;
    public void writeNewName(){
        waitAndSendKeys (addNewName,"Aghababa");
    }

    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    private WebElement addNewShortName;
    public void writeAddShortName(){
        waitAndSendKeys (addNewShortName,"Agha");
    }

    @FindBy(xpath = "//input[@type=\"number\"]")
    private WebElement addNewOrder;
    public void writeOrder(){
        waitAndSendKeys (addNewOrder,"5");
    }

    @FindBy(xpath = "//mat-select[@aria-label='Next Grade']")
    private WebElement addNextGrade;
    public void selectNextGrade(){
        waitAndClick (addNextGrade);
    }
    @FindBy(xpath = "//span[contains(text(),' 6th grade ')]")
    private WebElement select6ThGrade;
    public void sixGrade(){
        waitAndClick (select6ThGrade);
    }

    @FindBy(xpath = "//*[@formcontrolname=\"active\"]/label/div/div/div[1]")
    private WebElement activeButton;
    public void active(){
        waitAndClick (activeButton);
    }

    @FindBy(xpath = "//fa-icon[@class=\"ng-fa-icon ng-star-inserted\"]")
    private WebElement saveButton;
    public void save(){
        waitAndClick (saveButton);
    }
    @FindBy(xpath = "//*[@id=\"ms-text-field-0\"]/button/span/fa-icon")
    WebElement language;
    public void translate(){
        waitAndClick (language);
    }
    @FindBy(xpath = "//span[contains(text(),'Language')]")
    WebElement langButton;
    public void langButtonClick(){
        waitAndClick (langButton);
    }
    @FindBy(xpath = "//span[contains(text(),'Русский')]")
    WebElement choseEnLanguage;
    public void addEnglish(){
        waitAndClick (choseEnLanguage);
    }
    @FindBy(xpath = "//input[@formcontrolname='translation']")
    WebElement translateToEnglish;
    public void nameTraslateToEnglish(){
        waitAndSendKeys (translateToEnglish,"Агабаба");
    }
    @FindBy(xpath = "//span[contains(text(),'Apply')]")
    private WebElement applyButton;
    public void applyButtonClick(){
        waitAndClick (applyButton);

    }
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessfullyMessage;
    public void succesGrade(){
        waitAndGetText (SuccessfullyMessage);
    }
    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;
    public void errorGrade(){
        waitAndGetText (ErrorMessage);
    }

}

