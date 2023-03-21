package curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeworkEx2 {
public  WebDriver driver;		
	
	@BeforeClass 
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keybooks.ro/");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();	
	}
	
	@Test (priority =1)
	public void Login() {
		WebElement LoginLink = driver.findElement(By.partialLinkText("Login"));
		LoginLink.click();
		
		WebElement emailField = driver.findElement(By.id("log"));
		emailField.sendKeys("TestUser");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("12345@67890");
		
		WebElement loginButton = driver.findElement(By.className("submit_button"));
		loginButton.click();
		
	}
	
	

}
