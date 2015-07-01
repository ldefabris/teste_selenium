package br.com.dextraining;

import org.openqa.selenium.By;

import br.com.dextraining.utils.EsperaUtil;

public class MeuTeste extends SeleniumBase {

	@Override
	protected String getPaginaCorreta() {
		return "www.mercadolivre.com.br";
	}

	@Override
	public void fazTeste() throws InterruptedException {
		EsperaUtil.esperaDaFormaCorreta(3000, "main", getDriver());
		getDriver().findElement(By.id("main")).click();
	}

	@Override
	protected boolean isSecure() {
		return false;
	}

}
