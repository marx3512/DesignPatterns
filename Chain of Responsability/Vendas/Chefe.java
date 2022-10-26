public class Chefe implements Handler{

    private Handler nextHandler;
    private String nomeChefe, cargoChefe;

    public Chefe(String nomeChefe, String cargoChefe){
        this.nomeChefe = nomeChefe;
        this.cargoChefe = cargoChefe;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void aprovarCompra(double valor) {
        if (valor > 100 && valor <= 200) {
            System.out.println("Compra do valor " + valor + "aprovada por " + nomeChefe + " com o cargo de "
                    + cargoChefe);
        } else if (nextHandler != null) {
            nextHandler.aprovarCompra(valor);
        } else {
            System.out.println(
                    "Compra nao pode ser aprovada pelo " + nomeChefe + " com o cargo de " + cargoChefe);
        }
    }
    
}