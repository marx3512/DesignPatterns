public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao", "Funcionario");
        Chefe chefe = new Chefe("Carlos", "Chefe");
        Gerente gerente = new Gerente("Marx", "Gerente");

        funcionario.setNextHandler(chefe);
        chefe.setNextHandler(gerente);

        funcionario.aprovarCompra(250);
    }
}
