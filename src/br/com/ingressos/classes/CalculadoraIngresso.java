package br.com.ingressos.classes;

import br.com.ingressos.service.Espectador;
import br.com.ingressos.types.Ingressos;


public class CalculadoraIngresso {

	private Ingressos ingresso;
	private Espectador espectador;

	public CalculadoraIngresso(Espectador espectador,Ingressos ingresso) {
		this.espectador = espectador;
		this.ingresso = ingresso;
	}


	public double calcular() {
		return ingresso.getValor() * espectador.getDesconto();
	}

}
