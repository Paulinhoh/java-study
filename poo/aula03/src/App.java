public class App {
    public static void main(String[] args) throws Exception {

        Personagem heroi = new Personagem();
        heroi.nome = "Hécules";
        heroi.nivel = 28;
        heroi.forca = 55;
        heroi.vida = 100;

        // "Persongame: <nome> (lvl <nivel>) com <forca> de força e <vida> de vida."
        heroi.mostrarStatus();
        // Chamei o metodo atacar() e passei como argumento uma string "Hydra"
        heroi.atacar("Hydra", "Golpe de Espada");

    }
}
