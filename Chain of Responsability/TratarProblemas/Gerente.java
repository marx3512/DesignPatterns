public class Gerente implements Handler{

    private Handler nextHandler;

    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;        
    }

    @Override
    public void aprovarTarefa(String texto) {
        if(texto == "Gerente"){
            System.out.println("Gerente tratou o problema");
        }
        else if(nextHandler != null){
            this.nextHandler.aprovarTarefa(texto);
        }
        else{
            System.out.println("Gerente nao conseguiu tratar o problema");
        }
    }
    
}
