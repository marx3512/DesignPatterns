public class PizzaJuazeiroFactory implements IPizzaFactory{

    @Override
    public IPizzaAtum criarPizzaAtum() {
        return new PizzaAtum();
    }

    @Override
    public IPizzaCalabresa criarPizzaCalabresa() {
        return new PizzaCalabresa();
    }

    @Override
    public IPizzaDoce criarPizzaDoce() {
        return new PizzaDoce();
    }

    @Override
    public IPizzaDoisSabores criarPizzaDoisSabores() {
        return new PizzaDoisSabores();
    }
}
