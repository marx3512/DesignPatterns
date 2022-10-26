public class BordaRecheada extends PizzaDecorator{

    public BordaRecheada(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int preco() {
        return this.pizzaDecorada.preco() + 10;
    }
    
}
