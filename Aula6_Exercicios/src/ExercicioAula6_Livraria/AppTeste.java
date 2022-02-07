package ExercicioAula6_Livraria;

import java.text.NumberFormat;

public class AppTeste {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Charles Duhigg","O poder do hábito" , 50.0);
		Livro livro2 = new Livro("Robert T.Kiyosaki","Pai rico Pai pobre", 35.0);
		
		Operacao operacao1 = new Operacao("Venda",livro1, livro1.getValorLivro());
		Operacao operacao2 = new Operacao("Emprestimo",livro2, livro2.getValorLivro());
		
		operacao1.venderLivro();
		operacao2.emprestarLivro();
		
		System.out.println(livro1.toString()+", Tipo de operação: "+ operacao1.getTipoOp()+
				"\nValor total: "+ NumberFormat.getCurrencyInstance().format(operacao1.getValorOp()) + "\n");
		
		System.out.println(livro2.toString()+", tipo operação: " + operacao2.getTipoOp()+
				"\nValor total: " + NumberFormat.getCurrencyInstance().format(operacao2.getValorOp()));
	}

}
