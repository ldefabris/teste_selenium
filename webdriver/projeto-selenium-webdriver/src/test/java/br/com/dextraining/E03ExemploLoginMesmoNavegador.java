/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E03ExemploLoginMesmoNavegador {

    private static final int TEMPO_MAXIMO_ESPERA = 10;

    private static WebDriver driver;

    /**
     * Realiza uma unica instancia do driver, para ser reutilizado em todos os
     * testes.
     */
    @BeforeClass
    public static void prepararTeste() {
        driver = new FirefoxDriver();
    }

    /**
     * Sem este codigo, o navegador Firefox continuara aberto mesmo apos ter
     * finalizado todos os testes
     */
    @AfterClass
    public static void finalizarTestes() {
        driver.close();
    }

    @Test
    public void loginComSucessoUsandoId() throws InterruptedException {
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.id("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.id("inputPassword")).sendKeys("senha");
        driver.findElement(By.id("btnLogin")).click();

        esperarPor(driver, "lnkPaginaInicial");
    }

    @Test
    public void loginComSucessoUsandoClassName() throws InterruptedException {
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.className("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.className("inputPassword")).sendKeys("senha");
        driver.findElement(By.className("btnLogin")).click();

        esperarPor(driver, "lnkPaginaInicial");
    }

    @Test
    public void loginComSucessoUsandoName() throws InterruptedException {
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

    private void esperarPor(WebDriver driver, String elementoDeId) throws InterruptedException {
        Thread.sleep(3000); //apenas para podermos visualizar a tela antes da verificacao
        (new WebDriverWait(driver, TEMPO_MAXIMO_ESPERA)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.id(elementoDeId)).isDisplayed();
            }
        });
        Thread.sleep(3000); //apenas para podermos visualizar a tela antes da verificacao
    }

}
