package aula6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
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
					fila.add(nome);
					break;
				case 2:
					System.out.println("2 - Listar clientes");
					System.out.println(fila);
					break;
				case 3:
					System.out.println("3 - Retirar cliente da fila");
					System.out.println("O" + fila.poll() + " saiu da fila."); 
					break;
				default:
					System.out.println("Entrada inválida!!");
					break;
			}
			
		}
	}
}