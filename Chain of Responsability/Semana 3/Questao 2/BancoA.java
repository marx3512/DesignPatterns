public class BancoA extends Banco{

    public BancoA(String codigoBanco) {
        super(codigoBanco);
    }

    @Override
    void proximoNivel(Banco proximoBanco) {
        this.setProximoBanco(proximoBanco);
    }

    @Override
    void aprovarPagamento(String codigoDeBanco) {
        if(this.getCodigoBanco() == codigoDeBanco){
            System.out.println("O banco do codigo " + this.getCodigoBanco() + " pode aprovar pagamento");
        }
        else if(this.getProximoBanco() != null){
            this.getProximoBanco().aprovarPagamento(codigoDeBanco);
        }
        else{
            System.out.println("O banco do codigo " + this.getCodigoBanco() + " nao pode aprovar pagamento");
        }      
    }
    
}
