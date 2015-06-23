<#import "comum.ftl" as c/>
<@c.page title="Contato">
<div class="container">

    <form class="form-horizontal" role="form">
        <div class="form-group">
            <div class="col-sm-2"></div>
            <div class="col-sm-10"><h1>Contato</h1></div>

        </div>
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">Nome</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="nome" placeholder="Primeiro & Último nome" value="">
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-2 control-label">Email</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="email" name="email" placeholder="exemplo@dominio.com.br" value="">
            </div>
        </div>
        <div class="form-group">
            <label for="message" class="col-sm-2 control-label">Mensagem</label>
            <div class="col-sm-10">
                <textarea class="form-control" rows="4" name="message"></textarea>
            </div>
        </div>
        <div class="form-group">
            <label for="human" class="col-sm-2 control-label">2 + 3 = ?</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="human" name="humano" placeholder="Sua resposta">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-10 col-sm-offset-2">
                <input id="submit" name="submit" type="submit" value="Enviar" class="btn btn-primary">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-10 col-sm-offset-2">
                <! Will be used to display an alert to the user>
            </div>
        </div>
    </form>
</div>
</@c.page>