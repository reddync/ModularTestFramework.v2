package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {

    //*********Web Elements*********
    String ueserNameXpath = "//input[@value='Enter email address']";
    String passwordId = "//input[@type='password']";
    String loginbuttonXpath = "//input[@value='Log in']";
    String errorMessageUsernameXpath = "//p[contains(@class,'error')]";
    String errorMessagePasswordXpath = "//p[contains(@class,'error')]";
    //*********Constructor*********
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver);
    }

    //*********Page Methods*********
    @Step("Login Step with username: {0}, password: {1}, for method: {method} step...")
    public void logIntoNhs(String username, String password) {
        //Enter Username(Email)
        writeText(By.xpath(ueserNameXpath), username);
        //Enter Password
        writeText(By.xpath(passwordId), password);
        //Click Login Button
        click(By.xpath(loginbuttonXpath));

    }

    //Verify Username Condition
    @Step("Verify username: {0} step...")
    public void verifyLoginUserName (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
    }

    //Verify Password Condition
    @Step("Verify verifyLoginPassword: {0} step...")
    public void verifyLoginPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
    }

}
