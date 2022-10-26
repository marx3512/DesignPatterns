package MontandoPrato;

public abstract class MontarPrato {
    
    final void montandoPrato(){
        pegandoPrato();
        adicionandoArroz();
        adicionandoFeijao();
        adicionandoSalada();
        adicionandoCarne();
    }

    public void pegandoPrato(){
        System.out.println("Esta pegando prato");
    }

    public void adicionandoArroz(){
        System.out.println("Esta colocando arroz");
    }

    abstract void adicionandoFeijao();

    public void adicionandoSalada(){
        System.out.println("Esta colocando salada");
    }

    public void adicionandoCarne(){
        System.out.println("Esta colocando carne");
    }
}
