// Essa classe vai ser um handler
public abstract class Banco{

    private String codigoBanco;

    private Banco proximoBanco;

    public Banco(String codigoBanco){
        this.codigoBanco = codigoBanco;
    }

    abstract void proximoNivel(Banco proximoBanco);

    abstract void aprovarPagamento(String codigoDeBanco);

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public Banco getProximoBanco() {
        return proximoBanco;
    }

    public void setProximoBanco(Banco proximoBanco) {
        this.proximoBanco = proximoBanco;
    }
    
}