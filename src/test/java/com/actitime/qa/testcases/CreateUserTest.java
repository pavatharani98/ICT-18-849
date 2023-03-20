package com.actitime.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateUserTest {
	private WebDriver driver;

    @Given("I am logged in as an admin user")
    public void loginAsAdminUser() {
        // Code to log in as an admin user
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("admin");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Given("I am on the Users page")
    public void navigateToUsersPage() {
        // Code to navigate to the Users page
        WebElement usersLink = driver.findElement(By.linkText("Users"));
        usersLink.click();
    }

    @When("I click on New User")
    public void clickNewUserButton() {
        // Code to click on the New User button
        WebElement newUserButton = driver.findElement(By.id("new-user-button"));
        newUserButton.click();
    }

    @When("I fill in the mandatory fields with valid data")
    public void fillMandatoryFieldsWithValidData() {
        // Code to fill in the mandatory fields with valid data
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        firstNameField.sendKeys("John");
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys("Doe");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("johndoe@example.com");
    }

    @When("I fill in the mandatory fields with invalid data")
    public void fillMandatoryFieldsWithInvalidData() {
        // Code to fill in the mandatory fields with invalid data
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        firstNameField.sendKeys("");
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys("");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("invalid-email");
    }

    @When("I click on Create User")
    public void clickCreateUserButton() {
        // Code to click on the Create User button
        WebElement createUserButton = driver.findElement(By.id("create-user-button"));
        createUserButton.click();
    }

    @Then("I should see a success message")
    public void checkSuccessMessage() {
        // Code to check that a success message is displayed
        WebElement successMessage = driver.findElement(By.id("success-message"));
        assert(successMessage.isDisplayed());
    }

    @Then("the new user should be created")
    public void checkNewUserIsCreated() {
        // Code to check that the new user is created
        WebElement newUser = driver.findElement(By.xpath("//table[@id='users-table']//td[text()='John Doe']"));
        assert(newUser.isDisplayed());
    }

    @Then("I should see an error message")
    public void checkErrorMessage() {
        // Code to check that an error message is displayed
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        assert(errorMessage.isDisplayed());
    }
}
