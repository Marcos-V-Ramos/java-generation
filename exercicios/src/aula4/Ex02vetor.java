package aula4;

import java.util.Scanner;

public class Ex02vetor {

	public static void main(String[] args) {
		
		final Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		int somaNumeros = 0;
		double mediaNumeros = 0D;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número para a posição " + i + ": ");
			numeros[i] = entrada.nextInt();
			somaNumeros += numeros[i];
		}
		
		System.out.println("Números Ímpares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println("\nNúmeros Pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println("\nSoma dos números: " + somaNumeros);
		mediaNumeros = somaNumeros / numeros.length;
		System.out.println("Média dos números: " + mediaNumeros);
		
		System.out.println("\nFim do programa.");
		entrada.close();
	}
}
