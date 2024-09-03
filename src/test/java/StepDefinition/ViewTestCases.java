package StepDefinition;

import Pages.TestCasesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static StepDefinition.BaseStepDefinition.driver;

public class ViewTestCases {


    @Given("the user is on the Home page")
    public void navigateToHomePage() {
        driver.navigate().to("https://automationexercise.com");
    }

    @When("the user clicks on the \"Test Cases\" button")
    public void clickOnTestCasesButton() {
        TestCasesPage.clickTestCasesButton();
    }

    @Then("the user should be navigated to the Test Cases page")
    public void verifyNavigationToTestCasesPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("test_cases"));
    }

    @Then("the user should see the list of all test cases")
    public void verifyTestCasesListVisible() {
        Assert.assertTrue(TestCasesPage.isTestCasesListVisible());
    }

    @Given("the user is on the Test Cases page")
    public void navigateToTestCasesPage() {
        driver.navigate().to("https://automationexercise.com/test_cases");
    }

    @Then("the title of the page should be \"Test Cases\"")
    public void verifyPageTitle() {
        String title = TestCasesPage.getPageTitle();
        Assert.assertEquals(" TEST CASES", title);
    }
}
