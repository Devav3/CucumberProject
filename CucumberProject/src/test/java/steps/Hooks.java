package steps;


import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@io.cucumber.java.After
	public void afterMethods(Scenario scenario) {

		System.out.println("After method executed after every test are executed");
	}

	@Before
	public void beforeMethods(Scenario scenario) {
		System.out.println("Before method executed before  test are executed");

	}

	@AfterStep
	public void afterSteps(Scenario scenario) {
		System.out.println("After step executed after each test are executed");
		System.out.println("scenario:"+scenario.getName());

	}
	
	
}
