package com.actitime.qa.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

public class UsersPage extends TestBase  {
	Logger log = Logger.getLogger(UsersPage.class);
	@FindBy(xpath = "//div[text()='New User']")
	WebElement newUserButton;

	
	public UsersPage() {
		PageFactory.initElements(driver, this);	
	}
	
	 public AddUserPage clickOnAddusersLink() {
		 newUserButton.click();
  	   return new AddUserPage();
     }

	

	
	 
	

	
}
