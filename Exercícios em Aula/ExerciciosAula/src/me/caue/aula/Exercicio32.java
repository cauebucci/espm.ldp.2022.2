package me.caue.aula;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {
		int pacientes;
		double altura, peso;
		String nome, genero;
		String dados = "";
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Digite a quantidade de pacientes --> ");
			pacientes = teclado.nextInt();

			if (pacientes < 0) {
				System.out.println("Número de pacientes inválido.");
			}
		} while (pacientes < 0);

		for (int count = 1; count <= pacientes; count++) {
			teclado.nextLine();
			System.out.println("");
			System.out.println("=====================");
			System.out.println("==== " + count + "º Paciente ====");
			System.out.println("=====================");
			System.out.println("");
			System.out.print("Nome do paciente: ");
			nome = teclado.nextLine();
			do {
				System.out.println("Gênero de " + nome + " (M/F): ");
				genero = teclado.next();
				if(!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F")) {
					System.out.println("Gênero inválido! Digite apenas M para masculino ou F para feminino.");
					System.out.println("");
				}
			}while(!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F"));
			if(genero.equalsIgnoreCase("M")) {
				genero = "Masculino";
			}else {
				genero = "Feminino";
			}
			System.out.print("Altura de " + nome + ": ");
			altura = teclado.nextDouble();
			System.out.print("Peso de " + nome + ": ");
			peso = teclado.nextDouble();
			dados = dados + nome + "\n  Altura: " + String.format("%.2f", altura) + "m\n  Peso: "
					+ String.format("%.2f", peso) + "kg\n  Gênero: " + genero + "\n  IMC: " + String.format("%.2f", peso / (altura * altura)) + "\n";

		}

		System.out.println("");
		System.out.println("=========================");
		System.out.println("========== IMC ==========");
		System.out.println("=========================");
		System.out.println("");
		System.out.println(dados);
		System.out.println("=========================");
	}
}
