/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import br.com.dextraining.selenium.SeleniumTestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 *
 * @author dherik
 */
public class E30ExemploXPathSeletorCss extends SeleniumTestCase {

    @Test
    public void testeExemploComXPath() throws InterruptedException{
        
        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.id("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.id("inputPassword")).sendKeys("senha");
        driver.findElement(By.id("btnLogin")).click();

        esperarPor("lnkPaginaInicial");
        
        String xpathSelectorPattern = "/html/body/div/h1";
        By byXPath = By.xpath(xpathSelectorPattern);
        
        Assert.assertTrue("Nao foi encontrado o titulo na pagina inicial usando XPath!", driver.findElement(byXPath).isDisplayed());
        
    }
    
    @Test
    public void testeExemploComSelectorCSS() throws InterruptedException{
        
        driver.get("http://localhost:4567/login.html");
        
        //
        //seletor CSS por ID (o atributo input de email tem um ID chamado 'inputEmail')
        //
        driver.findElement(By.cssSelector("input#inputEmail")).sendKeys("usuarioEmailId@dominio.com");
        
        //
        //seletor CSS por Class (o atributo input de email tem um class chamado 'inputEmail')
        //
        driver.findElement(By.cssSelector("input.inputEmail")).clear(); //apenas para apagar o email anterior
        driver.findElement(By.cssSelector("input.inputEmail")).sendKeys("usuarioEmailClass@dominio.com");
        
        //
        //seletor CSS por id/classe e atributo
        //
        driver.findElement(By.cssSelector("input#inputPassword[name='inputPassword']")).sendKeys("senha");
        limparCampoPassword();
        
        //
        // Seletor CSS por parte de texto (prefixo)
        //
        driver.findElement(By.cssSelector("input#inputPassword[name^='inputPass']")).sendKeys("senhaPrefixo");
        limparCampoPassword();
        
        //
        // Seletor CSS por parte de texto (sufixo)
        //
        driver.findElement(By.cssSelector("input#inputPassword[name$='Password']")).sendKeys("senhaSufixo");
        limparCampoPassword();
        
        //
        // Seletor CSS por parte de texto (qualquer parte)
        //
        driver.findElement(By.cssSelector("input#inputPassword[name*='Passw']")).sendKeys("senhaQualquerParte");
        
        //
        // seletor CSS por atributo (atributo de type igual a 'submit' em um elemento HTML de button)
        //
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        esperarPor("lnkPaginaInicial");
        
        By bySeletorCss = By.cssSelector("html>body>div>h1");
        
        Assert.assertTrue("Nao foi encontrado o titulo na pagina inicial usando seletor CSS!", driver.findElement(bySeletorCss).isDisplayed());
        
    }

    private void limparCampoPassword() {
        driver.findElement(By.cssSelector("input#inputPassword[name^='inputPass']")).clear();
    }
        
    
}
