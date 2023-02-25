package classes;

public class VideoGame {
  private boolean estaLigado = false;
  private Jogo jogo; // null

  public void ligar() {
    System.out.println("Ligando o video Game...");
    this.estaLigado = true;
  }

  public void jogar(Jogo jogo) {
    if (estaLigado == true) {
      System.out.println("Iniciando o jogo...");
      this.jogo = jogo;
      jogo.jogar();
    } else {
      System.out.println("VideoGame esta desligado");
    }
  }

  public void fechar() {
    if (estaLigado == true) {
      System.out.println("Fechando o jogo...");
      boolean temJogoRodando = jogo != null;
      if (temJogoRodando) {
        jogo.fechar();
        jogo = null; // definindo novamente para null o que significa que n esta rodando
      } else {
        System.out.println("Não tem nenhum jogo rodando");
      }
    } else {
      System.out.println("VideoGame esta desligado");
    }
  }
}
