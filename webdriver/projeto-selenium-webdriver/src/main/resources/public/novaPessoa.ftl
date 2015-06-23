<#import "comum.ftl" as c/>
<@c.page title="Nova pessoa">        
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h1 id="h1AdicionarPessoa">Adicionar nova pessoa</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <form class="form-horizontal">
                <div class="form-group">
                    <label for="inputNome" class="col-sm-2 control-label">Nome</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputNome" placeholder="Nome">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputCpf" class="col-sm-2 control-label">CPF</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputCpf" placeholder="CPF">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Nacionalidade</label>
                    <div class="col-sm-10">
                        <div class="checkbox">
                            <label>
                                <input id="chkIsEstrangeiro" type="checkbox"> Estrangeiro
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="selectProfissao" class="col-sm-2 control-label">Profissão</label>
                    <div class="col-sm-10">
                        <@enumSelect "selectProfissao" profissoes/>
                        <#macro enumSelect selectName enumValues>
                        <select name="${selectName}" id="selectProfissao" class="form-control">
                            <#list enumValues as enum>
                            <option value="${enum}">${enum}</option>
                            </#list>
                        </select>
                        </#macro>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Sexo</label>
                    <div class="col-sm-10">
                        <label class="radio-inline">
                            <input type="radio" name="radioSexo" id="rdFeminino" value="Feminino"> Feminino
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="radioSexo" id="rdMasculino" value="Masculino"> Masculino
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button id="btnSalvarPessoa" type="submit" class="btn btn-default" onclick="criarPessoa(); return false;">Salvar</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</@c.page>