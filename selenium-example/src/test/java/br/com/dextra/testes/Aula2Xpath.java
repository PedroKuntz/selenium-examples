package br.com.dextra.testes;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aula2Xpath {

	private static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		driver = new FirefoxDriver();
	}

	@Before
	public void beforeTestt() {
		driver.get("http://www.dextraining.com.br/contato/");
	}

	@Test
	public void testeNomeCssSelector() {
		WebElement inputNome = driver.findElement(By.cssSelector("span.your-name input"));
		inputNome.sendKeys("Danilo");
	}


	@Test
	public void testeTodosOsCampos() {
		By nomeCss = By.cssSelector("span.your-name input");
		WebElement inputNome = driver.findElement(nomeCss);
		inputNome.sendKeys("Danilo");

		By emailCss = By.cssSelector("span.your-email input");
		WebElement inputEmail = driver.findElement(emailCss);
		inputEmail.sendKeys("email@email.com.br");

		By phoneCss = By.cssSelector("span.your-phone input");
		WebElement inputPhone = driver.findElement(phoneCss);
		inputPhone.sendKeys("(45)646546546");
	}

	@Test
	public void testeNomeByName() {
//		By.name("your-name")
		By nomeCss = By.cssSelector("input[name='your-name']");
		WebElement inputNome = driver.findElement(nomeCss);
		inputNome.sendKeys("Danilo");
	}

}
