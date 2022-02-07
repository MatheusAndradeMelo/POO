package ExercicioAula6_PaisAtleta;

public class TestaAtleta {

	public static void main(String[] args) {
		Pais pais1 = new Pais("Brasil", 20);
		Pais pais2 = new Pais("Eua", 20);
		
		Atleta atleta1 = new Atleta("Aurélio", 78.0, "Levantamento de peso", "Brasil");
		Atleta atleta2 = new Atleta("Steve jobs",59.0, " Skate Park", "Eua");
		Atleta atleta3 = new Atleta("Allen Iverson",85.0, "Basquete", "Eua");
		Atleta atleta4 = new Atleta("Lebron James", 110.0, "Basquete", "Eua");
		
		atleta1.verificarSituacao();
		atleta2.verificarSituacao();
		atleta3.verificarSituacao();
		atleta4.verificarSituacao();
		
		System.out.println("Nome: " + atleta1.getNome() + ", Nacionalidade: " + atleta1.getNacionalidade() + ", Peso: "+ atleta1.getPeso() + 
				", Modalidade: " + atleta1.getModalidade() + ", Situação do atleta: " + atleta1.verificarSituacao()+"\n");
		
		System.out.println("Nome: " + atleta2.getNome() + ", Nacionalidade: " + atleta2.getNacionalidade() + ", Peso: "+ atleta2.getPeso() + 
				", Modalidade: " + atleta2.getModalidade() + ", Situação do atleta: " + atleta2.verificarSituacao()+"\n");
		
		System.out.println("Nome: " + atleta3.getNome() + ", Nacionalidade: " + atleta3.getNacionalidade() + ", Peso: "+ atleta3.getPeso() + 
				", Modalidade: " + atleta3.getModalidade() + ", Situação do atleta: " + atleta3.verificarSituacao()+"\n");
		
		System.out.println("Nome: " + atleta4.getNome() + ", Nacionalidade: " + atleta4.getNacionalidade() + ", Peso: "+ atleta4.getPeso() + 
				", Modalidade: " + atleta4.getModalidade() + ", Situação do atleta: " + atleta4.verificarSituacao()+"\n");
	}
}
