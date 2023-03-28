package me.caue.exercicio1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Util {
	int id = 0;
	int aID = 1;
	private Cliente[] cliente = new Cliente[5];
	
	public void menu() {
		int opc;
		do {
			do {
				opc = parseInt(showInputDialog("Escolha uma das opções: \n\n1. Cadastrar Cliente\n2. Listar Vendas\n3. Cliente Master (Que mais alugou)\n4. Lucro Total\n5. Finalizar Programa"));
			}while(opc < 1 || opc > 5);
			
			if(opc == 1) {
				if(id == 5) {
					showMessageDialog(null, "Número máximo de clientes cadastrados.");
				}else {
					String nome, cpf;
					int tempo;
					
					nome = showInputDialog("Qual o nome do cliente?");
					cpf = showInputDialog("Qual o CPF de " + nome + "?");
					tempo = parseInt(showInputDialog("Quanto tempo " + nome + " irá alugar o veículo? (Em minutos)"));
					
					cliente[id] = new Cliente();
					
					cliente[id].id = aID;
					cliente[id].nome = nome;
					cliente[id].cpf = cpf;
					cliente[id].tempo = tempo;
					id++;
					aID++;
				}
			}else if(opc == 2) {
				if(id <= 0) {
					showMessageDialog(null, "Nenhum registro disponível.");
				}else {
					String aux = "Aluguéis: \n";
					for (int i = 0; i < id; i++) {
						aux += "\nID " + cliente[i].id + ":";
						aux += "\n  Nome: " + cliente[i].nome;
						aux += "\n  CPF: " + cliente[i].cpf;
						aux += "\n  Tempo (em minutos): " + cliente[i].tempo;
						aux += "\n  Total Pago: R$" + String.format("%.2f", (cliente[i].tempo * 0.50));
					}
					showMessageDialog(null, aux);
				}
			}else if(opc == 3) {
				if(id <= 0) {
					showMessageDialog(null, "Nenhum registro disponível.");
				}else {
					showMessageDialog(null, gerarRanking(id, cliente));
				}
			}else if(opc == 4) {
				if(id <= 0) {
					showMessageDialog(null, "Lucro\nR$0,00");
				}else {
					showMessageDialog(null, "Lucro\n" + getLucros(id, cliente));

				}
			}else {
				showMessageDialog(null, "Programa Finalizado!");
				return;
			}
		}while(true);
		
	}
	public String gerarRanking(int id, Cliente[] cliente) {
		int aux2 = 0;
		int aux = 0;
		for (int i = 0; i < id; i++) {
			if(cliente[i].tempo > aux2) {
				aux2 = cliente[i].tempo;
				aux = i;
			}
		}
		
		String aux1 = "Cliente Master:\n";
		
			aux1 += "\n  Nome: " + cliente[aux].nome;
			aux1 += "\n  CPF: " + cliente[aux].cpf;
			aux1 += "\n  Tempo (em minutos): " + cliente[aux].tempo;
			aux1 += "\n  Total Pago: R$" + String.format("%.2f", (cliente[aux].tempo * 0.50));
		
		
		return aux1;
	}
	
	public String getLucros(int id, Cliente[] cliente) {
		int tempo = 0;
		for (int i = 0; i < id; i++) {
			tempo += cliente[i].tempo;
		}
		
		return "R$" + String.format("%.2f", (tempo * 0.5));
	}
}
