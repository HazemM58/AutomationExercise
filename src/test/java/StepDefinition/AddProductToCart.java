package StepDefinition;
import Pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static StepDefinition.BaseStepDefinition.driver;
import static StepDefinition.BaseStepDefinition.wait;

public class AddProductToCart {



    @Given("the user is logged in and on a product page")
    public void productPage() {
       driver.navigate().to("https://automationexercise.com/products");
        // Assuming login is required, add the login steps here if needed
    }

    @Given("the user selects a product and clicks on the \"Add to Cart\" button")
    public void addToCartButton() throws InterruptedException {
        CartPage.addProductToCart();
    }

    @Then("the product should be added to the user's shopping cart")
    public void shoppingCart() throws InterruptedException {
        CartPage.closeCartModal();
    }

    @And("the cart icon should display the updated number of items")
    public void updatedNumber() {
        String cartItemCount = CartPage.getCartItemCount();
        Assert.assertEquals("1", cartItemCount); // Assuming 1 item was added
    }




}
