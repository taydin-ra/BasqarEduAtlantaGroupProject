package POMFiles;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class SetupSchoolsPage extends Parent {
    WebElement myElement;

    public SetupSchoolsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[aria-label='dismiss cookie message']")
    private WebElement cookiesMessage;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[1]")
    private WebElement setupMenu;

    @FindBy(xpath = "//span[contains(text(),'School Setup')]")
    private WebElement schoolSetupMenu;

    @FindBy(xpath = "//span[contains(text(),'Schools (Admin)')]")
    private WebElement schoolsAdminMenu;

    @FindBy(xpath = "//h3[contains(text(),'Schools')]")
    private WebElement schoolsGetText;

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement plusButton;

    @FindBy(xpath = "//h3[contains(text(),'New School')]")
    private WebElement newSchoolText;

    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement nameSchool;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")
    private WebElement shortNameSchool;
    @FindBy(xpath = "//mat-select[@aria-label='Phone Mask']/div/div/span")
    private WebElement phoneMask;
    @FindBy(xpath = "//span[contains(text(),'Mask 1')]")
    private WebElement mask1;

    @FindBy(xpath = "//span[contains(text(),'Mask 2')]")
    private WebElement mask2;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']/div/div/span")
    private WebElement currency;

    @FindBy(xpath = "//span[contains(text(),'KZT')]")
    private WebElement kzt;
    @FindBy(xpath = "//span[contains(text(),'USD')]")
    private WebElement usd;
    @FindBy(xpath = "//span[contains(text(),'EUR')]")
    private WebElement eur;

    @FindBy(xpath = "//span[contains(text(),'Default Time Zone')]")
    private WebElement timeZone;

    @FindBy(css = "div[id='mat-select-6-panel']>mat-option>span")
    public List<WebElement> timeZoneList;

    @FindBy(css = "mat-select[formcontrolname='language']>div>div")
    private WebElement language;

    @FindBy(css = "div[id='mat-select-7-panel']>mat-option")
    public List<WebElement> languageList;


    public void findElementAndClick(String element) {
        switch (element) {
            case "Got it":
                myElement = cookiesMessage;
                break;
            case "Setup":
                myElement = setupMenu;
                break;
            case "School Setup":
                myElement = schoolSetupMenu;
                break;
            case "Schools(Admin)":
                myElement = schoolsAdminMenu;
                break;
            case "Plus Sign":
                myElement = plusButton;
                break;
            case "Phone Mask":
                myElement = phoneMask;
                break;
            case "Mask 1":
                myElement = mask1;
                break;
            case "Mask 2":
                myElement = mask2;
                break;
            case "Default Currency":
                myElement = currency;
                break;

            case "KZT":
                myElement = kzt;
                break;
            case "USD":
                myElement = usd;
                break;
            case "EUR":
                myElement = eur;
                break;
            case "Default Time Zone":
                myElement = timeZone;
                break;

            case "Default Language:":
                myElement = language;
                break;
        }
        waitAndClick(myElement);
    }

    public void findElementAndSendKeys(String element, String text) {
        switch (element) {
            case "Name":
                myElement = nameSchool;
                break;
            case "Short Name":
                myElement = shortNameSchool;
                break;
        }
        waitAndSendKeys(myElement, text);
    }


    public String findElementAndGetText(String element) {
        switch (element) {
            case "Schools":
                myElement = schoolsGetText;
                break;
            case "New School":
                myElement = newSchoolText;
                break;


        }
        return waitAndGetText(myElement);

    }

    public void findElementInListAndClick(String element,List<WebElement> webElements) {

        for (int i = 0; i < webElements.size(); i++) {
            if (webElements.get(i).getText().trim().contains(element.trim())) {
                myElement = webElements.get(i);
                break;
            }
        }
        waitAndClick(myElement);
    }
}