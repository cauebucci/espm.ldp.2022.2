package me.caue.exc2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		preencher(numeros);
		
		System.out.print("Números: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println();
		crescente(numeros);
		System.out.print("Ordem crescente: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println();
		if(buscar(numeros, 25)) {
			System.out.println("Retorno: true");
		}else {
			System.out.println("Retorno: false");

		}
		
		
	}
	public static void preencher(int[] array) {
		Random gerador = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(20, 26);
		}
	}
	
	public static void crescente(int[] array) {
		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					
				}
			}
		}
	}
	
	public static boolean buscar(int[] array, int n){ 
		int inicio = 0;
		int fim = array.length-1;
		
		do {
			int meio = (inicio+fim)/2;
			
			if(n == array[meio]) return true;
			
			if(n > array[meio]) {
				inicio = meio;	
			}else {
				fim = meio;
			}
		}while(fim - 1 != inicio && fim != inicio);
		
		return false;
	}
}
