import classes.*;

public class App {
    public static void main(String[] args) throws Exception {

        // enCAPSULAmento -> Interface
        Circulo circulo = new Circulo(2);
        double raio = circulo.calcularArea();
        System.out.printf("%.2f\n", raio);

        Quadrado quadrado = new Quadrado(5);
        System.out.printf("%.2f\n", quadrado.calcularArea());

        CalculadorArea calculador = new CalculadorArea();
        System.out.printf("%.2f\n", calculador.somarAreas(quadrado, quadrado));

    }
}
