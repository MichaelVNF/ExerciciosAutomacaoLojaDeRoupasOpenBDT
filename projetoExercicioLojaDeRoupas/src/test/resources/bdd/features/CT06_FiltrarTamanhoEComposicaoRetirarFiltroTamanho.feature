Feature: CT06 - Clicar em Todos os produtos, filtrar pelo tamanho e composicao, e retirar o filtro Tamanho

@retiraFiltro
Scenario Outline: Filtrar e retirar filtro
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Todos os Produtos'
  And clico no link do 'Tamanho' em 'filtrar' "<tamanho>"  
  And clico no link de 'Composicao' em 'filtrar' "<composicao>"  
  And clico no link de 'Fitros ativos' para retirar "<filtro>"
  Then verificar remocao link 'Filtros ativos' "<qtdFiltrosAdd>"

Examples:
   | url                      | produto           | tamanho | composicao  | filtro  | qtdFiltrosAdd |
   | http://10.1.10.133:8080  | Vestido Estampado | L       | Algodão     | Tamanho | 2             |
