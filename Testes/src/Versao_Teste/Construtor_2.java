package Versao_Teste;

public class Construtor_2 {

	  int dinheiro;
	  String nome;

	public Construtor_2 (int dinheiro, String nome) {
		this.dinheiro = dinheiro;
		this.nome = nome;
	}
	
	public void Gastar ( int total) {
		this.dinheiro = total;
		if( total < 10 ) {
			System.out.println("Ta duro fi, vai dormir");
		}else if ( total >= 100) {
			System.out.println("Pai ta chato, puxa logo um paki");
		}else {
			System.out.println("Suave, da p tomar umas cerva");
		}
	}
	
}
	
	

