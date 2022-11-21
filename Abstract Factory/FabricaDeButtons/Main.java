public class Main {
    private static Client configureClient(){
        Client client;
        IGUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        }
        else{
            factory = new WindowsFactory();
        }
        client = new Client(factory);
        return client;
    }

    public static void main(String[] args) {
        Client client = configureClient();
        client.paint();
    }
}
