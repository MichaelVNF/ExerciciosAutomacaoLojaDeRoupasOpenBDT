Feature: CT01 - Cadastrar novo usuario

@cadastraUsuario
Scenario Outline: Cadastrar usuario
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Entrar'
  And clico no link 'Não tem uma conta? Crie uma aqui'
  And seleciono o rdb 'Titulo Social' "<tituloSocial>"
  And preencho o campo 'Nome' "<nome>"
  And preencho o campo 'sobreNome' "<sobreNome>"
  And preencho o campo 'E-mail' "<email>" "<modoOperacao>"
  And preencho o campo 'Senha' "<senha>"
  And clico no botao 'Mostrar'
  And preencho o campo 'Data de Nascimento' "<dtNasc>"
  And seleciono o ckb 'Receber Ofertas' "<receberOfertas>"
  And seleciono o ckb 'Receber Noticias' "<receberNoticias>"
  And clico no botao 'Salvar'
  Then verificar se usuario foi logado "<nome>" "<sobreNome>"

Examples:
   | url                      | tituloSocial       | nome  | sobreNome | email                | modoOperacao | senha       | dtNasc     | receberOfertas | receberNoticias | 
   | http://10.1.10.133:8080  | Sr.                | Mario | Bros      | Mario.Bros@email.com | Cadastro     | super666777 | 1970-05-31 | true           | true            |

