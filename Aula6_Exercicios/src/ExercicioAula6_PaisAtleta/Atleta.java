package ExercicioAula6_PaisAtleta;

public class Atleta {
	private String nome;
	private double peso;
	private String modalidade;
	private String nacionalidade;
	
	public Atleta(String nome, double peso, String modalidade, String nacionalidade) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.nacionalidade = nacionalidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String verificarSituacao() {
		if(peso > 90.0) {
			modalidade = "Peso pesado";
			return "Participará";
		}else if (peso >= 60 && peso <= 90 ) {
		modalidade = "Peso médio";
			return "Participará";
		}else {
			return "Não participará";
	}
		
}
	
}
