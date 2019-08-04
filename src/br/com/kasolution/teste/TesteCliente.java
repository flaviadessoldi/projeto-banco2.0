package br.com.kasolution.teste;

import java.time.LocalDate;

import br.com.kasolution.dominio.Cliente;
import br.com.kasolution.util.Arquivador;

public class TesteCliente {
	public static void main(String[] args) {
		Cliente[] clientes = {
				new Cliente ("472.007.810-52", "Marina Nascimento", LocalDate.of(2008, 5,12)),
				new Cliente ("698.493718-80", "Marcio Oliveira", LocalDate.of(2000, 12, 4)),
				new Cliente ("058.758.992-12", "Daiane Gabriela", LocalDate.of(1998, 3, 20))
		};
		
		for (Cliente c : clientes) {
			Arquivador.arquiva(c);
		}
	}

}
