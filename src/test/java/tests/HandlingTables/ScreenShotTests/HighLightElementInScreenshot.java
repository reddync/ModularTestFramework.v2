package tests.HandlingTables.ScreenShotTests;

import base.BasePage;
import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static tests.HandlingTables.ScreenShotTests.PageScreenShot.timestamp;

public class HighLightElementInScreenshot extends BaseTest {


    //Buttons
    private By BlueButton = By.xpath("//a[@class='button']");
    private By RedButton = By.xpath("//a[@class='button alert']");
    private By GreenButton = By.xpath("//a[@class='button success']");


    @Test
    public void BlueButtonhiglightelementscreenshot() throws IOException, InterruptedException {

        BasePage basePage = new HomePage(driver, wait);

// set time limit to find the element
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

// Go to URL
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
// store the webelement
        WebElement element_node = driver.findElement(BlueButton);
// pass the stored webelement to javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
// highlight the element with red border 3px width
        jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
// added sleep to give little time for browser to respond
        Thread.sleep(3000);

// Take ScreenShot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

// store the converted file as Image on D driver

        FileUtils.copyFile(file, new File("src/TestOutput/ScreenShots/ElementsHighLighted/BlueButtonElementWithHighlight" + timestamp() + ".png"), true);
    }

    @Test
    public void RedButtonhiglightelementscreenshot() throws IOException, InterruptedException {

        BasePage BasePage = new HomePage(driver, wait);

// set the geckodriver.exe property
// System.setProperty("webdriver.gecko.driver", "C:/PATH/geckodriver.exe");
// WebDriver driver =new FirefoxDriver();
// driver.manage().window().maximize();

// set time limit to find the element
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

// Go to URL
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
// store the webelement
        WebElement element_node = driver.findElement(RedButton);
// pass the stored webelement to javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
// highlight the element with red border 3px width
        jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
// added sleep to give little time for browser to respond
        Thread.sleep(3000);

// Take ScreenShot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

// store the converted file as Image on D driver

        FileUtils.copyFile(file, new File("src/TestOutput/ScreenShots/ElementsHighLighted/RedButtonElementWithHighlight" + timestamp() + ".png"), true);
    }

    @Test
    public void GreenButtonhiglightelementscreenshot() throws IOException, InterruptedException {

        BasePage basePage = new HomePage(driver, wait);

// set the geckodriver.exe property
// System.setProperty("webdriver.gecko.driver", "C:/PATH/geckodriver.exe");
// WebDriver driver =new FirefoxDriver();
// driver.manage().window().maximize();

// set time limit to find the element
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

// Go to URL
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
// store the webelement
        WebElement element_node = driver.findElement(GreenButton);
// pass the stored webelement to javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
// highlight the element with red border 3px width
        jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
// added sleep to give little time for browser to respond
        Thread.sleep(3000);

// Take ScreenShot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

// store the converted file as Image on D driver

        FileUtils.copyFile(file, new File("src/TestOutput/ScreenShots/ElementsHighLighted/GreenButtonElementWithHighlight" + timestamp() + ".png"), true);
    }
}