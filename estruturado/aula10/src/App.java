import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua Idade: ");
        int idade = Integer.parseInt(teclado.nextLine());

        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else if (idade > 16 && idade < 18) {
            System.out.println("Menor de Idade, mas quase lá!");
        } else {
            System.out.println("Menor de Idade");
        }

        // OR

        String maiorDeIdade = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";
        System.out.println(maiorDeIdade);

    }
}
