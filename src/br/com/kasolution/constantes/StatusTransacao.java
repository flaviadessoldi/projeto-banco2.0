package br.com.kasolution.constantes;

public enum StatusTransacao {
	
	SUCESSO("Transação realizada!"),
	VALOR_INCORRETO("Valor informado incorreto!"),
	SALDO_INSUFICIENTE("O cliente não possui saldo!"),
	DATA_MATURIDADE_MENOR("A data de maturidade não foi atingida!");
	
	private String informacao;

	private StatusTransacao(String informacao) {
		this.informacao = informacao;
	}

	public String getInformacao() {
		return informacao;
	}

	
}
