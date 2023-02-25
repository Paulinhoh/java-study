import devflix.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Polimorfismo
        // Poli -> muitas
        // morfo -> multiplas formas

        // Permite que o mesmo nome, represente varios comportamentos diferentes

        Filme filme = new Filme("Projeto Almanaque");
        filme.play();
        filme.play("japonês");
        filme.play("en-US", "arabe");

        System.out.println("");

        Serie serie = new Serie("The last of US", 1, 10);
        serie.play(1, 7);
    }
}
