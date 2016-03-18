package br.com.dextraining.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectCursoSelecionado {

	private FirefoxDriver driver;

	public PageObjectCursoSelecionado(FirefoxDriver driver) {
		this.driver = driver;
	}

	public void verificarQueExistemXSubCursos(int quantidadeDeSubcursosDesejada) {
		List<WebElement> listaDeSubcursos = driver.findElementsByCssSelector("ul.grid-view-cursos-categoria > li");
		Assert.assertEquals(quantidadeDeSubcursosDesejada,listaDeSubcursos.size());
	}

}
