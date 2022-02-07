package Versao_Teste;

public abstract class Faculdade extends Universidade {
	private String nomeFacul;
	private int bloco;
	
	public Faculdade(String nomeUniversidade, String nomeFacul, int bloco) {
		super(nomeUniversidade);
		this.nomeFacul = nomeFacul;
		this.bloco = bloco;
	}

	public String getNomeFacul() {
		return nomeFacul;
	}

	public int getBloco() {
		return bloco;
	}
	
	public abstract String matrizCurricular();

	@Override
	public void fazerMatricula() {
		return;
		
	}

	@Override
	public String toString() {
		return "Faculdade nomeFacul=" + nomeFacul + ", bloco=" + bloco + "";
	}
	
	
}
