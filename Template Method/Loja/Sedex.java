public class Sedex extends ConfirmandoCompra{

    private CarrinhoDeCompra carrinhoDeCompra;

    public Sedex(CarrinhoDeCompra carrinhoDeCompra) {
        this.carrinhoDeCompra = carrinhoDeCompra;
    }

    @Override
    void metodoDeEnvio() {
        System.out.println("Adicionando o frete ao valor da compra fica " + (carrinhoDeCompra.getValorCompra() + 10.00));
        System.out.println("Compra enviada pelo sedex");
    }
    
}
