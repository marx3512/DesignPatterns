public class LojaOnlineFactory {
    private IEntregarProduto entregarProduto;
    
    public void escolhaDeEnvio(String metodo){
        if(metodo == "Carro"){
            entregarProduto =  new Carro();
            entregarProduto.metodoDeEnvio();;
        }
        else if(metodo == "Navio"){
            entregarProduto = new Navio();
            entregarProduto.metodoDeEnvio();
        }
    }

    // Esse metodo nao é necessario fazer, so quando a fabrica vai precisar criar diferentes tipos de produtos 
    // public abstract void criarMetodoDeEnvio();
}
