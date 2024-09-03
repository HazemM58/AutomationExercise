package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage {
    private final WebDriver driver;

    // WebDriver driver;

    // Constructor
    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    private static WebElement testCasesButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div[1]/div/h2/b")
    private static WebElement pageTitle;

    @FindBy(xpath = "//div[@class='col-sm-9 col-sm-offset-1']")
    private static WebElement testCasesList;

    // Methods
    public static void clickTestCasesButton() {
        testCasesButton.click();
    }

    public static String getPageTitle() {
        return pageTitle.getText();
    }

    public static boolean isTestCasesListVisible() {
        return testCasesList.isDisplayed();
    }
}
