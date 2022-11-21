public abstract class Notebook{
    protected String marca;
    protected String processador;
    protected String placaDeVideo;

    public Notebook(String marca, String processador, String placaDeVideo) {
        this.marca = marca;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Processador: " + this.processador);
        System.out.println("Placa de video: " + this.placaDeVideo);
    }
}