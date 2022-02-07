package Exercicio_Tres_Poo.serratec;

public class Tabuada {

	public static void main(String[] args) {
		int numero = 2, resultado = 0;
			System.out.println("--------------TABUADA DO 2 ------------------\n");
		for(int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println("-------------------------------------");
			System.out.println(numero + "x" + i + "=" + resultado);
		}

	}

}
