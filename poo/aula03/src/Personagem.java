import java.util.Random;

public class Personagem {

  String nome;
  int nivel;
  int forca;
  int vida;

  // void -> significa que não esta retornando nada
  void mostrarStatus() {
    System.out.printf("Personagem: %s (lvl %d) com %d de força e %d de vida\n", nome, nivel, forca, vida);
  }

  int calcularDano() {
    Random gerador = new Random();
    // 1..20
    // nextInt(19) -> 0..19
    // nextInt(20) -> 0..20
    int dado20Faces = 5 + gerador.nextInt(15);
    int dano = forca + dado20Faces;
    return dano;
  }

  // metodo que não retorna nada e recebe um parâmetro alvo que é do tipo String
  void atacar(String alvo, String habilidade) {
    int danoCausado = calcularDano();

    if (habilidade.length() == 0) {
      System.out.format("%s atacou %s e causou %d de dano\n", nome, alvo, forca);
    } else {
      System.out.format("%s usou '%s' contra %s e causou %d de dano\n", nome, habilidade, alvo, danoCausado);
    }
  }

}
