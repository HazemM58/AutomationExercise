package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    private final WebDriver driver;

    // WebDriver driver;

    // Constructor
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    private static WebElement cartLink;

    @FindBy(xpath = "//*[@id='do_action']/div[1]/div/div/a")
    private static WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[@id='cart_items']/div/div[7]/a")
    private static WebElement placeOrderButton;

    @FindBy(xpath = "//*[@id='payment-form']/div[1]/div/input")
    private static WebElement nameOnCardField;

    @FindBy(xpath = "//*[@id='payment-form']/div[2]/div/input")
    private static WebElement cardNumberField;

    @FindBy(xpath = "//*[@id='payment-form']/div[3]/div[1]/input")
    private static WebElement cvcField;

    @FindBy(xpath = "//*[@id='payment-form']/div[3]/div[2]/input")
    private static WebElement expiryMonthField;

    @FindBy(xpath = "//*[@id='payment-form']/div[3]/div[3]/input")
    private static WebElement expiryYearField;

    @FindBy(id = "submit")
    private static WebElement placeOrderButtonSubmit;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/a")
    private static WebElement downloadInvoiceButton;

    // Methods
    public static void goToCart() {
        cartLink.click();
    }

    public static void proceedToCheckout() {
        proceedToCheckoutButton.click();
    }

    public static void placeOrder() {
        placeOrderButton.click();
    }

    public static void enterPaymentInformation(String name, String cardNumber, String cvc, String expiryMonth, String expiryYear) {
        nameOnCardField.sendKeys(name);
        cardNumberField.sendKeys(cardNumber);
        cvcField.sendKeys(cvc);
        expiryMonthField.sendKeys(expiryMonth);
        expiryYearField.sendKeys(expiryYear);
    }

    public static void submitOrder() {
        placeOrderButtonSubmit.click();
    }

    public static void downloadInvoice() {
        downloadInvoiceButton.click();
    }
}
