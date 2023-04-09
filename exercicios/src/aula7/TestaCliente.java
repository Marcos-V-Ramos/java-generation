package aula7;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João da Silva", "joao.silva@gmail.com", "(11) 99999-9999", "Rua A, 123", 30);
        Cliente cliente2 = new Cliente("Maria Souza", "maria.souza@hotmail.com", "(21) 88888-8888", "Rua B, 456", 25);
        
        cliente1.visualizar();
        System.out.println("\n--------------------\n");
        cliente2.visualizar();
        
        PessoaFisica pf1 = new PessoaFisica("Marcos V.", "marcosv@gmail.com", "96082-6242", "Rua das Olivas, 33", 22, "50823213844");
        PessoaFisica pf2 = new PessoaFisica("Isabelle Lima", "isinha@gmail.com", "93233-5453", "Rua Pará Nova", 21, "51232112332");
        pf1.visualizar();
        pf2.visualizar();
        
        PessoaJuridica pj1 = new PessoaJuridica("José Alberto", "josealb2@gmail.com", "91122-2121", "Rua Perdizes", 32, "213123332");
        PessoaJuridica pj2 = new PessoaJuridica("Mathias Evandro F.", "mathiasempresas@empresa.com", "4002-8922", "Rua dos Lagos, 22", 36, "3243533333");
        pj1.visualizar();
        pj2.visualizar();
    }
}