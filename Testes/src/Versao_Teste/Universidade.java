package Versao_Teste;

public abstract class Universidade {
	private String nomeUniversidade;

	public Universidade(String nomeUniversidade) {
		super();
		this.nomeUniversidade = nomeUniversidade;
	}

	public String getNomeFacul() {
		return nomeUniversidade;
	}
	
	public abstract void fazerMatricula();

	@Override
	public String toString() {
		return "Universidade nomeFacul=" + nomeUniversidade + "";
	}
	
	
}
