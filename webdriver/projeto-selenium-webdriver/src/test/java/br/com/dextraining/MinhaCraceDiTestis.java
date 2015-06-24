package br.com.dextraining;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;

public class MinhaCraceDiTestis {

	private FirefoxDriver driver;

	@Before
	public void antes() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://localhost:4567/login.html");
		driver.findElement(ByIdOrName.id("btnLogin")).click();
		Thread.sleep(3000);
		System.out.println();
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

	@Test
	public void preencheOFormulario() throws InterruptedException{
		driver.findElement(By.linkText("Contato")).click();
		Thread.sleep(3000);
		driver.findElement(ById.id("name")).sendKeys("Atrubaldos");
		driver.findElement(ById.id("email")).sendKeys("nãoéamamae");
		driver.findElement(ById.id("submit")).click();
		driver.findElement(ById.id("name")).getText().equalsIgnoreCase("Atrubaldos");
	}
	
	private WebElement recuperaInstanciaDoELemento(WebDriver driver, String id) {
		WebElement botaoNext = driver.findElement(By.id(id));
		Assert.assertTrue(botaoNext.isDisplayed());
		return botaoNext;
	}

}
