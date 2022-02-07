package ExercicioPessoaEndereco;

public class TestePessoaEndereco {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Silvestre Pereira Soares", "Artistas", "Teresópolis ");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("MarceloD2");
		pessoa.setCpf("1234567-8");
		pessoa.setEndereco(endereco);
		
		
		System.out.println(pessoa.toString() + pessoa.getEndereco(endereco).getCidade() + pessoa.getEndereco(endereco).getBairro()+ " "
				+ pessoa.getEndereco(endereco).getRua());

	}

}
