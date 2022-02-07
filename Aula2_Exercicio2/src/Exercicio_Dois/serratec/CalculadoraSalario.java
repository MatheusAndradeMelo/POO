package Exercicio_Dois.serratec;

public class CalculadoraSalario {

	public static void main(String[] args) {
		double salario = 5900;
		
		if(salario <= 1751.81) {
			salario -= salario * 8/100;
		}else if(salario >= 1751.82 && salario <= 5839.45) {
			salario -= salario * 9/100;
		}else if(salario >= 2912.73 && salario <= 5839.45) {
			salario -= salario * 10/100;
		}else {
			salario -= salario * 11/100;
		}
		System.out.println("Salario com desconto: "+ salario);
	}

}
