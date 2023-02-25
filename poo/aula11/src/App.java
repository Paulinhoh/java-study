import classes.*;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro = new Cachorro("Caramelo");
        cachorro.latir();
        cachorro.comer();

        Gato gato = new Gato("Snowbell");
        gato.miar();

        Dragao dragao = new Dragao("Griffin");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombo = new Pombo("Pombo Correio");
        pombo.enviarCarta();
        pombo.fazerPruh();

    }
}
