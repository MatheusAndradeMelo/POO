package ExercicioTimeAtleta;

public class TesteTimeAtleta {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Arrascaeta", 27, "Meia");
		Atleta atleta2 = new Atleta("Gabigol", 26, "Atacante");
		Atleta atleta3 = new Atleta("David Luiz", 26, "Zagueiro");
		
		Time time = new Time("Flamengo", "Renato Gaúcho", "Marcos Bras", new Atleta[3]);
		time.adicionarAtletas(atleta1); 
		time.adicionarAtletas(atleta2); 
		time.adicionarAtletas(atleta3);
		
		System.out.println("Time: " + time.getNomeTime());
		time.mostrarTime(); 
	}

}
