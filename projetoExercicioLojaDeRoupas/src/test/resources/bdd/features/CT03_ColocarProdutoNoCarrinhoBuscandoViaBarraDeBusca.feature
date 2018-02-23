Feature: CT03 - Colocar um Produto no Carrinho buscando via barra de busca

@colocaProdutoCarrinho
Scenario Outline: Colocar Produto no carrinho via barra de busca
  Given estou na pagina inicial do site "<url>"
  When preencho o campo 'Pesquisar' "<pesquisa>"
  And clico no botao 'Pesquisar'
  And clico no link do produto "<produto>"   
  And seleciono o ddl 'Tamanho' "<tamanho>"
  And seleciono o rdb 'Cor' do produto "<cor>"
  And preencho o campo 'Quantidade' "<quantidade>"
  And clico no botao 'Adicionar'
  Then verifico se o produto foi adicionado
 

Examples:
   | url                      | pesquisa              | produto                      | tamanho | cor   | quantidade |
   | http://10.1.10.133:8080  | Printed Chiffon Dress | Vestido De Chiffon Estampado | M       | Verde | 3          |
