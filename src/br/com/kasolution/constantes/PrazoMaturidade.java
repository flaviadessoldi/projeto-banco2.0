package br.com.kasolution.constantes;

public enum PrazoMaturidade {
	
	SEIS_MESES(6),
	DOZE_MESES(12),
	DEZOITO_MESES(18);
	
	private int meses;
	
	private PrazoMaturidade(int meses) {
		this.meses = meses;
		
	}

	public int getMeses() {
		return meses;
	}

}
