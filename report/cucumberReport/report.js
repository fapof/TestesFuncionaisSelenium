$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Carrinho.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Testar as funcionalidades de adicionar e remover produto do carrinho",
  "description": "\r\nNARRATIVA:\r\nComo usuário\r\nGostaria de adicionar produtos ao carrinho\r\nAo remover produto do carrinho\r\nUma mensagem deve ser exibida informando que o carrinho está vazio",
  "id": "testar-as-funcionalidades-de-adicionar-e-remover-produto-do-carrinho",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 10288826772,
  "status": "passed"
});
formatter.background({
  "line": 11,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Cenario de Fundo"
});
formatter.step({
  "line": 12,
  "name": "que o usuário está na pagina da categoria pré-venda",
  "keyword": "Dado "
});
formatter.match({
  "location": "CarrinhoSteps.queOUsuárioEstáNaPaginaInicial()"
});
formatter.result({
  "duration": 6271845530,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adicionar produto ao carrinho",
  "description": "",
  "id": "testar-as-funcionalidades-de-adicionar-e-remover-produto-do-carrinho;adicionar-produto-ao-carrinho",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 15,
  "name": "o usuário estiver da pagina de detalhes do produto",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "clicar na opção comprar",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "o produto deve ser adicionado ao carrinho de compras",
  "keyword": "Então "
});
formatter.match({
  "location": "CarrinhoSteps.oUsuárioEstiverDaPaginaDeDetalhesDoProduto()"
});
formatter.result({
  "duration": 2163658951,
  "status": "passed"
});
formatter.match({
  "location": "CarrinhoSteps.clicarNaOpçãoComprar()"
});
formatter.result({
  "duration": 6239272195,
  "status": "passed"
});
formatter.match({
  "location": "CarrinhoSteps.oProdutoDeveSerAdicionadoAoCarrinhoDeCompras()"
});
formatter.result({
  "duration": 2785402456,
  "status": "passed"
});
formatter.after({
  "duration": 1207478899,
  "status": "passed"
});
formatter.before({
  "duration": 12859849984,
  "status": "passed"
});
formatter.background({
  "line": 11,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Cenario de Fundo"
});
formatter.step({
  "line": 12,
  "name": "que o usuário está na pagina da categoria pré-venda",
  "keyword": "Dado "
});
formatter.match({
  "location": "CarrinhoSteps.queOUsuárioEstáNaPaginaInicial()"
});
formatter.result({
  "duration": 6672743286,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Remover produto do carrinho",
  "description": "",
  "id": "testar-as-funcionalidades-de-adicionar-e-remover-produto-do-carrinho;remover-produto-do-carrinho",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 20,
  "name": "o usuário estiver com produto adicionado no carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 21,
  "name": "clicar na opção retirar produto do carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "uma mensagem informando que o carrinho está vazio deve ser exibida na tela",
  "keyword": "Entao "
});
formatter.match({
  "location": "CarrinhoSteps.oUsuárioEstiverComProdutoAdicionadoNoCarrinho()"
});
formatter.result({
  "duration": 7010407756,
  "status": "passed"
});
formatter.match({
  "location": "CarrinhoSteps.clicarNaOpçãoRetirarProdutoDoCarrinho()"
});
formatter.result({
  "duration": 4022839429,
  "status": "passed"
});
formatter.match({
  "location": "CarrinhoSteps.umaMensagemInformandoQueOCarrinhoEstáVazioDeveSerExibidaNaTela()"
});
formatter.result({
  "duration": 92698307,
  "status": "passed"
});
formatter.after({
  "duration": 1038701140,
  "status": "passed"
});
formatter.uri("LoginInvalido.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Testar os metodos de login invalidos",
  "description": "\r\nNARRATIVA:\r\nComo usuário\r\nAo informar email ou senha de acesso invalido\r\nUma mensagem de email ou senha invalido deve ser exibido na tela",
  "id": "testar-os-metodos-de-login-invalidos",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Validar campos obrigatorios - \u003cmensagem\u003e",
  "description": "",
  "id": "testar-os-metodos-de-login-invalidos;validar-campos-obrigatorios---\u003cmensagem\u003e",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "o usuário informar o \"\u003ce-mail\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "informar a \"\u003csenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "clicar na opção continuar",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "a \"\u003cmensagem\u003e\" deve ser exibida na tela",
  "keyword": "Entao "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "testar-os-metodos-de-login-invalidos;validar-campos-obrigatorios---\u003cmensagem\u003e;",
  "rows": [
    {
      "cells": [
        "e-mail",
        "senha",
        "mensagem"
      ],
      "line": 20,
      "id": "testar-os-metodos-de-login-invalidos;validar-campos-obrigatorios---\u003cmensagem\u003e;;1"
    },
    {
      "cells": [
        "testesfuncionais@gmail.com",
        "123456",
        "E-mail ou senha incorretos"
      ],
      "line": 21,
      "id": "testar-os-metodos-de-login-invalidos;validar-campos-obrigatorios---\u003cmensagem\u003e;;2"
    },
    {
      "cells": [
        "123456@gmail.com",
        "testesfuncionais",
        "E-mail ou senha incorretos"
      ],
      "line": 22,
      "id": "testar-os-metodos-de-login-invalidos;validar-campos-obrigatorios---\u003cmensagem\u003e;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 12239100476,
  "status": "passed"
});
formatter.background({
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Cenario de Fundo"
});
formatter.step({
  "line": 11,
  "name": "que o usuário está na tela de indetificação",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginInvalidoSteps.queOUsuárioEstáNaTelaDeIndetificação()"
});
formatter.result({
  "duration": 3490156154,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validar campos obrigatorios - E-mail ou senha incorretos",
  "description": "",
  "id": "testar-os-metodos-de-login-invalidos;validar-campos-obrigatorios---\u003cmensagem\u003e;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "o usuário informar o \"testesfuncionais@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "informar a \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "clicar na opção continuar",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "a \"E-mail ou senha incorretos\" deve ser exibida na tela",
  "matchedColumns": [
    2
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "testesfuncionais@gmail.com",
      "offset": 22
    }
  ],
  "location": "LoginInvalidoSteps.oUsuárioInformarO(String)"
});
formatter.result({
  "duration": 310066252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 12
    }
  ],
  "location": "LoginInvalidoSteps.informarA(String)"
});
formatter.result({
  "duration": 113123009,
  "status": "passed"
});
formatter.match({
  "location": "LoginInvalidoSteps.clicarNaOpçãoContinuar()"
});
formatter.result({
  "duration": 77929281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "E-mail ou senha incorretos",
      "offset": 3
    }
  ],
  "location": "LoginInvalidoSteps.aDeveSerExibidaNaTela(String)"
});
formatter.result({
  "duration": 839829908,
  "status": "passed"
});
formatter.after({
  "duration": 930874184,
  "status": "passed"
});
formatter.before({
  "duration": 9558371267,
  "status": "passed"
});
formatter.background({
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Cenario de Fundo"
});
formatter.step({
  "line": 11,
  "name": "que o usuário está na tela de indetificação",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginInvalidoSteps.queOUsuárioEstáNaTelaDeIndetificação()"
});
formatter.result({
  "duration": 4682884975,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Validar campos obrigatorios - E-mail ou senha incorretos",
  "description": "",
  "id": "testar-os-metodos-de-login-invalidos;validar-campos-obrigatorios---\u003cmensagem\u003e;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "o usuário informar o \"123456@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "informar a \"testesfuncionais\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "clicar na opção continuar",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "a \"E-mail ou senha incorretos\" deve ser exibida na tela",
  "matchedColumns": [
    2
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "123456@gmail.com",
      "offset": 22
    }
  ],
  "location": "LoginInvalidoSteps.oUsuárioInformarO(String)"
});
formatter.result({
  "duration": 267541894,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testesfuncionais",
      "offset": 12
    }
  ],
  "location": "LoginInvalidoSteps.informarA(String)"
});
formatter.result({
  "duration": 134655004,
  "status": "passed"
});
formatter.match({
  "location": "LoginInvalidoSteps.clicarNaOpçãoContinuar()"
});
formatter.result({
  "duration": 70205475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "E-mail ou senha incorretos",
      "offset": 3
    }
  ],
  "location": "LoginInvalidoSteps.aDeveSerExibidaNaTela(String)"
});
formatter.result({
  "duration": 2310933532,
  "status": "passed"
});
formatter.after({
  "duration": 962483918,
  "status": "passed"
});
});