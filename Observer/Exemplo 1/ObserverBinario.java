public class ObserverBinario extends Observer{

    public ObserverBinario(ConcreteSubject subject){
        this.subject = subject;
        this.subject.adicionarObserver(this);
    }

    @Override
    public void atualizarObservador() {
        System.out.println("String binária: " + Integer.toBinaryString(subject.getEstado()));        
    }
    
}
