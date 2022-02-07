package Versao_Teste;

public class Executar_Teste_flamengo {

	public static void main(String[] args) {
		
		Teste_flamengo flamengo = new Teste_flamengo(5, 1, 2);
		
		flamengo.jogo(2);
		System.out.println("O placar é : "+flamengo.getgolsfla()+" x 2 no jogo");
		System.out.println("E 4 x 2 pro flamengo no agregado");

	}

}
