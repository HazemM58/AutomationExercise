package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
    WebDriver driver ;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
    static WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
    static WebElement passwordField;


    public static void enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public static void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public static void clickLoginButton() {
        passwordField.sendKeys(Keys.ENTER);
    }

    public static void LoginSteps(String username, String password) {
        enterUsername(username);
        enterPassword(password);
    }
}
