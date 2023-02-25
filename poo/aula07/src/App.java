
// import classes.Pessoa;
import classes.Personagem;

public class App {
    public static void main(String[] args) throws Exception {

        // Pessoa pessoa = new Pessoa("Paulo Henrique", 21, 1.80f);
        // pessoa.imprimirDados();

        // pessoa.setNome("Paulinho");
        // pessoa.setIdade(21);
        // pessoa.setAltura(1.80f);

        // System.out.printf("Nome: %s \nIdade: %d \nAltura: %.2f\n",
        // pessoa.getNome(), pessoa.getIdade(), pessoa.getAltura());

        // ---------------------------------------------------------------------------

        Personagem guerreiro = new Personagem("Aragorn", "Guerreiro");
        guerreiro.mostrarStatus();

        // Pilares POO
        /*
         * E -> Encapsulamento
         * H -> Herança
         * P -> Polimorfismo
         * A -> Abstração
         */

    }
}