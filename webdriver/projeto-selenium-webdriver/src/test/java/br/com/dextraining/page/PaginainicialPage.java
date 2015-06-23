/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author dherik
 */
public class PaginainicialPage {

    private final WebDriver driver;

    By tituloLocator = By.xpath("/html/body/div/h1");

    PaginainicialPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean temTituloNaPaginaInicial() {
        return driver.findElement(tituloLocator).isDisplayed();
    }

}
