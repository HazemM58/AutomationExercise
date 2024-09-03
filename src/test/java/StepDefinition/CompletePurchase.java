package StepDefinition;

import Pages.CartPage;
import Pages.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static StepDefinition.BaseStepDefinition.driver;
import static StepDefinition.BaseStepDefinition.wait;

public class CompletePurchase {


    @Given("the user has items in their shopping cart")
    public void shoppingCart() throws InterruptedException {
        driver.navigate().to("https://automationexercise.com");
        PaymentPage.goToCart();
        Thread.sleep(200);

    }

    @And("Confirmation message appears")
    public void confirmationMessage(){
        CartPage.ViewCart();
    }

    @When("the user proceeds to checkout")
    public void checkout() {
        PaymentPage.proceedToCheckout();
    }

    @And("the user proceeds to Place Order")
    public void placeOrder() {
        PaymentPage.placeOrder();
    }

    @And("the user enters valid payment and shipping information")
    public void paymentInformation() {
        PaymentPage.enterPaymentInformation("Hazem Mohamed", "156273849571098", "345", "02", "26");
    }

    @And("the user clicks on the \"Place Order\" button")
    public void orderButton() {
        PaymentPage.submitOrder();
    }

    @Then("the user should see an order confirmation page")
    public void confirmationPage() {
        wait.until(ExpectedConditions.urlContains("payment_done"));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("payment_done"));
    }

    @And("the user downloads the invoice")
    public void downloadInvoice() {
        PaymentPage.downloadInvoice();
        // Additional code can be added here to verify the download if needed
    }
}
