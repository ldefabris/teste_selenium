function login() {
    $.post("/login", JSON.stringify({'inputEmail': $('#inputEmail').val(), 'inputPassword': $('inputPassword').val()}))
            .done(function (data) {
                document.open();
                document.write(data);
                document.close();
            });
}

