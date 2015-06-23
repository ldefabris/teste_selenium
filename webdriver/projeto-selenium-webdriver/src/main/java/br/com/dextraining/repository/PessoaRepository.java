/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining.repository;

import br.com.dextraining.dto.PessoaDto;
import br.com.dextraining.entidade.PessoaDb;
import br.com.dextraining.entidade.Profissao;
import br.com.dextraining.entidade.Sexo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dherik
 */
public class PessoaRepository {

    private static ArrayList<PessoaDb> pessoas;
    private static int sequence;

    static {
        pessoas = new ArrayList<>();
        pessoas.add(new PessoaDb(1, "Carlos", "000.111.555.99", true, Profissao.Engenheiro.name(), Sexo.Masculino.name()));
        pessoas.add(new PessoaDb(2, "Ana", "111.111.555.99", true, Profissao.Advogado.name(), Sexo.Feminino.name()));
        sequence = pessoas.size() + 1;
    }

    public PessoaDb buscarPessoaPorId(Integer id) {
        return pessoas.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public List<PessoaDb> buscarTodasPessoas() {
        return pessoas;
    }

    public void atualizarPessoa(PessoaDto pessoaDto, Integer idPessoaDb) {
        PessoaDb pessoaDb = buscarPessoaPorId(idPessoaDb);
        pessoaDb.setCpf(pessoaDto.getCpf());
        pessoaDb.setNome(pessoaDto.getNome());
        pessoaDb.setEstrangeiro(pessoaDto.isEstrangeiro());
        pessoaDb.setProfissao(pessoaDto.getProfissao());
        pessoaDb.setSexo(pessoaDto.getSexo());
    }

    public void criarPessoa(PessoaDto pessoaDto) {
        PessoaDb pessoaDb = new PessoaDb(sequence++,
                pessoaDto.getNome(), pessoaDto.getCpf(), pessoaDto.isEstrangeiro(),
                pessoaDto.getProfissao(), pessoaDto.getSexo());
        pessoas.add(pessoaDb);
    }

}
