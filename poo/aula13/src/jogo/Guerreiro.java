package jogo;

public class Guerreiro extends Personagem {

  @Override
  public void atacar() {
    int valorDado6Faces = this.rolarDados();
    System.out.printf("Dados na mesa! O valor tirado foi: %d\n", valorDado6Faces);
    if (valorDado6Faces < 3) {
      System.out.println("O guerreiro errou o ataque!");
      System.out.println("");
    } else if (valorDado6Faces == 6) {
      System.out.println("O guerreiro acertou um golpe especial!!");
      System.out.println("");
    } else {
      System.out.println("O guerreiro acertou o inimigo!");
      System.out.println("");
    }
  }

}
