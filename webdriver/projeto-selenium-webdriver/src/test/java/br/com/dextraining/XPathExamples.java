package br.com.dextraining;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathExamples {

	@Test
	public void testeGoogleAtributoHTML1() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElementByXPath("//*[@name='btnI']").click();
	}
	
	@Test
	public void testeGoogleAtributoHTML2() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElementByXPath("//*[@jsaction='sf.lck']").click();
	}
	
	@Test
	public void testeGoogle() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='tsf']/div[2]/div[3]/center/input[2]").click();
	}
	
	@Test
	public void testeMErcadoLivreLinkClick() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.mercadolivre.com.br");
		driver.findElementByXPath("//*[@id='categories']/div[2]/div[1]/ul[1]/li[1]/a").click();
	}
	
	
	
}
