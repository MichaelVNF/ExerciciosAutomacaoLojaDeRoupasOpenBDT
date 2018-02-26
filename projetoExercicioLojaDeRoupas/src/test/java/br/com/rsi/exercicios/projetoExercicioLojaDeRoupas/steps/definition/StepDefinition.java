package br.com.rsi.exercicios.projetoExercicioLojaDeRoupas.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import br.com.rsi.exercicios.projetoExercicioLojaDeRoupas.steps.business.StepBusiness;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinition {

	@Steps
	StepBusiness stepB;
	
	@Given("^estou na pagina inicial do site \"([^\"]*)\"$")
	public void estou_na_pagina_inicial_do_site(String url) throws Throwable {
	    stepB.abrirPagina(url);
	}
	
	//CT01 - Cadastrar novo usuario
	@When("^clico no link 'Entrar'$")
	public void clico_no_link_Entrar() throws Throwable {
	    stepB.clicarLinkEntrar();
	}

	@When("^clico no link 'Não tem uma conta\\? Crie uma aqui'$")
	public void clico_no_link_Não_tem_uma_conta_Crie_uma_aqui() throws Throwable {
	    stepB.clicarLinkCriarConta();
	}

	@When("^seleciono o rdb 'Titulo Social' \"([^\"]*)\"$")
	public void seleciono_o_rdb_Titulo_Social(String tituloSocial) throws Throwable {
	    stepB.selecionarRdbTituloSocial(tituloSocial);
	}

	@When("^preencho o campo 'Nome' \"([^\"]*)\"$")
	public void preencho_o_campo_Nome(String nome) throws Throwable {
	    stepB.preencherCampoNome(nome);
	}

	@When("^preencho o campo 'sobreNome' \"([^\"]*)\"$")
	public void preencho_o_campo_sobreNome(String sobreNome) throws Throwable {
	    stepB.preencherCampoSobreNome(sobreNome);
	}

	@When("^preencho o campo 'E-mail' \"([^\"]*)\" \"([^\"]*)\"$")
	public void preencho_o_campo_E_mail(String email, String modoOperacao) throws Throwable {
	    stepB.preencherCampoEmail(email, modoOperacao);
	}

	@When("^preencho o campo 'Senha' \"([^\"]*)\"$")
	public void preencho_o_campo_Senha(String senha) throws Throwable {
	    stepB.preencherCampoSenha(senha);
	}

	@When("^clico no botao 'Mostrar'$")
	public void clico_no_botao_Mostrar() throws Throwable {
	    stepB.clicarBtnMostrar();
	}

	@When("^preencho o campo 'Data de Nascimento' \"([^\"]*)\"$")
	public void preencho_o_campo_Data_de_Nascimento(String dtNasc) throws Throwable {
	    stepB.preencherCampoDtNasc(dtNasc);
	}

	@When("^seleciono o ckb 'Receber Ofertas' \"([^\"]*)\"$")
	public void seleciono_o_ckb_Receber_Ofertas(boolean receberOfertas) throws Throwable {
	    stepB.selecionarCkbReceberOfertas(receberOfertas);
	}

	@When("^seleciono o ckb 'Receber Noticias' \"([^\"]*)\"$")
	public void seleciono_o_ckb_Receber_Noticias(boolean receberNoticias) throws Throwable {
	    stepB.selecionarCkbReceberNoticias(receberNoticias);
	}

	@When("^clico no botao 'Salvar'$")
	public void clico_no_botao_Salvar() throws Throwable {
	    stepB.clicarBtnSalvar();
	}
	
	@Then("^verificar se usuario foi logado \"([^\"]*)\" \"([^\"]*)\"$")
	public void verificar_se_usuario_foi_logado(String nome, String sobreNome) throws Throwable {
	    stepB.verificarUsuarioLogado(nome, sobreNome);
	}
	
	//CT02 - Alterar senha do usuario
	@When("^clico no botao 'Entrar'$")
	public void clico_no_botao_Entrar() throws Throwable {
	    stepB.clicarBtnEntrar();
	}

	@When("^clico no 'link especifico' de opcoes da conta \"([^\"]*)\"$")
	public void clico_no_link_especifico_de_opcoes_da_conta(String opcao) throws Throwable {
	    stepB.clicarLinkOpcoesConta(opcao);
	}

	@When("^preencho o campo 'Nova Senha' \"([^\"]*)\"$")
	public void preencho_o_campo_Nova_Senha(String novaSenha) throws Throwable {
	    stepB.preencherCampoNovaSenha(novaSenha);
	}

	@Then("^verificar alteracao dos dados \"([^\"]*)\"$")
	public void verificar_alteracao_dos_dados(String msg) throws Throwable {
	    stepB.verificarAlteracaoDados(msg);
	}
	
	//CT03 - Colocar um Produto no Carrinho buscando via barra de busca
	@When("^preencho o campo 'Pesquisar' \"([^\"]*)\"$")
	public void preencho_o_campo_Pesquisar(String pesquisa) throws Throwable {
	    stepB.preencherCampoPesquisa(pesquisa);
	}

	@When("^clico no botao 'Pesquisar'$")
	public void clico_no_botao_Pesquisar() throws Throwable {
	    stepB.clicarBtnPesquisar();
	}

	@When("^clico no link do produto \"([^\"]*)\"$")
	public void clico_no_link_do_produto(String produto) throws Throwable {
	    stepB.clicarLinkProduto(produto);
	}
	
	@When("^seleciono o ddl 'Tamanho' \"([^\"]*)\"$")
	public void seleciono_o_ddl_Tamanho(String tamanho) throws Throwable {
	    stepB.selecionarDdlTamanho(tamanho);
	}

	@When("^seleciono o rdb 'Cor' do produto \"([^\"]*)\"$")
	public void seleciono_o_rdb_Cor_do_produto(String cor) throws Throwable {
	    stepB.selecionarCorProduto(cor);
	}

	@When("^preencho o campo 'Quantidade' \"([^\"]*)\"$")
	public void preencho_o_campo_Quantidade(String qtd) throws Throwable {
	    stepB.preencherCampoQuantidade(qtd);
	}

	@When("^clico no botao 'Adicionar'$")
	public void clico_no_botao_Adicionar() throws Throwable {
	    stepB.clicarBtnAdicionar();
	}

	@Then("^verifico se o produto foi adicionado$")
	public void verifico_se_o_produto_foi_adicionado() throws Throwable {
	    stepB.verificarProdutoAdicionadoAoCarrinho();
	}
	
	//CT04 - Clicar em Todos os produtos, filtrar pela cor  e adiciona-lo
	@When("^clico no link 'Todos os Produtos'$")
	public void clico_no_link_Todos_os_Produtos() throws Throwable {
	    stepB.clicarLinkTodosOsProdutos();
	}

	@When("^clico no link da 'Cor' em 'filtrar' \"([^\"]*)\"$")
	public void clico_no_link_da_Cor_em_filtrar(String cor) throws Throwable {
	    stepB.clicarLinkCorProduto(cor);
	}
	
	//CT05 - Clicar em Todos os produtos, filtrar pelo tamanho e estilo, e adiciona-lo
	@When("^clico no link do 'Tamanho' em 'filtrar' \"([^\"]*)\"$")
	public void clico_no_link_do_Tamanho_em_filtrar(String tamanho) throws Throwable {
	    stepB.clicarLinkTamanho(tamanho);
	}

	@When("^clico no link do 'Estilo' em 'filtrar' \"([^\"]*)\"$")
	public void clico_no_link_do_Estilo_em_filtrar(String estilo) throws Throwable {
	    stepB.clicarLinkEstilo(estilo);
	}
	
	//CT06 - Clicar em Todos os produtos, filtrar pelo tamanho e composicao, e retirar o filtro Tamanho
	@When("^clico no link de 'Composicao' em 'filtrar' \"([^\"]*)\"$")
	public void clico_no_link_de_Composicao_em_filtrar(String composicao) throws Throwable {
	    stepB.clicarLinkComposicao(composicao);
	}

	@When("^clico no link de 'Fitros ativos' para retirar \"([^\"]*)\"$")
	public void clico_no_link_de_Fitros_ativos_para_retirar(String filtro) throws Throwable {
	    stepB.clicarLinkFiltrosAtivos(filtro);
	}
	
	@Then("^verificar remocao link 'Filtros ativos' \"([^\"]*)\"$")
	public void verificar_remocao_link_Filtros_ativos(int qtdFiltrosAdd) throws Throwable {
	    stepB.verificarRemocaoLinkFiltrosAtivos(qtdFiltrosAdd);
	}
}
