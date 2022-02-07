package Exercicios_Aula3_Construtor;

public class Conta {
	String titular;
	int numero;
	double saldo;
	
	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void Depositar(double valorDepositado) {
		this.saldo += valorDepositado;
	}
	
	public void sacar(double valorRetirado) {
		this.saldo -= valorRetirado;
	}
}
