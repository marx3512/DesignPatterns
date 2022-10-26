import java.util.ArrayList;
import java.util.List;

public class ConcreteAluno extends Subject{

    private List<Observer> observadores = new ArrayList<Observer>();

    private String nome,classe;

    public ConcreteAluno(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
        this.notificarTodosObservadores();
    }

    @Override
    public void adicionarObservador(Observer observador) {
        this.observadores.add(observador);        
    }

    @Override
    public void removerObservador(Observer observador) {
        this.observadores.remove(observador);        
    }

    @Override
    public void notificarTodosObservadores() {
        for (int i = 0; i < observadores.size(); i++) {
            observadores.get(i).atualizarObservador();
        }        
    }
    
}
