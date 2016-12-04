#language: pt

  Funcionalidade: Testar os metodos de login invalidos

    NARRATIVA:
    Como usuário
    Ao informar email ou senha de acesso invalido
    Uma mensagem de email ou senha invalido deve ser exibido na tela

  Cenario de Fundo:
    Dado que o usuário está na tela de indetificação

    Esquema do Cenario: Validar campos obrigatorios - <mensagem>
      Quando o usuário informar o "<e-mail>"
      E informar a "<senha>"
      E clicar na opção continuar
      Entao a "<mensagem>" deve ser exibida na tela

      Exemplos:
        |e-mail|senha|mensagem|
        |testesfuncionais@gmail.com|123456|E-mail ou senha incorretos|
        |123456@gmail.com|testesfuncionais|E-mail ou senha incorretos|
