package me.caue.aula;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int conta, reverso, n1, n2, n3, c1, soma, multi, r1, r2, r3, c2, verificador;
		
		System.out.print("Digite o número da conta: ");
		conta = teclado.nextInt();
		if (!(String.valueOf(conta).length() == 3)) {
			System.out.println("A conta corrente tem apenas 3 números. Tente novamente!");
			return;
		}
		n3 = conta%10;
		c1 = conta/10;
		n2 = c1%10;
		n1 = conta/100;
		
		reverso = (n3*100)+(n2*10)+(n1);
		
		soma = reverso+conta;
		
		
		r3 = soma%10;
		c2 = soma/10;
		r2 = c2%10;
		r1 = soma/100;
		
		multi = (r1*1)+(r2*2)+(r3*3);
		
		verificador = multi%10;
		
		System.out.println("\nO verificador desta conta corrente é: " + verificador);

	}

}
