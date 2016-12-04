#language: pt

Funcionalidade: Testar as funcionalidades de adicionar e remover produto do carrinho

  NARRATIVA:
  Como usuário
  Gostaria de adicionar produtos ao carrinho
  Ao remover produto do carrinho
  Uma mensagem deve ser exibida informando que o carrinho está vazio

  Cenario de Fundo:
    Dado que o usuário está na pagina da categoria pré-venda

    Cenario: Adicionar produto ao carrinho
      Quando o usuário estiver da pagina de detalhes do produto
      E clicar na opção comprar
      Então o produto deve ser adicionado ao carrinho de compras

  Cenario: Remover produto do carrinho
    Quando o usuário estiver com produto adicionado no carrinho
    E clicar na opção retirar produto do carrinho
    Entao uma mensagem informando que o carrinho está vazio deve ser exibida na tela



