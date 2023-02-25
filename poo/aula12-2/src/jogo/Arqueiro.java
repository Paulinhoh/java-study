package jogo;

public class Arqueiro extends Personagem {

  public Arqueiro(String nome) {
    super(nome);
    setClasse("Arqueiro");
    setNivel(2);
    setArma("Arco Grande");
  }

  @Override
  public String toString() {
    String informacaoArqueiro = String.format("%s - Arma: %s",
        super.toString(), getArma());
    return informacaoArqueiro;
  }

  @Override
  public void atacarComArma() {
    System.out.println("O arqueiro atacou com " + getArma());
  }

}
