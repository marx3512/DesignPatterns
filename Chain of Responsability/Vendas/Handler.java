public interface Handler{
    public void setNextHandler(Handler nextHandler);

    public void aprovarCompra(double valor);
}