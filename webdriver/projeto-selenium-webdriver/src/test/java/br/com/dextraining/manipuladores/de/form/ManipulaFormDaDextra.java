package br.com.dextraining.manipuladores.de.form;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.dextraining.utils.EsperaUtil;

public class ManipulaFormDaDextra {
	private FirefoxDriver driver;

	public ManipulaFormDaDextra(FirefoxDriver driver) {
		super();
		this.driver = driver;
	}

	public void setName(String nome) {
		EsperaUtil.esperaDaFormaCorreta(3000, "signupFirstName", driver);
		WebElement element = driver.findElementById("signupFirstName");
		element.sendKeys(nome);
	}
	
	@SuppressWarnings("unused")
	public void vaiParaFormulario() {
		EsperaUtil.esperaDaFormaCorreta(3000, By.xpath("/html/head/title"), driver);
		WebElement linkDoForm = driver.findElementByXPath("/html/body/div[1]/div/ul/li[7]/a");
		linkDoForm.click(); 
		EsperaUtil.esperaDaFormaCorreta(3000, By.xpath("//*title"), driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Contato | Dextraining"));
		
	}

}

// - /html/body/div[1]/div/ul/li[7]/a  /html/head/title
// - 