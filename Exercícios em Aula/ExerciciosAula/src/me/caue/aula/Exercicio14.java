package me.caue.aula;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		double valor;
		int dias;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantos dias a pessoa ficou hospedada? ");
		dias = teclado.nextInt();
		
		if(dias < 15) {
			valor = (150+58)*dias;
		}else if(dias == 15) {
			valor = (150+36)*dias;
		}else {
			valor = (150+15.50)*dias;
		}
		
		System.out.println("O hospede ficou hospedado por " + dias + " dia(s) e terá que pagar R$ " + String.format("%.2f", valor));
	}

}
