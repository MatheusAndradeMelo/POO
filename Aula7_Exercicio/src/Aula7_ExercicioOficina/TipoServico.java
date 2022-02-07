package Aula7_ExercicioOficina;

public enum TipoServico {
	OLEO(100),LAVAGEM(50),REVISAO(200);
	
	private TipoServico(double valorServico) {
		this.valorServico = valorServico;
	}
	
	private double valorServico;
	
	public double getvalorServico() {
		return valorServico;
	}
}
