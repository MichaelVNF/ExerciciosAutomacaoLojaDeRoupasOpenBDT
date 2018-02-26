Feature: CT04 - Clicar em Todos os produtos, filtrar pela cor e adiciona-lo

@filtraCor
Scenario Outline: Filtrar cor do produto
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Todos os Produtos'
  And clico no link da 'Cor' em 'filtrar' "<cor>"  
  And clico no link do produto "<produto>"   
  And seleciono o ddl 'Tamanho' "<tamanho>"
  And seleciono o rdb 'Cor' do produto "<cor>"
  And preencho o campo 'Quantidade' "<quantidade>"
  And clico no botao 'Adicionar'
  Then verifico se o produto foi adicionado
 

Examples:
   | url                      | produto                      | tamanho | cor   | quantidade |
   | http://10.1.10.133:8080  | Vestido De Chiffon Estampado | M       | Verde | 3          |
