package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestBase extends BaseTest {
////****Uncomment to use grid******//////
    //public WebDriver driver;
    //public Map<Long, WebDriver> driverMap = new ConcurrentHashMap();
    //public WebDriverWait wait;
    //public TLDriverFactory tlDriverFactory = new TLDriverFactory();

    //Do the test setup
    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setupTest(@Optional String browser) {
        //System.out.println("BeforeMethod is started. " + Thread.currentThread().getId());
        //Set & Get ThreadLocal Driver with Browser
        //TLDriverFactory.setDriver(browser);
        //driver = TLDriverFactory.getDriver();
        //driverMap.put(Thread.currentThread().getId(),TLDriverFactory.getDriver());
        //driver = driverMap.get(Long.valueOf(Thread.currentThread().getId()));
        //wait = new WebDriverWait(driver, 15);
    }

    @AfterMethod
    public void tearDown() {
        //System.out.println("AfterMethod is started. " + Thread.currentThread().getId());
        //TLDriverFactory.getDriver().quit();
        //TLDriverFactory.getTLDriver().remove();
    }

}