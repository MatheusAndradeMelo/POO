package TrabalhoFinalprograma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	private ArrayList<Programa> programas;

	public Biblioteca(List<Programa> programa) {
		this.programas = new ArrayList<Programa>();
	}
	public ArrayList<Programa> getPrograma(ArrayList<Filme> filmes) {
		for (Programa programa : programas) {
			if (((Programa) programa).getnomePrograma().equals(filmes)) {
				return this.programas;
			}
		}
		return programas; 
	}
	public void getProgramas(ArrayList<Programa> programa,Categoria categoria) {
		if(categoria == Categoria.COMEDIA) {
			for(Programa arrey : programa) {
				if(arrey.categoria == categoria) {
					System.out.print("Nome: " + arrey.nomePrograma + ", Categoria: " + arrey.categoria + ", Classifica��o: " + arrey.classificacao + "\n");
					try {
						arrey.classificar(arrey.classificacao);
					}catch(ClassificacaoForaDoRangeException e) {
						System.out.println(" Classifica��o invalida!!!");
					}
			}
		} 
			
		}else if( categoria == Categoria.FANTASIA){
			for(Programa arrey : programa) {
				if(arrey.categoria == categoria) {
					System.out.print("Nome: " + arrey.nomePrograma + ", Categoria: " + arrey.categoria + ", Classifica��o: " + arrey.classificacao + "\n");
					try {
						arrey.classificar(arrey.classificacao);
					}catch(ClassificacaoForaDoRangeException e) {
						System.out.println(" Classifica��o invalida!!!");
					}	
			}
		} 
		
		}else if(categoria == Categoria.TERROR) 
			{
			for(Programa arrey : programa) {
				if(arrey.categoria == categoria) {
					System.out.print("Nome: " + arrey.nomePrograma + ", Categoria: " + arrey.categoria + ", Classifica��o: " + arrey.classificacao + "\n");
					try {
						arrey.classificar(arrey.classificacao);
					}catch(ClassificacaoForaDoRangeException e) {
						System.out.println(" Classifica��o invalida!!!");
					}
			}
		} 
			
		}else {
			System.out.println("N�o foi poss�vel realizar! Erro desconhecido");
		}
	}
	public ArrayList<Serie> getProgramas(ArrayList<Serie> series) {
		return series;
	}
	public void PesquisaPrograma(ArrayList<Programa>programa) {
		Scanner sc = new Scanner(System.in);
		Scanner scResposta = new Scanner(System.in);
		
		boolean verdadeiro = true;
		
		while(verdadeiro == true) {
			try {
				System.out.print("\nDigite uma categoria para pesquisar no cat�logo: (COMEDIA,TERROR,FANTASIA)\nOu digite SAIR para sair:\n--->");
				Categoria cat = Categoria.valueOf(sc.next());
				System.out.println("Classe digitada:" + cat + "\n");
				getProgramas(programa,cat);
				
			}catch(IllegalArgumentException m)
				{
				System.out.println("N�o � uma categoria valida\n");
				System.out.println("Se deseja realmente deseja sair, digite : SIM, ou digite : NAO, para continuar a escolher as categorias:");
				String resposta = scResposta.next();
				boolean menuS = true;
				
				while(menuS == true) {
				if("SIM".equals(resposta)) {
					verdadeiro = false;	
					menuS = false;
					System.out.println("\nEncerrando o JAVAFLIX o melhor programa de filmes e s�ries, volte sempre :) ");
					break;
				}else if("NAO".equals(resposta)) {
					verdadeiro = true;	
					menuS = false;
					}else {
						menuS = false;
						System.out.println("\nN�o � uma resposta valida \n---------------------------------------");
					}
				}
			}
		} sc.close();
		  scResposta.close();
	}
}
