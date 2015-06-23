# selenium
Material para o curso de Selenium

# Informações básicas para utilização do projeto Selenium Web Driver

Este sistema foi criado para o curso de Selenium da Dextraining. Ele, basicamente, consiste em um Spark Server, Freemarker como engine template das telas, Bootstrap, Jquery, JUnit e, naturalmente, Selenium para os testes.

Para iniciar o servidor com a aplicação, basta executar a classe IniciarServidor.java. A aplicação estará disponível no endereço http://localhost:4567/login.html

## Sobre os testes implementados

Os testes com Selenium foram criados com base no material do curso. Um deles está falhando propositalmente.

Uma informação importante sobre os testes é que os primeiros estão propositalmente mais "crus" que os posteriores, para mostrar também a evolução do código de teste com Selenium. Explico.

O teste **E02ExemploLoginComDiferentesBy** não extende qualquer classe e contém código repetido. Isto foi feito para demonstrar com mais simplicidade o mecanismo do Selenium. Este teste, por exemplo, abre várias janelas do navegador (uma para cada teste) e as deixam abertas após a finalização dos testes, comportamentos estes não desejáveis mas que ajudam a ilustrar como o Selenium Web Driver funciona.

Já o teste **E03ExemploLoginMesmoNavegador** faz uso das anotações @BeforeClass e @AfterClass para abrir uma única janela de navegador, executar todos os testes nesta única janela e depois fechar o navegador.

Já o teste **E10ExemploAssert** extende uma classe SeleniumTestCase que move os métodos do @BeforeClass e @AfterClass para ele, além de um método de espera por elementos que é utilizado em vários testes funcionais.

O teste **E50PageObject**, finalmente, centraliza os elementos da página de Login no LoginPage.
