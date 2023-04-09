package aula7;

public class PessoaFisica extends Cliente {

	private String cpf;
	
	public PessoaFisica(String nome, String email, String telefone, String endereco, int idade, String cpf) {
		super(nome, email, telefone, endereco, idade);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}
}