package Versao_Teste;

public final class Direito extends Faculdade implements OAB,Eventos {
	private int tempoDeDuracao;

	public Direito(String nomeUniversidade, String nomeFacul, int bloco, int tempoDeDuracao) {
		super(nomeUniversidade, nomeFacul, bloco);
		this.tempoDeDuracao = tempoDeDuracao;
	}

	public int getTempoDeDuracao() {
		return tempoDeDuracao;
	}

	public void setTempoDeDuracao(int tempoDeDuracao) {
		this.tempoDeDuracao = tempoDeDuracao;
	}

	@Override
	public String matrizCurricular() {
		
		return null;
	}
	@Override
	public void fazerMatricula() {
		return;
	}

	@Override
	public String programacao() {
		
		return null;
	}

	@Override
	public void conteudoEvento() {
		
		
	}

	@Override
	public boolean realizarProva() {
		
		return false;
	}

	@Override
	public String toString() {
		return "Direito tempoDeDuracao=" + tempoDeDuracao + "";
	}
	
	
	
	
}
