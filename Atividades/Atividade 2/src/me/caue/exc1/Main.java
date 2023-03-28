package me.caue.exc1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Util util = new Util();
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int qnt_cadastrado = 0;
		do {
			int opc;
			String opc_str;
			do {
				System.out.println();
				System.out.println("");
				System.out.println("Selecione uma das opções:");
				System.out.println("   1- Cadastrar Produto");
				System.out.println("   2- Pesquisar Produto");
				System.out.println("   3- Listar Produtos");
				System.out.println("   4- Excluir Produto");
				System.out.println("   5- Finalizar");
				System.out.println("");
				System.out.print("Qual das opções deseja? ");
				opc_str = teclado.nextLine();
				opc = Integer.parseInt(opc_str);
				util.limpar();
				if(opc < 1 || opc > 5) System.out.println("Opção inválida. Tente novamente.");
				
			}while(opc < 1 || opc > 5);
			
			if(opc == 1) {
				if(qnt_cadastrado < 10) {
					
					
					qnt_cadastrado+= util.cadastrarProduto(util.produto, qnt_cadastrado);
					
					
				}else {
					System.out.println("Quantidade máxima de produtos atingída!");
				}	
			}else if(opc == 2) {
				String p_opc_str = "";
				int p_opc;
				boolean consulta = true;
				do {
					do {
						System.out.println("");
						System.out.println("Selecione uma das opções:");
						System.out.println("   1- Pesquisar por Código");
						System.out.println("   2- Pesquisar por Nome");
						System.out.println("");
						System.out.print("Qual das opções deseja: ");
						p_opc_str = teclado.nextLine();
						p_opc = Integer.parseInt(p_opc_str);
						util.limpar();
						if(p_opc < 1 || p_opc > 2) System.out.println("Opção inválida. Tente novamente!");;
					}while(p_opc < 1 || p_opc > 2);
					util.limpar();
					if(p_opc == 1) {
						System.out.print("Qual o código que deseja procurar? ");
						int cod = teclado.nextInt();
						util.limpar();
						System.out.println("Dados encontrados:\n");
						System.out.println(util.pesquisarProduto(util.produto, p_opc, qnt_cadastrado, 0, cod, ""));
						teclado.nextLine();
					}else if(p_opc == 2) {
						System.out.print("Qual o nome que deseja procurar? ");
						String nome = teclado.nextLine();
						util.limpar();
						System.out.println("Dados encontrados:\n");
						System.out.println(util.pesquisarProduto(util.produto, p_opc, qnt_cadastrado, 0, 0, nome));
					}
					String p_consul = "";
					
					do {
						
						System.out.print("\nDeseja realizar outra consulta? (S/N) ");
						p_consul = teclado.nextLine();	
						if(!(p_consul.equalsIgnoreCase("S") || p_consul.equalsIgnoreCase("N"))) System.out.println("Opção inválida. Tente novamente!");
					}while(!(p_consul.equalsIgnoreCase("S") || p_consul.equalsIgnoreCase("N")));
					
					if(p_consul.equalsIgnoreCase("n")) {
						consulta = false;
					}
					util.limpar();
				}while(consulta);
				
				

			}else if(opc == 3) {
				if(qnt_cadastrado == 0) {
					System.out.println("Nenhum produto cadastrado.");
				}else {
					System.out.println("Produtos cadastrados:\n");
					for (int i = 0; i < qnt_cadastrado; i++) {
						System.out.println(util.formatarProduto(util.produto, i));
					}
				}
				System.out.println("\nTotal de produtos: " + qnt_cadastrado);
				System.out.println("\nPressione ENTER para voltar ao menu principal.");
				@SuppressWarnings("unused")
				String adhsd = teclado.nextLine();
				util.limpar();
				
				
			}else if(opc == 4) {
				String e_opc_str = "";
				int e_opc;
				do {
					System.out.println("");
					System.out.println("Selecione uma das opções:");
					System.out.println("   1- Excluir pelo Código");
					System.out.println("   2- Excluir pelo Nome");
					System.out.println("");
					System.out.print("Qual das opções deseja: ");
					e_opc_str = teclado.nextLine();
					util.limpar();
					e_opc = Integer.parseInt(e_opc_str);
					if(e_opc < 1 || e_opc > 2) System.out.println("Opção inválida. Tente novamente!");;
				}while(e_opc < 1 || e_opc > 2);
				if(e_opc == 1) {
					int cod;
					System.out.print("Qual o código do produto que deseja excluir?");
					cod = teclado.nextInt();
					if(util.verificarExistencia(util.produto, 1, qnt_cadastrado, cod, "")) {
						util.excluirProduto(util.produto, 1, qnt_cadastrado, cod, "");
						qnt_cadastrado--;
					}else {
						System.out.println("Não existe nenhum produto com esse nome.");
					}
					teclado.nextLine();
				}else if(e_opc == 2) {
					String nome;
					System.out.print("Qual o nome do produto que deseja excluir?");
					nome = teclado.nextLine();
					if(util.verificarExistencia(util.produto, 2, qnt_cadastrado, 0, nome)) {
						util.excluirProduto(util.produto, 2, qnt_cadastrado, 0, nome);
						qnt_cadastrado--;
					}else {
						System.out.println("Não existe nenhum produto com esse nome.");
					}
				}
				
			}else {
				System.out.println("Programa finalizado!");
				return;
			}
		}while(true);
	}
}