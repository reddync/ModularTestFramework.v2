package base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class InitializeLogging extends BasePage {
    public static Logger log = Logger.getLogger("Regression");

    // static block
    static {
        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("resources/log4j.properties");

        //log the message to file
        log.trace("Logging Initialized");
    }

    public InitializeLogging(WebDriver driver) {
        super(driver);
    }
}