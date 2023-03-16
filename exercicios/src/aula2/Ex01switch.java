package aula2;

import java.util.Scanner;

public class Ex01switch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int codigo, quantidade;
        double precoTotal = 0.0;
        String nomeProduto = "";
        
        System.out.println("Digite o código do produto (1 a 6): ");
        codigo = entrada.nextInt();
        System.out.println("Digite a quantidade comprada: ");
        quantidade = entrada.nextInt();
        
        switch (codigo) {
            case 1:
                nomeProduto = "Cachorro Quente";
                precoTotal = 10.0 * quantidade;
                break;
            case 2:
                nomeProduto = "X-Salada";
                precoTotal = 15.0 * quantidade;
                break;
            case 3:
                nomeProduto = "X-Bacon";
                precoTotal = 18.0 * quantidade;
                break;
            case 4:
                nomeProduto = "Bauru";
                precoTotal = 12.0 * quantidade;
                break;
            case 5:
                nomeProduto = "Refrigerante";
                precoTotal = 8.0 * quantidade;
                break;
            case 6:
                nomeProduto = "Suco de Laranja";
                precoTotal = 13.0 * quantidade;
                break;
            default:
                System.out.println("Código de produto inválido!");
        }
        
        entrada.close();
        System.out.println("Total da compra: R$ " + precoTotal);
        System.out.println("Produto comprado: " + nomeProduto);
    }
}
