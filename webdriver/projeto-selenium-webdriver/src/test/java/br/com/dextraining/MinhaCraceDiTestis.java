package br.com.dextraining;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinhaCraceDiTestis {

	private FirefoxDriver driver;

	@Before
	public void antes() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://localhost:4567/login.html");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}

	@After
	public void depois() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void meuTestiDiSoftiuerey() throws InterruptedException {
		WebElement linkSobre = recuperaInstanciaDoELemento(driver, "lnkSobre");
		linkSobre.click();
		Thread.sleep(3000);
		WebElement sobreOCurso = recuperaInstanciaDoELemento(driver, "sobreCursos");
		Assert.assertTrue(sobreOCurso.isDisplayed());
		Assert.assertTrue("Tem que ir", sobreOCurso.getText().equalsIgnoreCase("Sobre o curso de Selenium da Dextraining"));
	}

	private WebElement recuperaInstanciaDoELemento(WebDriver driver, String id) {
		WebElement botaoNext = driver.findElement(By.id(id));
		Assert.assertTrue(botaoNext.isDisplayed());
		return botaoNext;
	}

}
