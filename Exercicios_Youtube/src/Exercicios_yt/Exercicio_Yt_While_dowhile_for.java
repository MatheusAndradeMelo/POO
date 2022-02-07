package Exercicios_yt;

public class Exercicio_Yt_While_dowhile_for {

	public static void main(String[] args) {
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println(contador++);
		}
		
		
		do {
			System.out.println("dentro do do while");
			
		}while(contador <= 10);
		
		
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("O valor de i é :" + i);
			if(i==5) {
				break;
			}
		}

	}

}
