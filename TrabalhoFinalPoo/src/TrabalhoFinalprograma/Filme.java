package TrabalhoFinalprograma;

public final class Filme extends Programa {
	private double duracao;

	public Filme(String nomePrograma, Categoria categoria, double duracao) {
		super(nomePrograma, categoria);
		this.duracao = duracao;
	}
	@Override
	public String toString() {
		return "Nome do filme = " + nomePrograma + ", duracao do filme = " + duracao + " minutos ," + " categoria = "
				+ categoria + ", Classificação: " + classificacao + "\n";
	}
	@Override
	public void classificar(int classificacao) throws ClassificacaoForaDoRangeException {
		//CLASSIFICAR		
		if (classificacao < 0 || classificacao >5) {
			throw new ClassificacaoForaDoRangeException("ERROR.Classificação incorreta! Somente de 0 a 5");
		} else {
			this.classificacao = classificacao;			
		}		
	}
	@Override
	protected Object getnomePrograma() {

		return null;
	}	
	
}
