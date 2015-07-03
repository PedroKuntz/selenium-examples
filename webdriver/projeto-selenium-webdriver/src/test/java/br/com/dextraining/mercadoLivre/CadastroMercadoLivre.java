package br.com.dextraining.mercadoLivre;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroMercadoLivre {

	private FirefoxDriver driver;
	
	public CadastroMercadoLivre(FirefoxDriver driver) {
		this.driver = driver;
	}

	public CadastroMercadoLivre clicarEmSeCadastrar() {
		driver
			.findElementByCssSelector("a[data-tracking='HEADER-REGISTRATE']")
			.click();
		return this;
	}
	
	public CadastroMercadoLivre preencherPrimeiroNome(String nome) {
		driver.findElementById("signupFirstName").sendKeys(nome);
		return this;
	}
	
	
	
}
