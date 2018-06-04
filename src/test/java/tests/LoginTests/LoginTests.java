package tests.LoginTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.lang.reflect.Method;


public class LoginTests extends BaseTest {

    //Test Data
    String wrongUsername = "onur@swtestacademy.com";
    String wrongPassword = "11122233444";

    @Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
    public void invalidLoginTest_InvalidUserNameInvalidPassword(Method method) {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        //*************PAGE METHODS********************
        //Open NHS HomePage
        homePage.goToNHS();

        //Go to LoginPage
        homePage.goToLoginPage();

        //Login to NHS
        loginPage.logIntoNhs(wrongUsername, wrongPassword);

        //*************ASSERTIONS***********************
        loginPage.verifyLoginPassword(("We're sorry, the username and password does not match. Please try again."));
    }

    @Test(priority = 1, description = "Invalid Login Scenario with empty username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword() {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        //*************PAGE METHODS********************
        homePage.goToNHS();
        homePage.goToLoginPage();
        loginPage.logIntoNhs("", "");

        //*************ASSERTIONS***********************
        loginPage.verifyLoginUserName("User Name is required.");
        loginPage.verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");
    }

}
