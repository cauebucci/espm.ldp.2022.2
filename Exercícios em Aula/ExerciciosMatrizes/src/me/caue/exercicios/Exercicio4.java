package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vendedores;
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho" };
		System.out.print("Quantos vendedores a loja tem? ");
		vendedores = teclado.nextInt();
		String[] nome = new String[vendedores];
		double[][] valores = new double[vendedores][meses.length];
		double[] total = new double[vendedores];

		for (int i = 0; i < valores.length; i++) {
			teclado.nextLine();
			System.out.println((i + 1) + "º vendedor:");
			System.out.print("  Nome: ");
			nome[i] = teclado.nextLine();
			System.out.println("  Faturamento:");
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print("    " + meses[j] + ": R$");
				valores[i][j] = teclado.nextDouble();
			}
		}
		for (int i = 0; i < valores.length; i++) {
			total[i] = Total(valores, i);
		}

		System.out.print(String.format("%9s", "Nome") + "\t|");
		for (int i = 0; i < meses.length; i++) {
			System.out.print(String.format("%9s", meses[i]) + "\t|");
		}
		System.out.println(String.format("%9s", "Total"));
		for (int i = 0; i < valores.length; i++) {
			System.out.print(String.format("%9s", nome[i]) + " |\t");
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(String.format("%9s", "R$" + String.format("%.2f", valores[i][j])) + "|\t");
			}
			System.out.print(String.format("%9s", String.format("%.2f", total[i])));
			System.out.println();
		}

		System.out
				.println("\nVendedor com maior venda: " + nome[PegarMaior(total)] + " - R$" + total[PegarMaior(total)]);
		System.out
				.println("\nVendedor com menor venda: " + nome[PegarMenor(total)] + " - R$" + total[PegarMenor(total)]);
	}

	public static double Total(double[][] faturamento, int vendedor) {
		double total = 0;
		for (int i = 0; i < faturamento[vendedor].length; i++) {
			total = total + faturamento[vendedor][i];
		}
		return total;
	}

	public static int PegarMaior(double[] total) {
		int maior = 0;
		double aux = 0;
		for (int i = 0; i < total.length; i++) {

			if (total[i] > aux) {
				maior = i;
			}
			aux = total[i];
		}
		return maior;
	}

	public static int PegarMenor(double[] total) {
		int menor = 0;
		double aux = 0;
		for (int i = 0; i < total.length; i++) {

			if (total[i] < aux) {
				menor = i;
			}
			aux = total[i];
		}
		return menor;
	}
}
