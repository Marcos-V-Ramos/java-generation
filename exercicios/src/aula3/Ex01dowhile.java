package aula3;

import java.util.Scanner;

public class Ex01dowhile {
	public static void main(String[] args) {
		
		int somaPositivos = 0;
		int numeroCorrente = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Por favor, digite um número: ");
			numeroCorrente = entrada.nextInt();
			if (numeroCorrente > 0) {
				somaPositivos += numeroCorrente;
			}
		} while (numeroCorrente > 0);
		
		System.out.println("Soma dos números positivos: " + somaPositivos);
	}
}