package steps;



import org.testng.Assert;

//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Actions.LoginPageActions;

public class LoginMultiple {
TestSetup ts=new TestSetup();
	
	LoginPageActions la=new LoginPageActions(TestSetup.getDriver());
	@Given("^Iam on the loginpage of linkedInn$")
	public void iam_on_the_loginpage_of_linkedInn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestSetup.openUrl("https://www.linkedin.com/");
		Assert.assertTrue(la.verifySignInPageTitle(), "Login Page title mismatch");
	}

	@When("^user tries to enter the username into username fieldd \"([^\"]*)\"$")
	public void user_tries_to_enter_the_username_into_username_fieldd(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    la.enterUserName(arg1);
	    System.out.println("username: "+arg1);
	}

	@When("^user enters the password for the password fieldd \"([^\"]*)\"$")
	public void user_enters_the_password_for_the_password_fieldd(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    la.enterPassword(arg1);
	    System.out.println("password :"+arg1);
	}

	@When("^user clicks on the sigin buttonn$")
	public void user_clicks_on_the_sigin_buttonn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    la.clickOnSignIn();
	}

	@Then("^user signed into the LinkedIN application succesfullyy$")
	public void user_signed_into_the_LinkedIN_application_succesfullyy() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
  la.waitfor();
	}

}
