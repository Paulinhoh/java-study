import br.com.devflix.gui.*;
import br.com.devflix.gui.botoes.*;
import br.com.devflix.videos.*;

// devflix.com.br -> br.com.ddevflix.<pacote>
/*
 * br/
 *   com/
 *      devflix/
 *             videos/
 * 
 *             gui/
 * 
 *      jogo
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        Filme filme = new Filme();
        Novela novela = new Novela();
        Serie serie = new Serie();
        Anime anime = new Anime();
        Documentario documentario = new Documentario();

        Janela janelinha = new Janela();
        MiniaturaVideo miniatura = new MiniaturaVideo();

        BotaoPlay botaoPlay = new BotaoPlay();


    }
}
