package ExercicoImpostodeRenda;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj;
	private String inscEstadual;
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	public double calculaIr() {
		return this.rendimentos * 15/100;
	}
}
