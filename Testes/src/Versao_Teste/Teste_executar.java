package Versao_Teste;

public class Teste_executar {

	public static void main(String[] args) {
	
		Teste_Construtor teste_construtor = new Teste_Construtor (2,"Matheus",15);
		
		System.out.println(teste_construtor.nome);
		
		System.out.println("Idade : "+teste_construtor.idade);
		
		teste_construtor.Entrar(15);
		
	}

}
