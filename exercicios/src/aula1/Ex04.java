package aula1;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    float n1 = sc.nextFloat();
	    float n2 = sc.nextFloat();
	    float n3 = sc.nextFloat();
	    float n4 = sc.nextFloat();
	    
	    float diferenca = (n1 * n2) - (n3 * n4);
	    
	    System.out.printf("Diferença do produto de %.2f e %.2f pelo produto de %.2f e %.2f: %.2f", n1, n2, n3, n4, diferenca);
	    
	    sc.close();
	}
}