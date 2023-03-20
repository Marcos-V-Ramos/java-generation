package aula4;

import java.util.Scanner;

public class Ex01matriz {
	public static void main(String[] args) {
		
		int[][] matrizInteiros = new int[3][3];
		final Scanner entrada = new Scanner(System.in);
		int somaDiagonalPrincipal = 0; 
		int somaDiagonalSecundaria = 0;
		
		
		for (int i = 0; i < matrizInteiros.length; i++) {
			for (int j = 0; j < matrizInteiros[i].length; j++) {
				System.out.print("Por favor, digite o valor para a linha " + i + " e para a coluna " + j + ": ");
				matrizInteiros[i][j] = entrada.nextInt();
			}
		}
		
		entrada.close();
		
		for (int[] vetor : matrizInteiros) {
			for (int numero : vetor) {
				System.out.print(numero + " ");
			}
			System.out.println("\t");
		}
		
		// Encontra a diagonal PRINCIPAL, a soma e imprime os valores:
		System.out.print("\nElementos da Diagonal Principal: ");
		for (int i = 0; i < matrizInteiros.length; i++) {
			somaDiagonalPrincipal += matrizInteiros[i][i];
			System.out.print(matrizInteiros[i][i] + " ");
		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		
		// Encontra a diagonal SECUNDÁRIA, a soma e imprime os valores:
		System.out.print("Elementos da Diagonal Principal: ");
		for (int i = 0, j = matrizInteiros.length - 1; i < matrizInteiros.length; i++) {
			somaDiagonalSecundaria += matrizInteiros[i][j];
			System.out.print(matrizInteiros[i][j] + " ");
			--j;
		}
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
	}
}