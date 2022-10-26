public class Aluno implements Handler{

    private Handler nextHandler;

    public Aluno(){}

    public Aluno(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void checar(String nome) {
        if (nome == "Aluno") {
            System.out.println("Aluno que faco a operacao");
        } else if (nextHandler != null) {
            nextHandler.checar(nome);
        }
    }
    
}
