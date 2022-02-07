package ExercicioFuncionarios;

public class Assistente extends Funcionario{
	private double adicional;

	
	public String toString() {
		return this.nome + " - " + this.salario;
	}
	@Override
	public double getSalario() {
		return super.getSalario() + this.adicional;
	}
	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}
	
}
