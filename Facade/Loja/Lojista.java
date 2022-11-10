public class Lojista {
    private LojaCelular apple;
    private LojaCelular samsung;
    private LojaCelular xiaomi;

    public void appleVenda(){
        apple = new Apple();
        System.out.println("Esta vendendo um celular apple do modelo " + apple.getModelo() + ", a um preco de " + apple.getPreco());
    }

    public void samsungVenda(){
        samsung = new Samsung();
        System.out.println("Esta vendendo um celular samsung do modelo " + samsung.getModelo() + ", a um preco de "
                + samsung.getPreco());

    }

    public void xiaomiVenda(){
        xiaomi = new Xiami();
        System.out.println("Esta vendendo um celular apple do modelo " + xiaomi.getModelo() + ", a um preco de "
                + xiaomi.getPreco());

    }
}
