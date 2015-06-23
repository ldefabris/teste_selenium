function atualizarPessoa() {
    $.ajax({
        url: '/pessoas/' + $('#inputIdPessoa').val(),
        type: 'PUT',
        data: JSON.stringify({ 
            'nome': $('#inputNome').val(), 
            'cpf': $('#inputCpf').val(),
            'estrangeiro': $('#chkIsEstrangeiro').is(':checked'),
            'profissao': $("#selectProfissao").val(),
            'sexo': $('input[name=radioSexo]:checked').val()
        }),
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        async: false,
        cache: false,
        complete: function( xhr ) {
            document.open();
            document.write(xhr.responseText);
            document.close();
        }
    });
}