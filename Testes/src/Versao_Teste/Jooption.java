package Versao_Teste;
import javax.swing.JOptionPane;
public class Jooption {

	public static void main(String[] args) {
		String entrada;
		String nome;
		String saida;
		int idade;
		String aux;
		//PERGUNTAS COM IMPUT P USUARIO
		entrada = JOptionPane.showInputDialog("Bom dia cria, mais um dia...Vamos a luta ! Digita ai qualquer coisa");
		nome = JOptionPane.showInputDialog("Escreve qualquer nome ai");
		aux = JOptionPane.showInputDialog("Digite sua idade");
		idade = Integer.parseInt(aux);
		
		if ( idade >=18) {
			aux = "maior de idade";
		}else if (idade<18) {
			aux = "menor de idade";
		}
		
		//RESPOSTA PRO USUARIO
		JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos e é "+ aux);
	}

}
