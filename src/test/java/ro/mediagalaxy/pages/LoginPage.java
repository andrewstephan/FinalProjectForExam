package ro.mediagalaxy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MainPage{

    public static final String LOGIN_URL = BASE_URL;

    public LoginPage(WebDriver driver){super(driver);}

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[1]/div/div/div[2]/div[2]/a/span[1]") private WebElement userButton; //button to open login page
    @FindBy(name = "email") private WebElement usernameInput; //enter email for login
    @FindBy(name = "password") private WebElement passwordInput; //enter password for login
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/form/div[3]/button/span/span") private WebElement authButton; //button for auth

    public void clickUserButton(){userButton.click();}
    public void enterEmail(String email){usernameInput.sendKeys(email);}
    public void enterPassword(String password){passwordInput.sendKeys(password);}
    public void clickAuthButton(){authButton.click();}


}
