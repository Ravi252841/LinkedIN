package steps;

import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

//import org.openqa.selenium.WebDriver;
//
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Actions.LoginPageActions;

public class LoginUserSteps   {
	
	TestSetup ts=new TestSetup();
	
	LoginPageActions la=new LoginPageActions(TestSetup.getDriver());
	@Test
	@Given("^Iam on the loginpage of linkedIn$")
	public void iam_on_the_loginpage_of_linkedIn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("driver in given :"+TestSetup.getDriver());
		System.out.println("we  are using the Given by Background");
		TestSetup.openUrl("https://www.linkedin.com/");
		Assert.assertTrue(la.verifySignInPageTitle(), "Login Page title mismatch");
		
	}
	@Test
	@When("^user tries to enter the username into username field$")
	public void user_tries_to_enter_the_username_into_username_field(List<String> category) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println("list value 1 of :"+category.get(1));
	    la.enterUserName(category.get(1));
	}
	@Test
	@When("^user enters the password for the password field$")
	public void user_enters_the_password_for_the_password_field(List<String> category) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println("list value 1 of :"+category.get(1));
	   la.enterPassword(category.get(1));
	}
	@Test
	@When("^user tries to enter the invalid username into username field$")
	public void user_tries_to_enter_the_invalid_username_into_username_field(List<String> item) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 System.out.println("list value 1 of :"+item.get(1));
		    la.enterUserName(item.get(1));
	}
	@Test
	@When("^user enters the invalid password for the password field$")
	public void user_enters_the_invalid_password_for_the_password_field(List<String> item) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("list value 1 of :"+item.get(1));
		   la.enterPassword(item.get(1));
	}

	@Test
	@When("^user clicks on the sigin button$")
	public void user_clicks_on_the_sigin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    la.clickOnSignIn();
	}
	@Test(priority=1)
	@Then("^user signed into the LinkedIN application succesfully$")
	public void user_signed_into_the_LinkedIN_application_succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("wea re in out");
	}

	
	

}
