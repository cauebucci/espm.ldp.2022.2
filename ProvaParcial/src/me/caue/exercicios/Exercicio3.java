package me.caue.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int qntCidades;
		boolean finalizar = true;

		System.out.print("Qauntas cidades você deseja cadastrar? ");
		qntCidades = teclado.nextInt();
		teclado.nextLine();

		String[] cidades = new String[qntCidades];
		int[][] tempo = new int[qntCidades][qntCidades];

		for (int i = 0; i < cidades.length; i++) {
			System.out.print("Qual o nome da " + (i + 1) + "º cidade? ");
			cidades[i] = teclado.nextLine();
		}

		limpar();
		preencher(tempo);

		do {
			int opc;
			do {
				System.out.println("Selecione uma das opções:");
				System.out.println("  1. Pesquisar tempo de voo entre cidades");
				System.out.println("  2. Ver tempo de voo entre todas cidades");
				System.out.println("");
				System.out.print("Qual das opções deseja: ");
				opc = teclado.nextInt();
				limpar();
				if (opc < 1 || opc > 2) {
					System.out.println("\nOpção inválida! Tente novamente.");
				}
			} while (opc < 1 || opc > 2);
			teclado.nextLine();
			if (opc == 1) {
				String cidade1, cidade2;
				System.out.println("Distância entre as cidades: ");
				do {
					System.out.print("  1º Cidade: ");
					cidade1 = teclado.nextLine();
					if (!verificarExistencia(cidade1, cidades)) {
						System.out.println("Esta cidade não está cadastrada! Tente novamente.");
					}
				} while (!verificarExistencia(cidade1, cidades));
				do {
					System.out.print("  2º Cidade: ");
					cidade2 = teclado.nextLine();
					if (!verificarExistencia(cidade2, cidades)) {
						System.out.println("Esta cidade não está cadastrada! Tente novamente.");
					}
				} while (!verificarExistencia(cidade2, cidades));

				limpar();

				System.out.println("O tempo entre a cidade de " + cidade1 + " e " + cidade2 + " é de "
						+ tempo[PegarId(cidades, cidade1)][PegarId(cidades, cidade2)] + " horas.");
				String opca = "";
				do {

					System.out.println("\nDeseja realizar outra ação? (S/N) ");
					opca = teclado.nextLine();
					if (!(opca.equalsIgnoreCase("S") || opca.equalsIgnoreCase("N"))) {
						System.out.print("Opção inválida. Digite apenas S para sim ou N para não!");
					}
				} while (!(opca.equalsIgnoreCase("S") || opca.equalsIgnoreCase("N")));
				
				if(opca.equalsIgnoreCase("N")) {
					finalizar = false;
				}
				limpar();
			} else if (opc == 2) {
				limpar();
				imprimirTempo(cidades, tempo);
				String opca;
				do {

					System.out.print("\nDeseja realizar outra ação? (S/N) ");
					opca = teclado.nextLine();
					if (!(opca.equalsIgnoreCase("S") || opca.equalsIgnoreCase("N"))) {
						System.out.println("Opção inválida. Digite apenas S para sim ou N para não!");
					}
				} while (!(opca.equalsIgnoreCase("S") || opca.equalsIgnoreCase("N")));
				if(opca.equalsIgnoreCase("N")) {
					finalizar = false;
				}
			}

		} while (finalizar);

	}

	public static void limpar() {
		for (int i = 0; i < 30; i++) {
			System.out.println("");
		}
	}

	public static void preencher(int[][] vetor) {
		Random gerador = new Random();
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				vetor[i][j] = gerador.nextInt(1, 10);
			}
		}
	}

	public static boolean verificarExistencia(String cidade, String[] cidades) {
		String cidadeVerificada = cidade.toUpperCase();
		boolean existe = false;
		for (int i = 0; i < cidades.length; i++) {
			String cidadeExistente = cidades[i].toUpperCase();
			if (cidadeExistente.equalsIgnoreCase(cidadeVerificada)) {
				existe = true;
			}
		}
		return existe;
	}

	public static int PegarId(String[] vetor, String dado) {
		String dadoVerificado = dado.toUpperCase();

		int id = 0;
		for (int i = 0; i < vetor.length; i++) {
			String dadoExistente = vetor[i].toUpperCase();
			if (dadoExistente.equalsIgnoreCase(dadoVerificado)) {
				id = i;
			}
		}
		return id;
	}
	
	public static void imprimirTempo(String[] cidade, int[][] tempo) {
		System.out.println("Tempo de voo entre cidades:");
		for (int i = 0; i < tempo.length; i++) {
			for (int j = 0; j < tempo.length; j++) {
				if(i != j) {
					System.out.println("  " + cidade[i] + " até " + cidade[j] + ": " + tempo[i][j] + " hora(s)");

				}
			}
		}
	}
}
