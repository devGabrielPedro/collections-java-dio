package set.pesquisas;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatosSet;

	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		contatosSet.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		if (!contatosSet.isEmpty()) {
			System.out.println(contatosSet);
		} else {
			System.out.println("O conjunto está vazio!");
		}
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		if (!contatosSet.isEmpty()) {
			for (Contato c : contatosSet) {
				if (c.getNome().startsWith(nome)) {
					contatosPorNome.add(c);
				}
			}
			return contatosPorNome;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if (!contatosSet.isEmpty()) {
			for (Contato c : contatosSet) {
				if (c.getNome().equalsIgnoreCase(nome)) {
					c.setNumero(novoNumero);
					contatoAtualizado = c;
					break;
				}
			}
			return contatoAtualizado;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

		// Adicionando contatos à agenda
		agendaContatos.adicionarContato("Gabriel", 123456789);
		agendaContatos.adicionarContato("João", 987654321);
		agendaContatos.adicionarContato("Felipe", 222222222);
		agendaContatos.adicionarContato("Victor", 333333333);
		agendaContatos.adicionarContato("Carol", 444455555);
		agendaContatos.adicionarContato("Sara", 555544444);

		// Exibindo os contatos na agenda
		System.out.println("Lista de contatos:");
		agendaContatos.exibirContatos();

		// Pesquisando contatos pelo nome
		System.out.println("Pesquisando pelo nome:");
		System.out.println(agendaContatos.pesquisarPorNome("João"));

		// Atualizando o número de um contato
		Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carol", 444433333);
		System.out.println("Contato atualizado: \n" + contatoAtualizado);

		// Exibindo os contatos atualizados na agenda
		System.out.println("Contatos na agenda após atualização:");
		agendaContatos.exibirContatos();
	}
}