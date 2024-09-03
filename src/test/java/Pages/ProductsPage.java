package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private final WebDriver driver;


    // Constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    private static WebElement productsPageTitle;

    @FindBy(xpath = "//input[@id='search_product']")
    private static WebElement searchInput;

    @FindBy(xpath = "//button[@id='submit_search']")
    private static WebElement searchButton;

    @FindBy(xpath = "//div[@class='features_items']")
    private static WebElement productsList;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    private static WebElement searchedProducts;

    // Methods
    public static String getProductsPageTitle() {
        return productsPageTitle.getText();
    }

    public static void enterSearchQuery(String productName) {
        searchInput.sendKeys(productName);
    }

    public static void clickSearchButton() {
        searchButton.click();
    }

    public static boolean isProductsListVisible() {
        return productsList.isDisplayed();
    }

    public static boolean isSearchedProductsVisible() {
        return searchedProducts.isDisplayed();
    }
}
