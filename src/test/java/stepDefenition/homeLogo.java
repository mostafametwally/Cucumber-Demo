package stepDefenition;

import org.junit.Assert;

//import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import org.testng.Assert;
import io.cucumber.java.en.When;

public class homeLogo {
	
	WebDriver driver;
	String cdriverPath="D:\\programs\\chromedriver.exe";
	String GoogleURL="https://www.google.com";
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver","D:\\programs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Given("navigate to url")
	public void navigate_to_google_com(String x) {
	driver.navigate().to(x);
	}


	@When("I complete action")
	public void i_complete_action() throws InterruptedException {
	driver.navigate().to("https://www.facebook.com");
		

	}

	@Then("I validate the outcome")
	public void i_validate_the_outcomes() { 
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		
	}
	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	
}
