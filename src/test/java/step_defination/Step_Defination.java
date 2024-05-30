package step_defination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_Defination {
	WebDriver driver;
//	private By login;
	@Given("user lanch the aopplication")
	public void user_lanch_the_aopplication() {
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.navigate().to("https://login.salesforce.com");
	}

	@Then("enter username and password")
	public void enter_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("12345");
	    
	}

	@Then("click on login")
	public void click_on_login() {
		driver.findElement(By.name("Login")).click();
		
		driver.close();
	    
	}
		
	   
	}




