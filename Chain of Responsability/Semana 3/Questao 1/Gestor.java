// Classe que vai ser o Handler
public abstract class Gestor{
    public double limite;
    public String cargo;
    public boolean aplicavel;
    public Gestor proximoNivel;

    abstract void proximoNivel(Gestor proximoNivel);

    abstract void aprovarCompra(Double valorCompra);
}