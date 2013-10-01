package br.com.ingressos.service;

import static org.junit.Assert.*;
import static br.com.ingressos.types.Ingressos.*;

import org.junit.Before;
import org.junit.Test;

import br.com.ingressos.classes.CalculadoraIngresso;
import br.com.ingressos.model.SocioOuro;
import br.com.ingressos.model.TorcedorComum;
import br.com.ingressos.types.Ingressos;

public class CalculadoraIngressoTest {

	
	private TorcedorComum torcedorComum;
	
	@Before
	public void setUp(){
		torcedorComum = new TorcedorComum();
	}
	
	@Test
	public void deveRetornaValorIntegralCadeiraInferiorParaTorcedorComum(){
		CalculadoraIngresso calculadora = new CalculadoraIngresso(torcedorComum,CADEIRA_INFERIOR);
		
		double valorTotal = calculadora.calcular();
		
		assertEquals(CADEIRA_INFERIOR.getValor(),valorTotal,0.3);
	}
	
	@Test
	public void deveRetornarValorIntegralCadeiraSuperiorParaTorcedorComum(){
		CalculadoraIngresso calculadora = new CalculadoraIngresso(torcedorComum,CADEIRA_SUPERIOR);
		
		double valorTotal = calculadora.calcular();
		
		assertEquals(Ingressos.CADEIRA_SUPERIOR.getValor(),valorTotal,0.3);		
	}
	
	@Test
	public void deveDarCinquentaPorCentoDescontoSocioOuroCadeiraSuperior(){
		SocioOuro socioOuro = new SocioOuro();
		CalculadoraIngresso calculadora = new CalculadoraIngresso(socioOuro , CADEIRA_SUPERIOR);
		Double valorIngresso = CADEIRA_SUPERIOR.getValor() * 0.5; 
		
		double valorTotal = calculadora.calcular();
		
		assertEquals(valorIngresso,valorTotal,0.3);
	}

}
