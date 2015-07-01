package br.com.dextraining;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class SeleniumBase {

	private FirefoxDriver driver;

	protected FirefoxDriver getDriver() {
		return driver;
	}

	@Before
	public void antes() {
		if (driver == null) {
			driver = new FirefoxDriver();
		}
		driver.get(pegaUrl());
	}

	private String pegaUrl() {
		StringBuffer b = new StringBuffer();
		if (isSecure()) {
			b.append("https://");
		} else {
			b.append("http://");
		}
		b.append(getPaginaCorreta());
		return b.toString();
	}

	protected abstract boolean isSecure();

	protected abstract String getPaginaCorreta();

	// l@After
	public void depois() {
		if (driver != null) {
			driver.close();
		}
	}

	@Test
	public abstract void fazTeste() throws InterruptedException;

	private void clicaNasCoisas(String algo) throws InterruptedException {
		driver.findElementById(algo).click();
		Thread.sleep(1000);
	}

}
