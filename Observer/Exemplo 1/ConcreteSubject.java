import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject{

    private List<Observer> observadores = new ArrayList<Observer>();

    private int estado;

    //Parte do programa que pode variar
    public int getEstado() {
        return estado;
    }

    // Parte do programa que pode variar
    public void setEstado(int estado){
        this.estado = estado;
        this.notificarTodosObservadores();
    }

    @Override
    public void adicionarObserver(Observer observador) {
        observadores.add(observador);        
    }

    @Override
    public void removerObserver(Observer observador) {
        observadores.remove(observador);        
    }

    @Override
    public void notificarTodosObservadores() {
        for (int i = 0; i < observadores.size(); i++) {
            observadores.get(i).atualizarObservador();
        }        
    }
    
}
