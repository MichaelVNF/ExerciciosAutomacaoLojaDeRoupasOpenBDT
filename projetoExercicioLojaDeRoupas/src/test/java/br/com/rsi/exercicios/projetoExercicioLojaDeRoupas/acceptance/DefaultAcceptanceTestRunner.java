package br.com.rsi.exercicios.projetoExercicioLojaDeRoupas.acceptance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.openbdt.cucumber.CucumberWithOpenBdt;

@RunWith(CucumberWithOpenBdt.class)
@CucumberOptions(features = {"src/test/resources/bdd/features/CT03_ColocarProdutoNoCarrinhoBuscandoViaBarraDeBusca.feature"}, glue = {"br.com.rsi.exercicios.projetoExercicioLojaDeRoupas.steps.definition"})
public class DefaultAcceptanceTestRunner {}
