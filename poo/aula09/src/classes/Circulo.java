package classes;

public class Circulo implements FiguraGeometrica {

  // Atributos
  private int raio;

  // Construtor
  public Circulo(int raio) {
    this.raio = raio;
  }

  // Métodos especificos
  @Override
  public double calcularArea() {
    // Area = pi * (raio^2)
    return Math.PI * Math.pow(raio, 2);
  }

  // Métodos getters e setters
  public int getRaio() {
    return raio;
  }

  public void setRaio(int raio) {
    this.raio = raio;
  }

}
