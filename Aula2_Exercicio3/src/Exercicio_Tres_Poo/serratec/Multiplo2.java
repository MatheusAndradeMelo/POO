package Exercicio_Tres_Poo.serratec;

public class Multiplo2 {

	public static void main(String[] args) {
		int total = 0;
		
		for (int cont = 1; cont <= 22; cont++) {
			int resto = cont % 2;
			if (resto == 0) {
				System.out.println( cont + " JAVA");
				total += 1;
			}
		}
		System.out.println("O total de multiplos encontrados é = " + total);
	}

}
