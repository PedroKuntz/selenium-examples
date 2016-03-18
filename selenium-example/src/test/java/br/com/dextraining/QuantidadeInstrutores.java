package br.com.dextraining;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.selenium.SeleniumTestCase;

public class QuantidadeInstrutores extends SeleniumTestCase {

	@Test
	public void testeQuantidadeInstrutores() {
		driver.get("http://www.dextraining.com.br/cursos/");
		Assert.assertEquals(16,
				driver.findElementsByCssSelector("ul.grid-view > li").size());
	}

}
