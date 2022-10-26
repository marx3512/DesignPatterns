public class ObserverClasse2 extends Observer{

    public ObserverClasse2(ConcreteAluno aluno){
        this.aluno = aluno;
        this.aluno.adicionarObservador(this);
    }

    @Override
    public void atualizarObservador() {
        if(this.aluno.getClasse() != "2"){
            System.out.println("O aluno " + this.aluno.getNome() + " nao faz parte da minha turma");
        }
        else{
            System.out.println("O aluno " + this.aluno.getNome() + " faz parte da minha turma");
        }        
    }
    
}
