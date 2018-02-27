package br.com.rsi.exercicios.projetoExercicioLojaDeRoupas.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClass extends PageObject{

	
	//CT01 - Cadastrar novo usuario
	@FindBy(xpath = "//a[starts-with(@title,'Entrar')]")
	private WebElement linkEntrar;
	
	@FindBy(xpath = "//div[@class='no-account']/a")
	private WebElement linkCriarConta;
	
	@FindBy(xpath = "//label[@class='radio-inline']")
	private List<WebElement> rdbsTituloSocial;
	
	@FindBy(name = "firstname")
	private WebElement txtNome;
			
	@FindBy(name = "lastname")
	private WebElement txtSobreNome;
	
	@FindBy(xpath = "//label[contains(text(),'E-mail')]/following::input[1]")
	private WebElement txtEmail;
	
	@FindBy(name = "password")
	private WebElement txtSenha;
	
	@FindBy(xpath = "//button[contains(text(),'Mostrar')]")
	private WebElement btnMostrarSenha;

	@FindBy(xpath = "//div[@class='col-md-6']/following::input[@placeholder='YYYY-MM-DD']")
	private WebElement txtDtNasc;
	
	private By ckbReceberOfertas = By.name("optin");
	
	private By ckbReceberNoticias = By.name("newsletter");
	
	@FindBy(xpath = "//button[normalize-space(text())='Salvar']")
	private WebElement btnSalvar;

	@FindBy(xpath = "//div[@id='_desktop_cart']/preceding::span[@class='hidden-sm-down']")
	private WebElement spanNomeUsuario;
	
	//CT02 - Alterar senha do usuario
	@FindBy(xpath = "//button[normalize-space(text())='Entrar']")
	private WebElement btnEntrar;
	
	@FindBy(xpath = "//div[@class='links']")
	private WebElement linksOpcoesConta;
	
	@FindBy(name = "new_password")
	private WebElement txtNovaSenha;
	
	@FindBy(xpath = "//article[@role='alert']")
	private WebElement lblMsgAlteracaoDados;
			
	//CT03 - Colocar um Produto no Carrinho buscando via barra de busca
	@FindBy(name = "s")
	private WebElement txtPesquisa;
	
	@FindBy(xpath = "//span[@class='hidden-xl-down']//preceding::i[@class='material-icons search']")
	private WebElement btnPesquisar;
	
	@FindBy(xpath = "//h1[@class='h3 product-title']")
	private List<WebElement> listaLinksProdutos; 
	
	@FindBy(id = "group_1")
	private WebElement ddlTamanho;
	
	@FindBy(xpath = "//input[@class='input-color']//ancestor::label")
	private List<WebElement> listaRdbCoresProduto; 
	
	@FindBy(id = "quantity_wanted")
	private WebElement txtQuantidade;
	
	@FindBy(xpath = "//button[@data-button-action='add-to-cart']")
	private WebElement btnAdicionar;
	
	@FindBy(id = "myModalLabel")
	private WebElement lblMsgProdutoAdicionado;
			
	//CT04 - Clicar em Todos os produtos, filtrar pela cor  e adiciona-lo

	@FindBy(xpath = "//a[normalize-space(text())='Todos os produtos']")
	private WebElement linkTodosOsProdutos;
	
	@FindBy(xpath = "//a[contains(@href, 'Cor')]/ancestor::ul")
	private WebElement ulCoresFiltro; 
			
	//CT05 - Clicar em Todos os produtos, filtrar pelo tamanho e estilo, e adiciona-lo
	@FindBy(xpath = "//a[contains(@href, 'Tamanho')]/ancestor::ul")
	private WebElement ulTamanhoFiltro; 
	
	@FindBy(xpath = "//a[contains(@href, 'Estilo')]/ancestor::ul")
	private WebElement ulEstiloFiltro; 
	
	//CT06 - Clicar em Todos os produtos, filtrar pelo tamanho e composicao, e retirar o filtro Tamanho
	@FindBy(xpath = "//a[contains(@href, 'Composi')]/ancestor::ul")
	private WebElement ulComposicaoFiltro; 
	
	@FindBy(xpath = "//h1[text()='Filtros ativos']/following-sibling::ul/li")
	private List<WebElement> listaLinksFiltrosAtivos;
	
	//CT07 - Clicar em Todos os produtos, filtrar pelo preco, e retirar o todos os filtros
	@FindBy(xpath = "//a[contains(@href, 'Pre') and not(contains(@href, 'Preto')) ]/ancestor::ul")
	private WebElement ulPrecoFiltro;
	
	@FindBy(xpath = "//div[@id='_desktop_search_filters_clear_all']/button")
	private WebElement btnLimparTudo;
	
	//CT08 - Clicar em Todos os produtos, ordenar do mais barato ao mais caro, adicionar o mais barato
	@FindBy(xpath = "//button[@class='btn-unstyle select-title']")
	private WebElement btnOrdenarPor;
	
	@FindBy(xpath = "//div[@class='dropdown-menu']")
	private WebElement linksOrdenarPor;
	
    //CT09 - Navegar via menu, aumentar a quantidade do item e finalizar compra
	@FindBy(id = "top-menu")
	private WebElement menuSuperior;
	
	@FindBy(xpath = "//button[contains(@class,'-up')]")
	private WebElement btnAumentarQtd;
	
	@FindBy(xpath = "//a[text()='Finalizar pedido']")
	private WebElement btnFinalizarPedido;
	
	//CT10 - Entrar na secao Fale Conosco e enviar mensagem 
	@FindBy(xpath = "//a[text()='Fale conosco']")
	private WebElement linkFaleConosco;
	
	@FindBy(name = "id_contact")
	private WebElement ddlAssunto;

	@FindBy(name = "message")
	private WebElement txtMensagem;
	
	@FindBy(xpath = "//input[@value='Enviar']")
	private WebElement btnEnviar;
	
	@FindBy(xpath = "//div[@class='col-xs-12 alert alert-success']")
	private WebElement lblMsgMsgEnviada;
	
	public WebElement getLinkEntrar() {
		return linkEntrar;
	}

	public WebElement getLinkCriarConta() {
		return linkCriarConta;
	}

	public List<WebElement> getRdbsTituloSocial() {
		return rdbsTituloSocial;
	}

	public WebElement getTxtNome() {
		return txtNome;
	}

	public WebElement getTxtSobreNome() {
		return txtSobreNome;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtSenha() {
		return txtSenha;
	}

	public WebElement getBtnMostrarSenha() {
		return btnMostrarSenha;
	}

	public WebElement getTxtDtNasc() {
		return txtDtNasc;
	}

	public By getCkbReceberOfertas() {
		return ckbReceberOfertas;
	}

	public By getCkbReceberNoticias() {
		return ckbReceberNoticias;
	}

	public WebElement getBtnSalvar() {
		return btnSalvar;
	}

	public WebElement getSpanNomeUsuario() {
		return spanNomeUsuario;
	}

	public WebElement getBtnEntrar() {
		return btnEntrar;
	}

	public WebElement getLinksOpcoesConta() {
		return linksOpcoesConta;
	}

	public WebElement getTxtNovaSenha() {
		return txtNovaSenha;
	}

	public WebElement getLblMsgAlteracaoDados() {
		return lblMsgAlteracaoDados;
	}

	public WebElement getTxtPesquisa() {
		return txtPesquisa;
	}

	public WebElement getBtnPesquisar() {
		return btnPesquisar;
	}

	public List<WebElement> getListaLinksProdutos() {
		return listaLinksProdutos;
	}

	public WebElement getDdlTamanho() {
		return ddlTamanho;
	}

	public List<WebElement> getListaRdbCoresProduto() {
		return listaRdbCoresProduto;
	}

	public WebElement getTxtQuantidade() {
		return txtQuantidade;
	}

	public WebElement getBtnAdicionar() {
		return btnAdicionar;
	}

	public WebElement getLblMsgProdutoAdicionado() {
		return lblMsgProdutoAdicionado;
	}

	public WebElement getLinkTodosOsProdutos() {
		return linkTodosOsProdutos;
	}

	public WebElement getUlCoresFiltro() {
		return ulCoresFiltro;
	}

	public WebElement getUlTamanhoFiltro() {
		return ulTamanhoFiltro;
	}

	public WebElement getUlEstiloFiltro() {
		return ulEstiloFiltro;
	}

	public WebElement getUlComposicaoFiltro() {
		return ulComposicaoFiltro;
	}

	public List<WebElement> getListaLinksFiltrosAtivos() {
		return listaLinksFiltrosAtivos;
	}

	public WebElement getUlPrecoFiltro() {
		return ulPrecoFiltro;
	}

	public WebElement getBtnLimparTudo() {
		return btnLimparTudo;
	}

	public WebElement getBtnOrdenarPor() {
		return btnOrdenarPor;
	}

	public WebElement getLinksOrdenarPor() {
		return linksOrdenarPor;
	}

	public WebElement getMenuSuperior() {
		return menuSuperior;
	}

	public WebElement getBtnAumentarQtd() {
		return btnAumentarQtd;
	}

	public WebElement getBtnFinalizarPedido() {
		return btnFinalizarPedido;
	}

	public WebElement getLinkFaleConosco() {
		return linkFaleConosco;
	}

	public WebElement getDdlAssunto() {
		return ddlAssunto;
	}

	public WebElement getTxtMensagem() {
		return txtMensagem;
	}

	public WebElement getBtnEnviar() {
		return btnEnviar;
	}

	public WebElement getLblMsgMsgEnviada() {
		return lblMsgMsgEnviada;
	}

	
	
	
	
}
