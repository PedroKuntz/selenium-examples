package br.com.dextraining;

import org.junit.AfterClass;
import org.junit.Test;

import br.com.dextraining.selenium.SeleniumTestCase;

public class UsandoSeleniumBase extends SeleniumTestCase{
	@Test
	public void teste1() throws InterruptedException {
		Thread.sleep(4000);
		driver.get("http://www.google.com");
		Thread.sleep(4000);
	}
	
}
