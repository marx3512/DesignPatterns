public abstract class Subject {
    public abstract void adicionarObservador(Observer observador);

    public abstract void removerObservador(Observer observador);

    public abstract void notificarTodosObservadores();
}
