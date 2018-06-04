package base;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedMethodListener implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            System.out.println("Test Method BeforeInvocation is started. " + Thread.currentThread().getId());
            String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browser");
            TLDriverFactory.setDriver(browserName);
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            System.out.println("Test Method AfterInvocation is started. " + Thread.currentThread().getId());
            WebDriver driver = TLDriverFactory.getDriver();
            if (driver != null) {
                driver.quit();
            }
        }
    }
}