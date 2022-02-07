package ExercicioAula6_Livraria;

public class Livro {
	private String autor;
	private String titulo;
	private double valorLivro;
	
	public Livro(String autor, String titulo, double valorLivro) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.setValorLivro(valorLivro);
	}

	@Override
	public String toString() {
		return "Livro autor = " + autor + ", titulo = " + titulo + ", valorLivro = " + valorLivro + " ";
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValorLivro() {
		return valorLivro;
	}
	
	public void reajuste() {
		this.valorLivro += valorLivro *  0.06;
	}
	public double setValorLivro(double valorLivro) {
		this.valorLivro = valorLivro;
		return valorLivro;
	}

	
}
