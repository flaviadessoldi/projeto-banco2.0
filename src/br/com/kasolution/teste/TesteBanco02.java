package br.com.kasolution.teste;

import java.time.LocalDate;

import br.com.kasolution.dominio.Banco;
import br.com.kasolution.dominio.Cliente;

public class TesteBanco02 {

	public static void main(String[] args) {
		Banco banco01 = Banco.getInstance();
		Banco banco02 = Banco.getInstance();
		
		Cliente cli01 = new Cliente ("217.024.060-03", "Pabblo Vittar", LocalDate.of(1994, 11, 1));
		
		banco01.setNome("Santander");
		
		banco01.adiciona(cli01);
		banco02.adiciona(cli01);
		
		System.out.println(banco01);
		System.out.println(banco02);
		

	}

}
