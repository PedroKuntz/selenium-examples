package br.com.dextra.testes;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Aula2MercadoLivre {

	private static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		driver = new FirefoxDriver();
	}

	@Before
	public void beforeTestt() {
		driver.get("http://www.mercadolivre.com.br/");
	}

	@Test
	public void buscaMercadoLivreByName() {
		By.linkText("Carros, Motos e Outros");
		By cssSelectorBusca = By.cssSelector("input[name=as_word]");
		WebElement inputBusca = driver.findElement(cssSelectorBusca);
		inputBusca.sendKeys("ChormeCast");
	}

	@Test
	public void buscaMercadoLivreCarros() {
		driver.findElement(By.linkText("Carros, Motos e Outros")).click();

		By selectTipoDeVeiculo = By.cssSelector("form[name=formBusquedaClass] select[name=vehiculo]");
		Select selectVeiculo = new Select(driver.findElement(selectTipoDeVeiculo));
		selectVeiculo.selectByValue("1745");//Carros antigos

//		By.id("firstCombo");
		By byComboTipo = By.cssSelector("select#firstCombo");
		Select selectTipo = new Select(driver.findElement(byComboTipo));
		selectTipo.selectByVisibleText("Jeep");

		driver.findElement(By.name("desde")).sendKeys("1000");
		driver.findElement(By.name("hasta")).sendKeys("50000");

		driver.findElement(By.cssSelector("p.actions input.ch-btn")).click();

	}
}
