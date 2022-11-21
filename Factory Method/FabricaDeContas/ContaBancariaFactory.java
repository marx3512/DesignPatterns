

public class ContaBancariaFactory {
    
    public ContaBancariaFactory() {}

    public IContaBancaria criarConta(String tipo){
        if(tipo == "ContaCorrente"){
            ContaCorrente contaCorrente = new ContaCorrente();
            contaCorrente.registrarConta();
            return contaCorrente;
        }
        else if(tipo == "ContaJuridica"){
            ContaJuridica contaJuridica = new ContaJuridica();
            contaJuridica.registrarConta();
            return contaJuridica;
        }
        else if(tipo == "ContaPoupanca"){
            ContaPoupanca contaPoupanca = new ContaPoupanca();
            contaPoupanca.registrarConta();
            return contaPoupanca;
        }
        else{
            System.out.println("Nao foi possivel criar a sua conta");
            return null;
        }
    }
}
