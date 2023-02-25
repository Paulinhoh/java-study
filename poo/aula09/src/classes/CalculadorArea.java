package classes;

public class CalculadorArea {

  /*
   * Quadrado, Circulo
   * Circulo, Quadrao
   * Circulo, Circulo
   * Quadrado, Quadrado
   */

  public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica FiguraB) {
    double totalArea = figuraA.calcularArea() + FiguraB.calcularArea();
    return totalArea;
  }

}
