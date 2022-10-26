public abstract class ConfirmandoCompra {
    final void finalizandoCompra(CarrinhoDeCompra carrinhoDeCompra){
        valorTotal(carrinhoDeCompra);
        metodoDeEnvio();
        finalizar();
    }

    abstract void metodoDeEnvio();

    public void valorTotal(CarrinhoDeCompra carrinhoDeCompra){
        System.out.println("Valor total da compra foi " + carrinhoDeCompra.getValorCompra());
    }

    public void finalizar(){
        System.out.println("Compra finalizada com sucesso");
    }
}