package Exercicio_um.serratec;

public class SituacaoAluno {
	public static void main(String[] args) {
		double nota1 = 8, nota2 = 5;
		double media = (nota1 + nota2) / 2;
		
		if (media==10) {
			System.out.println("Aprovado,Parab�ns!");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
