package com.actitime.qa.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.actitime.qa.base.TestBase;

public class AddUserPage extends TestBase {
	Logger log = Logger.getLogger(AddUserPage.class);

	@FindBy(xpath = "//*[@id=\"createUserPanel_firstNameField\"]")
	WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"createUserPanel_lastNameField\"]")
	WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"createUserPanel_emailField\"]")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"createUserPanel\"]/div[3]/div/div[3]/div[1]")
    WebElement createUserButton;
//	@FindBy(xpath = "//div[class()='components_button submitBtn']")
//      WebElement createUserButton;
	
	public AddUserPage() {
		PageFactory.initElements(driver, this);
	}

	public void createUser(String fName, String lName, String emailAddress) { 
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		email.sendKeys(emailAddress);
		createUserButton.click();
		
	}
}
