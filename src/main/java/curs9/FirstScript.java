package curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {
	
	public  WebDriver driver;	
	
	@BeforeClass //adica sa ruleze inaintea tuturor claselor adnotate cu @Test
	public void setup() {
		//daca vreau Chrome care are err datorita updateurilor
				//ChromeOptions chOpt = new ChromeOptions();
				//chOpt.addArguments("--remote-allow-origins=*");
				//WebDriver chrome = new ChromeDriver(chOpt);
				
		driver = new ChromeDriver();
		driver.get("https://keybooks.ro/");	
	}	
	
	@Test
	public void openBrowser() throws InterruptedException {
				
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000); //bad practise, do not use thread.sleep!!				
	}

	@AfterClass
	public void tearDown() {
		driver.quit();	
	}
}
