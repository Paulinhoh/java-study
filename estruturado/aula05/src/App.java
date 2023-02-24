public class App {
    public static void main(String[] args) throws Exception {
        String filme = "Vingadores";
        int anoLancamento = 2015;
        int duracao = 240;
        float notaCritica = 8.7f;
        char letraInicial = 'V';
        boolean foiSucesso = true;

        System.out.println("Filme: " + filme);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao);
        System.out.println("Nota: " + notaCritica);
        System.out.println("Letra Inicial: " + letraInicial);
        System.out.println("Foi um Sucesso? " + foiSucesso);

        System.out.printf("O filme %s lançado em %d tem duração de %dmin.", filme, anoLancamento, duracao);

        System.err.println("Erro"); // "err" == Mensagem de erro

    }
}
