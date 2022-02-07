package Exercicios_Aula3_Construtor;

public class Imovel {
	int codImovel;
	String Bairro;
	String Tipo;
	double Valor;
	

public void calcularReajuste() {
	if(this.Tipo == "casa") {
		this.Valor *= 1.05;
	}else {
		this.Valor *= 1.08;
	}
}
public String verificarCategoria() {
	String categoria;
	if(this.Valor > 50000) {
		categoria = "A";
	}else if (this.Valor >= 10000 && this.Valor <= 50000 ) {
		categoria = "B";
	}else {
		categoria = "C";
	}
	return categoria;
}

}