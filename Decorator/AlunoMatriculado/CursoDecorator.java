public abstract class CursoDecorator implements CursoMatriculado{
    CursoMatriculado cursoDecorado;

    public CursoDecorator(CursoMatriculado cursoDecorado){
        this.cursoDecorado = cursoDecorado;
    }
}
