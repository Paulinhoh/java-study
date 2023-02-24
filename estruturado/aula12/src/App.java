public class App {
    public static void main(String[] args) throws Exception {

        int contador = 1;

        // while() {}
        while (contador <= 3) {
            System.out.print(" " + contador);
            contador++;
        }

        contador = 1;
        System.out.println();

        // do{} while()
        do {
            System.out.print(" " + contador);
            contador++;
        } while (contador <= 10);

        contador = 1;
        System.out.println();

        // for() {}
        for (contador = 1; contador <= 7; contador++) {
            System.out.print(" " + contador);
        }

    }
}
