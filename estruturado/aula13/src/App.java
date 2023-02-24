
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Armazenar varios valores ao mesmo tempo
        // tipo[] nomeVariavel = new tipo[tamanhoArray];
        String[] nomes = new String[5];
        // String[] nomes = new String[] { "Goku", "Bulma", "Vegeta", "Piccolo",
        // "Kuririn" }

        for (int cont = 0; cont < 5; cont++) {
            System.out.print("Digite um valor: ");
            nomes[cont] = teclado.nextLine();
        }

        System.out.println();

        for (int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++) {
            System.out.print(nomes[posicaoVetor] + " ");
        }

        int[] numeros = new int[100];

        // preenche o Array com valor
        Arrays.fill(numeros, 0);
        // imprime o vetor
        System.out.println(Arrays.toString(numeros));
        // tamanho do vetor
        System.out.println(numeros.length);

        String[] opcoes = new String[] {
                "Anime Hunter x Hunter", // 0
                "Serie The Last of Us", // 1
                "Filme Vingadores", // 2
                "Sair" // 3
        };

        int opcaoEscolhida = 0;

        while (opcaoEscolhida != 3) {
            opcaoEscolhida = JOptionPane.showOptionDialog(
                    null,
                    "O que vc deseja Assistir?",
                    "DevFlix",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    0);

            System.out.println("Opção escolhida: " + opcaoEscolhida);
        }

    }
}
