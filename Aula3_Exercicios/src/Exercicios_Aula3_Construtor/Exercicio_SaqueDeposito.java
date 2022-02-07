package Exercicios_Aula3_Construtor;

public class Exercicio_SaqueDeposito {

	public static void main(String[] args) {
		Conta conta = new Conta("Matheus", 1, 100.00);
		
		conta.Depositar(20.00);
		
		System.out.println("Seu saldo na conta é = R$ "+conta.saldo);
		
		conta.sacar(40.00);
		
		System.out.println("Valor sacado.\nSeu saldo atual é : R$ "+conta.saldo);

	}

}
