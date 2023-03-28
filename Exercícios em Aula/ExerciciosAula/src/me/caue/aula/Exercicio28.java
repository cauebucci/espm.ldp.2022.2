package me.caue.aula;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int qnt, qnt2, pagamento;
		double valor, total;
		String nota, nome;
		total = 0;
		nota = "Produtos:";
		System.out.print("Digite a quantidade de produtos que deseja calcular --> ");
		qnt = teclado.nextInt();

		for (int i = 1; i <= qnt; i++) {
			qnt2 = 0;
			teclado.nextLine();
			System.out.print("Digite o nome do " + i + "º produto -- > ");
			nome = teclado.nextLine();
			System.out.print("Digite o valor do produto '" + nome + "' --> ");
			valor = teclado.nextDouble();
			System.out.print("Digite a quantidade do produto '" + nome + "' --> ");
			qnt2 = teclado.nextInt();

			total = total + (valor * qnt2);

			nota = nota + "\n  " + nome + "\n  " + qnt2 + " x R$" + valor + "\n";

		}

		System.out.println("\nO valor total da compra é de R$" + String.format("%.2f", total));
		System.out.println("Formas de pagamento: ");
		System.out.println("\n1 - A Vista (10% de desconto - R$" + String.format("%.2f", total * 0.9)
				+ ")\n2 - 2x de R$" + String.format("%.2f", total * 1.115 / 2));
		do {
			System.out.print("\nQual opção de pagamento deseja? ");
			pagamento = teclado.nextInt();
			if (pagamento != 1 && pagamento != 2) {
				System.out.println("\nForma de pagamento inválida.\n");
			}
		} while (pagamento != 1 && pagamento != 2);

		if (pagamento == 1) {
			nota = nota + "\nValor total da compra: R$" + String.format("%.2f", total);
			total = total * 0.9;
			nota = nota + "\nValor total a pagar: R$" + String.format("%.2f", total);
		} else {
			nota = nota + "\nValor total da compra: R$" + String.format("%.2f", total);
			total = total * 1.115;
			nota = nota + "\nValor total a pagar: R$" + String.format("%.2f", total) + "\nParcelas: 2x de R$"
					+ String.format("%.2f", total / 2);
		}
		System.out.println("========================");
		System.out.println("====== Nota Fiscal =====");
		System.out.println("========================");
		System.out.println("");
		System.out.println(nota);
		System.out.println("");
		System.out.println("========================");
	}
}
