package br.com.ingressos.model;

import br.com.ingressos.service.Espectador;

public class TorcedorComum implements Espectador {

	@Override
	public double getDesconto() {
		return 1;
	}

}
