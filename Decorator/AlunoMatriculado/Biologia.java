public class Biologia extends CursoDecorator{

    public Biologia(CursoMatriculado cursoDecorado) {
        super(cursoDecorado);
    }

    @Override
    public String cursoMatriculado() {
        return this.cursoDecorado.cursoMatriculado() + " Biologia ";
    }
    
}
