package Teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoArquivotxt {

	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\mandr\\Desktop\\TesteScan.txt"));
			out.append("abc");
			out.close();
		} catch(IOException e) {
			System.out.println("Erro ao acessar arquivo");
		}

	}

}
