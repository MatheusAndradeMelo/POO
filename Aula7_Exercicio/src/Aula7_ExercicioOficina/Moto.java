package Aula7_ExercicioOficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}
	@Override
	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getvalorServico();
	}
	@Override
	public double trocarOleo() {
		return valorCobrado = valorCobrado + TipoServico.OLEO.getvalorServico();
	}
	@Override
	public double revisao() {
		return valorCobrado = valorCobrado + TipoServico.REVISAO.getvalorServico();
	}
	
}
