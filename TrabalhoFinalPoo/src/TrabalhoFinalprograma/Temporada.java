package TrabalhoFinalprograma;

public class Temporada { 
	private int quantidadeEpisiodios;
	private int numeroTemporada;
	
	public Temporada(int quantidadeEpisiodios, int numeroTemporada) {
		super();
		this.quantidadeEpisiodios = quantidadeEpisiodios;
		this.numeroTemporada = numeroTemporada;
	}
	public int getQuantidadeEpisiodios() {
		return quantidadeEpisiodios;
	}
	public void setQuantidadeEpisiodios(int quantidadeEpisiodios) {
		this.quantidadeEpisiodios = quantidadeEpisiodios;
	}
	public int getNumeroTemporada() {
		return numeroTemporada;
	}
	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}
	@Override
	public String toString() {
		return " quantidade de episiodios = " + quantidadeEpisiodios + ", numero da temporada = " + numeroTemporada + "";
	}
}
