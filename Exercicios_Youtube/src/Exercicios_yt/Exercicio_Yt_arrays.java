package Exercicios_yt;

public class Exercicio_Yt_arrays {

	public static void main(String[] args) {
		int [] idades = new int [3];
		String [] nomes = new String [3];
		
		idades[0] = 20;
		idades[1] = 15;
		idades[2] = 30;
		
		nomes[0] = "Goku";
		nomes[1] = "Naruto";
		nomes[2] = "Levi";
		
		//for(int i = 0; i < nomes.length; i++) {
			//System.out.println("Nome do Jogador : "+ nomes[i] +"\n");	
		//}
		for (String n : nomes) {
			System.out.println("Nome do jogador : "+n);
		}
		
		System.out.println("idade do jogador 1 : " + idades[0]);
		System.out.println("idade do jogador 2 : " + idades[1]);
		System.out.println("idade do jogador 3 : " + idades[2]);
	}

}
