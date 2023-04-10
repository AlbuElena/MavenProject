package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JseExecutorExample extends BaseTest {
	
	//@Test
	public void manageBrowserPage() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.location = 'http://emag.ro'");
		jse.executeScript("window.history.go(-1)");
		
		//Refresh la pagina
		driver.navigate().refresh(); // prima metoda
		jse.executeScript("window.history.go(0)");//a 3 metoda
		driver.navigate().to(driver.getCurrentUrl());//alta metoda, ca prima
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();//a 2-a metoda
	}
	
	//@Test
	public void jsScroll() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);
		
		WebElement signUpButton = driver.findElement(By.cssSelector("input[value ='Sign up']"));
		//jse.executeScript("arguments[0].scrollIntoView" , signUpButton);
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.moveToElement(signUpButton).perform();
		
		
	}
	
	@Test
	public void jsExample() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement searchIcon = driver.findElement(app.menu.searchIcon);
		WebElement searchField = driver.findElement(app.menu.searchField);
		/*
		//1. click
		jse.executeScript("arguments[0].click()", searchIcon);
		//2.sendKeys
		jse.executeScript("arguments[0].value='cooking'", searchField);
		jse.executeScript("arguments[0].click()", searchIcon);
		
		
		//3 comasarea actiunilor 1 si 2 de mai sus:
		//jse.executeScript("arguments[0].click(), arguments[1].value='cooking',arguments[0].click()", searchIcon, searchField);
		*/
		// js executor pur:
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking'");
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		
		
	}

}
