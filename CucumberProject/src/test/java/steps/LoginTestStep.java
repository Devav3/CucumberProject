package steps;

import static org.junit.Assert.fail;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStep {
	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {

		System.out.println("inside login method");
	

	}

	@When("user enters credentials\\(username:{string},password:{string})")
	public void user_enters_credentials_username_password(String userName, String Password) {
		System.out.println("Logging in with user name : "+userName+" Password: "+Password);


 
	}

	@Then("user navigates to account home page")
	public void user_navigates_to_account_home_page() {
		  System.out.println("logged in to accout page");

	}

	@And("user sees welcome message")
	public void user_sees_welcome_message() {
		  System.out.println("verified welcome message");

   
	}
	
	
}
