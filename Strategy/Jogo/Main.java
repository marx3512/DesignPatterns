public class Main {
   public static void main(String[] args) {
        Monstro monstro = new Monstro("Ogro");

        monstro.setMetodoAtaque(new AtacandoLanca());

        monstro.getMetodoAtaque();
   }
}
