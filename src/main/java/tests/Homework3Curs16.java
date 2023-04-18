package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework3Curs16 extends BaseTest {

	@Test
	public void searchKing() {
		
		app.menu.searchBy("king");
		app.menu.click(app.menu.theWickedKingpopup);
		assertTrue(app.king.fieldIsDisplayed(app.king.category));
		assertTrue(app.king.fieldIsDisplayed(app.king.productId));
		assertTrue(driver.findElement(By.xpath("(//ol[@class = 'flex-control-nav flex-control-thumbs']/li/img)[1]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("(//ol[@class = 'flex-control-nav flex-control-thumbs']/li/img)[2]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("(//ol[@class = 'flex-control-nav flex-control-thumbs']/li/img)[3]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("(//ol[@class = 'flex-control-nav flex-control-thumbs']/li/img)[4]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("(//ol[@class = 'flex-control-nav flex-control-thumbs']/li/img)[5]")).isDisplayed());//sunt 5 poze acum
	}
}
