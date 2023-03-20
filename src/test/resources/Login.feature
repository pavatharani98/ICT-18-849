Feature: Login Functionality

	In order to do Acitime Application
	As a valid admin
	I want to login Successfully
	
Scenario Outline:  Create a new contact scenario

Given I am in the Login  page of the Acttime application
When I enter valid credentials
Then I should br taken the Home Page
Then i should be taken the userlist page
Then user enters contact details "<firstname>" and "<lastname>" and "<email>"
Then view user creation succesfully message after click close 
Then Close the browser

Examples:
         | firstname        | lastname         | email                |
         | Pavatharany 	    | Sivasuntharam    | thaarani998@gmail.com|
