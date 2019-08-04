package br.com.kasolution.dados;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.kasolution.constantes.PrazoMaturidade;
import br.com.kasolution.dominio.Conta;
import br.com.kasolution.dominio.ContaAPrazo;
import br.com.kasolution.dominio.ContaCorrente;

public class BD {
	
	private static ArrayList<Conta> contas;
	
	public BD() {
		
	}
	
	public static ArrayList<Conta> getContas(){
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new ContaCorrente("1234-0", LocalDate.now(), 10_000.00));
		contas.add(new ContaCorrente("1234-1", LocalDate.now(), 12_000.00));
		
		contas.add(new ContaAPrazo("1234-2", LocalDate.now(), PrazoMaturidade.SEIS_MESES));
		contas.add(new ContaAPrazo("1234-3", LocalDate.of(2018,10,5), PrazoMaturidade.DOZE_MESES));
		return contas;
	}

}
