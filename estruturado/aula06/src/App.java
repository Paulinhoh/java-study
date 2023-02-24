import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String filme = JOptionPane.showInputDialog(null, "Qual o seu filme favorito de 2023 até o momento?",
                "Oscar 2023", JOptionPane.QUESTION_MESSAGE);
        String elo;
        int tier;
        String valor;

        // Crio um objeto leitor para ler valores digitados no teclado
        Scanner leitor = new Scanner(System.in);
        // Configirando separadores (\r OU \n)
        // leitor.useDelimiter("[\r\n]+");

        System.out.print("Qual o seu Elo? ");
        elo = leitor.nextLine();

        /*
         * Converções
         * - Integer.parseInt(string)
         * - Float.parseFloat(string)
         * - Double.parseDouble(string)
         */

        System.out.print("Qual o seu Tier? ");
        valor = leitor.nextLine();
        tier = Integer.parseInt(valor);

        System.out.print("Qual o seu campeão preferido? ");
        String campeao = leitor.nextLine();

        System.out.printf("Você é mono %s no elo %s %d \n", campeao, elo, tier);

        JOptionPane.showMessageDialog(null, "Filme Preferido: " + filme, "Resposta", JOptionPane.INFORMATION_MESSAGE);

    }
}
