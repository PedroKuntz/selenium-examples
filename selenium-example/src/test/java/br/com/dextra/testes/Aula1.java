package br.com.dextra.testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Aula1 {

	@Test
	public void teste1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dextraining.com.br/");

		Assert.assertEquals("http://www.dextraining.com.br/",
				driver.getCurrentUrl());
		driver.close();
	}

	@Test
	public void teste2() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dextraining.com.br/");

		driver.findElement(By.className("navbar-toggle")).click();
	}

	@Test
	public void teste3() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.br/");

		WebElement inputBusca = driver.findElement(By.id("lst-ib"));
		Thread.sleep(2000);
		inputBusca.sendKeys("dextraining");

		Assert.assertEquals("https://www.google.com.br/",
				driver.getCurrentUrl());

		driver.findElement(By.name("btnG")).click();
		Assert.assertEquals("https://www.google.com.br/#q=dextraining",
				driver.getCurrentUrl());
	}

	@Test
	public void teste4() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dextraining.com.br/contato/");

		WebElement nome = driver.findElement(By.name("your-name"));
		nome.sendKeys("Danilo");
		nome = driver.findElement(By.name("your-name"));
		Assert.assertEquals("Danilo", nome.getAttribute("value"));

		WebElement email = driver.findElement(By.name("your-email"));
		email.sendKeys("Danilo.pereiradeluca@gmail.com");
		email = driver.findElement(By.name("your-email"));
		Assert.assertEquals("Danilo.pereiradeluca@gmail.com",
				email.getAttribute("value"));

		WebElement phone = driver.findElement(By.name("your-phone"));
		phone.sendKeys("(12)4565-6465");
		phone = driver.findElement(By.name("your-phone"));
		Assert.assertEquals("(12)45656465", phone.getAttribute("value"));

		phone = driver.findElement(By.name("your-phone"));
		phone.clear();
		phone.sendKeys("ASDASDASDASD");
		phone = driver.findElement(By.name("your-phone"));
		Assert.assertEquals("(", phone.getAttribute("value"));

	}

	@Test
	public void testeRadioButtonCheckBoxSelect() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.br/url?sa=t&rct=j&q=&esrc=s&source=web&cd=4&ved=0ahUKEwiT_9DOicnLAhWDjpAKHYu-CH8QFgg6MAM&url=https%3A%2F%2Fwww.utexas.edu%2Flearn%2Fforms%2Fradio.html&usg=AFQjCNFomnF3u-T-00xq-5XYReh4GGeIRw&cad=rja");

		//Radio Button ou Checkbox
		driver.findElement(By.id("ms")).click();

		Select select = new Select(driver.findElement(By.id("quicklinks")));
		select.selectByIndex(4);
		Thread.sleep(6000);

		select.selectByValue("Webmail");
		Thread.sleep(6000);

		select.selectByVisibleText("Registrar");
		Thread.sleep(6000);

	}

}
