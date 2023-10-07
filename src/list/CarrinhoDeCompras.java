package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<Item>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<Item>();
		for(Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
			}
		}
		itemList.removeAll(itensParaRemover);
	}
	public double calcularValorTotal() {
		double valorTotal = 0d;
	    if (!itemList.isEmpty()) {
	      for (Item item : itemList) {
	        double valorItem = item.getPreco() * item.getQuantidade();
	        valorTotal += valorItem;
	      }	      
	    }
	    return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(itemList);
	}
	
	public static void main(String[] args) {
	    // Criando uma instância do carrinho de compras
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	    // Adicionando itens ao carrinho
	    carrinho.adicionarItem("Lápis", 2d, 3);
	    carrinho.adicionarItem("Lápis", 2d, 3);
	    carrinho.adicionarItem("Caderno", 35d, 1);
	    carrinho.adicionarItem("Borracha", 2d, 2);

	    // Exibindo os itens no carrinho
	    carrinho.exibirItens();

	    // Removendo um item do carrinho
	    carrinho.removerItem("Lápis");

	    // Exibindo os itens atualizados no carrinho
	    carrinho.exibirItens();

	    // Calculando e exibindo o valor total da compra
	    System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());
	  }
}
