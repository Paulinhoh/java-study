package classes;

public class Dragao extends Voadores {

  public Dragao(String nome) {
    super(nome);
  }

  public void soltarFogo() {
    System.out.printf("%s cuspiu fogo\n", getNome());
  }

}
