/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * FIXME traduzir Adaptador de:
 * https://code.google.com/p/selenium/wiki/PageObjects
 */
public class LoginPage {

    private final WebDriver driver;

    //A pagina de logou contem diversos elementos HTML que podem ser representados por WebElements
    //Os localizadores para estes elementos devem ser definidos apenas uma vez
    By emailLocator = By.id("inputEmail");
    By senhaLocator = By.id("inputPassword");
    By loginBotaoLocator = By.id("btnLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        //Verifica se estamos na pagina correta.
        if (!"Login".equals(driver.getTitle())) {
            // Alternativamente, nos poderiamos navegar para a pagina de login, talvez realizando o logout primeiro da pagina primeiro
            throw new IllegalStateException("Esta nao eh a pagina de login!");
        }
    }

    // A pagina de login permite que o usuario digite o email no campo de email
    public LoginPage digitarEmail(String email) {
        //Este eh o unico local que "sabe" como entrar com o email
        driver.findElement(emailLocator).sendKeys(email);

        // Retorna o objecto da pagina atual pois esta acao nao realiza uma navegacao para uma outra pagina representada por outro PageObject
        return this;
    }

    // A pagina de login permite que o usuario digite a senha no campo senha
    public LoginPage digitarSenha(String password) {
        //Este eh o unico local que "sabe" como entrar com a senha
        driver.findElement(senhaLocator).sendKeys(password);

        // Retorna o objecto da pagina atual pois esta acao nao realiza uma navegacao para uma outra pagina representada por outro PageObject
        return this;
    }

    // A pagina de login permite que o usuario envie as informacoes de login para a aplicacao web
    public PaginainicialPage fazerLogin() {
        // This is the only place that submits the login form and expects the destination to be the home page.
        // A seperate method should be created for the instance of clicking login whilst expecting a login failure. 
        driver.findElement(loginBotaoLocator).click();

        // Return a new page object representing the destination. Should the login page ever
        // go somewhere else (for example, a legal disclaimer) then changing the method signature
        // for this method will mean that all tests that rely on this behaviour won't compile.
        return new PaginainicialPage(driver);
    }

    // The login page allows the user to submit the login form knowing that an invalid username and / or password were entered
    public LoginPage executarLoginEsperandoFalha() {
        // This is the only place that submits the login form and expects the destination to be the login page due to login failure.
        driver.findElement(loginBotaoLocator).click();

        // Return a new page object representing the destination. Should the user ever be navigated to the home page after submiting a login with credentials 
        // expected to fail login, the script will fail when it attempts to instantiate the LoginPage PageObject.
        return new LoginPage(driver);
    }

    // Conceptually, the login page offers the user the service of being able to "log into"
    // the application using a user name and password. 
    public PaginainicialPage logarComo(String email, String senha) {
        // The PageObject methods that enter username, password & submit login have already defined and should not be repeated here.
        digitarEmail(email);
        digitarSenha(senha);
        return fazerLogin();
    }

}
