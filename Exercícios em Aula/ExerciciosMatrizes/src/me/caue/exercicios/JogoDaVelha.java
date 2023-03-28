package me.caue.exercicios;

import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[][] jogo = new String[3][3];

		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < jogo.length; j++) {
				jogo[i][j] = "";
			}
		}

		imprimir(jogo);
		int jogador = 1;
		System.out.println("");
		System.out.println("");
		for (int j = 0; j < 9; j++) {
			if (jogador == 1) {
				Jogar(jogo, jogador);
				jogador = 2;

			} else {
				Jogar(jogo, 2);
				jogador = 1;
			}
			pularLinhas();
			imprimir(jogo);
			System.out.println();
		}

	}

	public static void imprimir(String[][] jogo) {
		System.out.println(
				"\t" + String.format("%3s", "A") + "\t" + String.format("%3s", "B") + "\t" + String.format("%3s", "C"));
		for (int i = 0; i < jogo.length; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < jogo.length; j++) {
				if (j == 2) {
					System.out.print(String.format("%3s", jogo[i][j]) + "\t");
				} else {
					System.out.print(String.format("%3s", jogo[i][j]) + "\t");
				}

			}
			System.out.println();
		}
	}

	public static int converter(String posicao) {
		posicao = posicao.toUpperCase();
		if (posicao.equals("A")) {
			return 0;
		} else if (posicao.equals("B")) {
			return 1;
		} else {
			return 2;
		}
	}

	public static boolean Utilizada(String[][] jogo, int x, int y) {
		if (jogo[x][y].equals("X") || jogo[x][y].equals("Y")) {
			return true;
		} else {
			return false;
		}
	}

	public static void Jogar(String[][] jogo, int jogador) {
		int x;
		String y;
		String ajogo = "";
		if (jogador == 1) {
			ajogo = "X";
		} else {
			ajogo = "O";
		}
		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogaodor " + jogador + " digite as coordenadas que deseja jogar:");
		do {
			do {
				System.out.print("  Coordenada X: (1-3) ");
				x = teclado.nextInt();
				if (x < 1 || x > 3) {
					System.out.println("Coordenada inválida");
				}
			} while (x < 1 || x > 3);
			do {
				System.out.print("  Coordenada Y: (A-C) ");
				teclado.nextLine();
				y = teclado.nextLine();
				if (!(y.equalsIgnoreCase("A") || y.equalsIgnoreCase("B") || y.equalsIgnoreCase("C"))) {
					System.out.println("Coordenada inválida");
				}
			} while (!(y.equalsIgnoreCase("A") || y.equalsIgnoreCase("B") || y.equalsIgnoreCase("C")));
			if (VerificarExistencia(jogo, (x - 1), converter(y))) {
				System.out.println("\nAlguém já jogou nessas coordenadas, jogue em outra!\n");
			}
		} while (VerificarExistencia(jogo, (x - 1), converter(y)));
		jogo[(x - 1)][converter(y)] = ajogo;
		if (VerificarJogo(jogo) == 1 || VerificarJogo(jogo) == 2) {
			System.out.println("O vencedor foi o jogador" + VerificarJogo(jogo));
			return;
		}
	}

	public static void pularLinhas() {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}

	public static boolean VerificarExistencia(String[][] jogo, int x, int y) {
		if (!(jogo[x][y].equalsIgnoreCase("X") || jogo[x][y].equalsIgnoreCase("O"))) {
			return false;
		} else {
			return true;
		}
	}

	public static int VerificarJogo(String[][] jogo) {
		for (int i = 0; i < jogo.length; i++) {
			int soma = 0;
			for (int j = 0; j < jogo.length; j++) {
				if(jogo[i][j].equals("X")) {
					soma =+ 4;
				}else if(jogo[i][j].equals("O")) {
					soma =+ 40;
				}
			}
			if(soma == 12) {
				return 1;
			}else if(soma == 120) {
				return 2;
			}
		}
		for (int i = 0; i < jogo.length; i++) {
			int soma = 0;
			for (int j = 0; j < jogo.length; j++) {
				
				if(jogo[j][i].equals("X")) {
					soma =+ 4;
				}else if(jogo[j][i].equals("O")) {
					soma =+ 40;
				}
			}
			if(soma == 12) {
				return 1;
			}else if(soma == 120) {
				return 2;
			}
		}
		for (int i = 0; i < jogo.length; i++) {
			int soma = 0;
			for (int j = 0; j < jogo.length; j++) {
				if (i == j) {
					if(jogo[i][j].equals("X")) {
						soma =+ 4;
					}else if(jogo[i][j].equals("O")) {
						soma =+ 40;
					}
                    
                }
			}
			if(soma == 12) {
				return 1;
			}else if(soma == 120) {
				return 2;
			}
		}
		for (int i = 0; i < jogo.length; i++) {
			int soma = 0;
			for (int j = 0; j < jogo.length; j++) {
				if ((i + j) == (jogo.length - 1)) {
					if(jogo[i][j].equals("X")) {
						soma =+ 4;
					}else if(jogo[j][i].equals("O")) {
						soma =+ 40;
					}
					
				}
			}
			if(soma == 12) {
				return 1;
			}else if(soma == 120) {
				return 2;
			}
		}
		return 0;
	}
}
