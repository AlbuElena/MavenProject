package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.MenuPage;

import utils.BaseTest;

public class Homework2Curs13 extends BaseTest {
	
	@Test 
	public void socialMedia() {
	
	MenuPage menu = new MenuPage(driver);	
	
	//am indoieli ca e ok sa creez o lista intr-o clasa de test. Poti confirma, te rog?
	ArrayList<WebElement> lista = new ArrayList<>();
	lista.add(driver.findElement(menu.facebookLink));
	lista.add(driver.findElement(menu.twitterLink));
	lista.add(driver.findElement(menu.instaLink));

	for (int i=0; i<3; i++) {
		
		lista.get(i).click();
		ArrayList<String> browserTabs = new ArrayList<>(driver.getWindowHandles());

		driver.getWindowHandles();
		driver.switchTo().window(browserTabs.get(browserTabs.size()-1));
		System.out.println(i + " = " + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		}

	}
}
	
	

