package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostFormatsPage {
	
	public WebDriver driver;
	
	public PostFormatsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By audioPost = By.cssSelector("h4[class = 'post_title']> a[href = 'https://keybooks.ro/2016/02/02/audio-post/']");
	public By searchField = By.cssSelector("input[title = 'Search for:']");
	public By galleryElement = By.cssSelector("h4[class = 'post_title'] a[href = 'https://keybooks.ro/2016/02/01/gallery-format/']");

	

	
	public void clickTo(By locator) {
		driver.findElement(locator).click();
	}

}
