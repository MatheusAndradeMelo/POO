package Exercicio_Tres_Poo.serratec;

public class Fatorial {

	public static void main(String[] args) {
			System.out.println("--------------EXERCICIO FATORIAL-------------------\n");
		for(int num = 1, fatorial = 1; num <= 10; num++) {
			fatorial = fatorial * num;
			System.out.println("---------------------------------------------");
			System.out.println("O fatorial de "+ num + " é = " + fatorial);
		}

	}

}
