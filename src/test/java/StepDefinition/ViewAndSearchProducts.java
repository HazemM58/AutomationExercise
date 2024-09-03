package StepDefinition;

import Pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static StepDefinition.BaseStepDefinition.driver;

public class ViewAndSearchProducts {



    @Given("the user is on the Products page")
    public void navigateToProductsPage() {
        driver.navigate().to("https://automationexercise.com/products");
        String title = ProductsPage.getProductsPageTitle();
        Assert.assertEquals("ALL PRODUCTS", title);
    }

    @Then("the user should see the list of all products")
    public void verifyAllProductsVisible() {
        Assert.assertTrue(ProductsPage.isProductsListVisible());
    }

    @When("the user enters a product name in the search input")
    public void enterProductNameInSearch() {
        ProductsPage.enterSearchQuery("T-shirt");
    }

    @And("the user clicks on the search button")
    public void clickSearchButton() {
        ProductsPage.clickSearchButton();
    }

    @Then("the user should see the searched products")
    public void verifySearchedProducts() {
        Assert.assertTrue(ProductsPage.isSearchedProductsVisible());
    }
}
