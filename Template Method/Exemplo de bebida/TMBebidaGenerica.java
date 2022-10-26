public abstract class TMBebidaGenerica {
    final void prepararReceita(){
        ferverAgua();
        prepararInfusao();
        colocarNaXicara();
        adicionarCondimentos();
    }

    abstract void prepararInfusao();

    abstract void adicionarCondimentos();

    public void ferverAgua(){
        System.out.println("Fervendo algo");
    }

    public void colocarNaXicara(){
        System.out.println("Colocando na xicara");
    }
}
