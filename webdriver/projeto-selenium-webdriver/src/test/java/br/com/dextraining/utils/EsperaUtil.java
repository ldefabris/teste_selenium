package br.com.dextraining.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EsperaUtil {

	/**
	 * Aguarda até algum item aparecer na TEla
	 * 
	 * @param tempo
	 * @param nomeDoQueEstouVendo
	 * @param driver
	 */
	static public void esperaDaFormaCorreta(int tempo,
			String nomeDoQueEstouVendo, WebDriver driver) {
		(new WebDriverWait(driver, tempo))
				.until(new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return driver.findElement(By.id(nomeDoQueEstouVendo))
								.isDisplayed();
					}
				});
	}
	
	/**
	 * Aguarda até algum item aparecer na TEla por xpatbh
	 * 
	 * @param tempo
	 * @param nomeDoQueEstouVendo
	 * @param driver
	 */
	static public void esperaDaFormaCorreta(int tempo,
			By busca, WebDriver driver) {
		(new WebDriverWait(driver, tempo))
				.until(new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return driver.findElement(busca)
								.isDisplayed();
					}
				});
	}

}
