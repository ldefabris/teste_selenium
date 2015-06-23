/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import br.com.dextraining.selenium.SeleniumTestCase;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author dherik
 */
public class E40ExemploExplicitImplicitWait extends SeleniumTestCase {

    @Test
    public void testeComTempoExplicito() throws InterruptedException {
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.id("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.id("inputPassword")).sendKeys("senha");
        driver.findElement(By.id("btnLogin")).click();

        //definicao do tempo explicito
        int esperarTempoEmSegundos = 5;
        (new WebDriverWait(driver, esperarTempoEmSegundos)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.id("lnkPaginaInicial")).isDisplayed();
            }
        });
    }

    @Test
    public void testeComTempoImplicito() throws InterruptedException {

        //definicao do tempo implicito
        int esperarTempo = 5;
        driver.manage().timeouts().implicitlyWait(esperarTempo, TimeUnit.SECONDS);

        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.id("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.id("inputPassword")).sendKeys("senha");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("lnkPaginaInicial")).isDisplayed();
    }

}
