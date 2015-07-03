package br.com.dextraining;

import br.com.dextraining.manipuladores.de.form.ManipulaFormDaDextra;

public class TestaADextra extends SeleniumBase {

	@Override
	protected boolean isSecure() {
		return false;
	}

	@Override
	protected String getPaginaCorreta() {
		return "www.dextraining.com.br";
	}

	@Override
	public void fazTeste() throws InterruptedException {
		ManipulaFormDaDextra dextraForm = new ManipulaFormDaDextra(getDriver());
		dextraForm.vaiParaFormulario();
		

	}

}
