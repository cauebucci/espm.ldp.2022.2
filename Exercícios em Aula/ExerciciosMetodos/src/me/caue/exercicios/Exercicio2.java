package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		
		double[] lados = new double[3];
		
		do {
			for (int i = 0; i < lados.length; i++) {
				System.out.print("Digite o " + (i+1) + " lado do triângulo --> ");
				lados[i] = teclado.nextDouble();
			}
			
			if(!testarTriangulo(lados[0], lados[1], lados[2])) {
				System.out.println("\nTriângulo inválido. Tente novamente!\n");
			}
		}while(!testarTriangulo(lados[0], lados[1], lados[2]));
		
		System.out.println("\n==================\n");
		System.out.println("Lados: " + String.format("%.2f", lados[0]) + " x " + String.format("%.2f", lados[1]) + " x " + String.format("%.2f", lados[2]));
		System.out.println("");
		System.out.println("Tipo: " + tipoTriangulo(lados[0], lados[1], lados[2]));
		System.out.println("\n==================\n");
	}
	
	public static boolean testarTriangulo(double lado1, double lado2, double lado3) {
		if(lado1 < lado2+lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado3) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String tipoTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			return "Equilátero";
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "Isósceles";
		} else if (lado1 != lado2 || lado1 != lado3 || lado2 != lado3) {
			return "Escaleno";
		}
		return "ERROR";	
		}
}
