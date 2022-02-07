package ExerciciodeGrupo_medico;

public class Medico extends Plano {
	
	protected String nome;
	private int crm;
	
	public Medico(String empresa, double valorPago, double valoriss, String nome, int crm) {
		super(empresa, valorPago, valoriss);
		this.nome = nome;
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", crm=" + crm + "]";
	}
	public String getNome() {
		return nome;
	}
	public int getcrm() {
		return crm;
	}
	public double calcularPagamento(double CalcularPagamento) {
		return CalcularPagamento = getValorPago() + 0.10;
	}
}
