package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opc;
		int chave;
		
		boolean fizalizar = true;
		
		System.out.print("Digite a chave de deslocamento: ");
		chave = teclado.nextInt();
		
		do {
			do {
				System.out.println("\nOpções disponíveis:");
				System.out.println("  1- Criptografar");
				System.out.println("  2- Descriptografar");
				System.out.println("  3- Trocar chave");
				System.out.println("  4- Finalizar Programa");
				System.out.print("\nQual opção deseja? ");
				opc = teclado.nextLine();
				if (!(opc.equals("1") || opc.equals("2") || opc.equals("3") || opc.equals("4"))) {
					pularLinhas();
					System.out.println("\nOpção inválida. Tente novamente!\n");
					
				}
			} while (!(opc.equals("1") || opc.equals("2") || opc.equals("3") || opc.equals("4")));

			pularLinhas();
			if (opc.equals("1")) {
				String msg;
				System.out.println("Digite a frase que deseja criptografar: ");
				msg = teclado.nextLine();
				pularLinhas();
				System.out.println("\nMensagem descriptografada: " + msg.toLowerCase());
				System.out.println("Mensagem criptografada: " + criptografar(msg, chave) + "\n");
			} else if (opc.equals("2")) {
				String msg;
				System.out.println("Digite a frase que deseja descriptografar: ");
				msg = teclado.nextLine();
				pularLinhas();
				System.out.println("\nMensagem criptografada: " + msg.toLowerCase());
				System.out.println("Mensagem descriptografada: " + descriptografar(msg, chave) + "\n");
			}else if(opc.equals("3")) {
				System.out.print("Digite a chave que deseja: ");
				chave = teclado.nextInt();
			} else if (opc.equals("4")) {
				pularLinhas();
				fizalizar = false;
				System.out.println("\nPrograma finalizado!");
			}

			String c = "";
			if (!opc.equals("4")) {
				do {
					System.out.print("Deseja realizar outra consulta? (s/n) ");
					c = teclado.nextLine();
					pularLinhas();
					if (!(c.equalsIgnoreCase("n") || c.equalsIgnoreCase("s"))) {
						System.out.println("Utilize 's' para realizar outra consulta ou 'n' para finalizar o programa!");
					}
				} while (!(c.equalsIgnoreCase("n") || c.equalsIgnoreCase("s")));

				if (!c.equalsIgnoreCase("s")) {
					fizalizar = false;
					pularLinhas();
					System.out.println("\nPrograma finalizado!");
				}
			}
		} while (fizalizar);

	}

	public static String criptografar(String msg, int chave) {
		String criptgrafada = "";

		msg = msg.toLowerCase();

		for (int i = 0; i < msg.length(); i++) {
			int n = msg.charAt(i) + chave;
			if (n > 122) {
				n = (n % 123) + 97;
			}
			char l = (char) (n);

			if (msg.charAt(i) == ' ') {
				criptgrafada = criptgrafada + " ";
			} else {
				criptgrafada = criptgrafada + l;
			}
		}

		return criptgrafada;
	}

	public static String descriptografar(String msg, int chave) {
		String descriptgrafada = "";

		msg = msg.toLowerCase();

		for (int i = 0; i < msg.length(); i++) {
			int n = msg.charAt(i) - chave;

			if (n < 97) {
				n = (n - 97) + 123;
			}

			char l = (char) (n);

			if (msg.charAt(i) == ' ') {
				descriptgrafada = descriptgrafada + " ";
			} else {
				descriptgrafada = descriptgrafada + l;
			}
		}

		return descriptgrafada;
	}

	public static void pularLinhas() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}

}
