package aula3;

import java.util.Scanner;

public class Ex01for {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite o primeiro número");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número");
		n2 = entrada.nextInt();
		
		entrada.close();
		
		if (n2 < n1) {
			System.out.println("O primeiro número é maior que o segundo! ");
			return;
		}
		
		for (int i = n1; i < n2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5!");
			}
		}
	}
}
