public class DescontoNullObject implements Desconto{

    
    @Override
    public double calculeDesconto(double valor) {
        return valor;
    }
    
}
