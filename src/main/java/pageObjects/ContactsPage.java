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
	
	public By zoomOutButton = By.cssSelector("button[title = 'Zoom out']");
	public By iframe = By.tagName("iframe");
	public By outsideMap = By.partialLinkText("map");
	
	
	public void zoomMap(By locator) {
		WebElement iFrame = driver.findElement(iframe);
		driver.switchTo().frame(iFrame);
		driver.findElement(locator).click();
		
	}
	
	public void redirectMap() {
		driver.findElement(outsideMap).click();
	}
	
	public void writePropertiesFile() throws IOException {
		try {
		
			OutputStream outputStream = new FileOutputStream("testing");
			
			Properties file = new Properties();
			file.setProperty("URL", "https://keybooks.ro/contacts/");
			file.setProperty("Name", "Popescu Ion");
			file.setProperty("Mail", "popescu_ion@email.com");
			file.setProperty("Subject", "Subiectul lui Popescu Ion");
			file.setProperty("Message", "Acesta este mesajul 1 al lui Popescu Ion");
							
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
	}	
	
	
	public void SendMessage(String name, String mail, String subject, String message) throws IOException {
		try {
		InputStream inputStream = new FileInputStream("testing");
		Properties file = new Properties() ;
		file.load(inputStream);
		driver.findElement(Name).sendKeys(name);
		driver.findElement(Mail).sendKeys(mail);
		driver.findElement(Subject).sendKeys(subject);
		driver.findElement(Message).sendKeys(message);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	}

	
	
}
	
