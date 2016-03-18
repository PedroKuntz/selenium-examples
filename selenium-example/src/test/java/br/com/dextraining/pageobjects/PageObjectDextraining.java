package br.com.dextraining.pageobjects;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectDextraining {

	private FirefoxDriver driver;
	
	
	public PageObjectDextraining(FirefoxDriver driverRecebido) {
		this.driver = driverRecebido;
	}


	public void entraPaginaContatos() {
		driver.findElementByXPath("//*[@class='header-menu']/li[7]/a").click();
	}


	public void entrarNaPaginaPrincipal() {
		driver.get("http://www.dextraining.com.br/");
	}


	public void entrarNaPaginaDeCursos() {
		driver.findElementByXPath("//*[@class='header-menu']/li[2]/a").click();
	}


	public void entrarPaginaDeInstrutores() {
		driver.findElementByXPath("//*[@class='header-menu']/li[3]/a").click();
		
	}
	
	
	
	
	
	
}
