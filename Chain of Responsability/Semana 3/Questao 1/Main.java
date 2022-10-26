public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor("Supervisor", 1000.00);
        Gerente gerente = new Gerente("Gerente", 2000.00);
        Diretor diretor = new Diretor("Diretor", 3000.00);
        Presidente presidente = new Presidente("Presidente", 4000.00);

        supervisor.proximoNivel(gerente);
        gerente.proximoNivel(diretor);
        diretor.proximoNivel(presidente);

        supervisor.aprovarCompra(4500.00);
    }
}
