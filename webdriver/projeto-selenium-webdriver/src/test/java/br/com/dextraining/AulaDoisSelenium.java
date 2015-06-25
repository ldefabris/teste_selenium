package br.com.dextraining;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AulaDoisSelenium {

	private FirefoxDriver driver;

	@Before
	public void antes() {
		if (driver == null) {
			driver = new FirefoxDriver();

		}
		// driver.get("http://localhost:4567/login.html");
		// driver.get("http://www.mercadolivre/imoveis/");
		driver.get("http://www.mercadolivre/veiculos/");
		;
	}

	// l@After
	public void depois() {
		if (driver != null) {
			driver.close();
		}
	}

	@Test
	public void fazTeste() throws InterruptedException {
		clicaNasCoisas("btnLogin");
		clicaNasCoisas("liDropdownMenu");
		clicaNasCoisas("lnkGerenciarPessoas");
		clicaNasCoisas("lnkAdicionarPessoa");
		clicaNasCoisas("chkIsEstrangeiro");
		clicaNasCoisas("rdFeminino");
	}

	@Test
	public void selecionandocheckBox() throws InterruptedException {
		Select tipo = new Select(driver.findElementById("inmueble"));
		tipo.selectByValue("1472");
	}

	/**
	 * Ir no mercado livre veiculos e tentar comprar uma motoca.
	 * 
	 * @throws InterruptedException
	 * 
	 */
	@Test
	public void exercico1() throws InterruptedException {
		Thread.sleep(1000);
		new Select(driver.findElementById("vehiculo"))
				.selectByVisibleText("Motos");
		new Select(driver.findElementById("firstCombo"))
				.selectByVisibleText("Sport");
		new Select(driver.findElementById("secondCombo"))
				.selectByVisibleText("Honda");
		driver.findElementById("desde").clear();
		driver.findElementById("desde").sendKeys("1000");
		driver.findElementById("hasta").clear();
		driver.findElementById("hasta").sendKeys("5000");
		new Select(driver.findElementById("anioDesde"))
				.selectByVisibleText("2000");
		new Select(driver.findElementById("anioHasta"))
				.selectByVisibleText("2015");

	}

	private void clicaNasCoisas(String algo) throws InterruptedException {
		driver.findElementById(algo).click();
		Thread.sleep(1000);
	}

	

}
