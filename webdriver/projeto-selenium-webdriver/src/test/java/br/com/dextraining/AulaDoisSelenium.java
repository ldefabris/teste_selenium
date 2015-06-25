package br.com.dextraining;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AulaDoisSelenium {

	private FirefoxDriver driver;

	@Before
	public void antes() {
		if (driver == null) {
			driver = new FirefoxDriver();

		}
		driver.get("http://localhost:4567/login.html");
		;
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

	private void clicaNasCoisas(String algo) throws InterruptedException {
		driver.findElementById(algo).click();
		Thread.sleep(1000);
	}

}
