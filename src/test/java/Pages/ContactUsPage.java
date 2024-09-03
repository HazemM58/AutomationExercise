package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    private final WebDriver driver;

    // Constructor
    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//*[@id='contact-page']/div[2]/div[1]/div/h2")
    private WebElement getInTouchTitle;

    @FindBy(name = "name")
    private static WebElement nameInput;

    @FindBy(name = "email")
    private static WebElement emailInput;

    @FindBy(name = "subject")
    private static WebElement subjectInput;

    @FindBy(id = "message")
    private static WebElement messageTextarea;

    @FindBy(name = "upload_file")
    private static WebElement uploadFileInput;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[6]/input")
    private static WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")
    private static WebElement successMessage;

    @FindBy(css = "#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success")
    private static WebElement homeButton;

    // Methods
    public String getGetInTouchTitle() {
        return getInTouchTitle.getText();
    }

    public static void enterName(String name) {
        nameInput.sendKeys(name);
    }

    public static void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public static void enterSubject(String subject) {
        subjectInput.sendKeys(subject);
    }

    public static void enterMessage(String message) {
        messageTextarea.sendKeys(message);
    }

    public static void uploadFile(String filePath) {
        uploadFileInput.sendKeys(filePath);
    }

    public static void clickSubmitButton() {
        submitButton.click();

    }

    public static String getSuccessMessage() {
        return successMessage.getText();
    }

    public static void clickHomeButton() {
        homeButton.click();
    }
}
