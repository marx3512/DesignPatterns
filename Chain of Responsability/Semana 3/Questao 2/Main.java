public class Main{
    public static void main(String[] args) {
        BancoA bancoA = new BancoA("A");
        BancoB bancoB = new BancoB("B");
        BancoC bancoC = new BancoC("C");

        bancoA.proximoNivel(bancoB);
        bancoB.proximoNivel(bancoC);

        bancoA.aprovarPagamento("D");
    }
}
