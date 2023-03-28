package me.caue.exercicios;

import java.util.Random;

public class ExercicioExtra1 {
	public static void main(String[] args) {
		int[] p = new int[10];
		String numeros = "";
	
		for (int i = 0; i < p.length; i++) {
			p[i] = aleatorio(0 ,100);
		}
		for (int i = 0; i < p.length; i++) {
			numeros = numeros + p[i] + " ";
		}
		System.out.println("Números gerados = " + numeros);
		System.out.println("");
		System.out.println("Maior número = " + maior(p));
		System.out.println("");
		ImprimirTabuada(maior(p));
	}
	
	public static int aleatorio(int min, int max) {
		Random gerador = new Random();
		return gerador.nextInt(min, max);
	}
	public static int maior(int[] numeros) {
		int n;
		for (int i = 0; i < (numeros.length - 1); i++) {
			if(numeros[i] > numeros[i+1]) {
				n = numeros[i];
				numeros[i] = numeros[i+1];
				numeros[i +1] = n;
			}
		}
		return numeros[numeros.length-1];
	}
	public static void ImprimirTabuada(int numero) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + "x" + i + "= " + (numero*i));
		}
	}
}
