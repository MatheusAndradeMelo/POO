package Aula8_ExceptionDivisao0;


public class DivisaoPor0 {

	public static void main(String[] args) {
		
		int i = 7, j = 0;
		double divisao;
		
		try {
			System.out.println("==================================================");
			divisao = i / j;
			System.out.println(i + " / " + j + " = " + divisao);
		
		} catch(ArithmeticException erro) {
			System.out.println("ERROR : Não é possivel dividir um número por 0 rapa " + erro);
		} finally {
			System.out.println("\n-------------------FIM---------------------------");
		}
		
		
    }
	
	
}