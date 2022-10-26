public abstract class Pacote{
    private String descricao;
    private double preco;

    public Pacote(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getPreco(){
        return this.preco;
    }
}