public class CorreioNormal extends ConfirmandoCompra{

    private CarrinhoDeCompra carrinhoDeCompra;

    public CorreioNormal(CarrinhoDeCompra carrinhoDeCompra) {
        this.carrinhoDeCompra = carrinhoDeCompra;
    }

    @Override
    void metodoDeEnvio() {
        System.out.println("Adicionando o frete ao valor da compra fica " + (carrinhoDeCompra.getValorCompra() + 100.00));
        System.out.println("Compra enviada pelo sedex");
    }
    
}
