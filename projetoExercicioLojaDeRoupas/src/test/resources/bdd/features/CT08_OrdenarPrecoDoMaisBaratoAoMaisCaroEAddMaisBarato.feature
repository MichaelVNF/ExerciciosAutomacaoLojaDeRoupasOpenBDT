Feature: CT08 - Clicar em Todos os produtos, ordenar do mais barato ao mais caro, adicionar o mais barato
 
@ordenaProdutos
Scenario Outline: Ordenar por preco
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Todos os Produtos'
  And clico no link 'Ordenar por' "<criterio>"
  And clico no link do produto "<produto>"   
  And preencho o campo 'Quantidade' "<quantidade>"
  And clico no botao 'Adicionar'
  Then verifico se o produto foi adicionado

Examples:
   | url                      | produto | criterio                          | quantidade |
   | http://10.1.10.133:8080  |         | Preço, do mais baixo ao mais alto | 1          |

#Se o valor do 'produto' for vazio, o 1º, por padrao, será selecionado