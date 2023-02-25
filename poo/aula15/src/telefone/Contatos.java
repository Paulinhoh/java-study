package telefone;

import java.util.ArrayList;

public class Contatos {

  private ArrayList<Contato> contatos;

  public Contatos() {
    this.contatos = new ArrayList<Contato>();
  }

  public void adicionar(String nome, String numero) {
    Contato novoContato = new Contato(nome, numero);
    contatos.add(novoContato);
  }

  public void adicionar(Contato NovoContato) {
    contatos.add(NovoContato);
  }

  public Contatos buscar(String palavraChave) {
    // PalavraChave = "Lu"
    // "Lucas", "Luana" ...
    String palavraChaveMinusculo = palavraChave.toLowerCase();
    Contatos contatosFiltrados = new Contatos();
    for (Contato contato : contatos) {
      // Esse contato começa com a palavra chave
      String nomeContatoMinusculo = contato.getNome().toLowerCase();
      if (nomeContatoMinusculo.startsWith(palavraChaveMinusculo)) {
        // Sim -> vou salvar nos meus contatosFiltrados
        contatosFiltrados.adicionar(contato);
      }
      // Não -> vou pular para o proximo contato da lista
    }
    return contatosFiltrados;
  }

  @Override
  public String toString() {
    String informacao = "Contatos:\n";
    for (Contato contato : contatos) {
      informacao += contato.toString() + "\n";
    }
    return informacao;
  }

  public ArrayList<Contato> getContatos() {
    return contatos;
  }

}
