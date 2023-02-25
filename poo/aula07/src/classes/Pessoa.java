package classes;

public class Pessoa {

  // Atributos de Classes
  private String nome;
  private int idade;
  private float altura;

  // Método Construtor
  // <moificador> <nomeClasse>()
  public Pessoa(String nome, int idade, float altura) {
    System.out.println("Uma pessoa acaba de nascer!");
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public void imprimirDados() {
    System.out.printf("Nome: %s \nIdade: %d \nAltura: %.2f\n",
        nome, idade, altura);
  }

  // Métodos Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

}
