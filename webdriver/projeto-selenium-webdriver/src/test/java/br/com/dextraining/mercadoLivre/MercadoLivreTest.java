package br.com.dextraining.mercadoLivre;


import org.junit.Assert;
import org.junit.Test;

public class MercadoLivreTest extends MercadoLivreBase {
	
	@Test
	public void testeEntrarNaPaginaDoMercadoLivre() {
		String title = driver.getTitle();
		Assert.assertEquals("MercadoLivre Brasil - Onde comprar e vender de Tudo",
				title);
	}
	
	@Test
	public void testeBuscaGlobal() {
		BuscaGlobalMercadoLivre busca = new BuscaGlobalMercadoLivre(driver);
		busca.digitarValoresBuscaGlobal("carro");
		busca.buscar();
	}
	
	@Test
	public void testeCadastrar() throws InterruptedException {
		CadastroMercadoLivre paginaCadastro = new CadastroMercadoLivre(driver);
		paginaCadastro.clicarEmSeCadastrar();
		paginaCadastro.preencherPrimeiroNome("Leonardo");
	}
	
	@Test
	public void testeCadastrarSemPAgeObject() throws InterruptedException {
		String cssLinkCadastrar = "a[data-tracking='HEADER-REGISTRATE']";
		driver.findElementByCssSelector(cssLinkCadastrar).click();
		driver.findElementById("signupFirstName").sendKeys("Leonardo");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
