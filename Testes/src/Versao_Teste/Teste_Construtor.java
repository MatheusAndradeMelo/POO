package Versao_Teste;

public class Teste_Construtor {
	int numero;
	String nome;
	int idade;
	
	public Teste_Construtor (int numero, String nome, int idade) {
		this.numero = numero;
		this.nome = nome;
		this.idade = idade;
		
	}
	public void Entrar(int maioridade) {
		this.idade = maioridade ;
		if(maioridade < 18) {
			System.out.println("É proibido entrada de menores, volta pra casa menor");
		}else {
			System.out.println("Entrada liberada, pode encher a cara !");
		}
	}
	
}
