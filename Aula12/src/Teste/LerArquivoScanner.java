package Teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivoScanner {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\mandr\\Desktop\\TesteScan.txt");
		Scanner sc = new Scanner(arquivo);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
