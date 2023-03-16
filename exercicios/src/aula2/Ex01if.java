package aula2;

import java.util.Scanner;

public class Ex01if {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		
		System.out.println("Digite um valor inteiro para A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite um valor inteiro para B: ");
		b = entrada.nextInt();
		
		System.out.println("Digite um valor inteiro para C: ");
		c = entrada.nextInt();
		
		entrada.close();
		
		if (a + b > c) {
			System.out.println("A soma de A + B é MAIOR que C.");
			return;
		} 
		
		if (a + b == c) {
			System.out.println("A soma de A + B é IGUAL a C.");
			return;
		}
		
		if (a + b < c) {
			System.out.println("A soma de A + B é MENOR queC.");
			return;
		}
	}
}
