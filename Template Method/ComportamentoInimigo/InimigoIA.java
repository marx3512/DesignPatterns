public abstract class InimigoIA {
    final void comportamento(){
        patrulha();
        procurar();
        atacar();
    }

    public void patrulha(){
        System.out.println("Inimigo esta patrulhando");
    }

    public void procurar(){
        System.out.println("Inimigo esta procurando");
    }

    abstract void atacar();
}