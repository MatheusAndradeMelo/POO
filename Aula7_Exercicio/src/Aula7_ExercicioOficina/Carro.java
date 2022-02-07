package Aula7_ExercicioOficina;


import java.time.DayOfWeek;
import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getvalorServico();
		
	}
	@Override
	public double trocarOleo() {
		if(dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valorCobrado = valorCobrado + TipoServico.OLEO.getvalorServico() - 50 ;
		}else {
			valorCobrado = valorCobrado + TipoServico.OLEO.getvalorServico();
		}
		
		return valorCobrado;
		
	}
	@Override
	public double revisao() {
		if(dataConserto.getDayOfMonth() == 8) {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getvalorServico() * 10/100;
		}else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getvalorServico();
		}
		
		return valorCobrado;
		
	}
	
}
