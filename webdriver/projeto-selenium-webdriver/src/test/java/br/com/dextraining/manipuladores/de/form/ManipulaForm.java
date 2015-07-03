package br.com.dextraining.manipuladores.de.form;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.dextraining.utils.EsperaUtil;

public class ManipulaForm {
	private FirefoxDriver driver;

	public ManipulaForm(FirefoxDriver driver) {
		super();
		this.driver = driver;
	}

	public void setName(String nome) {
		EsperaUtil.esperaDaFormaCorreta(3000, "signupFirstName", driver);
		WebElement element = driver.findElementById("signupFirstName");
		element.sendKeys(nome);
	}

}
