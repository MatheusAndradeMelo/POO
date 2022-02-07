package ExerciciodeGrupo_medico;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("São josé", 80, 5, "Clinica São josé", "CGC/RJ");
		Medico medico = new Medico("São José", 88, 5, "Ricardo", 1234567);
		Anestesista anestesista = new Anestesista("São josé", 1088, 5, "Goku", 123456, "Geral");
		
		System.out.println(clinica.calcularPagamento());
		System.out.println(medico.calcularPagamento());
		System.out.println(anestesista.calcularPagamento());
		
		System.out.println(clinica.toString());
		System.out.println(medico.toString());
		System.out.println(anestesista.toString());
	}

}
