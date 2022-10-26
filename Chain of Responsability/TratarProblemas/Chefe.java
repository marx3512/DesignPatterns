public class Chefe implements Handler{

    private Handler nextHandler;

    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void aprovarTarefa(String texto) {
        if(texto == "Chefe"){
            System.out.println("Chefe tratou o problema");
        }
        else if(nextHandler != null){
            this.nextHandler.aprovarTarefa(texto);
        }
        else{
            System.out.println("Chefe nao conseguiu tratar o problema");
        }
    }
    
}
