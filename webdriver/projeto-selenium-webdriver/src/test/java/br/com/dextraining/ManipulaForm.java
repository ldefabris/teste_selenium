package br.com.dextraining;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManipulaForm {
	private FirefoxDriver driver;

	public ManipulaForm(FirefoxDriver driver) {
		super();
		this.driver = driver;
	}

	public void setName(String nome) {
		WebElement element = driver.findElementById("signupFirstName");
		element.sendKeys(nome);
		// dps de dar o send keys atualizou o Dom mas a minha instância não,
		// então forço uma atualizaçãozinha aqui...
		WebElement estadoFinal = driver.findElementById("signupFirstName");		
	}

}
