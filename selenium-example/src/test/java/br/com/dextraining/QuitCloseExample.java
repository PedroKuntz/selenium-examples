package br.com.dextraining;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitCloseExample {

	@Test
	public void testClose() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.close();
	}
	
	@Test
	public void testQuit() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.quit();
	}
}
