public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Chefe chefe = new Chefe();
        Gerente gerente = new Gerente();

        funcionario.nextHandler(chefe);
        chefe.nextHandler(gerente);

        funcionario.aprovarTarefa("Gerente");
    }
}
