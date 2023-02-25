public class Matematica {

  private static double valorPi = 3.14;

  public static int somar(int numeroA, int numeroB) {
    return numeroA + numeroB;
  }

  public static double calcularAreaQuadrado(double lado) {
    return lado * lado;
  }

  public static double calcularAreaCirculo(double raio) {
    return valorPi * Math.pow(raio, 2);
  }
  
}
