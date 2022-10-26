public class Aluno implements CursoMatriculado{

    private String nome;
    
    public Aluno(String nome){
        this.nome = nome;
    }

    @Override
    public String cursoMatriculado() {
        return this.nome + " esta matriculado em ";
    }

}