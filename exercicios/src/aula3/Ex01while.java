package aula3;

import java.util.Scanner;

public class Ex01while {

	public static void main(String[] args) {
		int lower21 = 0;
		int greater50 = 0;
		int idadeCorrente = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá, digite uma idade: ");
		idadeCorrente = entrada.nextInt();
		while (idadeCorrente > 0) {
			if (idadeCorrente < 21) {
				lower21++;
			}
			
			if (idadeCorrente > 50) {
				greater50++; 
			}
			System.out.println("Digite uma outra idade: ");
			idadeCorrente = entrada.nextInt();
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + lower21);
		System.out.println("Total de pessoas maiores de 50 anos: " + greater50);
	}
}
