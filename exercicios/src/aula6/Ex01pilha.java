package aula6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex01pilha {

	public static void main(String[] args) {
		Stack<String> fila = new Stack<String>();
		Scanner entrada = new Scanner(System.in);
		int opcao = 1;
		
		while (opcao != 0) {
			
			System.out.println("Digite a próxima opção: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 0:
					System.out.println("Saindo do sistema, Até a próxima!");
					break;
				case 1:
					System.out.println("1 - Adicionar um cliente à fila: ");
					System.out.println("Digite o nome do cliente: ");
					String nome = entrada.next();
					fila.push(nome);
					break;
				case 2:
					System.out.println("2 - Listar clientes");
					System.out.println(fila);
					break;
				case 3:
					System.out.println("3 - Retirar cliente da pilha");
					System.out.println("O " + fila.pop() + " saiu da pilha."); 
					break;
				default:
					System.out.println("Entrada inválida!!");
					break;
			}
			
		}
	}
}