/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining.entidade;

/**
 *
 * @author dherik
 */
public class PessoaDb {

    private Integer id;
    private String nome;
    private String cpf;
    private boolean estrangeiro;
    private String profissao;
    private String sexo;

    public PessoaDb(Integer id, String nome, String cpf, boolean estrangeiro, String profissao, String sexo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.estrangeiro = estrangeiro;
        this.profissao = profissao;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public Integer getId() {
        return id;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "PessoaDb{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", estrangeiro=" + estrangeiro + ", profissao=" + profissao + ", sexo=" + sexo + '}';
    }

}
