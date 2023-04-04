package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.ContactsPage;
import pageObjects.MenuPage;
import utils.BaseTest;

public class ContactsTest extends BaseTest{
	

	@Test		
	public void MessageContacts()  {		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		
		ContactsPage message = new ContactsPage(driver);
		message.SendMessage("Albu Elena", "elena@email.com", "Subiect1", "Acesta este mesajul meu");
		message.pressSend();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("span[class *= 'name']>input"), "value", ""));
		
		assertTrue(message.responseSendMessageisDisplayed());
		
		
	}

	
}
