import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int idade = Integer.parseInt(leitor.nextLine());

        /*
         * > maior que
         * < menor que
         * >= maior ou igual
         * <= menor ou igual
         * == igual
         * != diferrente
         */

        /*
         * && AND (E)
         * // OR (OU)
         * ! NOT (NÃO, NEGAÇÃO)
         */

        boolean resultado = (idade >= 18);
        System.out.println(resultado);

    }
}
