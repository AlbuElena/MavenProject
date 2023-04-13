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
	public By countryCanadaDisplayed = By.cssSelector("span[title = 'Canada']");
	public By provinceDropdown = By.id("shipping_state");
	public By provinceNLDisplayed = By.cssSelector("span[title = 'Newfoundland and Labrador']");
	
	
	public void selectByIndex(int index) {		
		WebElement countryRegionDropdown = driver.findElement(countryDropdown);
		Select selectObj = new Select(countryRegionDropdown); 
		selectObj.selectByIndex(index);		
	}
	
	public boolean countryIsDisplayed() {
		return driver.findElement(countryCanadaDisplayed).isDisplayed();		
	}
	
	public void selectByValue(String value) {		
		WebElement province = driver.findElement(provinceDropdown);
		Select selectObj = new Select(province); 
		selectObj.selectByValue(value);		
	}
	/* NU MAI ESTE NEVOIE, dar o las aici*/
	public void scrollDownByVisibilityOfProvince() {
		WebElement element = driver.findElement(By.cssSelector("span[id = 'select2-shipping_state-container']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
//	*/
	public boolean provinceIsDisplayed() {
		return driver.findElement(provinceNLDisplayed).isDisplayed();		
	}
}