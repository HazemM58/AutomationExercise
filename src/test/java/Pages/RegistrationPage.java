package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    private final WebDriver driver;



    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // WebElements for registration form
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    private static WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    private static WebElement emailField;

    @FindBy(id = "id_gender1")
    private static WebElement genderMaleRadio;

    @FindBy(id = "password")
    private static WebElement passwordField;

    @FindBy(id = "days")
    private static WebElement dayDropdown;

    @FindBy(id = "months")
    private static WebElement monthDropdown;

    @FindBy(id = "years")
    private static WebElement yearDropdown;

    @FindBy(id = "first_name")
    private static WebElement firstNameField;

    @FindBy(id = "last_name")
    private static WebElement lastNameField;

    @FindBy(id = "company")
    private static WebElement companyField;

    @FindBy(id = "address1")
    private static WebElement addressField;

    @FindBy(id = "state")
    private static WebElement stateField;

    @FindBy(id = "city")
    private static WebElement cityField;

    @FindBy(id = "zipcode")
    private static WebElement zipcodeField;

    @FindBy(id = "mobile_number")
    private static WebElement mobileNumberField;

    @FindBy(xpath = "//*[@id='form']/div/div/div/div[1]/form/button")
    private static WebElement registerButton;

    @FindBy(xpath = " //*[@id=\"form\"]/div/div/div[3]/div/form/button")
    private static WebElement signupButton;

    // Methods to interact with the page
    public static void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public static void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public static void selectGenderMale() {
        genderMaleRadio.click();
    }

    public static void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public static void selectDateOfBirth(String day, String month, String year) {
        dayDropdown.sendKeys(day);
        monthDropdown.sendKeys(month);
        yearDropdown.sendKeys(year);
    }

    public static void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public static void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public static void enterCompany(String company) {
        companyField.sendKeys(company);
    }

    public static void enterAddress(String address) {
        addressField.sendKeys(address);
    }

    public static void enterState(String state) {
        stateField.sendKeys(state);
    }

    public static void enterCity(String city) {
        cityField.sendKeys(city);
    }

    public static void enterZipcode(String zipcode) {
        zipcodeField.sendKeys(zipcode);
    }

    public static void enterMobileNumber(String mobileNumber) {
        mobileNumberField.sendKeys(mobileNumber);
    }

    public static void clickRegisterButton() {
        registerButton.click();
    }

    public static void clickSignupButton() {
        signupButton.click();
    }

}
