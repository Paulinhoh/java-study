public class App {
    public static void main(String[] args) throws Exception {

        // iPhone 12, tela: 6.1", 256gb
        // Galaxy Note 20 Utra, tela: 6.9", 256gb
        // Xiaomi Mi 11 Pro, tela: 6.81", 128gb
        // <tipoVariavel> nomeVariavel = valor;

        // Declarando um objeto do tipo Celular = Instanciando um Objeto
        Celular celularA = new Celular();
        celularA.nome = "iPhone 12";
        celularA.sistemaOperacional = "iOS";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Utra";
        celularB.sistemaOperacional = "Android";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;

        Celular celularC; // Declarando um objeto chamado CelularC
        celularC = new Celular(); // Instanciando o objeto
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.sistemaOperacional = "Android";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;

        System.out.printf("Celular %s com tela de %.1f, %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela,
                celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.printf("Celular %s com tela de %.1f, %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela,
                celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.printf("Celular %s com tela de %.1f, %dgb e SO %s\n", celularC.nome, celularC.tamanhoTela,
                celularC.espacoArmazenamento, celularC.sistemaOperacional);

    }
}
