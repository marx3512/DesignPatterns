public class Email implements Handler{

    private Handler nextHandler;
    private String tipoDeEnvio;

    Email(String tipoDeEnvio){
        this.tipoDeEnvio = tipoDeEnvio;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void aprovarCompra(String mensagem, String metodoDeEnvio) {
        if(tipoDeEnvio == metodoDeEnvio){
            System.out.println("A mensagem " + mensagem + " foi enviado pelo " + tipoDeEnvio);
        }
        else if(nextHandler != null){
            this.nextHandler.aprovarCompra(mensagem, metodoDeEnvio);
        }
        else{
            System.out.println("A mensagem " + mensagem + " nao pode ser enviada pelo " + tipoDeEnvio);
        }
    }
    
}
