public class Presidente extends Gestor{

    public Presidente(String cargo, Double limite){
        this.cargo = cargo;
        this.limite = limite;
    }

    @Override
    void proximoNivel(Gestor proximoNivel) {
        this.proximoNivel = proximoNivel;        
    }

    @Override
    void aprovarCompra(Double valorCompra) {
        if (valorCompra <= this.limite) {
            System.out.println("O cargo " + this.cargo + " aprovou a compra");
        } else if (proximoNivel != null) {
            this.proximoNivel.aprovarCompra(valorCompra);
        } else {
            System.out.println("O cargo " + this.cargo + " nao aprovou a compra");
        }
    }
    
}
