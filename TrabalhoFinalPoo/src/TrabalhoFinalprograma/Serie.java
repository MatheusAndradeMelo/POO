package TrabalhoFinalprograma;

import java.util.List;

public class Serie extends Programa{
	
	private List<Temporada> temporadas;
		
	public Serie(int classificacao, String nomePrograma, Categoria categoria, List<Temporada> temporadas) {
		super(classificacao, nomePrograma, categoria);
		this.setTemporadas(temporadas);
	}
	public void adicionarNovaTemporada(Temporada temporada) {
		this.temporadas.add(temporada);
	}
	public List<Temporada> getquantidadeTemporadas() {
		return temporadas;
	}
	public List<Temporada> getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	@Override
	public void classificar(int classificacao) throws ClassificacaoForaDoRangeException {
		//CLASSIFICAR		
		if (classificacao < 0 || classificacao >10) {
			throw new ClassificacaoForaDoRangeException("ERROR.Classificação incorreta! Somente de 0 a 10");
		} else {
			this.classificacao = classificacao;			
		}		
	}
	@Override
	public String toString() {
		return "Nome da serie: " + nomePrograma + ", Categoria: " + categoria + ", " + temporadas.toString()+ " Classificação: " + classificacao + "\n";
	}
	@Override
	protected Object getnomePrograma() {
		
		return null;
	}
}