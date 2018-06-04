package tests.HandlingTables.GetAttributesTest;


import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ExtentReports.ExtentTestManager;

import static org.testng.Assert.assertEquals;

public class PageAttributes extends BaseTest {


    String testurl = ("http://the-internet.herokuapp.com/challenging_dom");

    //Go to the test URL
//TODO Add test url to testdata
    @BeforeClass
    public void setUp() {
        driver.get(testurl);
    }

    //Col1
    @Test
    public void Header() {
        String actualHeader = driver.findElement(By.xpath("//h3[contains(.,'Challenging DOM')]")).getText();
        System.out.println("the page Header" + actualHeader);
        assertEquals(driver.findElement(By.xpath("//h3[contains(.,'Challenging DOM')]")).getText(), actualHeader);
        ExtentTestManager.getTest().log(LogStatus.INFO, "the page Header" + actualHeader);
    }

    @Test
    public void PageTitle() {
        String actualTitle = driver.getTitle();
        System.out.println("Is the page title" + actualTitle);
        String expectedTitle = "The Internet";
        assertEquals(expectedTitle, driver.getTitle());
        ExtentTestManager.getTest().log(LogStatus.INFO, "the page Title " + actualTitle);
    }
}