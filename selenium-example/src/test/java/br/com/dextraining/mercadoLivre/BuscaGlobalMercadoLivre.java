package br.com.dextraining.mercadoLivre;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BuscaGlobalMercadoLivre {

	private FirefoxDriver search;

	public BuscaGlobalMercadoLivre(FirefoxDriver search) {
		this.search = search;
	}

	public BuscaGlobalMercadoLivre 
		digitarValoresBuscaGlobal(String busca) {
		search.findElementById("query").sendKeys(busca);
		return this;
	}
	
	public BuscaGlobalMercadoLivre buscar() {
		search.findElementByName("mlSearchBtn").click();
		return this;
	}
}
