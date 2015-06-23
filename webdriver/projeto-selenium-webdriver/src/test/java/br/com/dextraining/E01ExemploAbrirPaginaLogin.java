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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author dherik
 */
public class E01ExemploAbrirPaginaLogin {

	@Test
	public void login() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4567/login.html");
	}

	@Test
	public void googleSearch() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("btnI")).click();
	}

	@Test
	public void gmailLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("teste.selenium.training@gmail.com");
		driver.findElement(By.id("next")).click();
		// Thread.sleep(2000);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.id("Passwd")).isDisplayed();
			}
		});
		driver.findElement(By.id("Passwd")).sendKeys("teste321456");
		driver.findElement(By.id("signIn")).click();
		driver.close();
	}
}
