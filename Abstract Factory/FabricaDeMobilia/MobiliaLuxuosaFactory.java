public class MobiliaLuxuosaFactory implements IMobiliaFactory{

    @Override
    public ICadeira criarCadeira() {
        return new CadeiraLuxuosa();
    }

    @Override
    public IMesa criarMesa() {
        return new MesaLuxuosa();
    }

    @Override
    public ISofa criarSofa() {
        return new SofaLuxuoso();
    }
    
}
