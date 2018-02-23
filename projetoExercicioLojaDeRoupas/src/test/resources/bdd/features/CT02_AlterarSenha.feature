Feature: CT02 - Alterar senha do usuario

@alteraSenha
Scenario Outline: Alterar senha
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Entrar'
   And preencho o campo 'E-mail' "<email>" "<modoOperacao>"
   And preencho o campo 'Senha' "<senha>"
   And clico no botao 'Entrar'
   And clico no 'link especifico' de opcoes da conta "<linkOpcoesConta>"
   And preencho o campo 'Senha' "<senha>"
   And clico no botao 'Mostrar'
   And preencho o campo 'Nova Senha' "<senha>"
   And clico no botao 'Mostrar'
   And clico no botao 'Salvar'
  Then verificar alteracao dos dados "<msg>"
 

Examples:
   | url                      | tituloSocial       | nome  | sobreNome | email                | modoOperacao | senha       | linkOpcoesConta   | msg                                  |
   | http://10.1.10.133:8080  | Sr.                | Mario | Bros      | Mario.Bros@email.com | Login        | super777666 | Informação        | Informações atualizadas com sucesso. |

