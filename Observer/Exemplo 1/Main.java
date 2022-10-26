public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        new ObserverBinario(subject);
        new ObserverHexa(subject);

        System.out.println("Primeira mudança de estado: 15");
        subject.setEstado(15);

        System.out.println("Segunda mudança de estado: 10");
        subject.setEstado(10);
    }
}
