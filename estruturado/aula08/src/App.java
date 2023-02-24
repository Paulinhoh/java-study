import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Random gerador = new Random();
        int facesDado = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas faces tem o Dado?"));

        int resultado = 1 + gerador.nextInt(facesDado); // 6 é o maior número e 1 é o valor minimo

        JOptionPane.showMessageDialog(null, "Voce tirou " + resultado + " no Dado");

    }
}
