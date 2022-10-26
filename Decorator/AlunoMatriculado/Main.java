public class Main {
    public static void main(String[] args) {
        Aluno marx = new Aluno("Marx");

        CursoMatriculado cursos = new Matematica(new Biologia(marx));

        System.out.println(cursos.cursoMatriculado());;
    }
}
