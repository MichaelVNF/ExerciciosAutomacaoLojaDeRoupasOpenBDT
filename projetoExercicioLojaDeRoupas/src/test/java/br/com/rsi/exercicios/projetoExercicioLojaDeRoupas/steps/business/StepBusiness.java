package br.com.rsi.exercicios.projetoExercicioLojaDeRoupas.steps.business;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import br.com.rsi.exercicios.projetoExercicioLojaDeRoupas.pages.PageObjectClass;
import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusiness {

	PageObjectClass page;
	private static Logger LOG = Logger.getLogger(StepBusiness.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	@Step
	public void abrirPagina(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	//CT01 - Cadastrar novo usuario
	public void clicarLinkEntrar() {
		viewElement.click(page.getLinkEntrar());
	}

	public void clicarLinkCriarConta() {
		viewElement.waitForElementIsPresent(10, page.getLinkCriarConta());
		viewElement.click(page.getLinkCriarConta());
	}

	public void selecionarRdbTituloSocial(String tituloSocial) {
		if(tituloSocial.equals("Sr."))
			viewElement.click(page.getRdbsTituloSocial().get(0));
		else
			viewElement.click(page.getRdbsTituloSocial().get(1));
	}

	public void preencherCampoNome(String nome) {
		viewElement.sendText(page.getTxtNome(), nome);
	}

	public void preencherCampoSobreNome(String sobreNome) {
		viewElement.sendText(page.getTxtSobreNome(), sobreNome);
	}

	public void preencherCampoEmail(String email, String modoOperacao) {
		if(modoOperacao.equals("Cadastro")) {
			String emailAleatorio[] = email.split("@");
			email = emailAleatorio[0] + UUID.randomUUID() + "@" + emailAleatorio[1];
		}
		
		viewElement.sendText(page.getTxtEmail(), email);
	}

	public void preencherCampoSenha(String senha) {
		viewElement.sendText(page.getTxtSenha(), senha);
	}

	public void clicarBtnMostrar() {
		viewElement.click(page.getBtnMostrarSenha());
	}

	public void preencherCampoDtNasc(String dtNasc) {
		viewElement.sendText(page.getTxtDtNasc(), dtNasc);
	}

	public void selecionarCkbReceberOfertas(boolean receberOfertas) {
		if(receberOfertas)
			viewElement.findElement(page.getCkbReceberOfertas()).click();
	}

	public void selecionarCkbReceberNoticias(boolean receberNoticias) {
		if(receberNoticias)
			viewElement.findElement(page.getCkbReceberNoticias()).click();
	}

	public void clicarBtnSalvar() {
		viewElement.click(page.getBtnSalvar());
	}
	
	public void verificarUsuarioLogado(String nome, String sobreNome) {
		viewElement.waitForElementIsPresent(10, page.getSpanNomeUsuario());
		LOG.info("\nNOME DO USUÁRIO LOGADO: " + page.getSpanNomeUsuario().getText());
		assertTrue(page.getSpanNomeUsuario().getText().contains(nome + " " + sobreNome));
	}
	
	//CT02 - Alterar senha do usuario
	public void clicarBtnEntrar() {
		viewElement.click(page.getBtnEntrar());
	}
		
	public void clicarLinkOpcoesConta(String opcao) {
		viewElement.waitForElementIsPresent(10,page.getLinksOpcoesConta().findElement(By.partialLinkText(opcao.toUpperCase())));
		LOG.info("\nOPÇÃO DE CONTA: " + page.getLinksOpcoesConta().findElement(By.partialLinkText(opcao.toUpperCase())).getText());
		viewElement.click(page.getLinksOpcoesConta().findElement(By.partialLinkText(opcao.toUpperCase())));
	}

	public void preencherCampoNovaSenha(String novaSenha) {
		viewElement.sendText(page.getTxtNovaSenha(), novaSenha);
	}

	public void verificarAlteracaoDados(String msg) {
		viewElement.waitForElementIsPresent(10, page.getLblMsgAlteracaoDados());
		assertTrue(page.getLblMsgAlteracaoDados().getText().contains(msg));
	}
	
	//CT03 - Colocar um Produto no Carrinho buscando via barra de busca
	public void preencherCampoPesquisa(String pesquisa) {
		viewElement.sendText(page.getTxtPesquisa(), pesquisa);
	}
	
	public void clicarBtnPesquisar() {
		viewElement.click(page.getBtnPesquisar());
	}
	
	public void clicarLinkProduto(String produto) {
		for(WebElement l : page.getListaLinksProdutos()) 
		{
			LOG.info("PRODUTO: " + l.getText());
			viewElement.mouseOver(l);
			
			if(l.getText().contains(produto)) {
				l.click();
				break;
			}	
		}
	}

	public void selecionarDdlTamanho(String tamanho) {
		viewElement.waitForElementIsPresent(10, page.getDdlTamanho());
		viewElement.selectByVisibleText(page.getDdlTamanho(), tamanho);
	}

	public void selecionarCorProduto(String cor) {
		for(WebElement l : page.getListaRdbCoresProduto())
		{	
			LOG.info("COR PRODUTO: " + l.getText());
			if(l.getText().contains(cor)) {
				l.click();
				break;
			}
		}
	}
	
	public void preencherCampoQuantidade(String qtd) {
		viewElement.clear(page.getTxtQuantidade());
		viewElement.sendText(page.getTxtQuantidade(), qtd);
	}
	
	public void clicarBtnAdicionar() {
		viewElement.click(page.getBtnAdicionar());
	}
	
	public void verificarProdutoAdicionadoAoCarrinho() {
	    viewElement.waitForElementIsPresent(10, page.getLblMsgProdutoAdicionado());
		assertTrue(page.getLblMsgProdutoAdicionado().isDisplayed());
	}
	
	//CT04 - Clicar em Todos os produtos, filtrar pela cor  e adiciona-lo
	public void clicarLinkTodosOsProdutos() {
		viewElement.waitForElementIsPresent(10, page.getLinkTodosOsProdutos());
		viewElement.click(page.getLinkTodosOsProdutos());
	}
	
	public void clicarLinkCorProduto(String cor) {
		viewElement.waitForElementIsPresent(10, page.getUlCoresFiltro().findElement(By.partialLinkText(cor)));
		viewElement.click(page.getUlCoresFiltro().findElement(By.partialLinkText(cor)));
	}

	//CT05 - Clicar em Todos os produtos, filtrar pelo tamanho e estilo, e adiciona-lo
	public void clicarLinkTamanho(String tamanho) {
		viewElement.waitForElementIsPresent(10, page.getUlTamanhoFiltro().findElement(By.partialLinkText(tamanho)));
		viewElement.click(page.getUlTamanhoFiltro().findElement(By.partialLinkText(tamanho)));
	}

	public void clicarLinkEstilo(String estilo) {
		viewElement.waitForElementIsPresent(10, page.getUlEstiloFiltro().findElement(By.partialLinkText(estilo)));
		viewElement.click(page.getUlEstiloFiltro().findElement(By.partialLinkText(estilo)));
	}
	
	//CT06 - Clicar em Todos os produtos, filtrar pelo tamanho e composicao, e retirar o filtro Tamanho
	public void clicarLinkComposicao(String composicao) {
		viewElement.waitForElementIsPresent(10, page.getUlComposicaoFiltro().findElement(By.partialLinkText(composicao)));
		viewElement.click(page.getUlComposicaoFiltro().findElement(By.partialLinkText(composicao)));
	}
	
	public void clicarLinkFiltrosAtivos(String filtro) {
		for(WebElement l : page.getListaLinksFiltrosAtivos())
		{	
			LOG.info("FILTROS ATIVOS: " + l.getText());
			if(l.getText().contains(filtro)) {
				l.findElement(By.tagName("i")).click();
				break;
			}
		}
	}
	
	public void verificarRemocaoLinkFiltrosAtivos(int qtdFiltrosAdd) {
		qtdFiltrosAdd--;
		viewElement.waitForElementIsPresent(10, page.getListaLinksFiltrosAtivos().get(0));
		assertTrue(page.getListaLinksFiltrosAtivos().size() == qtdFiltrosAdd);
	}
	
	//CT07 - Clicar em Todos os produtos, filtrar pelo preco, e retirar o todos os filtros
	public void clicarLinkPreco(String preco) {
		viewElement.waitForElementIsPresent(10, page.getUlPrecoFiltro().findElement(By.partialLinkText(preco)));
		viewElement.click(page.getUlPrecoFiltro().findElement(By.partialLinkText(preco)));
	}
	
	public void clicarBtnLimparTudo() {
		viewElement.waitForElementIsPresent(10, page.getBtnLimparTudo());
		viewElement.click(page.getBtnLimparTudo());
	}
	
	public void verificarRemocaoTodosOsFiltros() {
		assertTrue(!page.containsText("Filtros ativos"));
	}

	//CT08 - Clicar em Todos os produtos, ordenar do mais barato ao mais caro, adicionar o mais barato
	public void clicarLinkOrdenarPor(String criterio) {
		viewElement.click(page.getBtnOrdenarPor());
		viewElement.waitForElementIsPresent(10, page.getLinksOrdenarPor().findElement(By.linkText(criterio)));
		viewElement.click(page.getLinksOrdenarPor().findElement(By.linkText(criterio)));
		
		page.waitFor(10).seconds();
	}
	
	
}
