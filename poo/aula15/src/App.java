import telefone.*;

public class App {
    public static void main(String[] args) throws Exception {

        Telefone telefone = new Telefone("4002-8922");

        Contato contatoA = new Contato("Paulinho", "(75)99883-6561");
        Contato contatoB = new Contato("Duda", "(75)99885-3752");
        Contato contatoC = new Contato("Lucas", "(75)99873-8861");
        Contato contatoD = new Contato("Luana", "(79)99855-8421");

        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);

        System.out.println(telefoneContatos);

        System.out.println("Contatos Filtrados: ");
        System.out.println(telefoneContatos.buscar("lu"));

        Ligacao ligacaoA = new Ligacao("123", "456");
        ligacaoA.ligar();
        System.out.println(ligacaoA);

        System.out.println("");

        Ligacao ligacaoB = new Ligacao(contatoA, contatoB);
        ligacaoB.ligar();
        System.out.println(ligacaoB);

        System.out.println("");

        telefone.ligar(contatoD);
        telefone.ligar(contatoA);
        telefone.ligar(contatoB);

        System.out.println("");

        System.out.println(telefone.getChamadas());

    }
}
