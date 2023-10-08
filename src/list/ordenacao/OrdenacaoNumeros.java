package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  //atributos
  private List<Integer> numerosList;

  //construtor
  public OrdenacaoNumeros() {
    this.numerosList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numerosList.add(numero);
  }

  public List<Integer> ordenarAscendente() {
    List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
    if (!numerosList.isEmpty()) {
      Collections.sort(numerosAscendente);
      return numerosAscendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Integer> ordenarDescendente() {
    List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
    if (!numerosList.isEmpty()) {
      numerosAscendente.sort(Collections.reverseOrder());
      return numerosAscendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public void exibirNumeros() {
    if (!numerosList.isEmpty()) {
      System.out.println(this.numerosList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(10);
    numeros.adicionarNumero(22);
    numeros.adicionarNumero(3);
    numeros.adicionarNumero(55);
    numeros.adicionarNumero(90);

    // Exibindo a lista de números adicionados
    System.out.println("Lista de números:");
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println("Lista em ordem ascendente:");
    System.out.println(numeros.ordenarAscendente());

    // Ordenando e exibindo em ordem descendente
    System.out.println("Lista em ordem descendente:");
    System.out.println(numeros.ordenarDescendente());
  }
}