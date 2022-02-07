package ExercicoImpostodeRenda;

public class TestaIr {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Chorão",3000.0,"1234567-8","87654321");
		PessoaJuridica pj = new PessoaJuridica("Zeca Pagodinho",7500.0,"12345678-9","9876");
		
		System.out.println(pf.nome);
		System.out.println("Imposto a pagar: " + pf.calculaIr());
		
		System.out.println(pj.nome);
		System.out.println("Imposto a pagar: " + pj.calculaIr());

	}

}
