package tests.HandlingTables.ScreenShotTests;

import base.BasePage;
import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import pages.HomePage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static tests.HandlingTables.ScreenShotTests.PageScreenShot.timestamp;


public class GetElementSCreenShot extends BaseTest {
    //Buttons
    private By BlueButton = By.xpath("//a[@class='button']");
    private By RedButton = By.xpath("//a[@class='button alert']");
    private By GreenButton = By.xpath("//a[@class='button success']");

    //BLUEBUTTON
    @Test
    public void BlueButtonGetElementScreenShot() throws IOException {

        BasePage basePage = new HomePage(driver, wait);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/challenging_dom");

//Locate Image element to capture screenshot.
        WebElement element = driver.findElement(BlueButton);

//Capture entire page screenshot as File.
//Used TakesScreenshot, OutputType Interface of selenium and File class of java to capture screenshot of entire page.
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//Used selenium Point class to get x y coordinates of Image element.
//get location(x y coordinates) of the element.
        Point point = element.getLocation();
        int xcordinate = point.getX();
        int ycordinate = point.getY();

//Used selenium getSize() method to get height and width of element.
//Retrieve width of element.
        int imageWidth = element.getSize().getWidth();
//Retrieve height of element.
        int imageHeight = element.getSize().getHeight();

//Reading full image screenshot.
        BufferedImage img = ImageIO.read(screen);

//cut Image using height, width and x y coordinates parameters.
        BufferedImage destination = img.getSubimage(xcordinate, ycordinate, imageWidth, imageHeight);
        ImageIO.write(destination, "png", screen);

//save Image screenshot In D: drive.
        FileUtils.copyFile(screen, new File("src/TestOutput/ScreenShots/Elements/BlueButtonscreenshotOfElement" + timestamp() + ".png"));
    }


    //REDBUTTON
    @Test
    public void RedButtonGetElementSCreenShot() throws IOException {
        BasePage BasePage = new HomePage(driver, wait);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/challenging_dom");

//Locate Image element to capture screenshot.
        WebElement element = driver.findElement(RedButton);

//Capture entire page screenshot as File.
//Used TakesScreenshot, OutputType Interface of selenium and File class of java to capture screenshot of entire page.
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//Used selenium Point class to get x y coordinates of Image element.
//get location(x y coordinates) of the element.
        Point point = element.getLocation();
        int xcordinate = point.getX();
        int ycordinate = point.getY();

//Used selenium getSize() method to get height and width of element.
//Retrieve width of element.
        int imageWidth = element.getSize().getWidth();
//Retrieve height of element.
        int imageHeight = element.getSize().getHeight();

//Reading full image screenshot.
        BufferedImage img = ImageIO.read(screen);

//cut Image using height, width and x y coordinates parameters.
        BufferedImage destination = img.getSubimage(xcordinate, ycordinate, imageWidth, imageHeight);
        ImageIO.write(destination, "png", screen);

//save Image screenshot In D: drive.
        FileUtils.copyFile(screen, new File("src/TestOutput/ScreenShots/Elements/RedButtonscreenshotOfElement" + timestamp() + ".png"));
    }

    //GREENBUTTON
    @Test
    public void GreenButtonGetElementScreenShot() throws IOException {
        BasePage basePage = new HomePage(driver, wait);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/challenging_dom");

//Locate Image element to capture screenshot.
        WebElement element = driver.findElement(GreenButton);

//Capture entire page screenshot as File.
//Used TakesScreenshot, OutputType Interface of selenium and File class of java to capture screenshot of entire page.
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//Used selenium Point class to get x y coordinates of Image element.
//get location(x y coordinates) of the element.
        Point point = element.getLocation();
        int xcordinate = point.getX();
        int ycordinate = point.getY();

//Used selenium getSize() method to get height and width of element.
//Retrieve width of element.
        int imageWidth = element.getSize().getWidth();
//Retrieve height of element.
        int imageHeight = element.getSize().getHeight();

//Reading full image screenshot.
        BufferedImage img = ImageIO.read(screen);

//cut Image using height, width and x y coordinates parameters.
        BufferedImage destination = img.getSubimage(xcordinate, ycordinate, imageWidth, imageHeight);
        ImageIO.write(destination, "png", screen);

//save Image screenshot In D: drive.
        FileUtils.copyFile(screen, new File("src/TestOutput/ScreenShots/Elements/GreenButtonscreenshotOfElement" + timestamp() + ".png"));
    }
}