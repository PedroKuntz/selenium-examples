package br.com.dextraining.pageobjects;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ClasseTesteEnviarContato extends PageObjectsSeleniumBase {

	@Test
	public void testePreencherFormularioDeContato() throws InterruptedException {
		PageObjectGoogle google = new PageObjectGoogle(driver);
		google.entreEmSuaPagina();
		google.buscar("Dextraining");
		google.clicarBuscar();
		esperarPor(By.linkText("Dextraining: Treinamentos em TI"));
		google.entreNoLink("Dextraining: Treinamentos em TI");
		
		esperarPor(By.className("logo"));
		Assert.assertEquals("Treinamentos em TI | Dextraining", 
				driver.getTitle());
		
		PageObjectDextraining dextraining = new PageObjectDextraining(driver);
		dextraining.entraPaginaContatos();
		esperarPor(By.className("logo"));
		Assert.assertEquals("Contato | Dextraining", 
				driver.getTitle());
		
		PageObjectPaginaContatoDextraining contatos = new PageObjectPaginaContatoDextraining(driver);
		contatos.preencherFormulario("joazinho","asd@asd.com","Teste da aula de teste de software");
		contatos.clicarEmEnviar();
		esperarPor(By.cssSelector("div[role='alert']"));
	}
	
	@Test
	public void testeEnviarContatoSemPageObject() throws InterruptedException {
		driver.get("http://www.google.com");
		driver.findElementById("lst-ib").sendKeys("Dextraining");
		driver.findElementByName("btnG").click();
		esperarPor(By.linkText("Dextraining: Treinamentos em TI"));
		driver.findElementByLinkText("Dextraining: "
					+ "Treinamentos em TI").click();
		
		esperarPor(By.className("logo"));
		
		Assert.assertEquals("Treinamentos em TI | Dextraining", 
				driver.getTitle());
		
		driver.findElementByXPath("//*[@class='header-menu']/li[7]/a").click();
		esperarPor(By.className("logo"));
		
		Assert.assertEquals("Contato | Dextraining", 
				driver.getTitle());
		
		
		driver.findElementByName("your-name").sendKeys("joazinho");
		driver.findElementByName("your-email").sendKeys("asd@asd.com");
		driver.findElementByName("your-message").sendKeys("Teste da aula de teste de software");
		driver.findElementByCssSelector("input[value='Enviar mensagem']").click();
		
		esperarPor(By.cssSelector("div[role='alert']"));
	}
	
	
	
	
	
}
