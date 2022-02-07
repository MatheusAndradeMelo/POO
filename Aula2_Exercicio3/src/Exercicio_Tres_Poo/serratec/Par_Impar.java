package Exercicio_Tres_Poo.serratec;

public class Par_Impar {

	public static void main(String[] args) {
		int contPar = 0;
		int contImpar = 0;
		
		for (int i = 0; i < 30;  i++) {
			if (i % 2 == 0) {
				contPar += 1;
			}else {
				contImpar += 1;
			}
		}
		System.out.println("O total de números pares é " + contPar);
		System.out.println("E o Total de números impares é " + contImpar);
	}

}
