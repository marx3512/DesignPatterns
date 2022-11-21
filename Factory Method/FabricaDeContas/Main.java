
public class Main {
    public static void main(String[] args) {
        ContaBancariaFactory contaBancariaFactory = new ContaBancariaFactory();

        contaBancariaFactory.criarConta("ContaCorrente");
        System.out.println("---------------");
        contaBancariaFactory.criarConta("ContaJuridica");
        System.out.println("---------------");
        contaBancariaFactory.criarConta("ContaPoupanca");
        System.out.println("---------------");
    }
}
