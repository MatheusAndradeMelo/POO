package ExercicioFuncionarios;

public class Gerente extends Funcionario{
	private String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.salario;
	}
	
	public double partLucros() {
		return super.partLucros() + 200;
	}
	
	
	
}
