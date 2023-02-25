import classes.Serie;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * - Classe Object + toString() + implícito e explícito
         * - Sobreescrita de métodos (+ exemplos)
         * - Método Super
         * - Modificadores sem acesso
         */

        Serie got = new Serie("Game of Thrones", 8, 2011);
        // System.out.println(got.pegarInformacoes());

        // NomeDaClasse@
        // System.out.println(got.toString());
        System.out.println(got); // esta implicito o metodo toString()

    }
}
