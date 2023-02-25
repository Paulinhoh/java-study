package classes;

public class Voadores extends Animais {

  public Voadores(String nome) {
    super(nome);
  }

  public void voar() {
    System.out.printf("%s voou\n", getNome());
  }

}
