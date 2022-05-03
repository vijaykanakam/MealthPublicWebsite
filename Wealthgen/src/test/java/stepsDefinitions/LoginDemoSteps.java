package stepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {

		WebDriver driver=null;

	@Given("Browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDri\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		
		
	}

	@And("User is on  login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
	
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password)  {
		
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	

	}
	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	
			driver.findElement(By.id("login")).click();

			Thread.sleep(2000);
			
			
	}
			
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
		driver.findElement(By.id("logout")).isEnabled();
		driver.close();
		driver.quit();
	}










}
