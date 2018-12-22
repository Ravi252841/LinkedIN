package page.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPageActions {
	
	private WebDriver driver;
	private By headerPageText = By.xpath("//form[@id='regForm']//h2");
//	private By createAccountLink = By.linkText("Salary");
	private By emailTextBox = By.id("login-email");
	private By passwordTextBox = By.id("login-password");
	private By loginBtn = By.id("login-submit");
	private By errorMsgTxt = By.xpath("//div[@class='form__input--floating']//div[@error-for='password']");
//	private By homepage=By.linkText("Go to LinkedIn");	
	public LoginPageActions(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName(String userName) {
		WebElement emailTxtBox = driver.findElement(emailTextBox);
		if(emailTxtBox.isDisplayed())
			emailTxtBox.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		WebElement passwordTxtBox = driver.findElement(passwordTextBox);
		if(passwordTxtBox.isDisplayed())
			passwordTxtBox.sendKeys(password);
	}
	public void clickOnSignIn() {
		WebElement signInBtn = driver.findElement(loginBtn);
		if(signInBtn.isDisplayed())
			signInBtn.click();
	}
	public String getErrorMessage() {
		String strErrorMsg = null;
		WebElement errorMsg = driver.findElement(errorMsgTxt);
		if(errorMsg.isDisplayed()&&errorMsg.isEnabled())
			strErrorMsg = errorMsg.getText();
		
		return strErrorMsg;
	}
	public String getSignInPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public boolean verifySignInPageTitle() {
		String expectedTitle = "LinkedIn: Log In or Sign Up";
		return getSignInPageTitle().contains(expectedTitle);
	}
	
	public boolean verifySignInPageText() {
		WebElement element = driver.findElement(headerPageText);
		String pageText = element.getText();
		String expectedPageText = "Be great at what you do";
		
		return pageText.contains(expectedPageText);
	}
	
	public void waitfor(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		public boolean verifySignIn() {
			enterUserName("araviteja222@gmail.com");
			enterPassword("pass");
			clickOnSignIn();
			return getErrorMessage().contains("not");
		}
		

	

}
