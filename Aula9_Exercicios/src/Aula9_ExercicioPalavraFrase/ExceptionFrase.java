package Aula9_ExercicioPalavraFrase;

public class ExceptionFrase {

	public static void main(String[] args) {
		String frase = null;
		
		try {
			System.out.println(frase.toUpperCase());
		}
		catch(NullPointerException erro) {
			System.out.println("ERROR.Deu ruim mané " + erro);
		}finally {
			System.out.println("-----------------------FIM------------------");
		}
		

	}

}
