package br.com.dextraining;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Aula2 {
	private FirefoxDriver driver;

//	@Before
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("http://www.mercadolivre.com.br/");
	}

	@Test
	public void testeParaBuscarUmaMoto() throws InterruptedException {
		WebElement linkCarrosEMotos = driver
				.findElementByLinkText("Carros, Motos e Outros");
		linkCarrosEMotos.click();

		Select comboTipoVeiculo = new Select(driver.
				findElementById("vehiculo"));
		comboTipoVeiculo.selectByValue("1763");
		
		Select comboTipoMoto = new Select(driver.
				findElementById("firstCombo"));
		comboTipoMoto.selectByValue("6809");
		
		
		Select anoDesde = new Select(driver.
				findElementById("anioDesde"));
		anoDesde.selectByValue("2000");
		
		Select anoAte = new Select(driver.
				findElementById("anioHasta"));
		anoAte.selectByValue("2010");
		
		driver.findElementByClassName("ch-btn").click();
		
	}

	@Test
	public void testeGoogle() {
		driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.findElementByCssSelector("div.jsb input[name='btnK']").click();
	}
	
	@Test
	public void buscaPorXPath() {
		driver = new FirefoxDriver();
		driver.get("http://www.mercadolivre.com.br/veiculos/");
		driver.findElementByCssSelector
	("form#formBusquedaClass p.actions input[value='Buscar']").click();
	}
	
	@After
	public void close() {
		driver.close();
	}
	
}


