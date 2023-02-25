package classes;

public class Pombo extends Voadores {

  private int cartasEnviadas;

  public Pombo(String nome) {
    super(nome);
    cartasEnviadas = 10;
  }

  public void fazerPruh() {
    System.out.println("Pruh pruh pruh\n");
  }

  public void enviarCarta() {
    System.out.printf("%s saiu com a carta\n", getNome());
    cartasEnviadas++;
  }

  public int getCartasEnviadas() {
    return cartasEnviadas;
  }

}
