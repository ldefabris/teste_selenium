/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author dherik
 */
public class E01ExemploAbrirPaginaLogin {

    @Test
    public void login() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:4567/login.html");
    }

}
