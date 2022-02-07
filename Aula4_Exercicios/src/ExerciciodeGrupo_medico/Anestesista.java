package ExerciciodeGrupo_medico;

public class Anestesista extends Medico {
	
	protected String tipoAnestesia;
	
	public Anestesista(String empresa, double valorPago, double valoriss, String nome, int crm, String tipo) {
		super(empresa, valorPago, valoriss, nome, crm);
		this.tipoAnestesia = tipo;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {
		return "Anestesista [tipoAnestesia=" + tipoAnestesia + "]";
	}
	
	public double calcularPagamento(double calcularPagamento) {
		return calcularPagamento = getValorPago() + 0.10 + 1000.00;
	}
	
}
