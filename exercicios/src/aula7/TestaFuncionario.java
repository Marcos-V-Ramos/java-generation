package aula7;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Marcos V", "marcosdev@gmail.com", "11960826242", "Desenvolvedor", 2500);
		Funcionario f2 = new Funcionario("Isabelle L", "isabellese@gmail.com", "11966511241", "Dentista", 3000);
		f1.visualizar();
		System.out.println("\n--- --- --- --- --- --- ---\n");
		f2.visualizar();
	}
}