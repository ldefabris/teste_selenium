/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E02ExemploLoginComDiferentesBy {

    /**
     * Exemplo usando o atributo id do input
     *
     * @throws InterruptedException
     */
    @Test
    public void loginComSucessoUsandoId() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.id("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.id("inputPassword")).sendKeys("senha");
        driver.findElement(By.id("btnLogin")).click();

        esperarPor(driver, "lnkPaginaInicial");
    }

    /**
     * Exemplo usando o atributo class do input
     *
     * @throws InterruptedException
     */
    @Test
    public void loginComSucessoUsandoClassName() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.className("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.className("inputPassword")).sendKeys("senha");
        driver.findElement(By.className("btnLogin")).click();

        esperarPor(driver, "lnkPaginaInicial");
    }

    /**
     * Exemplo usando o atributo name do input
     *
     * @throws InterruptedException
     */
    @Test
    public void loginComSucessoUsandoName() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.name("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.name("inputPassword")).sendKeys("senha");
        driver.findElement(By.name("btnLogin")).click();

        esperarPor(driver, "lnkPaginaInicial");
    }
    
    /**
     * Exemplo usando o texto do link
     *
     * @throws InterruptedException
     */
    @Test
    public void loginComSucessoDemonstrandoLink() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.name("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.name("inputPassword")).sendKeys("senha");
        
        driver.findElement(By.linkText("Perdi minha senha")).click();
        driver.findElement(By.partialLinkText("Perdi")).click();
        
        driver.findElement(By.name("btnLogin")).click();

        esperarPor(driver, "lnkPaginaInicial");
    }

    /**
     * Este metodo realiza a espera da exibicao do elemento na tela.
     *
     * @param driver
     * @param idDoElemento
     */
    private void esperarPor(WebDriver driver, String idDoElemento) {
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.id(idDoElemento)).isDisplayed();
            }
        });
    }

}
