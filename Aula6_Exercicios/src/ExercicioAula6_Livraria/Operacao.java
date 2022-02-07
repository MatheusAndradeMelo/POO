package ExercicioAula6_Livraria;

public class Operacao implements Livraria{
	
	private String tipoOp;
	private double valorOp;
	private Livro livro;
	
	public Operacao( String tipoOp, Livro livro, double valorOp) {
		this.tipoOp = tipoOp;
		this.livro = livro;
		this.valorOp = valorOp;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getTipoOp() {
		return tipoOp;
	}

	public double getValorOp() {
		return valorOp;
	}

	@Override
	public double emprestarLivro() {
		return this.valorOp = this.valorOp + (this.valorOp * 0.02) + taxaEmprestimo;
		
	}

	@Override
	public double venderLivro() {
		return this.valorOp *= 1.09;
		
	}

	
}
