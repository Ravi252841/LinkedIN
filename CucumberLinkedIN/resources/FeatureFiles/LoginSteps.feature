@Smoke
Feature: User logs into the linkedIn Application 
Background: 
	Given Iam on the loginpage of linkedIn
	
Scenario: Validate user login sucessfully 

	Given Iam on the loginpage of linkedIn 
	When user tries to enter the username into username field 
		|username     |
		|araviteja222@gmail.com|
	And user enters the password for the password field 
		|password    |
		|Python@247|
		
	And user clicks on the sigin button 
	Then user signed into the LinkedIN application succesfully
	
Scenario: Validate invaliduser login sucessfully
 
  When user tries to enter the invalid username into username field 
		|username     |
		|aravitja222@gmail.com|
And user enters the invalid password for the password field 
		|password    |
		|Python@247|
And user clicks on the sigin button 
	Then user signed into the LinkedIN application succesfully