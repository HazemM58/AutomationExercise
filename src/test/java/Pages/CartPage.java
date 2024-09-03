package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private final WebDriver driver;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    
    @FindBy(xpath = "//*[@id='cartModal']/div/div/div[3]/button")
    private WebElement cartModalCloseButton;
    
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a/i")
    private WebElement productsLink;

    @FindBy(xpath = "//a[contains(text(), 'Add to cart')]")
    private static WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[1]")
    private static WebElement cartModalTitle;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    private static WebElement ContinueShoppingButton;


    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")
    private static WebElement ViewCartButton;

    @FindBy(id = "cartItemCount")
    private static WebElement cartItemCount;

    // Methods
    public void goToProductsPage() {
        productsLink.click();
    }

    public static void addProductToCart() {
        addToCartButton.click();
    }
    public static void ViewCart() {
        ViewCartButton.click();
    }

    public static String getCartModalTitle() {
        return cartModalTitle.getText();
    }

    public static void closeCartModal() throws InterruptedException {
        Thread.sleep(1000);
        ViewCartButton.click();
    }

    public static String getCartItemCount() {
        return cartItemCount.getText();
    }
}
