package aula2;

import java.util.Scanner;

public class Ex02if {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroEscolhido = 0;
		boolean ehPositivo = false;
		boolean ehPar = false;
		
		System.out.println("Digite um número inteiro: ");
		numeroEscolhido = entrada.nextInt();
		
		ehPositivo = numeroEscolhido > 0;
		ehPar = numeroEscolhido % 2 == 0;
		
		entrada.close();
		
		if (ehPositivo && ehPar) {
			System.out.printf("O número %d eh positivo e par.", numeroEscolhido); //
			return;
		} else if (!ehPositivo && !ehPar) {
			System.out.printf("O número %d eh negativo e ímpar.", numeroEscolhido); //
			return;
		} else if (!ehPositivo && ehPar) {
			System.out.printf("O número %d eh negativo e par.", numeroEscolhido);
			return;
		} else if (ehPositivo && !ehPar){
			System.out.printf("O número %d eh positivo e ímpar.", numeroEscolhido);
			return;
		}
	}
}
