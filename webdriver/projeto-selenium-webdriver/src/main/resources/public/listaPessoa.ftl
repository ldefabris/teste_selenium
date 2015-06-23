<#import "comum.ftl" as c/>
<@c.page title="Gerenciar pessoas">
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h1 id="h1GerenciarPessoas">Buscar pessoas</h1>
        </div>
    </div>
    <#if mensagemSucesso??>
    <div class="row">
        <div class="col-lg-12">
            <div class="alert alert-success">
                <a href="#" class="close" data-dismiss="alert">&times;</a>
                <strong>Sucesso!</strong> ${mensagemSucesso}.
            </div>
        </div>
    </div>
    </#if>
    <div class="row">
        <div class="col-lg-12">
            <a id="lnkAdicionarPessoa" class="btn btn-default" href="/pessoas/new"><i class="fa fa-plus"></i> &nbsp; Adicionar pessoa</a>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>CPF</th>
                        <th>Estrangeiro</th>
                        <th>Profissão</th>
                        <th>Sexo</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <#list pessoas as pessoa>
                    <tr>
                        <td id="tdNomePessoa">${pessoa.nome}</td>
                        <td>${pessoa.cpf}</td>
                        <td>${pessoa.estrangeiro?string('Sim', 'Não')}</td>
                        <td>${pessoa.profissao}</td>
                        <td>${pessoa.sexo}</td>
                        <td>
                            <a class="btn btn-success btn-sm" href="/pessoas/${pessoa.id}">
                                <span class="fa fa-pencil" aria-hidden="true"></span> Editar
                            </a>
                        </td>
                    </tr>
                    </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
</@c.page>