package br.com.kasolution.dominio;

import static br.com.kasolution.util.Util.*;

import java.time.LocalDate;

import br.com.kasolution.constantes.PrazoMaturidade;
import br.com.kasolution.constantes.StatusTransacao;

public class ContaAPrazo extends Conta {
	
	private LocalDate dataMaturidade;

	public ContaAPrazo() {
		
	}

	public ContaAPrazo(String numero, LocalDate dataAbertura, PrazoMaturidade prazo) {
		this(numero, dataAbertura, 0, prazo);
	}

	public ContaAPrazo(String numero, LocalDate dataAbertura, double saldo, PrazoMaturidade prazo) {
		super(numero, dataAbertura, saldo);
		this.dataMaturidade = dataAbertura.plusMonths(prazo.getMeses());
	}

	public LocalDate getDataMaturidade() {
		return dataMaturidade;
	}

	public void setDataMaturidade(LocalDate dataMaturidade) {
		this.dataMaturidade = dataMaturidade;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "\nData Maturidade: " + (formata(dataMaturidade));
		return info;
	}
	
	@Override
	public StatusTransacao saca(double valor) {
		if (valor <=0) {
			return StatusTransacao.VALOR_INCORRETO;
		} else {
			LocalDate hoje = LocalDate.now();
			if (hoje.isAfter(dataMaturidade)) {
				if (getSaldo() >= valor) {
					setSaldo(getSaldo()-valor);
					return StatusTransacao.SUCESSO;
				} else {
				return StatusTransacao.SALDO_INSUFICIENTE;
			} 
				
			}else {
					return StatusTransacao.DATA_MATURIDADE_MENOR;
				}
		}
	}
}//fim saca

	

