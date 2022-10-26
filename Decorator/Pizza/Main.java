public class Main {
    public static void main(String[] args) {

        Pizza pizzaCalabresa = new PizzaCalabresa(new BordaRecheada(new PizzaDaNona()));

        System.out.println(pizzaCalabresa.preco());
    }
}
