public class Main {
    public static void main(String[] args) {
        System.out.println("== PACOTE PRAIA (João Pessoa-R$1200): INCLUI BEBIDA (R$300) + MASSAGEM (R$350)");
        Pacote pacotePraia = new ServicoMassagem(
                new ServicoBebida(
                        new PacotePraia("João Pessoa", 1200.0)));

        System.out.println("DESCRIÇÃO " + pacotePraia.getDescricao());
        System.out.println("TOTAL R$ " + pacotePraia.getPreco());
    }
}
