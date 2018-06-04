package tests.HandlingTables.GetAttributesTest;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ExtentReports.ExtentTestManager;

public class GetAttributesButtons extends BaseTest {

    //Buttons
    public By BlueButton = By.xpath("//a[@class='button']");
    public By RedButton = By.xpath("//a[@class='button alert']");
    public By GreenButton = By.xpath("//a[@class='button success']");


    //Result
    public By Result = By.xpath(".//*[@id='canvas']");

    //Go to the test URL
//TODO Add test url to testdata
    @BeforeClass
    public void setUp() {
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
    }

    //Blue Button
    @Test
    public void getAttribute_Id_BlueButton() {
        WebElement BlueButtonId = driver.findElement(BlueButton);
        System.out.println("Id of the blue button is:- " + BlueButtonId.getAttribute("id"));
        ExtentTestManager.getTest().log(LogStatus.INFO, "id of the button is:- " + BlueButtonId);
    }

    @Test
    public void getAttribute_ButtonText_BlueButton() {
        String BlueButtonIdText = driver.findElement(BlueButton).getText();
        System.out.println("Blue button text " + BlueButtonIdText);
        ExtentTestManager.getTest().log(LogStatus.INFO, "text of the button is:- " + BlueButtonIdText);

    }

    @Test
    public void getAttribute_Class_BlueButton() {
        String BluebuttonClassName = driver.findElement(BlueButton).getAttribute("class");
        System.out.println("class of the button is:- " + BluebuttonClassName);
        Assert.assertEquals(BluebuttonClassName, "button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "class of the button is:- " + BluebuttonClassName);
    }

    //RedButton
    @Test
    public void getAttribute_Id_RedButton() {
        WebElement RedButtonId = driver.findElement(RedButton);
        System.out.println("Id of the red button is:- " + RedButtonId.getAttribute("id"));
        ExtentTestManager.getTest().log(LogStatus.INFO, "id of the button is:- " + RedButtonId);

    }

    @Test
    public void getAttribute_ButtonText_RedButton() {
        String RedButtonIdText = driver.findElement(RedButton).getText();
        System.out.println("Red button text " + RedButtonIdText);
        ExtentTestManager.getTest().log(LogStatus.INFO, "text of the button is:- " + RedButtonIdText);

    }

    @Test
    public void getAttribute_Class_RedButton() {
        String RebuttonClassName = driver.findElement(RedButton).getAttribute("class");
        System.out.println("class of the button is:- " + RebuttonClassName);
        Assert.assertEquals(RebuttonClassName, "button alert");
        ExtentTestManager.getTest().log(LogStatus.PASS, "class of the button is:- " + RebuttonClassName);
    }

    //GreenButton
    @Test
    public void getAttribute_Id_GreenButton() {
        WebElement GreenButtonId = driver.findElement(GreenButton);
        System.out.println("Id of the green button is:- " + GreenButtonId.getAttribute("id"));
        ExtentTestManager.getTest().log(LogStatus.INFO, "id of the button is:- " + GreenButtonId);
    }

    @Test
    public void getAttribute_ButtonText_GreenButton() {
        String GreenButtonIdText = driver.findElement(GreenButton).getText();
        System.out.println("Green button text " + GreenButtonIdText);
        ExtentTestManager.getTest().log(LogStatus.INFO, "text of the button is:- " + GreenButtonIdText);
    }

    @Test
    public void getAttribute_Class_GreenButton() {
        String GreenbuttonClassName = driver.findElement(GreenButton).getAttribute("class");
        System.out.println("class of the button is:- " + GreenbuttonClassName);
        Assert.assertEquals(GreenbuttonClassName, "button success");
        ExtentTestManager.getTest().log(LogStatus.PASS, "class of the button is:- " + GreenbuttonClassName);
    }

    //RESULT
    @Test
    public void getAttribute_Id_Result() {
        WebElement ResultId = driver.findElement(Result);
        System.out.println("Id of the result is:- " + ResultId.getAttribute("id"));
        ExtentTestManager.getTest().log(LogStatus.INFO, "id of the button is:- " + ResultId);
    }

    @Test
    public void getAttribute_ButtonText_Result() {
        String ResultIdText = driver.findElement(Result).getText();
        System.out.println("Result text " + ResultIdText);
        ExtentTestManager.getTest().log(LogStatus.INFO, "class of the button is:- " + ResultIdText);
    }

    @Test
    public void getAttribute_Class_Result() {
        WebElement ResultClassname = driver.findElement(Result);
        System.out.println("class of the button is:- " + ResultClassname.getAttribute("class"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "class of the button is:- " + ResultClassname);
    }
}