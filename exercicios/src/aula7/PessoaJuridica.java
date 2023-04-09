package aula7;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	public PessoaJuridica(String nome, String email, String telefone, String endereco, int idade, String cnpj) {
		super(nome, email, telefone, endereco, idade);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.getCnpj());
	}
}