package br.com.dextra.testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aula2 {

	private static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Ola");
		driver = new FirefoxDriver();
	}

	@Before
	public void beforeTestt() {
		System.out.println("Tudo bem?");
		driver.get("http://www.dextraining.com.br/");
	}

	@Test
	public void t1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Claro!!");
		driver.get("http://www.dextraining.com.br/contato/");
	}

	@Test
	public void t2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("E vc?");
		driver.get("http://www.dextraining.com.br/instrutores/");
	}

	@After
	public void afterTestt() throws InterruptedException {
		System.out.println("Executou com sucesso!");
		Thread.sleep(3000);
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Vai fechar o browser!!");
		driver.close();
	}

}
