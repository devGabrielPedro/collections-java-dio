package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> pessoasList;

	public OrdenacaoPessoas() {
		this.pessoasList = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoasList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<Pessoa>(pessoasList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<Pessoa>(pessoasList);
        Collections.sort(pessoasPorAltura, new AlturaComparator());
        return pessoasPorAltura;
    }
	
	public static void main(String[] args) {
	    // Criando uma instância da classe OrdenacaoPessoas
	    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

	    // Adicionando pessoas à lista
	    ordenacaoPessoas.adicionarPessoa("Gabriel", 19, 1.73);
	    ordenacaoPessoas.adicionarPessoa("Joao", 18, 1.68);
	    ordenacaoPessoas.adicionarPessoa("Felipe", 17, 1.80);
	    ordenacaoPessoas.adicionarPessoa("Victor", 20, 1.70);

	    // Exibindo a lista de pessoas adicionadas
	    System.out.println("Lista de Pessoas: \n" + ordenacaoPessoas.pessoasList);

	    // Ordenando e exibindo por idade
	    System.out.println("Ordenação por idade: \n" + ordenacaoPessoas.ordenarPorIdade());

	    // Ordenando e exibindo por altura
	    System.out.println("Ordenação por altura: \n" + ordenacaoPessoas.ordenarPorAltura());
	  }
	
}
