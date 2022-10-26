public interface Handler{
    public abstract void setNextHandler(Handler nextHandler);

    public void aprovarCompra(String mensagem, String metodoDeEnvio);
}