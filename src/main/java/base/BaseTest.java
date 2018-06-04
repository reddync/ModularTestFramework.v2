package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;


    @Parameters({"browser"})

    @BeforeTest
    public void openBrowser(String browser) {
        try {
            if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "D:/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
            //Create a wait. All test classes use this.
            wait = new WebDriverWait(driver, 15);
            //Maximize Window
            driver.manage().window().maximize();
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }
}



