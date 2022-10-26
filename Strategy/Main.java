public class Main {
    
    public static void main(String[] args) {
        Compra compra = new Compra(new PayPal());

        compra.executarEstrategia();
    }
}
