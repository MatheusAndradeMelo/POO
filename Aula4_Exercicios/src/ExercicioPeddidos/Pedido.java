package ExercicioPeddidos;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	private int numero;
	private LocalDate data;
	private int quantidade;
	private double valor;
	private double total;
	
	public Pedido(int numero, LocalDate data, int quantidade, double valor) {
		super();
		this.numero = numero;
		this.data = data;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}

	public LocalDate getData() {
		return data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	public double getTotal() {
		return total;
	}
	
	public double finalizarPedido() {
		if(data.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			return valor * 0.9;
		}
		return valor;
	}
	public void mostrarTotal() {
		total = quantidade * valor;
		return;
	}
	
}
