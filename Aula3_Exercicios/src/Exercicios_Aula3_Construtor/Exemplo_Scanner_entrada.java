package Exercicios_Aula3_Construtor;

import java.util.Scanner;

public class Exemplo_Scanner_entrada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Digite um número: ");
		a = ler.nextInt();
		
		System.out.println("Voce digitou da primeira vez: " + a);
		
		System.out.println("Digite um número: ");
		b = ler.nextInt();
		
		System.out.println("Voce digitou da segunda vez: " + b);
		
		ler.close();
	}

}
