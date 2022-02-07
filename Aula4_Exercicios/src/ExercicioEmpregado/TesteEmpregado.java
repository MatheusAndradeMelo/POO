package ExercicioEmpregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Levi", "Matador", 2500.0);
		Empregado empregado2 = new Empregado("Goku", "Da Serra", 4350.0);
		
		empregado.calcularImpostodeRenda();
		empregado2.calcularImpostodeRenda();
		
		System.out.println("Nome: " + empregado.getNome() + "\nSobrenome: " + empregado.getSobrenome() + "\nSalário com desconto: "+
		empregado.getSalario()+ "\n");
		
		System.out.println("Nome: " + empregado2.getNome() + "\nSobrenome: " + empregado2.getSobrenome() + "\nSalário com desconto: "+
		empregado2.getSalario());
		
		
	}

}
