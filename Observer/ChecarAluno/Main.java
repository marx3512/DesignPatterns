public class Main {
    public static void main(String[] args) {
        ConcreteAluno aluno = new ConcreteAluno("Marx","1");

        new ObserverClasse1(aluno);
        new ObserverClasse2(aluno);

        aluno.setClasse("1");
    }
}
