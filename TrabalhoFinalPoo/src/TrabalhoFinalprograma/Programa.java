package TrabalhoFinalprograma;

public abstract class Programa implements Classificar {
	protected int classificacao;
	protected String nomePrograma;
	protected Categoria categoria;
	
	
	public Programa(String nomePrograma, Categoria categoria) {
		super();
		this.nomePrograma = nomePrograma;
		this.categoria = categoria;
	}
	public Programa(int pontuacao, String nomePrograma, Categoria categoria) {
		super();
		this.classificacao = pontuacao;
		this.nomePrograma = nomePrograma;
		this.categoria = categoria;
	}
	@Override
	public abstract void classificar(int classificacao) throws ClassificacaoForaDoRangeException;

	protected abstract Object getnomePrograma();
	
	public void setNomePrograma(String nomePrograma) {
		this.nomePrograma = nomePrograma;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	@Override
	public String toString() {
		return "Programa classificacao = " + classificacao + ", nomePrograma = " + nomePrograma + ", categoria = "
				+ categoria;
	}
	
}
