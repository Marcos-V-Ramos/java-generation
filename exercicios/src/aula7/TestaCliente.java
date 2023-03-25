package aula7;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João da Silva", "joao.silva@gmail.com", "(11) 99999-9999", "Rua A, 123", 30);
        Cliente cliente2 = new Cliente("Maria Souza", "maria.souza@hotmail.com", "(21) 88888-8888", "Rua B, 456", 25);
        
        cliente1.visualizar();
        System.out.println("\n--------------------\n");
        cliente2.visualizar();
    }
}