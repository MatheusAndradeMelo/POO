package Versao_Teste;

public class Cliente_Executar_teste {

	public static void main(String[] args) {
		
		Cliente_teste cliente1 = new Cliente_teste();
		
		cliente1.setNome("Matheus");
		
		cliente1.pagarComDinheiro();
		
		cliente1.pagarComPix("mandrademelo77@gmail.com");
	}
	
}
