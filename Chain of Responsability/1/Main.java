public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Diretor diretor = new Diretor();

        aluno.setNext(professor);
        professor.setNext(diretor);

        aluno.checar("Aluno");
    }
}
