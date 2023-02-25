public class App {
    public static void main(String[] args) throws Exception {
        
        // Modificador Static
        // System.out.println(Matematica.calcularAreaCirculo(25));

        Carro ferrari = new Carro("Ferrari", 2023);
        Carro fusca = new Carro("Fusca", 1991);

        ferrari.anoDaCompra = 2007;

        System.out.println(ferrari.getNome());
        System.out.println(ferrari.anoDaCompra);
        
        System.out.println(fusca.getNome());
        System.out.println(fusca.anoDaCompra);
        
    }
}
