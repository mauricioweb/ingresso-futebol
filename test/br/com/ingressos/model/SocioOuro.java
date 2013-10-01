package br.com.ingressos.model;

import br.com.ingressos.service.Espectador;

public class SocioOuro implements Espectador {
	
	public double getDesconto(){
		return 0.5;
	}

}
