package Versao_Teste;

import java.util.Scanner;

public class Teste_Scanner {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String n;
		int i;
		int din;
		
		System.out.println("---------------OLÁ JOVEM---------------------");
		System.out.println("Digite seu nome :");
		n = ler.next();
		System.out.println("Digite sua idade :");
		i = ler.nextInt();
		System.out.println("Quanto tem de dinheiro ?");
		din = ler.nextInt();
		
		System.out.println("--------------RESULTADO--------------");
		
		if (din < 10) {
			System.out.println("Ta duro vai dormir");
		}else if (din >= 100) {
			System.out.println("Puxa logo um paki");
		}else {
			System.out.println("Suave da p tomar umas cerva");
		}
			

	}

}
