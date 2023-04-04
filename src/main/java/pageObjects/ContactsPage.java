package pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage {
	
	public WebDriver driver;
	
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By Name = By.cssSelector("span[class *= 'name']>input");
	public By Mail = By.cssSelector("span[class *= 'email']>input");
	public By Subject = By.cssSelector("span[class *= ' your-s']>input");
	public By Message = By.cssSelector("span[class*='message']>textarea");
	public By sendBttn = By.cssSelector("input[value = 'Send Message']");
	public By responseSendMessage = By.cssSelector("div[class = 'wpcf7-response-output']");
	
	public By zoomOutButton = By.cssSelector("button[title = 'Zoom out']");
	public By iframe = By.tagName("iframe");
	public By outsideMap = By.partialLinkText("map");

	public void SendMessage(String name, String mail, String subject, String message)  {		
		driver.findElement(Name).sendKeys(name);
		driver.findElement(Mail).sendKeys(mail);
		driver.findElement(Subject).sendKeys(subject);
		driver.findElement(Message).sendKeys(message);			
	}
	
	public void pressSend() {
		driver.findElement(sendBttn).click();
	}
	
	public boolean responseSendMessageisDisplayed() {
		return driver.findElement(responseSendMessage).isDisplayed();
	}
	
	public void zoomMap(By locator) {
		WebElement iFrame = driver.findElement(iframe);
		driver.switchTo().frame(iFrame);
		driver.findElement(locator).click();		
	}
	
	public void redirectMap() {
		driver.findElement(outsideMap).click();
	}
	
	


	
	
}
	
