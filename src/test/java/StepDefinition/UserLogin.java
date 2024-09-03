package StepDefinition;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static StepDefinition.BaseStepDefinition.driver;
import static StepDefinition.BaseStepDefinition.wait;

public class UserLogin {




    @Given("the user is on the login page")
    public void login() {
        driver.navigate().to("https://automationexercise.com/login");

    }

    @When("the user enters a valid username and password")
    public void entersValidUsername() {
        LoginPage.LoginSteps("HazemMohamed@mraxy.one", "tomsmith");
    }

    @And("the user clicks on the login button")
    public void loginButton() {
        LoginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the Home page")
    public void redirected() {
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/"));
        Assert.assertEquals("https://automationexercise.com/", driver.getCurrentUrl());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).isDisplayed());
    }


}
