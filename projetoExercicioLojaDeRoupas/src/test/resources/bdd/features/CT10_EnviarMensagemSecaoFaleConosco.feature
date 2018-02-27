Feature: CT10 - Entrar na secao Fale Conosco e enviar mensagem 

@enviaMensagem
Scenario Outline: Enviar mensagem
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Fale Conosco'
  And seleciono a ddl 'Assunto' "<assunto>"
  And preencho o campo 'E-mail' "<email>" "<modoOperacao>"
  And preencho o campo 'Mensagem' "<mensagem>"
  And clico no botao 'Enviar'
  Then verifico o envio da mensagem

Examples:
   | url                      | assunto   | email           | modoOperacao | mensagem                   |
   | http://10.1.10.133:8080  | Webmaster | teste@email.com | Normal       | Esta é uma mensagem teste. |

#Se o valor do 'produto' for vazio, o 1º, por padrao, será selecionado