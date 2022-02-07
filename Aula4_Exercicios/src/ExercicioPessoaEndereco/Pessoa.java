package ExercicioPessoaEndereco;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
		@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco(Endereco endereco) {
		return endereco;
	}
}
