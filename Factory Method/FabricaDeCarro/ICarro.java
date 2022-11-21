public abstract class ICarro{
    
    protected String ano;
    protected String marca;
    protected Double preco;

    public ICarro(String ano, String marca, Double preco) {
        this.ano = ano;
        this.marca = marca;
        this.preco = preco;
    }

    public void TipoCarro(){
        System.out.println("O carro comprado foi da marca " + this.marca + " do ano " + this.ano + " por um valor de "
                + this.preco);
    }
}