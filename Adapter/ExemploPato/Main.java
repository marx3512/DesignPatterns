public class Main {
    public static void main(String[] args) {
        IPato animal1 = new Pato();
        animal1.grasnar();
        animal1.voar();
        
        IPato animal2 = new PeruPatoAdapter();
        animal2.grasnar();
        animal2.voar();
    }
}
