package br.com.dextraining;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathExamples {
	
	private static FirefoxDriver driver;

	@BeforeClass
	public static void setup() {
		driver = new FirefoxDriver();
	}
	
	@AfterClass
	public static void exit() {
		driver.quit();
	}

	@Test
	public void testeGoogleAtributoHTML1() {
		driver.get("http://www.google.com");
		driver.findElementByXPath("//*[@name='btnI']").click();
	}
	//*[@id="tsf"]/div[2]/div[3]/center/input[2]
	
	@Test
	public void testeGoogleAtributoHTML2() {
		driver.get("http://www.google.com");
		driver.findElementByXPath("//*[@jsaction='sf.lck']").click();
	}
	
	@Test
	public void testeClickLinkMercadoLivre() {
		driver.get("http://www.mercadolivre.com.br/");
//		driver.findElementByXPath("//*[@data-tracking='CATEGNEWBIE-1743']").click();
		driver.findElementByXPath("//*[@class='explore-content']/div[1]/ul[1]/li[1]/a").click();
	}
	
	@Test
	public void testeGoogle() {
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='tsf']/div[2]/div[3]/center/input[2]").click();
	}
	
	@Test
	public void testeMErcadoLivreLinkClick() {
		driver.get("http://www.mercadolivre.com.br");
		driver.findElementByXPath("//*[@id='categories']/div[2]/div[1]/ul[1]/li[1]/a").click();
	}
	
	
	
}
