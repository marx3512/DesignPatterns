package MontandoPrato;

public class Main {
    public static void main(String[] args) {
        FeijaoCarioca feijaoCarioca = new FeijaoCarioca();

        FeijaoCorda feijaoCorda = new FeijaoCorda();

        feijaoCarioca.montandoPrato();

        System.out.println();

        feijaoCorda.montandoPrato();
    }
}
