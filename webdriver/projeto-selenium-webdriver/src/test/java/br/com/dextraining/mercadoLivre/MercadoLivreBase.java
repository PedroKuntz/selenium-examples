package br.com.dextraining.mercadoLivre;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MercadoLivreBase {

	protected static FirefoxDriver driver;

	@BeforeClass
	public static void setup() {
		driver = new FirefoxDriver();
		driver.get("http://www.mercadolivre.com.br/");
	}

	@AfterClass
	public static void shutDown() {
		driver.quit();
	}

	protected void esperarPor(String elementoDeId) throws InterruptedException {
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.id(elementoDeId)).isDisplayed();
			}
		});
	}
}
