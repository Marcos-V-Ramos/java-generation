package aula1;

import java.util.Scanner;

public class Ex03 {
	
	public static void main (String[] args) {
		
		float salBruto = 0f;
		float adcNoturno = 0f;
		float horasExtras = 0f;
		float desconto = 0f;
		float salLiquido = 0f;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário bruto: ");
		salBruto = entrada.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adcNoturno = entrada.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasExtras = entrada.nextFloat();
		
		System.out.println("Digite o valor do desconto: ");
		desconto = entrada.nextFloat();
		
		salLiquido = salBruto + adcNoturno + (horasExtras * 5) - desconto;
		System.out.println("O salário líquido é: " + salLiquido);
		
		entrada.close();
	}
}