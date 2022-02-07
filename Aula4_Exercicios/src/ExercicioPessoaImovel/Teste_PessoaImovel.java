package ExercicioPessoaImovel;

public class Teste_PessoaImovel {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Naruto", "12345678-78", "(21) 99123-3445");
		Imovel imovel = new Imovel( "Várzea", "Apto", 530000, pessoa );

		System.out.println(imovel.getTipoLocal() + "," + imovel.getdono() .getNome() + "," + imovel.getValorImovel() );
			
	}

}
