package aula1;

import java.util.Scanner;

public class Ex02 {
	
	private static void main(String[] args) {
		double n1, n2, n3, n4;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		System.out.println("Digite a quarta nota: ");
		n4 = entrada.nextDouble();
		
		System.out.println("A sua média final eh: " + (n1 + n2 + n3 + n4) / 4);
		
		entrada.close();
	}
}
