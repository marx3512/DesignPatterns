public class Main {
    public static void main(String[] args) {
        Professor professorJose = new Professor("Jose", "12.12");
        Professor professorPaulo = new Professor("Paulo", "12.13");
        Professor professorAntonio = new Professor("Antonio", "12.14"); 
    
        Aluno aluno = new Aluno("Marx", "12.15");

        professorJose.nextHandler(professorPaulo);
        professorPaulo.nextHandler(professorAntonio);

        professorJose.checarMatricula(aluno);
    }
}
