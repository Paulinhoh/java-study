import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(50);
        numeros.add(22);
        numeros.add(26);
        numeros.add(78);
        numeros.add(4);
        numeros.add(15);
        numeros.add(-17);

        Collections.sort(numeros, Collections.reverseOrder());
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
