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
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author dherik
 */
public class E20ExemploOutrosElementos extends SeleniumTestCase {

    @Test
    public void preenchendoCadastroPessoa() throws InterruptedException {

        driver.get("http://localhost:4567/login.html");
        driver.findElement(By.id("inputEmail")).sendKeys("usuario@dominio.com");
        driver.findElement(By.id("inputPassword")).sendKeys("senha");
        driver.findElement(By.id("btnLogin")).click();

        esperarPor("lnkPaginaInicial");

        //selecionar no menu
        driver.findElement(By.id("liDropdownMenu")).click();
        driver.findElement(By.id("lnkGerenciarPessoas")).click();

        esperarPor("h1GerenciarPessoas");

        driver.findElement(By.id("lnkAdicionarPessoa")).click();

        esperarPor("h1AdicionarPessoa");

        driver.findElement(By.id("inputNome")).sendKeys("Mariana");
        driver.findElement(By.id("inputCpf")).sendKeys("111.1111.111-11");

        //
        // Checkbox
        //
        driver.findElement(By.id("chkIsEstrangeiro")).click();

        //
        // Select
        //
        Select dropdown = new Select(driver.findElement(By.id("selectProfissao")));
        dropdown.selectByVisibleText("Engenheiro");

        Thread.sleep(2000);

        //
        // Radio button
        //
        driver.findElement(By.id("rdMasculino")).click();

        driver.findElement(By.id("btnSalvarPessoa")).click();

        //verificar se pessoa foi salva
        esperarPor("h1GerenciarPessoas");

        Assert.assertTrue("Mariana nao foi encontrada na tabela de pessoas!", driver.findElement(By.className("alert-success")).isDisplayed());

    }

}
