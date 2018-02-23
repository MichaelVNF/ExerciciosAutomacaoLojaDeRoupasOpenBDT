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
	
}
