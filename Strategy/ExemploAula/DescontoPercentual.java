public class DescontoPercentual implements Desconto{

    private double porcentagemDesconto;

    @Override
    public double calculeDesconto(double valor) {
        return valor * (100 - this.porcentagemDesconto) / 100;
    }
    
}
