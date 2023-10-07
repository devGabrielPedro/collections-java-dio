package list.pesquisas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<Livro>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<Livro>();
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<Livro>();
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		catalogo.adicionarLivro("Livro 1", "Autor 2", 2016);
		catalogo.adicionarLivro("Livro 2", "Autor 2", 2017);
		catalogo.adicionarLivro("Livro 3", "Autor 3", 2018);
		catalogo.adicionarLivro("Livro 4", "Autor 4", 2019);
		catalogo.adicionarLivro("Livro 5", "Autor 5", 2020);
		catalogo.adicionarLivro("Livro 6", "Autor 6", 2021);
		
		System.out.println(catalogo.pesquisarPorAutor("Autor 2"));
		System.out.println(catalogo.pesquisarPorIntervaloAnos(2018, 2020));
		System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
	}
	
}
