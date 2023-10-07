package list.pesquisas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

	private List<Integer> numerosList;

	public SomaNumeros() {
		this.numerosList = new ArrayList<Integer>();
	}
	
	public void adicionarNumero(int numero) {
		numerosList.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer numero: numerosList) {
			soma += numero;
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = 0;
		if(!numerosList.isEmpty()) {
			maiorNumero = Collections.max(numerosList);
		} else {
			System.out.println("A lista está vazia!");
		}
		return maiorNumero;
	}
	
	public int encontrarMenorNumero() {
		int menorNumero = 0;
		if(!numerosList.isEmpty()) {
			menorNumero = Collections.min(numerosList);
		} else {
			System.out.println("A lista está vazia!");
		}
		return menorNumero;
	}
	
	public void exibirNumeros() {
		System.out.println(numerosList);
	}
	
	public static void main(String[] args) {
	    SomaNumeros somaNumeros = new SomaNumeros();

	    somaNumeros.adicionarNumero(2);
	    somaNumeros.adicionarNumero(4);
	    somaNumeros.adicionarNumero(1);
	    somaNumeros.adicionarNumero(3);
	    somaNumeros.adicionarNumero(10);

	    //somaNumeros.exibirNumeros();
	    System.out.println("Numeros: ");
	    somaNumeros.exibirNumeros();
	    
	    System.out.println("Soma: " + somaNumeros.calcularSoma());
	    
	    System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());
	    
	    System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());

	  }
	
}
