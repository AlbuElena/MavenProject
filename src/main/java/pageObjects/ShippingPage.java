package pageObjects;

import java.security.spec.ECField;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage {
	
public WebDriver driver;
	
	public ShippingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By countryDropdown = By.id("shipping_country");
	
	public void selectByVisibleText(String value) {
		/*
		WebElement element = driver.findElement(countryDropdown);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		*/
		
		WebElement countryRegionDropdown = driver.findElement(countryDropdown);
		Select selectObj = new Select(countryRegionDropdown); 
		
		//countryRegionDropdown = WebDriverWait(driver, 10).until(driver.findElement(By.cssSelector("select[id='shipping_country']//options[contains(., 'AF')]")));
	
		selectObj.selectByVisibleText(value);		
	}
	

}
