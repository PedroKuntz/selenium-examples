package br.com.dextraining.pageobjects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectsSeleniumBase {

	protected static FirefoxDriver driver;

	@BeforeClass
	public static void prepararTeste() {
		driver = new FirefoxDriver();
	}
	
	@AfterClass
    public static void finalizarTestes() {
        driver.quit();
    }
	
	protected void esperarPor(final By by) throws InterruptedException {
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(by).isDisplayed();
            }
        });
    }
}
