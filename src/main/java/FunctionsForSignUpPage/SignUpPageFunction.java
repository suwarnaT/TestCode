package FunctionsForSignUpPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpPageFunction 
{
	
	WebDriver driver;
	String expectedErrorMessage="This is a required field.";
	String expctedErrorMessageForEmailValidation="Please enter a valid email address (Ex: johndoe@domain.com).";
	String expectedErrorMessageForMismatchedPassword="Please enter the same value again.";
	String expectedErrorMessageForExixtingEmail="There is already an account with this email address. If you are sure that it is your email address, ";
	
	
	@FindBy (xpath="//*[@id='search']//preceding::a[3]")
	WebElement homePage_createaAccountButton;
	
	@FindBy (xpath="//input[@id='firstname']")
	WebElement firstName;
	
	@FindBy (xpath="//input[@id='lastname']")
	WebElement lastName;
	
	@FindBy (id="email_address")
	WebElement emailId;
	
	@FindBy (xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy (xpath="//input[@id='password-confirmation']")
	WebElement confirmPassword;
	
	@FindBy (xpath="//button[@class='action submit primary']")
	WebElement signUpPage_CreateAnAccountButton;
	
	@FindBy (xpath="//*[@id='search']//preceding::li[6]")
	WebElement createdUserName;
	
	@FindBy (xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement logoutButton;
	
	@FindBy (xpath="//*[@id='search']//preceding::a[4]")
	WebElement HomePage_SignInButton;
	
	@FindBy (xpath="//input[@id='email_address']")
	WebElement signIn_EmailId;
	
	
	@FindBy (xpath="//input[@id='email']//following::input[1]")
	WebElement signIn_password;
	
	@FindBy (xpath="//input[@id='email']//following::button[1]")
	WebElement signInButton;
	
	@FindBy (xpath="//div[@id='firstname-error']")
	WebElement errorMessageForFirstName;
	
	
	@FindBy (xpath="//div[@id='lastname-error']")
	WebElement errorMessageForLastName;
	
	@FindBy (xpath="//div[@id='email_address-error']")
	WebElement errorMessageForEmailAddress;
	
	@FindBy (xpath="//div[@id='password-error']")
	WebElement errorMessageForPassword;
	
	@FindBy (xpath="//div[@id='password-confirmation-error']")
	WebElement errorMessageForPasswordConfirmation;
	
	@FindBy (xpath="//*[@class='message-error error message']")
	WebElement errorMesssageForDuplicateEmail;

	public SignUpPageFunction(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickOnCreateAAcoountButton_HomePage()
	{
		homePage_createaAccountButton.click();
	}
	
	public void enterFirstName(String firstName)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		this.firstName.sendKeys(firstName);
	}
	
	public void enterLasttName(String lastName)
	{
	  this.lastName.sendKeys(lastName);
	}
	
	public void enterEmailId(String emailId)
	{
		this.emailId.sendKeys(emailId);
	}
	
	public void enterPassword(String password)
	{
		this.password.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword)
	{
		this.confirmPassword.sendKeys(confirmPassword);
	
	}
	
	public void clickOnCreateAAcoountButton_SignUpPage()
	{
		signUpPage_CreateAnAccountButton.click();
	}
	
	public void verifyCreatedUserNameWithgreeting()
	{
	  Assert.assertEquals(createdUserName.getText(), "Welcome, "+firstName.getText()+" "+lastName.getText());
	//Welcome, Test02 Test03!
	}

	public void verifyErrorMessageForFirstName()
	{
	 Assert.assertEquals(errorMessageForFirstName.getText(), expectedErrorMessage);

	}
	
	public void verifyErrorMessageForLastName()
	{
	 Assert.assertEquals(errorMessageForLastName.getText(), expectedErrorMessage);

	}
	
	public void verifyErrorMessageForEmailAddress()
	{
	 Assert.assertEquals(errorMessageForEmailAddress.getText(), expectedErrorMessage);

	}
	
	public void verifyErrorMessageForPassword()
	{
	 Assert.assertEquals(errorMessageForPassword.getText(), expectedErrorMessage);

	}
	
	public void verifyErrorMessageForConfirmPassword()
	{
	 Assert.assertEquals(errorMessageForPasswordConfirmation.getText(), expectedErrorMessage);

	}
	
	public void verifyErrorMessageForEmailValidation()
	{
	 Assert.assertEquals(errorMessageForEmailAddress.getText(), expctedErrorMessageForEmailValidation);

	}
	
	public void verifyErrorMessageForPasswordMismatched()
	{
	 Assert.assertEquals(errorMessageForPasswordConfirmation.getText(), expectedErrorMessageForMismatchedPassword);

	}
	
	public void verifyErrorMessageForExistingEmail()
	{
	 Assert.assertEquals(errorMesssageForDuplicateEmail.getText(), expectedErrorMessageForExixtingEmail);

	}
	
	public void verifySuccessfullyAccoutLogin()
	{
		Assert.assertEquals(createdUserName.getText(), "Welcome, "+firstName.getText()+" "+lastName.getText());

	}
	
	public void clickOnSigninbuttonandLoginwithvalidCredentials(String username,String password)
	{
	
		HomePage_SignInButton.click();
		signIn_EmailId.sendKeys(username);
		signIn_password.sendKeys(password);
	}
	
	public void clickOnSIgnInButton_signinPage()
	{
		signInButton.click();
	}

}
