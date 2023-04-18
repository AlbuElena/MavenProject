package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassicPage {
	
	public WebDriver driver;
	
	public ClassicPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By readMoreButton = By.xpath("//a[contains(text(), 'Read more')][1]");
	
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}

}
