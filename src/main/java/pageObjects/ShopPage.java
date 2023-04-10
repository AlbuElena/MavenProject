package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
	
	public WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}

	public By dropdown = By.name("orderby");
	public By sliderinitialPosition = By.cssSelector("span[style = 'left: 0%;']");
	public By sliderFinalPosition = By.cssSelector("span[style = 'left: 100%;']");
	public By booksByPrice = By.cssSelector("li[class *= 'column-1_4'] bdi");
	
	public void dragAndDrop(By locator, int x, int y) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, x, y).perform();//metoda perform tb mereu sa fie la final
	
		
		//lantul de actiuni pe care il face dragAndDrop:
		//action.clickAndHold().moveByOffset(x, y).release().perform();
		
		//combinatii posibile: action.sendKeys(Keys.TAB).click().sendKeys(Keys.TAB). . . .perform(); 
		
		
	}
	
	public void selectByValue(String value) {
		
		WebElement orderDropdown = driver.findElement(dropdown);
		Select selectObj = new Select(orderDropdown); // sau ... = new Select(driver.findElement(dropdown))
		selectObj.selectByValue(value);		
	}
	
	public String getSelectedOption() {

		WebElement orderDropdown = driver.findElement(dropdown);
		Select selectObj = new Select(orderDropdown);
		return selectObj.getFirstSelectedOption().getText();
	}
	
	public void selectByIndex(int index) {
		
		WebElement orderDropdown = driver.findElement(dropdown);
		Select selectObj = new Select(orderDropdown); 
		selectObj.selectByIndex(index);		
	}

	public void selectByVisibleText(String text) {
		
		WebElement orderDropdown = driver.findElement(dropdown);
		Select selectObj = new Select(orderDropdown); 
		selectObj.selectByVisibleText(text);		
	}
	
	
	
			
}
