/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining.services;

import br.com.dextraining.dto.PessoaDto;
import br.com.dextraining.entidade.Profissao;
import br.com.dextraining.repository.PessoaRepository;
import static br.com.dextraining.util.JsonTransformer.fromJson;
import freemarker.template.Configuration;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;
import spark.template.freemarker.FreeMarkerEngine;

/**
 *
 * @author dherik
 */
public class PessoaService {
    
    private Configuration config;

    public PessoaService(Configuration config) {
        this.config = config;
        registrarServicos();
    }

    //http://microformats.org/wiki/rest/urls
    private void registrarServicos() {
        get("/pessoas", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("pessoas", new PessoaRepository().buscarTodasPessoas());
            return new ModelAndView(attributes, "listaPessoa.ftl");
        }, new FreeMarkerEngine(config));
        get("/pessoas/new", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("profissoes", Profissao.values());
            return new ModelAndView(attributes, "novaPessoa.ftl");
        }, new FreeMarkerEngine(config));
        get("/pessoas/:id", (request, response) -> {
            Integer id = Integer.valueOf(request.params(":id"));
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("profissoes", Profissao.values());
            attributes.put("pessoa", new PessoaRepository().buscarPessoaPorId(id));
            return new ModelAndView(attributes, "editarPessoa.ftl");
        }, new FreeMarkerEngine(config));
        post("/pessoas", (request, response) -> { //para criar novo registro

            String body = request.body();
            PessoaDto pessoaDto = fromJson(body, PessoaDto.class);
            new PessoaRepository().criarPessoa(pessoaDto);

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("pessoas", new PessoaRepository().buscarTodasPessoas());
            attributes.put("mensagemSucesso", "Pessoa criada com sucesso");
            return new ModelAndView(attributes, "listaPessoa.ftl");
        }, new FreeMarkerEngine(config));
        put("/pessoas/:id", (request, response) -> { //para editar/update

            String body = request.body();
            PessoaDto pessoaDto = fromJson(body, PessoaDto.class);

            Integer id = Integer.valueOf(request.params(":id"));
            new PessoaRepository().atualizarPessoa(pessoaDto, id);

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("pessoas", new PessoaRepository().buscarTodasPessoas());
            attributes.put("mensagemSucesso", "Pessoa atualizada com sucesso");

            return new ModelAndView(attributes, "listaPessoa.ftl");
        }, new FreeMarkerEngine(config));
    }
    
}
