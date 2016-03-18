package br.com.dextraining.pageobjects;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectGoogle {

	private FirefoxDriver driver;
	
	public PageObjectGoogle(FirefoxDriver driverRecebido) {
		this.driver  = driverRecebido;
	}

	public void entreEmSuaPagina() {
		driver.get("http://www.google.com");
	}

	public void buscar(String oqueEstouBuscando) {
		driver.findElementById("lst-ib").sendKeys(oqueEstouBuscando);
	}

	public void clicarBuscar() {
		driver.findElementByName("btnG").click();
	}

	public void entreNoLink(String linkASerClicado) {
		driver.findElementByLinkText(linkASerClicado).click();
	}
}
