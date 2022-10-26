public class PayPal implements PagamentoStrategy{

    @Override
    public void calcularPagamento() {
        System.out.println("Estou pagando com o paypal");
        
    }
    
}
