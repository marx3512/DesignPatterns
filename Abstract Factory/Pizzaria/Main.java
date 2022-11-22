public class Main {
    public static Lanchonete configureLanchonete(String local){
        Lanchonete lanchonete;
        IPizzaFactory pizzaFactory;

        if(local == "Juazeiro"){
            pizzaFactory = new PizzaJuazeiroFactory();
            lanchonete = new Lanchonete(pizzaFactory);
        }
        else if(local == "Crato"){
            pizzaFactory = new PizzaCratoFactory();
            lanchonete = new Lanchonete(pizzaFactory);
        }
        else if(local == "Barbalha"){
            pizzaFactory = new PizzaBarbalhaFactory();
            lanchonete = new Lanchonete(pizzaFactory);
        }
        else{
            System.out.println("Nao foi possivel encontrar a pizzaria");
            lanchonete = null;
        }
        return lanchonete;
    }
    public static void main(String[] args) {
        Lanchonete lanchonete = configureLanchonete("Juazeiro");
        lanchonete.montarPizzas();
        System.out.println("----------------------------------------");
        lanchonete = configureLanchonete("Crato");
        lanchonete.montarPizzas();
        System.out.println("----------------------------------------");
        lanchonete = configureLanchonete("Barbalha");
        lanchonete.montarPizzas();
        System.out.println("----------------------------------------");
        lanchonete = configureLanchonete("Cra");
        lanchonete.montarPizzas();
    }
}
