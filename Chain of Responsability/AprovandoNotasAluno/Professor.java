public class Professor implements Handler{

    private Handler nextHandler;

    private String nome;
    private String matriculaTurma;

    public Professor(String nome, String matriculaTurma) {
        this.nome = nome;
        this.matriculaTurma = matriculaTurma;
    }

    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void checarMatricula(Aluno aluno) {
        if(aluno.getCaideraMatriculada() == matriculaTurma){
            System.out.println("O aluno " + aluno.getNome() + " esta matriculado na turma do professor " + this.nome);
        }
        else if(nextHandler != null){
            this.nextHandler.checarMatricula(aluno);
        }
        else{
            System.out.println("O professor " + this.nome + " nao da aula pro aluno " + aluno.getNome());
        }
    }
    
}
