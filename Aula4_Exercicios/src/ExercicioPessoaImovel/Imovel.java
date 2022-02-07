package ExercicioPessoaImovel;

public class Imovel {
	
	protected String local;
	protected String tipoImovel;
	protected double valorImovel;
	protected Pessoa dono;
	
	public Imovel(String local, String tipoImovel, double valorImovel,Pessoa dono) {
		this.local = local;
		this.tipoImovel = tipoImovel;
		this.valorImovel = valorImovel;
		this.dono = dono ;
	}

	public String getTipoLocal() {
		return tipoImovel;
	}

	public void setTipoLocal(String tipoLocal) {
		this.tipoImovel = tipoLocal;
	}

	public double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}
	public Pessoa getdono() {
		return dono;
	}

	@Override
	public String toString() {
		return "Imovel [local=" + local + ", tipoImovel=" + tipoImovel + ", valorImovel=" + valorImovel + ", dono=" + dono + "]";
	}
	
}
