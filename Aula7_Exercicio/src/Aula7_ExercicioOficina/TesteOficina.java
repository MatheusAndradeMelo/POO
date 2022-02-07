package Aula7_ExercicioOficina;

import java.text.NumberFormat;
import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario(" Vin diesel");
		Veiculo veiculo1 = new Carro("Mercedes-AMG", 100, LocalDate.of(2021,8,8), proprietario, "Sport");

		veiculo1.trocarOleo();
		veiculo1.revisao();
		
		System.out.println("Nome do proprietario do veiculo: " + proprietario.getNome());
		
		System.out.println("Veiculo : " + veiculo1.toString() + " "+ NumberFormat.getCurrencyInstance().format(veiculo1.getValorCobrado()));
	}

}
