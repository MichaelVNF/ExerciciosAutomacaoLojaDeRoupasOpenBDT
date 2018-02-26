Feature: CT09 - Navegar via menu, aumentar a quantidade do item e finalizar compra

@procuraProdutoViaMenu
Scenario Outline: Navegar no menu
  Given estou na pagina inicial do site "<url>"
  When sobreponho o cursor no link do menu superior "<categoria>"
  And clico no link do menu superior "<subcategoria>"  
  And clico no link do produto "<produto>" 
  And seleciono o ddl 'Tamanho' "<tamanho>"
  And seleciono o rdb 'Cor' do produto "<cor>"
  And clico no botao para aumentar a 'Quantidade' "<quantidade>"
  And clico no botao 'Adicionar'
  And verifico se o produto foi adicionado
  Then clico no botao 'Finalizar Pedido'

Examples:
   | url                      |  categoria | subcategoria | produto | tamanho | cor  | quantidade |
   | http://10.1.10.133:8080  |   WOMEN    | T-shirts     |         | M       | Azul | 6          |

#Se o valor do 'produto' for vazio, o 1º, por padrao, será selecionado