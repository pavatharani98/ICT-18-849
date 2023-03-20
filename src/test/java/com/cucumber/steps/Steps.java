package com.cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;
public class Steps {
	
	private WebDriver driver;
	
	@Given("I am in the Login  page of the Acttime application")
	public void i_am_in_the_Login_page_of_the_Acttime_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\cucumber-Actitime\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	} 

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("I should br taken the Home Page")
	public void i_should_br_taken_the_Home_Page() throws Exception {
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Users")).click();
		
	}
	@Then("i should be taken the userlist page")
	public void i_should_be_taken_the_userlist_page() throws Exception{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
	}
	
	
	
	@Then("user enters contact details {string} and {string} and {string}")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String email) throws Exception{
		Thread.sleep(15000);
		 driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys(firstname);
		 driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys(lastname);
		 driver.findElement(By.id("createUserPanel_emailField")).sendKeys(email);
		 driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[3]/div/div[3]/div[1]")).click();
	}
	
	@Then("view user creation succesfully message after click close")
	public void view_user_creation_succesfully_message_after_click_close() throws Exception {
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[2]/div[1]/div[5]/span")).click();
	}
	@Then("Close the browser")
	public void close_the_browser() throws Exception{
		Thread.sleep(3000);
		driver.quit();
	}

	
	
	
	
}
