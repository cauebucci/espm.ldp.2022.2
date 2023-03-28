package me.caue.exercicios;

import java.util.Random;
import java.util.Scanner;

public class SorteioAluno {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int qntAlunos;
		System.out.print("Quantos alunos participarão do sorteio? ");
		qntAlunos = teclado.nextInt();

		System.out.println("Selecione uma das opções: ");
		System.out.println("  1. a partir do RA do aluno");
		System.out.println("  2. a partir do nome do aluno");
		System.out.println("  3. a partir do RA e nome do aluno\n");

		int opc;
		do {
			System.out.print("Qual opção deseja? ");
			opc = teclado.nextInt();
			if (opc > 3 || opc < 1) {
				System.out.println("Opção inválida.\n");
			}
		} while (opc > 3 || opc < 1);

		if (opc == 1) {
			int[] ra = new int[qntAlunos];

			for (int i = 0; i < ra.length; i++) {
				System.out.println((i+1) + "º participante:");
				System.out.print("  RA: ");
				ra[i] = teclado.nextInt();
			}

			int qntVencedores;
			
			do {
				System.out.print("\nAgora digite a quantidade de vencedores que deseja: ");
				qntVencedores = teclado.nextInt();

				if (qntVencedores > ra.length) {
					System.out.println("Existem apenas " + ra.length + " alunos participando. Digite um número menor!");
				}
			} while (qntVencedores > ra.length);

			int[] ganhadores = sortear(ra.length, qntVencedores);

			pularLinhas();
			System.out.println("\nSorteando...");
			Thread.sleep(2000);
			pularLinhas();

			System.out.println("Vencedores: ");
			for (int i = 0; i < ganhadores.length; i++) {
				System.out.println(" > " + ra[ganhadores[i]]);
			}

		} else if (opc == 2) {
			String[] nome = new String[qntAlunos];
			teclado.nextLine();
			for (int i = 0; i < nome.length; i++) {
				System.out.println((i+1) + "º participante:");
				System.out.print("  Nome: ");
				nome[i] = teclado.nextLine();
			}

			int qntVencedores;
			System.out.println("");
			do {
				System.out.println("Agora digite a quantidade de vencedores que deseja: ");
				qntVencedores = teclado.nextInt();

				if (qntVencedores > nome.length) {
					System.out.println("Existem apenas " + nome.length + " alunos participando. Digite um número inferior a esse!");
				}
			} while (qntVencedores > nome.length);

			int[] ganhadores = sortear(nome.length, qntVencedores);

			pularLinhas();
			System.out.println("\nSorteando...");
			Thread.sleep(2000);
			pularLinhas();

			System.out.println("Vencedores: ");
			for (int i = 0; i < ganhadores.length; i++) {
				System.out.println((i + 1) + "º " + nome[ganhadores[i]]);
			}
		}else {
			int[] ra = new int[qntAlunos];
			String[] nome = new String[qntAlunos];
			for (int i = 0; i < nome.length; i++) {
				teclado.nextLine();
				System.out.println((i+1) + "º participante:");
				System.out.print("  Nome: ");
				nome[i] = teclado.nextLine();
				System.out.print("  RA: ");
				ra[i] = teclado.nextInt();
			}

			int qntVencedores;
			System.out.println("");
			do {
				System.out.print("Agora digite a quantidade de vencedores que deseja: ");
				qntVencedores = teclado.nextInt();

				if (qntVencedores > nome.length) {
					System.out.println("Existem apenas " + nome.length + " alunos participando. Digite um número menor!");
				}
			} while (qntVencedores > nome.length);

			int[] ganhadores = sortear(nome.length, qntVencedores);

			pularLinhas();
			System.out.println("\nSorteando...");
			Thread.sleep(2000);
			pularLinhas();

			System.out.println("Vencedores: ");
			for (int i = 0; i < ganhadores.length; i++) {
				System.out.println(nome[ganhadores[i]] + "\n RA: " + ra[ganhadores[i]]);
			}
		}
	}

	public static int[] sortear(int participantes, int vencedores) {
		int[] ganhadores = new int[vencedores];
		Random sorteador = new Random();
		boolean achei;
		for (int i = 0; i < vencedores;) {
			ganhadores[i] = sorteador.nextInt(participantes);
			achei = false;
			for (int j = 0; j < i; j++) {
				if (ganhadores[i] == ganhadores[j]) {
					achei = true;
					break;

				}
			}
			if (achei == false) {
				i++;
			}
		}

		return ganhadores;
	}

	public static void pularLinhas() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
}
