package br.com.dextraining.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectInstrutores {

	private FirefoxDriver driver;

	public PageObjectInstrutores(FirefoxDriver driver) {
		this.driver = driver;
	}

	public void validarQueExistemXInstrutores(int totalInstrutores) {
		List<WebElement> listaInstrutores = driver.findElementsByCssSelector("ul#lista-instrutores > li");
		Assert.assertEquals(totalInstrutores,listaInstrutores.size());
	}

}
