public class PeruPatoAdapter implements IPato{

    Peru peru = new Peru();

    @Override
    public void voar() {
        peru.baterAsas();
    }

    @Override
    public void grasnar() {
        peru.wooble();
    }
    
}
