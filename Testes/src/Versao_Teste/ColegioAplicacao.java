package Versao_Teste;

public abstract class ColegioAplicacao extends Universidade{
	private String nomeCoordenador;

	public ColegioAplicacao(String nomeUniversidade, String nomeCoordenador) {
		super(nomeUniversidade);
		this.nomeCoordenador = nomeCoordenador;
	}
	
	public abstract void reuniaoDePais();
}
