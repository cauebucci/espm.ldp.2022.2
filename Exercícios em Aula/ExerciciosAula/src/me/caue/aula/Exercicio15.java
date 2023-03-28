package me.caue.aula;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		String nome, genero;
		double h, peso;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual o nome do paciente? ");
		nome = teclado.nextLine();
		
		System.out.print("Qual a altura do paciente? ");
		h = teclado.nextDouble();
		
		System.out.print("Qual o gênero do paciente? (M/F) ");
		genero = teclado.next();
		
		while(!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F")) {
			System.out.println("");
			System.out.println("O gênero precisa ser representado apenas com 'M', para masculino, e 'F', para feminino.");
			System.out.print("Qual o gênero do paciente? (M/F) ");
			genero = teclado.next();
		}
//		if(!genero.equalsIgnoreCase("m") && !genero.equalsIgnoreCase("f")) {
//			System.out.println("O gênero precisa ser representado apenas com 'M', para masculino, e 'F', para feminino.");
//			return;
//		}
//		
		if(genero.equalsIgnoreCase("m")) {
			peso = 72.7*h-58;
			genero = "Masculino";
		}else {
			peso = 61.1*h-44.7;
			genero = "Feminino";
		}
		
		System.out.println("======================");
		System.out.println("");
		System.out.println("Nome do paciente: " + nome);
		System.out.println("Gênero do paciente: " + genero);
		System.out.println("Altura do paciente: " + String.format("%.2f", h) + " m");
		System.out.println("Peso ideal: " + String.format("%.2f", peso) + " Kg");
		System.out.println("");
		System.out.println("======================");

	}

}
