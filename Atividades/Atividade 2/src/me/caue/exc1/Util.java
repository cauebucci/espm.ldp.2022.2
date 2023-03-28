package me.caue.exc1;

import java.util.Scanner;

public class Util {
	Produto[] produto = new Produto[10];
	
	public void limpar() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
	
	public int cadastrarProduto(Produto[] produto, int id) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int codigo;
		String nome;
		int qnt;
		double preco;
		System.out.println("Cadastro de Produto: ");
		System.out.print("  Código: ");
		codigo = teclado.nextInt();
		if(verificarExistencia(produto, 1, id, codigo, null)) {
			limpar();
			System.out.println("Já existe um produto cadastrado com esse código. Tente novamente!");
			return 0;
		}
		System.out.print("  Nome: ");
		teclado.nextLine();
		nome= teclado.nextLine();
		if(verificarExistencia(produto, 2, id, 0, nome)) {
			limpar();
			System.out.println("Já existe um produto cadastrado com esse nome. Tente novamente!");
			return 0;
		}
		System.out.print("  Preço: R$");
		preco = teclado.nextDouble();
		System.out.print("  Quantidade: ");
		qnt = teclado.nextInt();
		limpar();
		System.out.println("O produto '" + nome + "' foi cadastrado com sucesso!");
		teclado.nextLine();
		produto[id] = new Produto();
		produto[id].codigo = codigo;
		produto[id].nome = nome;
		produto[id].preco = preco;
		produto[id].quantidade = qnt;
		return 1;
	}
	
	public String formatarProduto(Produto[] produto, int id) {
		String impressao = "";
		
			impressao += "COD" + produto[id].codigo + ":\n   Nome: " + produto[id].nome + "\n   Preço: R$" + String.format("%.2f", produto[id].preco) + "\n   Quantidade: " + produto[id].quantidade ;
		
		return impressao;
	}
	
	public String pesquisarProduto(Produto[] produto, int opc, int cadastrados, int id, int cod, String nome) {
		String retorno = "Nenhum dado encontrado!";
		if(cadastrados == 0) {
			return retorno;
		}
		if(opc == 1) {
			for (int i = 0; i < cadastrados; i++) {
				if(produto[i].codigo == cod) {
					retorno = formatarProduto(produto, i);
				}
			}
		}else if(opc == 2) {
			for (int i = 0; i < cadastrados; i++) {
				if(produto[i].nome.equalsIgnoreCase(nome)) {
					retorno = formatarProduto(produto, i);
				}
			}
		}
		return retorno;
	}
	
	public boolean verificarExistencia(Produto[] produto, int opc, int qnt, int cod, String nome) {
		if(opc == 1) {
			for (int i = 0; i < qnt; i++) {
				if(produto[i].codigo == cod) {
					return true;
				}
			}
		}else if(opc == 2) {
			for (int i = 0; i < qnt; i++) {
				if(produto[i].nome.equalsIgnoreCase(nome)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void excluirProduto(Produto[] produto, int opc, int qnt, int cod, String nome) {
		int id = 0;
		if(opc == 1) {
			for (int i = 0; i < qnt; i++) {
				if(produto[i].codigo == cod) {
					id = i;
				}
			}
		}else if(opc == 2) {
			for (int i = 0; i < qnt; i++) {
				if(produto[i].nome.equalsIgnoreCase(nome) ) {
					id = i;
				}
			}
		}
		
		
		
		for (int i = id; i < qnt-1; i++) {
			produto[i].codigo = produto[i+1].codigo;
			produto[i].nome = produto[i+1].nome;
			produto[i].preco = produto[i+1].preco;
			produto[i].quantidade = produto[i+1].quantidade;
		}
	}
	
}
