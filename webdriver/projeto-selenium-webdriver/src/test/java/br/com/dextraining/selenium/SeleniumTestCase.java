/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining.selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author dherik
 */
public class SeleniumTestCase {

    private static final int TEMPO_MAXIMO_ESPERA = 10;

    protected static WebDriver driver;

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
        //driver.close();
        driver.quit();
    }

    protected void esperarPor(String elementoDeId) throws InterruptedException {
        //Thread.sleep(2000); //apenas para podermos visualizar a tela antes da verificacao
        (new WebDriverWait(driver, TEMPO_MAXIMO_ESPERA)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.id(elementoDeId)).isDisplayed();
            }
        });
    }

}
