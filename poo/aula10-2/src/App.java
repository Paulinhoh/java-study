import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList<String> filmes = new ArrayList<String>();

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);

        Pessoa joao = new Pessoa("Joao", 20);
        Pessoa paulo = new Pessoa("Paulo", 25);
        Pessoa maria = new Pessoa("Maria", 30);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(joao);
        pessoas.add(paulo);
        pessoas.add(maria);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

    }
}
