package br.com.kasolution.dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

import br.com.kasolution.util.Util;

public class Banco  implements Arquivavel {
	//2- declarar a variavel instance do mesmo tipo da classe
	private static final Banco instance = new Banco();
	
	private String nome;
	private ArrayList<Cliente> clientes;	
	

	//1-transformar o construtor em private
	private Banco() {
		clientes = new ArrayList<>();
		
	}
	
	//3- metodo get para pegar a instancia
	public static Banco getInstance() {
		return instance;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Banco: ").append(nome).append("\nRelação de Clientes: ");
		for (Cliente c : clientes) {
			sb.append("\n").append(c);
			
			}
		
		return sb.toString();
		
	}
	
	public void adiciona(Cliente cliente) {
		if (!clientes.contains(cliente)) {
			clientes.add(cliente);
		} else {
			System.out.println("Já é cliente!");
		}
	}

	@Override
	public void geraArquivo() {
		File nomeArq = new File(CAMINHO_BASE + nome + ".txt"); //nome do arquivo
		try {
			System.setOut(new PrintStream(nomeArq)); //setando a saída que não será mais na tela e sim no arquivo setado acima
			System.out.println("-- Dados do Banco --");
			System.out.println("\nData da Geração: " + Util.formata(LocalDate.now()));
			System.out.println("\n\n"+ this);
			
		} catch(FileNotFoundException e) { //declara variavel do mesmo tipo do erro
			System.out.println("Erro durante a geração do arquivo: " + e.getMessage());
		}//fim try
		
		
	}//fim gerararquivo
	
	
}//fim classe


