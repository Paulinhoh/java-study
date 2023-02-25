package classes;

public class TiroAoAlvoOnline implements Jogo {

  @Override
  public void fechar() {
    System.out.println("Salvando o progresso do joogo no servidor...");
    System.out.println("Sair da Partida");
    System.out.println("Sair do jogo");
  }

  @Override
  public void jogar() {
    System.out.println("Carregando jogo");
    System.out.println("Se conectando ao servidor...");
    System.out.println("Carregando Partida");
  }

}
