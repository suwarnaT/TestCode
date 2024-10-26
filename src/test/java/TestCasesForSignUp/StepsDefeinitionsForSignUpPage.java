package TestCasesForSignUp;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import FunctionsForSignUpPage.SignUpPageFunction;
import Utilities.BrowserLaunch;
import Utilities.SnipCapured;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefeinitionsForSignUpPage 
{
	WebDriver driver;
	SignUpPageFunction signUp=new SignUpPageFunction(driver);
	
	
	@Given("^The user should launch the browser and URL$")
	public void the_user_should_launch_the_browser_and_URL() throws Exception 
	{
		BrowserLaunch browserLaunch=new BrowserLaunch(driver);
		driver=browserLaunch.launchBrowser(driver,"https://magento.softwaretestingboard.com/");
		Thread.sleep(5000);
		SnipCapured.captiredScreenshot(driver, "ConmmonForAllTestCases", "BrowserLanuch");
	}
	
	@Given("^Click on Create An Account button on home page$")
	public void click_on_Create_An_Account_button_on_home_page() throws Exception 
	{
		//signUp=new SignUpPageFunction(driver);
				signUp.clickOnCreateAAcoountButton_HomePage();
				Thread.sleep(5000);
		SnipCapured.captiredScreenshot(driver, "ConmmonForAllTestCases", "NewCustomerAccountPage");		
	}

	@When("^Click on Create An Account button on signUp Page$")
	public void click_on_Create_An_Account_button_on_signUp_Page() throws Exception 
	{
	   signUp.clickOnCreateAAcoountButton_SignUpPage();
	   Thread.sleep(5000);
	  
	}

	@When("^The user Do not enter any input value in all mandatory fields mentioned fields$")
	public void the_user_Do_not_enter_any_input_value_in_all_mandatory_fields_mentioned_fields() throws Exception 
	{
		signUp.enterFirstName(" ");
		signUp.enterLasttName(" ");
		signUp.enterEmailId(" ");
		signUp.enterPassword(" ");
		signUp.enterConfirmPassword(" ");
		Thread.sleep(5000);
	   
	}

	@When("^The user enter the input value in all mandatory fields excluding Confirm password field\\.$")
	public void the_user_enter_the_input_value_in_all_mandatory_fields_excluding_Confirm_password_field() throws Exception 
	{
		signUp.enterFirstName("Test04");
		signUp.enterLasttName("Test05");
		signUp.enterEmailId("test04test05@gmail.com");
		signUp.enterPassword("Test@2024");
		signUp.enterConfirmPassword(" ");
		Thread.sleep(5000);
	}

	@When("^The user enter the input value in all mandatory fields excluding password field\\.$")
	public void the_user_enter_the_input_value_in_all_mandatory_fields_excluding_password_field() throws Exception 
	{
		signUp.enterFirstName("Test04");
		signUp.enterLasttName("Test05");
		signUp.enterEmailId("test04test05@gmail.com");
		signUp.enterPassword(" ");
		signUp.enterConfirmPassword("Test@2024");
		Thread.sleep(5000);
	    
	}

	@When("^The user enter the input value in all mandatory fields excluding email field\\.$")
	public void the_user_enter_the_input_value_in_all_mandatory_fields_excluding_email_field() throws Exception 
	{
		signUp.enterFirstName("Test04");
		signUp.enterLasttName("Test05");
		signUp.enterEmailId(" ");
		signUp.enterPassword("Test@2024");
		signUp.enterConfirmPassword("Test@2024");
		Thread.sleep(5000);
	    
	}

	@When("^The user enter the input value in all mandatory fields excluding first name field\\.$")
	public void the_user_enter_the_input_value_in_all_mandatory_fields_excluding_first_name_field() throws Exception 
	{
		signUp.enterFirstName(" ");
		signUp.enterLasttName("Test05");
		signUp.enterEmailId("test04test05@gmail.com");
		signUp.enterPassword("Test@2024");
		signUp.enterConfirmPassword("Test@2024");
		Thread.sleep(5000);
	}

	@When("^The user enter the input value in all mandatory fields excluding last name field\\.$")
	public void the_user_enter_the_input_value_in_all_mandatory_fields_excluding_last_name_field() throws Exception 
	{
		signUp.enterFirstName("Test04");
		signUp.enterLasttName(" ");
		signUp.enterEmailId("test04test05@gmail.com");
		signUp.enterPassword("Test@2024");
		signUp.enterConfirmPassword("Test@2024");
		Thread.sleep(5000);
	    
	}

	@When("^The user enter the input value in all mandatory fields and enter email id without having domain$")
	public void the_user_enter_the_input_value_in_all_mandatory_fields_and_enter_email_id_without_having_domain() throws Exception 
	{
		signUp.enterFirstName("Test04");
		signUp.enterLasttName("Test05");
		signUp.enterEmailId("test04test05");
		signUp.enterPassword("Test@2024");
		signUp.enterConfirmPassword("Test@2024");
		Thread.sleep(5000);
	}

	@When("^The user enter the input value in all mandatory fields along with Confirm Password mismatched$")
	public void the_user_enter_the_input_value_in_all_mandatory_fields_along_with_Confirm_Password_mismatched() throws Exception 
	{
		signUp.enterFirstName("Test04");
		signUp.enterLasttName("Test05");
		signUp.enterEmailId("test04test05@gmail.com");
		signUp.enterPassword("Test@2024");
		signUp.enterConfirmPassword("Test@202445");
		Thread.sleep(5000);
	}

	@When("^The user enter the input value in all mandatory fields along with already user email id$")
	public void the_user_enter_the_input_value_in_all_mandatory_fields_along_with_already_user_email_id() throws Exception 
	{
		signUp.enterFirstName("Test04");
		signUp.enterLasttName("Test05");
		signUp.enterEmailId("test01@gmail.com");
		signUp.enterPassword("Test@2024");
		signUp.enterConfirmPassword("Test@2024");
		Thread.sleep(5000);
	}

	@When("^The user enter the correct input value in all mandatory fields$")
	public void the_user_enter_the_correct_input_value_in_all_mandatory_fields() throws Exception 
	{
		signUp.enterFirstName("Test04");
		signUp.enterLasttName("Test05");
		signUp.enterEmailId("test04test05@gmail.com");
		signUp.enterPassword("Test@2024");
		signUp.enterConfirmPassword("Test@2024");
		Thread.sleep(5000);
	}

	@Then("^verify the system displayed the success message on top for new accout creation$")
	public void verify_the_system_displayed_the_success_message_on_top_for_new_accout_creation() throws Exception 
	{
	  
	}	
	
	@Then("^Verify the system displayed the error messages for all mandatory fields\\.$")
	public void verify_the_system_displayed_the_error_messages_for_all_mandatory_fields() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_01", "ErrorMesagesForAllManFields");
		signUp.verifyErrorMessageForFirstName();
		signUp.verifyErrorMessageForLastName();
		signUp.verifyErrorMessageForEmailAddress();
		signUp.verifyErrorMessageForPassword();
		signUp.verifyErrorMessageForConfirmPassword();
	    
	}

	@Then("^Verify the system displayed the error messages for Confirm password fields\\.$")
	public void verify_the_system_displayed_the_error_messages_for_Confirm_password_fields() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_02", "ErrorMesagesForConfirmPasswordField");
		signUp.verifyErrorMessageForConfirmPassword();
	    
	}

	@Then("^Verify the system displayed the error messages for password fields\\.\\.$")
	public void verify_the_system_displayed_the_error_messages_for_password_fields() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_03", "ErrorMesagesForPasswordField");
		signUp.verifyErrorMessageForPassword(); 
	}

	@Then("^Verify the system displayed the error messages for email fields\\.$")
	public void verify_the_system_displayed_the_error_messages_for_email_fields() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_04", "ErrorMesagesForEmailField");
		signUp.verifyErrorMessageForEmailAddress();
	}

	@Then("^Verify the system displayed the error messages for first name fields\\.\\.$")
	public void verify_the_system_displayed_the_error_messages_for_first_name_fields() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_05", "ErrorMesagesForFirstNameField");
		signUp.verifyErrorMessageForFirstName();
		
	}

	@Then("^Verify the system displayed the error messages for last name fields\\.$")
	public void verify_the_system_displayed_the_error_messages_for_last_name_fields() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_06", "ErrorMesagesForLastNameField");
		signUp.verifyErrorMessageForLastName();
	}

	@Then("^Verify the system displayed the error messages for email validation\\.$")
	public void verify_the_system_displayed_the_error_messages_for_email_validation() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_07", "ErrorMesagesForEmailValidation");
	    signUp.verifyErrorMessageForEmailValidation();
	}

	@Then("^Verify the system displayed the error messages for password validation\\.$")
	public void verify_the_system_displayed_the_error_messages_for_password_validation() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_08", "ErrorMesagesForPasswordValidation");
	    signUp.verifyErrorMessageForPasswordMismatched();
	}

	@Then("^Verify the system displayed the error messages for duplicate email id\\.$")
	public void verify_the_system_displayed_the_error_messages_for_duplicate_email_id() throws Exception 
	{
		SnipCapured.captiredScreenshot(driver, "TC_09", "ErrorMesagesForExistingEmailValidation");
	    signUp.verifyErrorMessageForExistingEmail();
	}
	
	@And ("^Click on sign in on home page and enter the username and password\\.$")
	public void Clickonsigninonhomepageandentertheusernameandpassword()
	{
		signUp.clickOnSigninbuttonandLoginwithvalidCredentials("test@0207@gmail.com","Test@2024");
	}

	@When ("^ click on signin button on sign in page\\.$")
	public void clickonsigninbuttononsigninpage()
	{
		signUp.clickOnSIgnInButton_signinPage();
	}
    
	@Then ("^verify user is loggned to account\\$")
	public void verifyuserisloggnedtoaccount() throws Exception
	{
		signUp.verifySuccessfullyAccoutLogin();
		SnipCapured.captiredScreenshot(driver, "TC_10", "AccountLoggedIn");
		
	}
    
	
}
