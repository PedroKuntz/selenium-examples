package br.com.dextraining.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectCursos {

	private FirefoxDriver driver;

	public PageObjectCursos(FirefoxDriver driver) {
		this.driver = driver;
	}

	public void verificarQueExistemTantosCursos(int quantidadeDesejada) {
		List<WebElement> elementosEncontrados = driver.findElementsByCssSelector("ul.grid-view > li");
		Assert.assertEquals(quantidadeDesejada, elementosEncontrados.size());
	}

	public void entrarEm(String linkTextDoCurso) {
		driver.findElementByLinkText(linkTextDoCurso);
	}
}
