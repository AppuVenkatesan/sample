package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PracticePage {
	
	WebDriver driver;
	

@Given("when I enter url {string}")
public void when_i_enter_url(String browserName) {
	
	if (browserName.equalsIgnoreCase("chrome")) {
		
				
		driver = new ChromeDriver();
		
	} else if (browserName.equalsIgnoreCase("firefox")) {
		
		driver = new FirefoxDriver();
		
	} else if (browserName.equalsIgnoreCase("edge")) {
		
		driver = new EdgeDriver();
		
	} 
	
	
	driver.manage().window().maximize();
  
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
    
}

@Then("enter name in the textbox")
public void enter_name_in_the_textbox() {
    
   driver.findElement(By.id("name")).sendKeys("Appu");;	
	
   
}

@Then("click on confirm")
public void click_on_confirm() {

        driver.findElement(By.id("confirmbtn")).click();

  
}

@Then("click on ok")
public void click_on_ok() {
	
	 driver.switchTo().alert().accept();
	 driver.close();
}

}