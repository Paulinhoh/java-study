import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        VideoGame xDevOne = new VideoGame();
        xDevOne.ligar();
        xDevOne.jogar(new TiroAoAlvoOnline());
        xDevOne.fechar();
    }
}
