package ExerciciodeGrupo_medico;

public class Clinica extends Plano {
	
	protected String nome;
	protected String cgc;
	
	public Clinica(String empresa, double valorPago, double valoriss, String nome, String cgc) {
		super(empresa, valorPago, valoriss);
		this.nome = nome;
		this.cgc = cgc;
	}

	@Override
	public String toString() {
		return "Clinica [nome=" + nome + ", cgc=" + cgc + "]";
	}
	public String getnome() {
		return nome;
	}
	public String getcgc() {
		return cgc;
	}
}
