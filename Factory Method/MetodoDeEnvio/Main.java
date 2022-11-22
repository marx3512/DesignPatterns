public class Main {
    public static void main(String[] args) {
        LojaOnlineFactory lojaOnlineFactory = new LojaOnlineFactory();
        lojaOnlineFactory.escolhaDeEnvio("Carro");
        System.out.println("--------------------");
        lojaOnlineFactory.escolhaDeEnvio("Navio");
    }
}
