public class Client {
    private ICadeira cadeira;
    private IMesa mesa;
    private ISofa sofa;

    public Client(IMobiliaFactory mobiliaFactory){
        this.cadeira = mobiliaFactory.criarCadeira();
        this.mesa = mobiliaFactory.criarMesa();
        this.sofa = mobiliaFactory.criarSofa();
    }

    public void tipo(){
        cadeira.tipo();
        mesa.tipo();
        sofa.tipo();
    }
}
