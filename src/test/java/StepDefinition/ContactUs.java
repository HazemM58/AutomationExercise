package StepDefinition;

import Pages.ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static StepDefinition.BaseStepDefinition.driver;

public class ContactUs {


    @Given("the user is on the Contact Us page")
    public void contactUsPage() {
        driver.navigate().to("https://automationexercise.com/contact_us");
    }

    @When("the user enters valid name, email, subject, and message")
    public void enterDetails() {
        ContactUsPage.enterName("John Doe");
        ContactUsPage.enterEmail("johndoe@example.com");
        ContactUsPage.enterSubject("Inquiry");
        ContactUsPage.enterMessage("I have an inquiry regarding your services.");
    }

    @And("the user uploads a file")
    public void uploadFile() {
        ContactUsPage.uploadFile("path/to/your/file.txt");
    }

    @And("the user clicks on the Submit button")
    public void clickSubmit() throws InterruptedException {
        ContactUsPage.clickSubmitButton();
        Thread.sleep(800);
        driver.switchTo().alert().accept();
    }

    @Then("the user should see a success message")
    public void verifySuccessMessage() {
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='form-section']/div[1]/div/div/h4")));
        String successMessage = ContactUsPage.getSuccessMessage();
       // Assert.assertEquals("Success! Your details have been submitted successfully.", successMessage);
        Assert.assertTrue(successMessage.contains("Success! Your details have been submitted successfully."));
    }

    @And("the user should be able to navigate back to the home page")
    public void navigateToHomePage() {
        ContactUsPage.clickHomeButton();

    }
}
