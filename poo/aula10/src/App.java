import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Array (vetor) -> com um tamanho maximo de 5 posições
        String[] arrayStatic = new String[5];
        arrayStatic[0] = "Goku";
        arrayStatic[1] = "Maria";
        arrayStatic[2] = "João";
        arrayStatic[3] = "Paulinho";
        arrayStatic[4] = "Gohan";

        // ArrayList<tipo> nome = new ArrayList<tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku"); // indice 0
        arrayDinamico.add("Maria"); // indice 1
        arrayDinamico.add("Paulinho"); // indice 2
        arrayDinamico.add("Gohan"); // indice 3

        System.out.println("Imprimindo Array Statico");
        for (int i = 0; i < arrayStatic.length; i++) {
            System.out.println(arrayStatic[i]);
        }

        System.out.println("Imprimindo Array Dinamico");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        System.out.println("Removendo 'Maria'"); // indice ou nome
        arrayDinamico.remove("Maria");

        System.out.println("Imprimindo Array Dinamico");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        System.out.println("Limpando o Array");
        arrayDinamico.clear();

        System.out.println("Imprimindo Array Dinamico");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Adicionando um novo nome");
        arrayDinamico.add("Goten");
        arrayDinamico.add("Truncks");

        // Outra forma mais pratica para o for
        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }

    }
}
