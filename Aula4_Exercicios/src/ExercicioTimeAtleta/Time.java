package ExercicioTimeAtleta;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;
	private Atleta[] atletas;
	
	public Time(String nomeTime, String tecnico, String diretor, Atleta[] atletas) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
		this.atletas = atletas;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public String getDiretor() {
		return diretor;
	}
	public void adicionarAtletas(Atleta atleta) {
		for(int i = 0; i < atletas.length; i++) {
			if(atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}
		}
	}
	public void mostrarTime() {
		for(int j = 0; j < atletas.length; j++) {
			System.out.println(atletas[j].getNome());
		}
	}
}
