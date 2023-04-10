package pageObjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import curs10.FindElements;

public class FindBookPage {
	
	public WebDriver driver ; 
	
	public FindBookPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By searchField = By.cssSelector("button[title = 'Open search']");
	public By inputSearchField = By.cssSelector("div[class = 'top_panel_middle'] input");
	public By loadMoreButton = By.cssSelector("div[id = viewmore]>a");  
	public By displayedBook = By.cssSelector("article>h4>a[href = 'https://keybooks.ro/shop/the-story-about-me/']"); //By.linkText("The story about me");
	public By addToCart = By.cssSelector("button[name = 'add-to-cart']");
	public By responseAddToCart = By.cssSelector("div[role = 'alert']");
	public By viewCart = By.cssSelector("a[tabindex='1']");

	public void clickSearchButton() {
		driver.findElement(searchField);
	}
	
	public void write(String numeCarte) {
		driver.findElement(inputSearchField).sendKeys(numeCarte);		
	}
	
	public void search() {
		driver.findElement(searchField).click();
	}
	
	
	public void loadMore()   {		
		do {	
			driver.findElement(loadMoreButton).click();				
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor2.executeScript("window.scrollBy(0,document.body.scrollHeight)","");	//scroll Down to the bottom of the page		
		} while(driver.findElement(loadMoreButton).isDisplayed());
	}
		
	public boolean findBook() {
		return 	driver.findElement(displayedBook).isDisplayed();
	}
	
	public void clicktheBook() {
		driver.findElement(displayedBook).click();
	}
	
	public String checkBookUrl() {
		//assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-story-about-me/");
		return driver.getCurrentUrl();
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	
	public boolean responseAddToCartIsDisplayed() {
		return driver.findElement(responseAddToCart).isDisplayed();
	}
	
	public void pressViewCart() {
		driver.findElement(viewCart).click();
	}
	
	public String checkViewCartUrl() {
		//assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/cart/"); assert tb sa fie doar in clasele de test
		return driver.getCurrentUrl();
	}
			
		
		
		
	
	

}
