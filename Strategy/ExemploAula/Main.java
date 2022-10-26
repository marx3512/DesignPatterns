public class Main {
    public static void main(String[] args) {
        Item item = new Item("Caderno", 100);

        item.setDesconto(new DescontoAbsoluto(50));
    }
}
