package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleAuthorPage {
	
	public WebDriver driver ; 
	
	public By drama = By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 odd first inited']>div>div");
	public By biography = By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 even inited']>div>div");
	public By cookbooks = By.cssSelector("div[class ='sc_skills_item sc_skills_style_1 odd inited']>div>div");
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public boolean checkSkill(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	    return wait.until(ExpectedConditions.textToBePresentInElementLocated((locator), text));
	}
	
	

}
