public class MobiliaModernaFactory implements IMobiliaFactory{

    @Override
    public ICadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public IMesa criarMesa() {
        return new MesaModerna();
    }

    @Override
    public ISofa criarSofa() {
        return new SofaModerno();
    }
    
}
