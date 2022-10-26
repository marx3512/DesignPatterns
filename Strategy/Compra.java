public class Compra {
    private PagamentoStrategy pagamentoStrategy;

    Compra(PagamentoStrategy pagamentoStrategy){
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy){
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public PagamentoStrategy getPagamentoStrategy(){
        return this.pagamentoStrategy;
    }

    public void executarEstrategia(){
        this.pagamentoStrategy.calcularPagamento();
    }
}
