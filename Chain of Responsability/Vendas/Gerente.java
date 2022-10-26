public class Gerente implements Handler{

    private Handler nextHandler;
    private String nomeGerente, cargoGerente;

    public Gerente(String nomeGerente, String cargoGerente){
        this.nomeGerente = nomeGerente;
        this.cargoGerente = cargoGerente;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void aprovarCompra(double valor) {
        if (valor > 200 && valor <= 300) {
            System.out.println("Compra do valor " + valor + "aprovada por " + nomeGerente + " com o cargo de "
                    + cargoGerente);
        } else if (nextHandler != null) {
            nextHandler.aprovarCompra(valor);
        } else {
            System.out.println(
                    "Compra nao pode ser aprovada pelo " + nomeGerente + " com o cargo de " + cargoGerente);
        }
    }
    
}
