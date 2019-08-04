package br.com.kasolution.teste;

import java.util.ArrayList;

import br.com.kasolution.constantes.StatusTransacao;
import br.com.kasolution.dados.BD;
import br.com.kasolution.dominio.Conta;

public class TesteDeposito {
	
	public static void main(String[] args) {
		ArrayList<Conta> contas = BD.getContas();
		for (Conta c : contas) {
			StatusTransacao resp = c.saca(20_000.00);
			if (resp != StatusTransacao.SUCESSO ) {
				System.out.println("Operação de saque não realizada.");
				System.out.print("Motivo: ");
				System.out.println(resp.getInformacao());
			}
			System.out.println(c + "\n\n");
		}
		
	}
} 

