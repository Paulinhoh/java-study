import classes.*;

public class App {
    public static void main(String[] args) throws Exception {

        // modificar -> setNomeVariavel
        // pegar -> getNomeVariavel

        /*
         * Pessoa pessoa = new Pessoa();
         * pessoa.setNome("Paulinho");
         * pessoa.setAltura(1.80);
         * pessoa.setIdade(21);
         * 
         * System.out.println(pessoa.getNome());
         * System.out.println(pessoa.getIdade());
         * System.out.println(pessoa.getAltura());
         */

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(200);
        System.out.println(conta.getSaldo());
        conta.depositar(100);
        System.out.println(conta.getSaldo());

    }
}
