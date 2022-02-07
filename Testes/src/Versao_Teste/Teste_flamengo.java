package Versao_Teste;

public class Teste_flamengo {
	private int cartoes;
	private int penaltis;
	private int golsfla;
	
	public Teste_flamengo (int cartoes, int penaltis, int golsfla) {
		this.cartoes = cartoes;
		this.penaltis = penaltis;
		this.golsfla = golsfla;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public int getPenaltis() {
		return penaltis;
	}

	public void setPenaltis(int penaltis) {
		this.penaltis = penaltis;
	}

	public int getgolsfla() {
		return golsfla;
	}

	public void setPlacar(int golsfla) {
		this.golsfla = golsfla;
	}
	
	public void jogo(int golsbarca) {
		this.golsfla = golsbarca;
		if(golsbarca < 4) {
			System.out.println("Tamo na final porra");
		}else if(golsbarca == 4 ) {
			System.out.println("Vamo p penalti e diego cata suave");
		}else {
			System.out.println("Ai fudeu vai depender do flamengo matar o jogo");
		}
	}
	
}
