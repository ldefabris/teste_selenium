/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author dherik
 */
public class E01ExemploAbrirPaginaLogin {

	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		// driver.get("http://localhost:4567/login.html");
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=pt-BR#identifier");
		Assert.assertTrue(driver.findElement(By.id("Email")).isDisplayed());
		WebElement mailField = driver.findElement(By.id("Email"));
		mailField.click();
		mailField.sendKeys("imaspdu@gmail.com");

		WebElement btnNext = recuperaInstanciaDoELemento(driver, "next");
		btnNext.click();
		
		Thread.sleep(3000);
		WebElement passField = recuperaInstanciaDoELemento(driver, "Passwd");
		passField.sendKeys("andreiwid");
		
		WebElement btnsignIn = recuperaInstanciaDoELemento(driver, "signIn");
		btnsignIn.click();

		driver.close();
	}

	private WebElement recuperaInstanciaDoELemento(WebDriver driver, String id) {
		WebElement botaoNext = driver.findElement(By.id(id));
		Assert.assertTrue(botaoNext.isDisplayed());
		return botaoNext;
	}

}
