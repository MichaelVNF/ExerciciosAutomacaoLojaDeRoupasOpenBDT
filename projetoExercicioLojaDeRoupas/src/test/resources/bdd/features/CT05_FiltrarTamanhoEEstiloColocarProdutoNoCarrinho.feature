Feature: CT05 - Clicar em Todos os produtos, filtrar pelo tamanho e estilo, e adiciona-lo

@filtraTamanhoEEstilo
Scenario Outline: Filtrar tamanho e estilo do produto
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Todos os Produtos'
  And clico no link do 'Tamanho' em 'filtrar' "<tamanho>"  
  And clico no link do 'Estilo' em 'filtrar' "<estilo>"  
  And clico no link do produto "<produto>"   
  And seleciono o ddl 'Tamanho' "<tamanho>"
  And seleciono o rdb 'Cor' do produto "<cor>"
  And preencho o campo 'Quantidade' "<quantidade>"
  And clico no botao 'Adicionar'
  Then verifico se o produto foi adicionado
 
	
Examples:
   | url                      | produto           | tamanho | estilo  | cor   | quantidade |
   | http://10.1.10.133:8080  | Vestido Estampado | L       | Vistoso | Bege  | 3          |
