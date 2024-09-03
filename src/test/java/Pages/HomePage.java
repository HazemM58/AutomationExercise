package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//*[@id='header']//a[contains(text(), 'Home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//*[@id='header']//a[contains(text(), 'Products')]")
    private WebElement productsLink;

    @FindBy(xpath = "//*[@id='header']//a[contains(text(), 'Cart')]")
    private WebElement cartLink;

    @FindBy(xpath = "//*[@id='header']//a[contains(text(), 'Signup / Login')]")
    private WebElement signUpLoginLink;

    @FindBy(xpath = "//*[@id='header']//a[contains(text(), 'Test Cases')]")
    private WebElement testCasesLink;

    @FindBy(xpath = "//*[@id='header']//a[contains(text(), 'Contact us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//*[@id='header']//a[contains(text(), 'Logout')]")
    private WebElement logoutLink;

    @FindBy(xpath = "//*[@id='header']//a[contains(text(), 'Delete Account')]")
    private WebElement deleteAccountLink;

    // Methods
    public void navigateToHome() {
        homeLink.click();
    }

    public void navigateToProducts() {
        productsLink.click();
    }

    public void navigateToCart() {
        cartLink.click();
    }

    public void navigateToSignUpLogin() {
        signUpLoginLink.click();
    }

    public void navigateToTestCases() {
        testCasesLink.click();
    }

    public void navigateToContactUs() {
        contactUsLink.click();
    }

    public void logout() {
        logoutLink.click();
    }

    public void deleteAccount() {
        deleteAccountLink.click();
    }
}
