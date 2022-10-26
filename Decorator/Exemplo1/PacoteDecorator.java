public class PacoteDecorator extends Pacote{

    protected Pacote pacote;

    public PacoteDecorator(Pacote pacote, String descricao, double preco) {
        super(pacote.getDescricao() + " + " + descricao, pacote.getPreco() + preco);
        this.pacote = pacote;
    }
    
}
