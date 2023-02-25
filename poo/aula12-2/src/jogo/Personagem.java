package jogo;

public abstract class Personagem {

  /*
   * private, public, protected -> modificadores de acesso
   * final, abstract -> modificadores de sem acesso
   */

  // Atributes
  private String nome;
  private String classe;
  private int nivel;
  private String arma;

  // Constructor
  public Personagem(String nome) {
    this.nome = nome;
    this.classe = "Nenhuma";
    this.nivel = 1;
    this.arma = "Nenhuma";
  }

  // Métodos especificos
  public void atacar() {
    if (arma == "Nenhuma") {
      atacarSemArma();
    } else {
      atacarComArma();
    }
  }

  // <modificador de acesso> <modificador sem acesso> <retorno> nomeDoMetodo()
  /*
   * final -> significa que esse método não pode ser subescrito por ninguem que
   * herdar desta classe
   */
  public final void atacarSemArma() {
    System.out.println("O personagem Atacou");
  }

  public abstract void atacarComArma();

  @Override
  public String toString() {
    String informacoes = String.format("%s (Nivel: %d) - Classe: %s",
        nome, nivel, classe);
    return informacoes;
  }

  // Métodos getters e setters
  public String getNome() {
    return nome;
  }

  public String getClasse() {
    return classe;
  }

  public int getNivel() {
    return nivel;
  }

  public String getArma() {
    return arma;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public void setArma(String arma) {
    this.arma = arma;
  }

}
