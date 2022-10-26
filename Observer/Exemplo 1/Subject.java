public abstract class Subject {
    public abstract void adicionarObserver(Observer observador);

    public abstract void removerObserver(Observer observador);

    public abstract void notificarTodosObservadores();
}