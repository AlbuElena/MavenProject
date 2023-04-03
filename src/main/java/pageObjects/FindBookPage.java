package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindBookPage {
	
	public WebDriver driver ; 
	
	public FindBookPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By searchField = By.cssSelector("button[title = 'Open search']");

	public void WriteinSearch(String numeCarte) {
		driver.findElement(searchField).sendKeys(numeCarte);
	}
	

}
