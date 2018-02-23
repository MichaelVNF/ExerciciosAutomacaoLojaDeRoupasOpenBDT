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
	
	@FindBy(name = "email")
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
	
	@FindBy(xpath = "//button[@data-text-show='Mostrar']//following::button[@data-text-show='Mostrar']")
	private WebElement btnMostrarNovaSenha;
	
	@FindBy(xpath = "//article[@role='alert']")
	private WebElement lblMsgAlteracaoDados;
			
	//CT03 - Colocar um Produto no Carrinho buscando via barra de busca
	@FindBy(xpath = "//input[@name='s']")
	private WebElement txtPesquisa;
	
	@FindBy(xpath = "//i[@class='material-icons search']/preceding::button[position()=2]")//poderiamos substituir o 'position()=2' por apenas '2'
	private WebElement btnPesquisar;
	
	
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

	public WebElement getBtnMostrarNovaSenha() {
		return btnMostrarNovaSenha;
	}

	public WebElement getLblMsgAlteracaoDados() {
		return lblMsgAlteracaoDados;
	}
	
	
	
	
	
	
	
}
