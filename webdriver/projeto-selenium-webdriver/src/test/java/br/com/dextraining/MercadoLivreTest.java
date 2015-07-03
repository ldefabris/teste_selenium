package br.com.dextraining;

import br.com.dextraining.manipuladores.de.form.ManipulaForm;
import br.com.dextraining.utils.EsperaUtil;

public class MercadoLivreTest extends SeleniumBase {

	@Override
	protected boolean isSecure() {
		return true;
	}

	@Override
	protected String getPaginaCorreta() {
		return "registration.mercadolivre.com.br/registration/";
	}

	@Override
	public void fazTeste() throws InterruptedException {
		ManipulaForm form = new ManipulaForm(getDriver());
		form.setName("Leonardo Lopes");

	}

}
