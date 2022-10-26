public class Main {
    public static void main(String[] args) {
        Email email = new Email("Email");
        Facebook facebook = new Facebook("Facebook");
        Slack slack = new Slack("Slack");

        email.setNextHandler(facebook);
        facebook.setNextHandler(slack);

        email.aprovarCompra("Oi eu sou o Goku", "Aaaa");
    }
}
