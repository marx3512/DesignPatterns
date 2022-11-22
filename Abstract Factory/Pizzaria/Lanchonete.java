public class Lanchonete {
    private IPizzaAtum pizzaAtum;
    private IPizzaCalabresa pizzaCalabresa;
    private IPizzaDoce pizzaDoce;
    private IPizzaDoisSabores pizzaDoisSabores;

    public Lanchonete(IPizzaFactory pizzaFactory){
        this.pizzaAtum = pizzaFactory.criarPizzaAtum();
        this.pizzaCalabresa = pizzaFactory.criarPizzaCalabresa();
        this.pizzaDoce = pizzaFactory.criarPizzaDoce();
        this.pizzaDoisSabores = pizzaFactory.criarPizzaDoisSabores();
    }

    public void montarPizzas(){
        this.pizzaAtum.adicionarMoho();
        this.pizzaAtum.adicionarRecheio();
        System.out.println("---------------------------");
        this.pizzaCalabresa.adicionarMoho();
        this.pizzaCalabresa.adicionarRecheio();
        System.out.println("---------------------------");
        this.pizzaDoce.adicionarMoho();
        this.pizzaDoce.adicionarRecheio();
        System.out.println("---------------------------");
        this.pizzaDoisSabores.adicionarMoho();
        this.pizzaDoisSabores.adicionarRecheio();
        System.out.println("---------------------------");
    }
}
