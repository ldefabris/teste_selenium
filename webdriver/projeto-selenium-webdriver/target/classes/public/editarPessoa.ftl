<#import "comum.ftl" as c/>
<@c.page title="Contato">
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h1>Editar pessoa</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <form class="form-horizontal">
                <input id="inputIdPessoa" type="hidden" value="${pessoa.id}" />
                <div class="form-group">
                    <label for="inputNome" class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputNome" placeholder="Nome" value="${pessoa.nome}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputCpf" class="col-sm-2 control-label">CPF</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputCpf" placeholder="CPF" value="${pessoa.cpf}">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <div class="checkbox">
                            <label>
                                <input id="chkIsEstrangeiro" type="checkbox"
                                       ${pessoa.estrangeiro?string('checked="checked"', '')}
                                       > Estrangeiro
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="selectProfissao" class="col-sm-2 control-label">Profissão</label>
                    <div class="col-sm-10">
                        <!--                                <select id="selectProfissao" class="form-control" >
                                                            <option value="Estudante">Estudante</option>
                                                            <option value="Engenheiro">Engenheiro</option>
                                                            <option value="Advogado">Advogado</option>
                                                        </select>-->
                        <@enumSelect "selectProfissao" profissoes/>
                        <#macro enumSelect selectName enumValues>
                        <select name="${selectName}" id="selectProfissao" class="form-control">
                            <#list enumValues as enum>
                            <option value="${enum}"
                                    <#if pessoa.profissao == enum>
                                    selected="selected"
                                    </#if>
                                    >${enum}</option>
                            </#list>
                        </select>
                        </#macro>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Sexo</label>
                    <div class="col-sm-10">
                        <label class="radio-inline">
                            <input type="radio" name="radioSexo" id="rdFeminino" value="Feminino" 
                                   <#if pessoa.sexo == "Feminino">
                                   checked="checked"
                                   </#if>
                                   > Feminino
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="radioSexo" id="rdMasculino" value="Masculino"
                                   <#if pessoa.sexo == "Masculino">
                                   checked="checked"
                                   </#if>
                                   > Masculino
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default" onclick="atualizarPessoa(); return false;">Salvar</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</@c.page>