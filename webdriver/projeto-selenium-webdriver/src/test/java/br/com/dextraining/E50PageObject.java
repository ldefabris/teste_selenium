/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import br.com.dextraining.page.LoginPage;
import br.com.dextraining.page.PaginainicialPage;
import br.com.dextraining.selenium.SeleniumTestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author dherik
 */
public class E50PageObject extends SeleniumTestCase {

    @Test
    public void testeLoginComPageObject() {

        driver.get("http://localhost:4567/login.html");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.digitarEmail("usuario@dominio.com").digitarSenha("senha");
        PaginainicialPage paginaInicialPage = loginPage.fazerLogin();

        Assert.assertTrue("Nao foi encontrado o titulo na pagina inicial", paginaInicialPage.temTituloNaPaginaInicial());

    }

}
