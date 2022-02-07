package ExercicioFuncionarios;

public class TesteFuncionarios {

	public static void main(String[] args) {
		Gerente g = new Gerente("Cartola", 3570.0);
		Assistente a = new Assistente("Antonio Carlos Jobim", 1100.0, 250);
		
		System.out.println(g.toString());
		System.out.println("Part.Lucros: " + g.partLucros());
		System.out.println("Salário Bruto: " + g.getSalario() + "\n");
		
		System.out.println(a.toString());
		System.out.println("Part.Lucros: " + a.partLucros());
		System.out.println("Salário Bruto: " + a.getSalario());

	}

}
