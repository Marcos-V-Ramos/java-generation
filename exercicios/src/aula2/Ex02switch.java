package aula2;

import java.util.Scanner;

public class Ex02switch {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String nomeColaborador;
	        int codigoCargo;
	        float salario, novoSalario;
	        
	        System.out.println("Digite o nome do colaborador: ");
	        nomeColaborador = sc.nextLine();
	        System.out.println("Digite o código do cargo (1 a 6): ");
	        codigoCargo = sc.nextInt();
	        System.out.println("Digite o salário do colaborador: ");
	        salario = sc.nextFloat();
	        
	        switch (codigoCargo) {
	            case 1:
	                novoSalario = salario + (0.1f * salario);
	                System.out.println("Nome do colaborador: " + nomeColaborador);
	                System.out.println("Cargo: Gerente");
	                System.out.println("Novo salário: R$ " + novoSalario);
	                break;
	            case 2:
	            	novoSalario = salario + (0.1f * salario);
	                System.out.println("Nome do colaborador: " + nomeColaborador);
	                System.out.println("Cargo: Vendedor");
	                System.out.println("Novo salário: R$ " + novoSalario);
	                break;
	            case 3:
	            	novoSalario = salario + (0.1f * salario);
	                System.out.println("Nome do colaborador: " + nomeColaborador);
	                System.out.println("Cargo: Supervisor");
	                System.out.println("Novo salário: R$ " + novoSalario);
	                break;
	            case 4:
	            	novoSalario = salario + (0.1f * salario);
	                System.out.println("Nome do colaborador: " + nomeColaborador);
	                System.out.println("Cargo: Motorista");
	                System.out.println("Novo salário: R$ " + novoSalario);
	                break;
	            case 5:
	            	novoSalario = salario + (0.1f * salario);
	                System.out.println("Nome do colaborador: " + nomeColaborador);
	                System.out.println("Cargo: Estoquista");
	                System.out.println("Novo salário: R$ " + novoSalario);
	                break;
	            case 6:
	            	novoSalario = salario + (0.1f * salario);
	                System.out.println("Nome do colaborador: " + nomeColaborador);
	                System.out.println("Cargo: Técnico de TI");
	                System.out.println("Novo salário: R$ " + novoSalario);
	                break;
	            default:
	                System.out.println("Código de cargo inválido!");
	        }
	        
	        sc.close();
	    }
}
