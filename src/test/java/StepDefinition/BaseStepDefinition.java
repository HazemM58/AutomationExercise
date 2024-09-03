package StepDefinition;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseStepDefinition {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static LoginPage LoginPage;
    public static ProductsPage ProductsPage;
    public static ContactUsPage ContactUsPage;
    public static CartPage CartPage;
    public static RegistrationPage RegistrationPage;
    public static TestCasesPage TestCasesPage;
    public static PaymentPage PaymentPage;


    @Before
    public void setup() {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        LoginPage = new LoginPage(driver);
        ProductsPage = new ProductsPage(driver);
        ContactUsPage = new ContactUsPage(driver);
        CartPage = new CartPage(driver);
        RegistrationPage = new RegistrationPage(driver);
        TestCasesPage = new TestCasesPage (driver);
        PaymentPage = new PaymentPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
