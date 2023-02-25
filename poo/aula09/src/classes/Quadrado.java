package classes;

public class Quadrado implements FiguraGeometrica {

  // Atributos
  private int lado;

  // Construtor
  public Quadrado(int lado) {
    this.lado = lado;
  }

  // Métodos especificos
  @Override
  public double calcularArea() {
    return lado * lado;
  }

  // Getters e Setters
  public int getLado() {
    return lado;
  }

  public void setLado(int lado) {
    this.lado = lado;
  }

}
