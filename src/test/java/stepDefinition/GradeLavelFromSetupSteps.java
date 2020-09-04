package stepDefinition;

import POMFiles.GradeLavelPage;
import POMFiles.Parent;
import Utilities.Driver;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class GradeLavelFromSetupSteps extends  Parent {
    GradeLavelPage grade=new GradeLavelPage ();
    @When("^go to setup menu$")
    public void go_to_setup_menu()  {
        Driver.getDriver ().manage ().window ().maximize ();
        grade.clickgoToIt ();
        grade.clickSetupMenu ();
        grade.clickParametrMenu ();


    }

    @When("^Chose garde lavel from Parametrs and click$")
    public void chose_garde_lavel_from_Parametrs_and_click()  {
        grade.clickGradeLavel ();
        grade.clickPlusButton ();
        grade.writeNewName ();
        grade.writeAddShortName ();
        grade.writeOrder ();
        grade.selectNextGrade ();
        grade.sixGrade ();
       // grade.active ();
        grade.translate ();
        grade.langButtonClick ();
        grade.addEnglish ();
        grade.nameTraslateToEnglish ();
        grade.applyButtonClick ();
        grade.save ();
        grade.succesGrade ();






    }


}
