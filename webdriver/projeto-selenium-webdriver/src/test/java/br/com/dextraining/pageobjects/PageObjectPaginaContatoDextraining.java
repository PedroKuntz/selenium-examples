package br.com.dextraining.pageobjects;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectPaginaContatoDextraining {

	private FirefoxDriver driver;

	public PageObjectPaginaContatoDextraining(FirefoxDriver driverRecebido) {
		this.driver = driverRecebido;
	}

	public void preencherFormulario(String nome, String email,
			String mensagem) {
		
		driver.findElementByName("your-name").sendKeys(nome);
		driver.findElementByName("your-email").sendKeys(email);
		driver.findElementByName("your-message").sendKeys(mensagem);
		
	}

	public void clicarEmEnviar() {
		driver.findElementByCssSelector("input[value='Enviar mensagem']").click();
		
	}
}
