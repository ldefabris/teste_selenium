/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining.dto;

/**
 *
 * @author dherik
 */
public class LoginDto {

    private String inputPassword;
    private String inputEmail;

    public String getInputEmail() {
        return inputEmail;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

}
