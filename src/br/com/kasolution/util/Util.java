package br.com.kasolution.util;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
	public static String formata(double valor){
		return NumberFormat.getCurrencyInstance().format(valor);
	}//fim formata
	
	public static String formata(LocalDate date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
		return dtf.format(date);
	}//fim formata
}//fim classe
