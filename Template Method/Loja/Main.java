public class Main{
    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra(250);

        Sedex sedex  = new Sedex(carrinhoDeCompra);

        CorreioNormal correioNormal = new CorreioNormal(carrinhoDeCompra);

        sedex.finalizandoCompra(carrinhoDeCompra);

        correioNormal.finalizandoCompra(carrinhoDeCompra);
    }
}
