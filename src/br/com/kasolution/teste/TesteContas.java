package br.com.kasolution.teste;

import java.util.ArrayList;

import br.com.kasolution.dados.BD;
import br.com.kasolution.dominio.Conta;
import br.com.kasolution.util.Arquivador;

public class TesteContas {

	public static void main(String[] args) {
		ArrayList<Conta> contas = BD.getContas();
		for (Conta c : contas) {
			System.out.println(c +"\n");
			Arquivador.arquiva(c);
		}//fim for
	}//fim main

}//fim class
