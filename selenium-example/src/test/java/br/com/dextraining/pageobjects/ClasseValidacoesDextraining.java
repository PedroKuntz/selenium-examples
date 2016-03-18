package br.com.dextraining.pageobjects;

import org.junit.Test;
import org.openqa.selenium.By;

public class ClasseValidacoesDextraining extends PageObjectsSeleniumBase{

	@Test
	public void testeValidarQuantidades() throws InterruptedException {
		PageObjectDextraining dextraining = new PageObjectDextraining(driver);
		//entrar no site do dextraining
		dextraining.entrarNaPaginaPrincipal();
		
		//entrar na aba de 'Cursos'
		dextraining.entrarNaPaginaDeCursos();
		PageObjectCursos cursos = new PageObjectCursos(driver);

		//validar que existem 16 cursos
		esperarPor(By.className("logo"));
		cursos.verificarQueExistemTantosCursos(16);
		
		//entrar no curso JAVA
		cursos.entrarEm("Java");
		esperarPor(By.className("logo"));
		
		//validar que existem 10 subcursos de JAVA
		PageObjectCursoSelecionado curso = new PageObjectCursoSelecionado(driver);
		
		curso.verificarQueExistemXSubCursos(10);
		
		//entrar na tela de instrutores 
		dextraining.entrarPaginaDeInstrutores();
		PageObjectInstrutores instrutores = new PageObjectInstrutores(driver);
		
		//verificar que existem 27 instrutores
		instrutores.validarQueExistemXInstrutores(27);
		//fim
		
	}
}
