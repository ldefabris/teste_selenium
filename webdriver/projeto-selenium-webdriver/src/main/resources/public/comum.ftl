<#macro page title>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>${title?html}</title>

        <link rel="stylesheet" href="/css/bootstrap.min.css">
        <link rel="stylesheet" href="/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="/css/starter-template.css">
        <link rel="stylesheet" href="/css/style.css">
        <link href="/css/signin.css" rel="stylesheet">
        <link href="/css/font-awesome.min.css" rel="stylesheet">

        <script src="/js/jquery-latest.min.js" type="text/javascript"></script>
        <script src="/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="/js/navbar.js" type="text/javascript"></script>
        <script src="/js/atualizarPessoa.js" type="text/javascript"></script>
        <script src="/js/criarPessoa.js" type="text/javascript"></script>

    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Selenium</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li ><a id="lnkPaginaInicial" href="/inicio">Página inicial</a></li>
                        <li class="dropdown">
                            <a id="liDropdownMenu" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Cadastros <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">Usuário</a></li>
                                <li><a href="#">Endereço</a></li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Pessoa</li>
                                <li><a id="lnkGerenciarPessoas" href="/pessoas">Gerenciar</a></li>
                            </ul>
                        </li>
                        <li><a id="lnkSobre" href="/sobre">Sobre</a></li>
                        <li><a href="/contato">Contato</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <#nested/>
        <div class="modal"></div>
    </body>
</html>
</#macro>