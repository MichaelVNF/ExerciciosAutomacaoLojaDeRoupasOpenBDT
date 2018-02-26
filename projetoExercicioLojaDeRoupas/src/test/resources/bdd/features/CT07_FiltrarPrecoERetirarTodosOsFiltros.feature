Feature: CT07 - Clicar em Todos os produtos, filtrar pelo preco, e retirar o todos os filtros
 
@retiraTodosFiltros
Scenario Outline: Filtrar e retirar todos filtros
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Todos os Produtos'
  And clico no link do 'Preco' em 'filtrar' "<preco>"  
  And clico no botao 'Limpar tudo'
  Then verificar remocao de todos os filtros

Examples:
   | url                      | produto           | preco             | qtdFiltrosAdd |
   | http://10.1.10.133:8080  | Vestido Estampado | R$25,00 - R$38,00 | 1             |
