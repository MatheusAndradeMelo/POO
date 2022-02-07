package ExercicioAula6_PaisAtleta;

public class Pais {
	private String nome;
	private int totalParticipantes;

	public Pais(String string, int totalParticipantes) {
		super();
		this.nome = string;
		this.totalParticipantes = totalParticipantes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public void setTotalParticipantes(int totalParticipantes) {
		this.totalParticipantes = totalParticipantes;
	}

	
	
	
}
