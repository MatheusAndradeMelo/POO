package Aula10_ExercicioAgendaTelefonica;

import java.util.HashMap;

public class AgendaTelefonica {
	 private Map <String, String> colecao = new HashMap<> ();
	    
	    public Map<String, String> getColecao() {
	        return colecao;
	    }
	    public void setColecao(Map<String, String> colecao) {
	        this.colecao = colecao;
	    }
	    public void inserir (String nome, String numero) {
	        colecao.put (nome, numero);   
	    }
	    public String buscar (String nome) {
	        return colecao.get(nome);
	    }
	    public void remover (String nome){
	        colecao.remove(nome);
	    }
	    public int tamanho () {
	        return colecao.size ();
	    }       
}
