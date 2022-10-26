public class Funcionario implements Handler{

    private Handler nextHandler;

    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;        
    }

    @Override
    public void aprovarTarefa(String texto) {
        if(texto == "Funcionario"){
            System.out.println("Funcionario tratou o problema");
        }
        else if(nextHandler != null){
            this.nextHandler.aprovarTarefa(texto);
        }
        else{
            System.out.println("Funcionario nao conseguiu tratar o problema");
        }
    }
    
}
