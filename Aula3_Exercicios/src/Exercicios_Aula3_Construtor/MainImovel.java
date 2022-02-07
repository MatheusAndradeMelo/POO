package Exercicios_Aula3_Construtor;

public class MainImovel {

	public static void main(String[] args) {
		Imovel im1 = new Imovel();
		im1.codImovel = 1;
		im1.Bairro = "Vale do paraíso";
		im1.Tipo = "casa";
		im1.Valor = 35000;
		
		System.out.println(im1.Bairro + " "+ im1.Valor);
		im1.calcularReajuste();
		System.out.println("Valor do reajuste: R$ "+im1.Valor);
		System.out.println(im1.verificarCategoria() + "\n");
		
		Imovel im2 = new Imovel();
		im2.codImovel = 2;
		im2.Bairro = "Rosário";
		im2.Tipo = "apto";
		im2.Valor = 89800;
		
		System.out.println(im2.Bairro + " "+ im2.Valor);
		im2.calcularReajuste();
		System.out.println("Valor do reajuste: R$ "+im2.Valor);
		System.out.println(im2.verificarCategoria() + "\n");
		
	}

}
