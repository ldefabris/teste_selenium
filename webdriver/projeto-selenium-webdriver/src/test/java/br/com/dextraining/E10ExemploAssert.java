/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import br.com.dextraining.selenium.SeleniumTestCase;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 *
 * @author dherik
 */
public class E10ExemploAssert extends SeleniumTestCase {

    /**
     * Este teste esta propositalmente falhando
     *
     * @throws InterruptedException
     */
    @Test
    public void assertTituloSobreCursoExiste() throws InterruptedException {
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.id("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.id("inputPassword")).sendKeys("senha");
        driver.findElement(By.id("btnLogin")).click();

        esperarPor("lnkSobre");

        driver.findElement(By.id("lnkSobre")).click();

        Assert.assertEquals("O titulo sobre o curso nao foi encontado na pagina!", driver.findElement(By.id("sobreCurso")).isDisplayed(), true);
    }

}
