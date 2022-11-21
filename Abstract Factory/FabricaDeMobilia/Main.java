public class Main {
    private static Client configureClient(String tipo){
        Client client;
        IMobiliaFactory mobiliaFactory;

        if(tipo == "Luxuoso"){
            mobiliaFactory = new MobiliaLuxuosaFactory();
            client = new Client(mobiliaFactory);
        }
        else{
            mobiliaFactory = new MobiliaModernaFactory();
            client = new Client(mobiliaFactory);
        }

        return client;
    }

    public static void main(String[] args) {
        Client client = configureClient("Moderno");
        client.tipo();
    }
}
