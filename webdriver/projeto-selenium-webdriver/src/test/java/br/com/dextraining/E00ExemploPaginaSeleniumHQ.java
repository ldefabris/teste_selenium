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

/**
 *
 * @author dherik
 */
public class E00ExemploPaginaSeleniumHQ {

    @Test
    public void clickDownloadInSeleniumPage() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumhq.org/");
        driver.findElement(By.linkText("Download")).click();
        Thread.sleep(3000);            //delay
        driver.navigate().back();
        Thread.sleep(3000);            //delay
        driver.navigate().forward();
    }

}
