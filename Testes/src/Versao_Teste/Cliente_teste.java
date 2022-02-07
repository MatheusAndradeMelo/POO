package Versao_Teste;

public class Cliente_teste {
	//Encapsulamento com private
	
	private String codigo;
	private String cpf;
	private String nome;
	private String telefone;
	
	//Usando getters and Setters...Clicando com botão direito na classe/ source /Generate getters and setters
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Utilizando Métodos :
	public void pagarComDinheiro() {
		System.out.println(nome+" pagou com dinheiro!");
		System.out.println();
	}
	public void pagarComPix(String chave) {
		System.out.println("Pagamento com pix realizado!\nNa chave: "+chave);
	}
}
