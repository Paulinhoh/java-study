package classes;

public class PingPong implements Jogo {

  @Override
  public void fechar() {
    System.out.println("Salvando o progresso do jogo");
    System.out.println("Fechar o jogo");
  }

  @Override
  public void jogar() {
    System.out.println("Cutcene Inicial");
    System.out.println("Mostrando o menu inicial");
    System.out.println("Tocando música de fundo");
  }
  
}
