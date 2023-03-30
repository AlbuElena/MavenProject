package curs12;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplicitWait extends BaseTest {
	
	@Test
	public void testWait() throws InterruptedException {
		// in linkul de mai jos, elem exista in pag si este hiddne
		//astfel, IMPLICIT WAIT il gaseste si nu se activeaza(nu asteapta
		//din acest motid e failed
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//in exp de mai jos elementul NU exista in pagina
		//astfel IMPLICIT WAIT nu il gaseste in pag si il asteapta
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//implicit wait:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		//Thread.sleep(10000); //bad practice; l-am pus pt ca aplicatia avea un loading care dura si folosesc ce e mai sus: 2 tipuri de wait exista: implicit si explicit wait
		
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finish.getText(), "Hello World!");
		
		
	}

}
