package br.com.ingressos.types;

public enum Ingressos {
	CADEIRA_SUPERIOR(90.00), 
	CADEIRA_INFERIOR(150.00);
	
	private Double valor; 
	
	private Ingressos(Double valor){
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}

}
