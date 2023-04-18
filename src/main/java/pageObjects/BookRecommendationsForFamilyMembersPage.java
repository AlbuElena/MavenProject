package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookRecommendationsForFamilyMembersPage {

public WebDriver driver;
	
	public BookRecommendationsForFamilyMembersPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By comment = By.xpath("//textarea[@id = 'comment']");
	public By name = By.xpath("//input[@id = 'author']");
	public By email = By.xpath("//input[@id = 'email']");
	public By website = By.xpath("//input[@id = 'url']");
	public By sendComment = By.xpath("//input[@id = 'send_comment']");
	public By responseSendComment = By.xpath("//div[@class = 'comment_not_approved']");
	
	public void sendMessage(String myComment, String myName, String myEmail, String myWebsite) {
		driver.findElement(comment).sendKeys(myComment);
		driver.findElement(name).sendKeys(myName);
		driver.findElement(email).sendKeys(myEmail);
		driver.findElement(website).sendKeys(myWebsite);
	}
	
	public void sendComment(By locator) {
		driver.findElement(locator).click();
	}
	
	public boolean responseIsDisplayed() {
		return driver.findElement(responseSendComment).isDisplayed();
	}
	
	
}
