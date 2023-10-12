package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavrasUnicasSet;

	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicasSet = new HashSet<String>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavrasUnicasSet.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		if(!palavrasUnicasSet.isEmpty()) {
			if(palavrasUnicasSet.contains(palavra)) {
				palavrasUnicasSet.remove(palavra);
			}
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public boolean verificarPalavra(String palavra) {
		return palavrasUnicasSet.contains(palavra);
	}
	
	public void exibirPalavrasUnicas() {
		if(!palavrasUnicasSet.isEmpty()) {
			System.out.println(palavrasUnicasSet);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
		
		// Adicionando palavras ao conjunto
		palavrasUnicas.adicionarPalavra("Melancia");
		palavrasUnicas.adicionarPalavra("Morango");
		palavrasUnicas.adicionarPalavra("Pêra");
		palavrasUnicas.adicionarPalavra("Maçã");
		
		// Exibindo as palavras adicionadas
		System.out.println("Palavras Únicas adicionadas ao conjunto:");
		palavrasUnicas.exibirPalavrasUnicas();
		
		// Exibindo palavras após remoção
		System.out.println("Conjunto após a remoção de uma palavra:");
		palavrasUnicas.removerPalavra("Morango");
		palavrasUnicas.exibirPalavrasUnicas();
		
		// Verificando se uma palavra está no conjunto
	    System.out.println("A fruta 'Maçã' está no conjunto? " + palavrasUnicas.verificarPalavra("Maçã"));
	}
	
}
