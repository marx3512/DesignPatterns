public class DescontoAbsoluto implements Desconto{

    private double descontoAbsoluto;

    public DescontoAbsoluto(double descontoAbsoluto){
        this.descontoAbsoluto = descontoAbsoluto;
    }

    @Override
    public double calculeDesconto(double valor) {
        return valor - this.descontoAbsoluto;
    }
    
}
