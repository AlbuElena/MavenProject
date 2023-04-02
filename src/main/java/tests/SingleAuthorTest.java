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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 odd first inited']>div>div"), "95"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 even inited']>div>div"), "75"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 odd inited']>div>div"), "82"));
		
		assertTrue(author.dramaSkill());
		assertTrue(author.biography());
		assertTrue(author.cookbooks());
		
	}
	

}
