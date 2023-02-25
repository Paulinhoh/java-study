package classes;

public class Xadrez implements Jogo {

  @Override
  public void fechar() {
    System.out.println("Fechando o jogo");
  }

  @Override
  public void jogar() {
    System.out.println("Exibir menu");
    System.out.println("Exibir video de jogadas no fundo");
  }

}
