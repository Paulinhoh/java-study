public class ContaNetflix {

  private String idiomaPreferencial;
  private String resolucaoTela;

  public void entrar() {
    // pegar as informações do idioma do usuário
    buscarPreferenciasDoUsuario();
    // pegar a resolução da tela
    indentificarResolucao();

  }

  private void buscarPreferenciasDoUsuario() {
    idiomaPreferencial = "PT-BR";
  }

  private void indentificarResolucao() {
    resolucaoTela = "Full HD";
  }

  public void assistirFilme(String nomeFilme) {
    System.out.println("Iniciando o filme: " + nomeFilme);
    System.out.println("Carregando o filme na resolução " + resolucaoTela);
    carregarAudioFilme();
  }

  private void carregarAudioFilme() {
    if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
      System.out.println("Carregando o audio em " + idiomaPreferencial);
    } else {
      System.out.println("Carregando o audio em EN-US");
    }
  }

}
