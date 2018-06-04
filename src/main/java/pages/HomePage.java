package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    //*********Web Elements*********
    String signInButtonXpath = "//a[contains(.,'Log in')][1]";

    //*********Page Variables*********
    String baseURL = "https://www.nhs.uk/pages/home.aspx";

    //*********Constructor*********
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver);
    }


    //*********Page Methods*********

    //Go to Homepage
    @Step("Open NHS Home Page ")
    public void goToNHS() {
        driver.get(baseURL);

        //driver.navigate().to(baseURL)
    }

    //Go to LoginPage
    @Step("Go to Login Page Step...")
    public void goToLoginPage() {
        click(By.xpath(signInButtonXpath));
    }

}
