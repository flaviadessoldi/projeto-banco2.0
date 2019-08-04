package br.com.kasolution.dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;

import br.com.kasolution.util.Util;

import static br.com.kasolution.util.Util.*;

public class Cliente implements Arquivavel{
	
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;
	
	public Cliente () {
	
	}

	public Cliente(String cpf, String nome, LocalDate dataNascimento) {
	this.cpf = cpf;
	this.nome = nome;
	this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
	return cpf;
	}

	public void setCpf(String cpf) {
	this.cpf = cpf;
	}

	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public LocalDate getDataNascimento() {
	return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
	this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		String info = "CPF: " + cpf;
		info += " Nome: " + nome;
		info += " Data Nascimento: " + formata(dataNascimento);		
		return info;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			Cliente cliente = (Cliente) obj;//cast = transforma obj em cliente para acessar os atributos dele 
			if (this.cpf.equals(cliente.cpf)) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public void geraArquivo() {
		File nomeArq = new File (CAMINHO_BASE + "cliente_" + nome + ".txt"); //nome do arquivo
		try {
			PrintStream ps = System.out;
			System.setOut(new PrintStream(nomeArq)); //setando a saída que não será mais na tela e sim no arquivo setado acima
			System.out.println("-- Dados do Cliente --");
			System.out.println("\nData da Geração: " + Util.formata(LocalDate.now()));
			System.out.println("\n\n"+ this);
			System.setOut(ps);
			System.out.println("Arquivo Gerado.");
			
		} catch(FileNotFoundException e) { //declara variavel do mesmo tipo do erro
			System.out.println("Erro durante a geração do arquivo: " + e.getMessage());
		}finally {
			//fim try
			System.out.close();
		}
	
	}
}

