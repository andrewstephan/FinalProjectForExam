package ro.mediagalaxy.tests;

import org.testng.annotations.Test;
import ro.mediagalaxy.pages.LoginPage;

import static ro.mediagalaxy.pages.LoginPage.LOGIN_URL;

public class LoginTest extends MainTest{

    @Test

    public void loginTest(){
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickUserButton();
        loginPage.enterEmail("xtestfortech@gmail.com");
        loginPage.enterPassword("Passfortest");
        loginPage.clickAuthButton();

    }
}
