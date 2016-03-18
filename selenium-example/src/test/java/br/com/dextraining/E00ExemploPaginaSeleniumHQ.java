/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author dherik
 */
public class E00ExemploPaginaSeleniumHQ {

    @Test
    public void clickDownloadInSeleniumPage() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumhq.org/");
        
        driver.findElement(By.linkText("Download")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();
    }
    
    @Test
    public void click2() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumhq.org/");
        driver.findElement(By.linkText("Documentation")).click();
        driver.findElement(By.linkText("Introducing WebDriver")).click();
        driver.close();
    }
    
    @Test
    public void testeGoogle() {
    	WebDriver driver = new FirefoxDriver();
    	driver.get("http://www.globo.com/");
    	
    	driver.findElement(By.id("busca-campo")).sendKeys("OLA");
    }
    
    @Test
    public void testeLucky() throws InterruptedException {
    	WebDriver driver = new FirefoxDriver();
    	driver.get("http://www.google.com/");
    	Thread.sleep(3000);
    	driver.findElement(By.name("btnI")).click();
    }
    

}
