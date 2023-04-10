package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AudioPostPage {
	
	public WebDriver driver;
	
	public AudioPostPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By musicPlayButton = By.cssSelector("div[class *= 'mejs-play']");	
	public By musicSlider = By.cssSelector("span[class ='mejs-time-handle']");
	public By volumeSlider = By.cssSelector("a[class = 'mejs-horizontal-volume-slider']");
	
	
	public void clickTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public void dragAndDrop(By locator, int x, int y) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, x, y).perform();
	}

}
