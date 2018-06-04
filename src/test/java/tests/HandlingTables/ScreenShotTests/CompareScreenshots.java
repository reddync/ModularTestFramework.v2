package tests.HandlingTables.ScreenShotTests;

import base.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

// PLEASE DO WRITE IMPORT STATEMENTS
public class CompareScreenshots extends BaseTest {


    @Test

    public void CompareScreenshots() throws InterruptedException {

        driver.manage().window().maximize();

// set time limit to find the element
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

// Go to URL
        driver.get("http://the-internet.herokuapp.com/challenging_dom");

// Take ScreenShot
        String screenshot_1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        Thread.sleep(2000);
        String screenshot_2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

        if (screenshot_1.equals(screenshot_2)) {
            System.out.println("Screenshots are matching");
        } else {
            System.out.println("Screenshots are NOT matching");
        }
    }
}