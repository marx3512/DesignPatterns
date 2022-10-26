public class Monstro {
    private String tipo;

    private MetodoAtaque metodoAtaque;

    public Monstro(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMetodoAtaque(MetodoAtaque metodoAtaque) {
        this.metodoAtaque = metodoAtaque;
    }

    public void getMetodoAtaque(){
        this.metodoAtaque.atacar();
    }
}
