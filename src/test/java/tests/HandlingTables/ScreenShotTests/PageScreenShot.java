package tests.HandlingTables.ScreenShotTests;

import base.BasePage;
import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class PageScreenShot extends BaseTest {


    //Create string to use as timestamp so files are not over written
    public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    @Test
    public void screenshotPage() throws IOException {
        BasePage basePage = new HomePage(driver, wait);
        driver.manage().window().maximize();
// set time limit to find the element
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Go to URL
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
// Take ScreenShot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/TestOutput/ScreenShots/Pages/pageScreenshot" + timestamp() + ".png."), true);

// Close Driver
// driver.quit();
    }
}
