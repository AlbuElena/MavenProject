package tests;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import utils.BaseTest;

public class Homework3Curs14 extends BaseTest{
	
	@DataProvider
	public Object[][] HomePageBooksTestData(){
		
		Object[][] data = new Object[6][3];
		data[0][0] = "TestUser";
		data[0][1] = "12345@67890";
		data[0][2] = true;
		
		
		data[1][0] = "user Gresit";
		data[1][1] = "parola gresita";
		data[1][2] = false;
		
		data[2][0] = "test.test";
		data[2][1] = "test.test@123";
		data[2][2] = true;
					
		return data;
	}
	
	@Test (dataProvider = "HomePageBooksTestData")
	public void test() {
		
		MenuPage menu = new MenuPage(driver);
		
		ArrayList<WebElement> lista = new ArrayList<>();
		lista.add(driver.findElement(menu.TheForestlink));
		lista.add(driver.findElement(menu.TheSonLink));
		lista.add(driver.findElement(menu.LifeInTheGardenLink));
		lista.add(driver.findElement(menu.TheLongRoadLink));
		lista.add(driver.findElement(menu.StrangeStoryLink));
		lista.add(driver.findElement(menu.StormLink));
		
		for(int i=0; i<6; i++ ) {
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
