package ExercicioPeddidos;

import java.time.LocalDate;

public class MainPedidos {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(1,LocalDate.parse("2021-10-03"), 2, 50.0);
		Pedido pedido2 = new Pedido(2,LocalDate.parse("2021-09-03"), 5, 15.5);
		Pedido pedido3 = new Pedido(3,LocalDate.parse("2021-05-10"), 3, 100.0);
	 
	 pedido1.finalizarPedido();
	 pedido2.finalizarPedido();
	 pedido3.finalizarPedido();
	 
	 pedido1.mostrarTotal();
	 pedido2.mostrarTotal();
	 pedido3.mostrarTotal();
	 
	 System.out.println("Pedido 1: " + "\nQuantidade: "+ pedido1.getQuantidade()+ "\nValor: " + pedido1.getValor() +
			 "\nTotal: " + pedido1.getTotal()+"\n");
	 
	 System.out.println("Pedido 2: " + "\nQuantidade: "+ pedido2.getQuantidade()+ "\nValor: " + pedido2.getValor() +
			 "\nTotal: " + pedido2.getTotal()+"\n");
	 
	 System.out.println("Pedido 3: " + "\nQuantidade: "+ pedido3.getQuantidade()+ "\nValor: " + pedido3.getValor() +
			 "\nTotal: " + pedido3.getTotal()+"\n");
	 
	}

}
