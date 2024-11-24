package steps;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStep2 {

	@Given("user is on the login page1")
	public void user_is_on_the_login_page1() {
	
		System.out.println("inside login method 2");
	}
	
	
	@When("user enters credentials2")
	public void user_enters_credentials2_username_password(DataTable table) {
		Map<String, String> dtable= table.asMap(String.class,String.class);
		System.out.println("Test 2Logging in with user name ");
		System.out.println(dtable.get("firstName"));
		System.out.println(dtable.get("lastName"));
		System.out.println(dtable.get("address"));
	}

	@Then("user navigates to account home page2")
	public void user_navigates_to_account_home_page2() {
		 System.out.println("logged in to accout page test 2"); 
	}

	@And("user sees welcome message2")
	public void user_sees_welcome_message2() {
		  System.out.println("verified welcome message test 2");

	}
	
	@When("user enters credentials as {string} and password as {string}")
	public void user_enters_credentials_as_and_password_as(String uname, String pwd) {
	    System.out.println("Logging In withCredentisls "+uname +"and "+pwd);
	}


}
