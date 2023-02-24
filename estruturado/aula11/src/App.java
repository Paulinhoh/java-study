import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String personagem = "Majin Boo";

        // switch -> Escolha
        switch (personagem) {
            case "Vegeta":
                System.out.println("Planeta Sayajin");
                break;
            case "Goku":
                System.out.println("Planeta Syajin");
                break;
            case "Bulma":
                System.out.println("Planeta Terra");
                break;
            case "Piccolo":
                System.out.println("Planeta Namekuseijin");
                break;
            case "Kuririn":
                System.out.println("Planeta Terra");
                break;
            default:
                System.out.println("Origem Desconhecida");
                break;
        }

        int diasDaSemana = 1;

        switch (diasDaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de Semana");
                break;
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
        }

        String personagen = JOptionPane.showInputDialog(null, "Digite um personagem do Dragon Ball");
        String nomeImage = "";
        String origem = "";

        switch (personagen) {
            case "Goku":
                origem = "Planeta Sayajin";
                nomeImage = "goku-icone";
                break;
            case "Vegeta":
                origem = "Planeta Sayajin";
                nomeImage = "vegeta-icone";
                break;
            case "Piccolo":
                origem = "Planeta Namikuseijin";
                nomeImage = "piccolo-icone";
                break;
            case "Bulma":
                origem = "Planeta Terra";
                nomeImage = "bulma-icone";
                break;
            case "Kuririn":
                origem = "Planeta Terra";
                nomeImage = "kuririn-icone";
                break;
            default:
                origem = "Origem Desconhecida";
                nomeImage = "default";
                break;
        }

        // C:\Users\phdsr\Documents\studing\java\aula11\src\images\bulma-icone.png
        String caminhoImage = String.format("C:\\Users\\phdsr\\Documents\\studing\\java\\aula11\\src\\images\\%s.png",
                nomeImage);

        ImageIcon icone = new ImageIcon(caminhoImage);

        String informacoesPersonagem = String.format("Personagem: %s\nOrigem: %s", personagen, origem);
        JOptionPane.showConfirmDialog(null, "", informacoesPersonagem, JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, icone);

    }
}
