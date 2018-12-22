@All
Feature: Running multiple tests

Scenario Outline: Login for multiple types of cases
Given Iam on the loginpage of linkedInn
When user tries to enter the username into username fieldd "<username>"
And user enters the password for the password fieldd "<password>"
And user clicks on the sigin buttonn
Then user signed into the LinkedIN application succesfullyy

Examples: 
|username              |password  |typeOfUser|
|araviteja222@gmail.com|Pthon@247|user|
|araviteja222@gmail.com|          |student| 
|                      |Python@247|Employee|
|araviteja222@gmail.com|Python@247|normal|



