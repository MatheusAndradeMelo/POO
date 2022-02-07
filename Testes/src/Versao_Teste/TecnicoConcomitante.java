package Versao_Teste;

public final class TecnicoConcomitante extends ColegioAplicacao{
	private String nomeCurso;

	public TecnicoConcomitante(String nomeUniversidade, String nomeCoordenador, String nomeCurso) {
		super(nomeUniversidade, nomeCoordenador);
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	@Override
	public void reuniaoDePais() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub
		
	}
	
	
}
