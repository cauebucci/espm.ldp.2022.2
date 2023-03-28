package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double a, b ,c;
		System.out.println("Digite o valor de A --> ");
		a = teclado.nextDouble();
		System.out.println("Digite o valor de B --> ");
		b = teclado.nextDouble();
		System.out.println("Digite o valor de c --> ");
		c = teclado.nextDouble();
		
		System.out.println("\n=======================\n");
		System.out.println("A: " + String.format("%.2f", a));
		System.out.println("B: " + String.format("%.2f", b));
		System.out.println("C: " + String.format("%.2f", c));
		System.out.println("");
		System.out.println("Delta: " + delta(a, b, c));
		System.out.println("");
		if(delta(a, b, c) > 0) {
			System.out.println("X1: " + PrimeiraRaiz(a, b, c));
			System.out.println("X2: " + SegundaRaiz(a, b, c));
		}else {
			System.out.println("Sem raízes!");
		}
		System.out.println("");
		System.out.println("\n=======================\n");
	}
	
	public static double delta(double a, double b, double c) {
		double d = (Math.pow(b, 2))-4*a*c;
		
		return d;
	}
	
	public static double PrimeiraRaiz(double a, double b, double c) {
		
		double d = (Math.pow(b, 2))-4*a*c;
		
		double x1 = ( -b + Math.sqrt(d) ) / (2*a);
		
		return x1;
		
	}
	
	public static double SegundaRaiz(double a, double b, double c) {
		
		double d = (Math.pow(b, 2))-4*a*c;
		
		double x2 = ( -b - Math.sqrt(d) ) / (2*a);
		
		return x2;
		
	}
}
