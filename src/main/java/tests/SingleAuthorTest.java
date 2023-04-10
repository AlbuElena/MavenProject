package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.SingleAuthorPage;
import utils.BaseTest;

public class SingleAuthorTest extends BaseTest{
//homework1
	
	@Test
	public void AuthorTest () {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.singleAuthorLink);
		
		SingleAuthorPage author = new SingleAuthorPage(driver);		
			
		assertTrue(author.checkSkill(author.drama, "95"));
        assertTrue(author.checkSkill(author.biography, "75"));
        assertTrue(author.checkSkill(author.cookbooks, "82"));
	}	

}
