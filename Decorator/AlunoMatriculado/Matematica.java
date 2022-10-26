public class Matematica extends CursoDecorator{

    public Matematica(CursoMatriculado cursoDecorado) {
        super(cursoDecorado);
    }

    @Override
    public String cursoMatriculado() {
        return this.cursoDecorado.cursoMatriculado() + " Matematica ";
    }
    
}
