import java.util.ArrayList;
import java.util.List;

public  class PlayList implements Componente{
    
    private List<Componente> componentes = new ArrayList<Componente>(); 

    protected String nomePlayList;

    public PlayList(String nomePlayList){
        this.nomePlayList = nomePlayList;
    }

    @Override
    public void tocar(){
        System.out.println("Nome da playlist: " + nomePlayList);
        for (int i = 0; i < componentes.size(); i++) {
            componentes.get(i).tocar();
        }
    };

    @Override
    public String getNome(){
        return this.nomePlayList;
    }

    @Override
    public void setVelocidadeReproducao(float velocidade){
        System.out.println("Alterando a velocidade de reproducao para " + velocidade);
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public void remover(Componente componente){
        componentes.remove(componente);
    }
}
