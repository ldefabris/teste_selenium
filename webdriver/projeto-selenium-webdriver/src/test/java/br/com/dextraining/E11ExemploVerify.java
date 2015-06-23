/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import br.com.dextraining.selenium.SeleniumTestCase;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 *
 * @author dherik
 */
public class E11ExemploVerify extends SeleniumTestCase {

    @Test
    public void verifyTituloSobreCursoExiste() throws InterruptedException {
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.id("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.id("inputPassword")).sendKeys("senha");
        driver.findElement(By.id("btnLogin")).click();

        esperarPor("lnkSobre");

        driver.findElement(By.id("lnkSobre")).click();

        //verify
        try {
            Assert.assertEquals("O titulo sobre o curso nao foi encontado na pagina!", driver.findElement(By.id("sobreCurso")).isDisplayed(), true);
        } catch (Throwable ex) {
            Logger.getLogger(E11ExemploVerify.class.getName()).log(Level.SEVERE, "O titulo sobre o curso nao foi encontado na pagina!", ex);
        }
    }

}
