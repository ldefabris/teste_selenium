function criarPessoa() {
    $.post("/pessoas", JSON.stringify({
        'nome': $('#inputNome').val(),
        'cpf': $('#inputCpf').val(),
        'estrangeiro': $('#chkIsEstrangeiro').is(':checked'),
        'profissao': $("#selectProfissao").val(),
        'sexo': $('input[name=radioSexo]:checked').val()
    }), function (data) {
        document.open();
        document.write(data);
        document.close();
    });
}

function carregarCriarPessoa() {
    $.get("/pessoas/new", function (data) {
        document.open();
        document.write(data);
        document.close();
    });
}