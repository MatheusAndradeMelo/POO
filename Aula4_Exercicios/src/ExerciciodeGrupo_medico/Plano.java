package ExerciciodeGrupo_medico;

public class Plano {
	
	private String empresa;
	private double ValorPago = 80;
	private double Valoriss = 5;
		
	public Plano(String empresa, double valorPago, double valoriss) {
		super();
		this.empresa = empresa;
		ValorPago = valorPago;
		Valoriss = valoriss;

	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getValorPago() {
		return ValorPago;
	}

	public void setValorPago(double valorPago) {
		ValorPago = valorPago;
	}

	public double getValoriss() {
		return Valoriss;
	}

	public void setValoriss(double valoriss) {
		Valoriss = valoriss;
	}

	@Override
	public String toString() {
		return "Plano [empresa=" + empresa + "]";
	}
	public double calcularPagamento() {
		return ValorPago = ValorPago - ValorPago * Valoriss/100;
	}
}


