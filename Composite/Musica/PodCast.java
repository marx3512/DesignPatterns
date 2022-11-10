public class PodCast implements Componente{

    protected String nomePodcast;
    protected float velocidade;
    protected String nomeConvidado;
    
    public PodCast(String nomePodcast, String nomeConvidado, float velocidade) {
        this.nomePodcast = nomePodcast;
        this.velocidade = velocidade;
        this.nomeConvidado = nomeConvidado;
    }

    @Override
    public void tocar() {
        System.out.println("Esta tocando o podcast " + nomePodcast + " com o convidado " + nomeConvidado);        
    }

    @Override
    public void setVelocidadeReproducao(float velocidade) {
        System.out.println("Alterando a velocidade da musica para " + velocidade);
    }

    @Override
    public String getNome() {
        return this.nomePodcast;
    }
    
}
