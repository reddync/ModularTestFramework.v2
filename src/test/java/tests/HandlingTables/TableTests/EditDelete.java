package tests.HandlingTables.TableTests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ExtentReports.ExtentTestManager;

public class EditDelete extends BaseTest {

    //Buttons
    public By Row1Edit = By.xpath(".//*[@id='content']/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]");
    public By Row1delete = By.xpath(".//*[@id='content']/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[2]");

    String editurl = "http://the-internet.herokuapp.com/challenging_dom#edit";
    String deleteurl = "http://the-internet.herokuapp.com/challenging_dom#dcklete";

//Go to the test URL

    @BeforeClass
    public void setUp() {
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
    }

    //Row 1 Edit Delete verifications
    @Test(priority = 1, description = "Click on row 1 edit, verify the url has changed .")
    @Step
    public void getAttribute_Id_Row1Edit() {
        driver.findElement(Row1Edit).click();
        String CurrentURL = driver.getCurrentUrl();
        if (CurrentURL.equals(editurl)) {
            System.out.println("Row 1 Edit URL Match PASS");
            ExtentTestManager.getTest().log(LogStatus.INFO, "Row 1 Edit URL Match PASS");
        } else {
            System.out.println("Row 1 Edit URL not matching expected FAIL");
            ExtentTestManager.getTest().log(LogStatus.INFO, "Row 1 Edit URL Match PASS");
            Assert.assertEquals(editurl, driver.getCurrentUrl());

        }
    }

    @Test(priority = 1, description = "Click on row 1 delete, verify the url has changed .")
    @Step

    public void getAttribute_Id_Row1Delete(ITestContext iTestContext) {
        driver.findElement(Row1delete).click();
        String CurrentURL = driver.getCurrentUrl();
        if (CurrentURL.equals(deleteurl)) {
            System.out.println("Row 1 Delete URL Match PASS");
            ExtentTestManager.getTest().log(LogStatus.INFO, "Row 1 Delete URL Match PASS");
        } else {
            System.out.println("Row 1 Delete URL not matching expected FAIL");
            ExtentTestManager.getTest().log(LogStatus.INFO, "Row 1 Delete URL not matching expected FAIL");
        }

        Assert.assertEquals(deleteurl, driver.getCurrentUrl());


    }
}