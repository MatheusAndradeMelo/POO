package Teste;

import java.io.File;
import java.util.Scanner;

public class ExemploDiretorio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o nome do arquivo ou diret�rio: \n");
		String nome = scan.nextLine();
		
		File file = new File(nome);
		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n",
				file.getName(),   file.length());
			}
			else {
				System.out.printf("\nConteudo do diret�rio: \n");
				String diretorio[] = file.list();
				for (String item: diretorio) {
					System.out.printf("%s\n", item);
				}
			}
		} else {
			System.out.println("Arquivo ou diret�rio n�o existe!\n");
		}
		scan.close();
	}

}
