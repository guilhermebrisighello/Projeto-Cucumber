# language: pt

  Funcionalidade: Receber o cupom de desconto da qazando
    Eu como usuário da qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

    Cenario: Visualizar código de desconto
      Dado que estou no site da qazando
      Quando eu desço a página
      E eu preencho meu email
      E clico no botão ganhar cupom
      Então eu vejo o código de desconto

