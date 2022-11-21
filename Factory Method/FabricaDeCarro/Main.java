public class Main {
    public static void main(String[] args) {
        CarroFactory carroFactory = new CarroFactory();

        carroFactory.createCarro("Ford");
        System.out.println("------------------");
        carroFactory.createCarro("Toyota");
        System.out.println("------------------");
        carroFactory.createCarro("Volkswagen");
        System.out.println("------------------");
    }
}
