public class Musica implements Componente{

    protected String nomeMusica;
    protected String nomeArtista;
    protected float velocidade;

    public Musica(String nomeMusica, String nomeArtista, float velocidade){
        this.nomeMusica = nomeMusica;
        this.nomeArtista = nomeArtista;
        this.velocidade = velocidade;
    }

    @Override
    public void tocar() {
        System.out.println("Esta tocando a musica " + nomeMusica + " do artista " + nomeArtista);
    }

    @Override
    public void setVelocidadeReproducao(float velocidade) {
        System.out.println("Alterando a velocidade da musica para " + velocidade);
    }

    @Override
    public String getNome() {
        return this.nomeMusica;
    }

    public String getNomeArtista(){
        return this.nomeArtista;
    }
    
}
