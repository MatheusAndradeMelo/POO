package Exercicios_Aula3_Construtor;

public class Calculadora {
	public double calcular(double x, double y, int operacao) {
		double resultado = 0;
		switch(operacao) {
		case 1 :
			resultado = x + y;
			break;
		case 2 :
			resultado = x - y;
			break;
		case 3 :
			resultado = x * y;
			break;
		case 4 : 
			resultado = x / y;
			break;
		}
		return resultado;
	}
}
