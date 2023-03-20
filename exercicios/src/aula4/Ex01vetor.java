package aula4;

import java.util.Scanner;

public class Ex01vetor {
	public static void main(String[] args) {
		final int[] numeros = { 6, 13, 22, 1, 7, 3, 5, -1, -5, -10 }; 
		final Scanner entrada = new Scanner(System.in);
		int numeroEscolhido = 0;
		
		System.out.println("Olá, digite o número que você deseja encontrar: ");
		numeroEscolhido = entrada.nextInt();
		entrada.close();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroEscolhido) {
				System.out.format("O número %d está localizado na posição %d", numeroEscolhido, i);
				break;
			}
		}
		System.out.format("O número %d não foi encontrado!", numeroEscolhido);
	}
}