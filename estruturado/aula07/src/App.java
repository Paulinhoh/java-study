import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int numeroA = 5;
        int numeroB = 2;

        double resultado = (double) Math.pow(numeroA, numeroB);

        JOptionPane.showMessageDialog(null, resultado, "Mátematica", JOptionPane.INFORMATION_MESSAGE, null);

    }
}
