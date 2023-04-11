package tests;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework3Curs14 extends BaseTest{	
	@DataProvider
	public Object[][] HomePageBooksTestData(){
		
		Object[][] data = new Object[6][2];
		data[0][0] = "The forest";
		data[0][1] = "https://keybooks.ro/shop/the-forest/";
		
		data[1][0] = "The son";
		data[1][1] = "https://keybooks.ro/shop/the-son/";
		
		data[2][0] = "Life in the garden";
		data[2][1] = "https://keybooks.ro/shop/life-in-the-garden/";
		
		data[3][0] = "The long road to the deep Silence";
		data[3][1] = "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/";
		
		data[4][0] = "It’s a really strange story";
		data[4][1] = "https://keybooks.ro/shop/its-a-really-strange-story/";
		
		data[5][0] = "Storm";
		data[5][1] = "https://keybooks.ro/shop/storm/";
			
		return data;
	}	
	
	@Test (dataProvider = "HomePageBooksTestData")
	public void test(String link, String URL) {
		app.menu.navigateTo(app.menu.homePage);
		driver.findElement(By.linkText(link)).click();
		assertEquals(driver.getCurrentUrl(), URL);
	
	}
}
