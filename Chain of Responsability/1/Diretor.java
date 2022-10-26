public class Diretor implements Handler{

    private Handler nextHandler;

    public Diretor(){};

    public Diretor(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void checar(String nome) {
        if(nome == "Diretor"){
            System.out.println("Diretor que faco a operacao");
        }
        else if(nextHandler != null){
            nextHandler.checar(nome);
        }
    }
    
}
