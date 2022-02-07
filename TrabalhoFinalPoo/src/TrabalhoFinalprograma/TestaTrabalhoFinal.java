package TrabalhoFinalprograma;

import java.util.ArrayList;
import java.util.Scanner;
//NOME DOS INTEGRANTES DO TRABALHO :
//Matheus Andrade, Camilla Seraphim, Vitor Nicodemus, Hugo de Almeira, Vitor Borges, Tatiana Silva, Janaina Citeli

public class TestaTrabalhoFinal {

	public static void main(String[] args) throws ClassificacaoForaDoRangeException {
		// INSTANCIANDO OBJETOS FILME
		Filme filme1 = new Filme("Gente Grande", Categoria.COMEDIA, 90);
		Filme filme2 = new Filme("O Iluminado", Categoria.TERROR, 60);
		Filme filme3 = new Filme("Harry Potter", Categoria.FANTASIA, 90);
		Filme filme4 = new Filme("Todo mundo em pânico", Categoria.COMEDIA, 60.50);
		Filme filme5 = new Filme("Invocação do mal", Categoria.TERROR, 60.30);
		Filme filme6 = new Filme("Um estranho no ninho", Categoria.FANTASIA, 60.70);

		// CLASSIFICAR FILMES
		filme1.classificar(3);
		filme2.classificar(5);
		filme3.classificar(4);
		filme4.classificar(3);
		filme5.classificar(2);
		filme6.classificar(5);

		// CADASTRAR FILMES:
		ArrayList<Filme> filmes = new ArrayList<>();
		filmes.add(filme1);
		filmes.add(filme2);
		filmes.add(filme3);
		filmes.add(filme4);
		filmes.add(filme5);
		filmes.add(filme6);

		// REMOVER FILMES:
		filmes.remove(filme1);

		// EDITAR FILMES:
		filme2.setNomePrograma("Annabelle");

//--------------------------------------------------------------------------------------------------------------------------

		// INSTANCIANDO AS TEMPORADAS
		Temporada temporadaSerie11 = new Temporada(13, 1);
		Temporada temporadaSerie21 = new Temporada(13, 2);
		Temporada temporadaSerie12 = new Temporada(8, 1);
		Temporada temporadaSerie22 = new Temporada(8, 2);
		Temporada temporadaSerie32 = new Temporada(8, 3);
		Temporada temporadaSerie13 = new Temporada(15, 1);
		Temporada temporadaSerie14 = new Temporada(6, 1);
		Temporada temporadaSerie24 = new Temporada(6, 2);
		Temporada temporadaSerie15 = new Temporada(10, 1);
		Temporada temporadaSerie16 = new Temporada(7, 1);
		Temporada temporadaSerie26 = new Temporada(7, 2);

		// CADASTRANDO TEMPORADAS DAS SERIES
		ArrayList<Temporada> arrayListSerie1 = new ArrayList<>();
		arrayListSerie1.add(temporadaSerie11);
		arrayListSerie1.add(temporadaSerie21);

		ArrayList<Temporada> arrayListSerie2 = new ArrayList<>();
		arrayListSerie2.add(temporadaSerie12);
		arrayListSerie2.add(temporadaSerie22);
		arrayListSerie2.add(temporadaSerie32);

		ArrayList<Temporada> arrayListSerie3 = new ArrayList<>();
		arrayListSerie3.add(temporadaSerie13);

		ArrayList<Temporada> arrayListSerie4 = new ArrayList<>();
		arrayListSerie4.add(temporadaSerie14);
		arrayListSerie4.add(temporadaSerie24);

		ArrayList<Temporada> arrayListSerie5 = new ArrayList<>();
		arrayListSerie5.add(temporadaSerie15);

		ArrayList<Temporada> arrayListSerie6 = new ArrayList<>();
		arrayListSerie6.add(temporadaSerie16);
		arrayListSerie6.add(temporadaSerie26);

		// INSTANCIANDO OBJETOS SERIE
		Serie serie1 = new Serie(9, "Vikings", Categoria.FANTASIA, arrayListSerie1);

		Serie serie2 = new Serie(3, "Maldição da Residência Hill", Categoria.TERROR, arrayListSerie2);

		Serie serie3 = new Serie(6, "The Office", Categoria.COMEDIA, arrayListSerie3);

		Serie serie4 = new Serie(7, "Peaky Blinders", Categoria.FANTASIA, arrayListSerie4);

		Serie serie5 = new Serie(2, "Missa da meia noite", Categoria.TERROR, arrayListSerie5);

		Serie serie6 = new Serie(11, "Broklyn nine-nine", Categoria.COMEDIA, arrayListSerie6);

		// CLASSIFICAR SERIES
		serie1.classificar(9);
		serie2.classificar(3);
		serie3.classificar(6);
		serie4.classificar(7);
		serie5.classificar(2);
		serie6.classificar(10);

		// ADICIONANDO TEMPORADA EM UMA LISTA
		Temporada temporadaSerie23 = new Temporada(15, 2);
		serie3.adicionarNovaTemporada(temporadaSerie23);

		// CADASTRANDO SERIES
		ArrayList<Serie> series = new ArrayList<>();
		series.add(serie1);
		series.add(serie2);
		series.add(serie3);
		series.add(serie4);
		series.add(serie5);
		series.add(serie6);

		// REMOVER SERIES
		series.remove(serie1);

		// EDITAR SERIES
		serie2.setNomePrograma("A ordem");

//---------------------------------------------------------------------------------------------------------------
		// BIBLIOTECA
		Biblioteca biblioteca = new Biblioteca(new ArrayList<Programa>(filmes));

		ArrayList<Programa> biblioteca1 = new ArrayList<>();
		ArrayList<Programa> bibliotecaF = new ArrayList<>();
		ArrayList<Programa> bibliotecaS = new ArrayList<>();

		biblioteca1.addAll(series);
		biblioteca1.addAll(filmes);

		bibliotecaF.addAll(filmes);

		bibliotecaS.addAll(series);

		System.out.println("---------------BEM-VINDO AO JAVAFLIX---------------\n");
		System.out.println("                   BIBLIOTECA                 ");

		// PESQUISA DE ITENS NA BIBLIOTECA COM LISTA POR CATEGORIA E COM CLASSIFICACAO
		boolean verdadeiro = true;
		Scanner SC = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		while (verdadeiro == true) {
			System.out.println("Qual biblioteca deseja pesquisar? (FILME,SERIE,TODOS)\n--->");
			String opc = SC.next();
			try {
				if ("FILME".equals(opc)) {
					biblioteca.PesquisaPrograma(bibliotecaF);
				} else if ("SERIE".equals(opc)) {
					biblioteca.PesquisaPrograma(bibliotecaS);
				} else if ("TODOS".equals(opc)) {
					System.out.println(
							"-----------------------LISTA DE FILMES-----------------------------------------------------\n");
					filmes.forEach(Filmes -> System.out.println(Filmes));

					System.out.println(
							"\n-----------------------LISTA DE SÉRIES---------------------------------------------------\n");
					series.forEach(Serie -> System.out.println(Serie));
				} else {
					throw new IllegalArgumentException();
				}

			} catch (IllegalArgumentException e) {

				System.out.println("Não é uma opção válida");
				System.out.println(
						"\nDigite SIM para sair, ou digite NAO para continuar a escolher opção novamente:\n");
				String resposta = scan.next();
				boolean menuS = true;

				while (menuS == true) {
					if ("SIM".equals(resposta)) {
						verdadeiro = false;
						menuS = false;
						System.out.println(
								"\nEncerrando o JAVAFLIX o melhor programa de filmes e séries, volte sempre :) ");
						break;
					} else if ("NAO".equals(resposta)) {
						verdadeiro = true;
						menuS = false;
					} else {
						menuS = false;
						System.out.println("\nNão é uma resposta valida \n---------------------------------------");
					}
				}
			}
		}
		scan.close();
		SC.close();
	}
}