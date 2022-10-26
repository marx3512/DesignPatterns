public class Funcionario implements Handler{

    private Handler nextHandler;
    private String nomeFuncionario,cargoFuncionario;

    public Funcionario(String nomeFuncionario,String cargoFuncionario){
        this.nomeFuncionario = nomeFuncionario;
        this.cargoFuncionario = cargoFuncionario;
    };

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void aprovarCompra(double valor) {
        if(valor <= 100){
            System.out.println("Compra do valor " + valor + "aprovada por " + nomeFuncionario + " com o cargo de " + cargoFuncionario);            
        }
        else if(nextHandler != null){
            nextHandler.aprovarCompra(valor);
        }
        else{
            System.out.println("Compra nao pode ser aprovada pelo " + nomeFuncionario + " com o cargo de " + cargoFuncionario);
        }
    }
    
}
