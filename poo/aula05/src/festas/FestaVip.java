package festas;

public class FestaVip {

  // <modificador> <tipo> <nome-atributo>
  private int quantidadeCafe = 30;
  private int quantidadeSalgados = 50;

  public void entrar() {
    beberCafe();
    comerSalgado();
    beberCafe();
  }

  // <modificador> <retorno-metodo> <nome-metodo>
  private void beberCafe() {
    quantidadeCafe--;
    System.out.println("Bebeu 1 xicara de café");
  }

  private void comerSalgado() {
    quantidadeSalgados--;
    System.out.println("Comeu 5 salgados");
  }

}
