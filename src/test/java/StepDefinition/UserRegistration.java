package StepDefinition;

import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static StepDefinition.BaseStepDefinition.driver;
import static StepDefinition.BaseStepDefinition.wait;

public class UserRegistration {



    @Given("the user is on the registration page")
    public void registrationPage() {
        driver.navigate().to("https://automationexercise.com/login");
    }

    @When("the user enters a valid username, password, email, and other required details")
    public void requiredDetails() {
        RegistrationPage.enterUsername("Hazem Mohamed");
        RegistrationPage.enterEmail("Hazem-Mohamed@ry.one");
        RegistrationPage.clickSignupButton();
        RegistrationPage.selectGenderMale();
        RegistrationPage.enterPassword("tomsmith");
        RegistrationPage.selectDateOfBirth("12", "August", "1997");
        RegistrationPage.enterFirstName("Hazem");
        RegistrationPage.enterLastName("Mohamed");
        RegistrationPage.enterCompany("PEWPEW");
        RegistrationPage.enterAddress("afad");
        RegistrationPage.enterState("dssdsf");
        RegistrationPage.enterCity("alex");
        RegistrationPage.enterZipcode("48541");
        RegistrationPage.enterMobileNumber("01115546970");
    }

    @And("the user clicks on the register button")
    public void registerButton() {
        RegistrationPage.clickRegisterButton();
    }

    @Then("the user should receive a confirmation email")
    public void confirmationEmail() {
        // Implement code to verify confirmation email, possibly involving an email service API or UI verification.
    }

    @And("the user should be redirected to the login page")
    public void login_page() {
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/account_created"));
        Assert.assertEquals("https://automationexercise.com/account_created", driver.getCurrentUrl());
    }
}
