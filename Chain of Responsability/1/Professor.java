public class Professor implements Handler{

    private Handler nextHandler;

    public Professor(){};

    public Professor(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void checar(String nome) {
        if (nome == "Professor") {
            System.out.println("Professor que faco a operacao");
        } else if (nextHandler != null) {
            nextHandler.checar(nome);
        }
    }
    
}
